package com.hrd.interview.server.service;

import com.hrd.interview.api.enums.EngineEnum;
import com.hrd.interview.api.req.InterviewSubmitReq;
import com.hrd.interview.api.req.StartReq;
import com.hrd.interview.api.vo.InterviewQuestionVO;
import com.hrd.interview.api.vo.InterviewResultVO;
import com.hrd.interview.api.vo.InterviewVO;

import java.util.List;

/**
 * <p>
 * 面试引擎
 * </p>
 *
 * @author ChickenWing
 * @since 2024/05/16
 */
public interface InterviewEngine {

    /**
     * 引擎类型
     */
    EngineEnum engineType();

    /**
     * 通过简历关键字获取面试关键字
     */
    InterviewVO analyse(List<String> KeyWords);

    /**
     * 通过面试关键字获取面试题
     */
    InterviewQuestionVO start(StartReq req);

    /**
     * 提交面试题
     */
    InterviewResultVO submit(InterviewSubmitReq req);

}
