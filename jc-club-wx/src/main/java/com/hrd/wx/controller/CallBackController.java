package com.hrd.wx.controller;

import com.hrd.wx.handler.WxChatFactory;
import com.hrd.wx.handler.WxChatMsgHandler;
import com.hrd.wx.utils.MessageUtil;
import com.hrd.wx.utils.SHA1;
import io.micrometer.common.util.StringUtils;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Objects;

/**
 * description:
 */
@RestController
@Slf4j
public class CallBackController {

    private static final String token = "sdasasd";

    @Resource
    private WxChatFactory wxChatFactory;

    @RequestMapping("/test")
    public String test() {
        return "hello world";
    }

    /**
     * 回调消息校验
     */
    @GetMapping("callback")
    public String callback(@RequestParam("signature") String signature,
                           @RequestParam("timestamp") String timestamp,
                           @RequestParam("nonce") String nonce,
                           @RequestParam("echostr") String echostr) {
        log.info("get验签请求参数：signature:{}，timestamp:{}，nonce:{}，echostr:{}",
                signature, timestamp, nonce, echostr);
        String shaStr = SHA1.getSHA1(token, timestamp, nonce, "");
        if (signature.equals(shaStr)) {
            return echostr;
        }
        return "unknown";
    }

    @PostMapping(value = "callback", produces = "application/xml;charset=UTF-8")
    public String callback(@RequestBody String requestBody,
                           @RequestParam("signature") String signature,
                           @RequestParam("timestamp") String timestamp,
                           @RequestParam("nonce") String nonce,
                           @RequestParam(value = "msg_signature", required = false) String msgSignature) {
        log.info("接收到微信消息：requestBody：{}", requestBody);
        Map<String, String> msgMap = MessageUtil.parseXml(requestBody);
        String  msgType = msgMap.get("MsgType");
        String event = msgMap.get("Event") == null ? "" : msgMap.get("Event");
        log.info("msgType:{},event:{}", msgType, event);
        StringBuilder sb = new StringBuilder();
        sb.append(msgType);
        if (!StringUtils.isEmpty(event)) {
            sb.append(".");
            sb.append(event);
        }
        String msgTypeKey = sb.toString();
        WxChatMsgHandler wxChatMsgHandler = wxChatFactory.getHandlerByMsgType(msgTypeKey);
        if (Objects.isNull(wxChatMsgHandler)) {
            return "unknown";
        }
        String replyContent = wxChatMsgHandler.dealMsg(msgMap);
        log.info("replyContent:{}", replyContent);
        return replyContent;
    }
//    String msg = "<xml>\n" +
//                "  <ToUserName><![CDATA[" + fromUserName + "]]></ToUserName>\n" +
//                "  <FromUserName><![CDATA[" + toUserName + "]]></FromUserName>\n" +
//                "  <CreateTime>12345678</CreateTime>\n" +
//                "  <MsgType><![CDATA[text]]></MsgType>\n" +
//                "  <Content><![CDATA[你好,我是经典鸡翅，欢迎来学习]]></Content>\n" +
//                "</xml>";
}
