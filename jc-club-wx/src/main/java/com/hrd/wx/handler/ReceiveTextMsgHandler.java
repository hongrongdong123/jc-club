package com.hrd.wx.handler;

import com.hrd.wx.redis.RedisUtil;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * description:
 */
@Component
@Slf4j
public class ReceiveTextMsgHandler implements WxChatMsgHandler{

    private static final String KEY_WORD = "验证码";

    private static final String LOGIN_PREFIX = "loginCode";

    @Resource
    private RedisUtil redisUtil;

    @Override
    public WxChatMsgTypeEnum getMsgType() {
        return WxChatMsgTypeEnum.TEXT_MSG;
    }

    @Override
    public String dealMsg(Map<String, String> msgMap) {
        log.info("接收到文本消息");
        String content = msgMap.get("Content");
        if (!KEY_WORD.equals(content)) {
            return "";
        }
        String fromUserName = msgMap.get("FromUserName");
        String toUserName = msgMap.get("ToUserName");

        Random random = new Random();
        int min = 100; // 最小的六位数是100000
        int max = 999; // 最大的六位数是999999
        int num = random.nextInt(max - min + 1) + min;//生成一个六位数的随机数
        String numKey = redisUtil.buildKey(LOGIN_PREFIX, String.valueOf(num));
        redisUtil.setNx(numKey, fromUserName, 5L, TimeUnit.MINUTES);
        String numContent = "您当前的验证码是：" + num + "，五分钟内有效";
        String msg = "<xml>\n" +
                "  <ToUserName><![CDATA[" + fromUserName + "]]></ToUserName>\n" +
                "  <FromUserName><![CDATA[" + toUserName + "]]></FromUserName>\n" +
                "  <CreateTime>12345678</CreateTime>\n" +
                "  <MsgType><![CDATA[text]]></MsgType>\n" +
                "  <Content><![CDATA[" + numContent + "]]></Content>\n" +
                "</xml>";
        return msg;
    }
}
