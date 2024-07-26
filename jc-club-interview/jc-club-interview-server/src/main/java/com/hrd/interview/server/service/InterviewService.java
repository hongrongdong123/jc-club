package com.hrd.interview.server.service;

import com.hrd.interview.api.req.InterviewReq;
import com.hrd.interview.api.req.InterviewSubmitReq;
import com.hrd.interview.api.req.StartReq;
import com.hrd.interview.api.vo.InterviewQuestionVO;
import com.hrd.interview.api.vo.InterviewResultVO;
import com.hrd.interview.api.vo.InterviewVO;

public interface InterviewService {

    InterviewVO analyse(InterviewReq req);

    InterviewQuestionVO start(StartReq req);

    InterviewResultVO submit(InterviewSubmitReq req);
}
