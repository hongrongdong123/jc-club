package com.hrd.wx.handler;

import java.util.Map;

public interface WxChatMsgHandler {

    WxChatMsgTypeEnum getMsgType();

    String dealMsg(Map<String, String> msgMap);
}
