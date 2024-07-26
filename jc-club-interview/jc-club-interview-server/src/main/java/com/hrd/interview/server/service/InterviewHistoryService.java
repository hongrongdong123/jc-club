package com.hrd.interview.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hrd.interview.api.common.PageResult;
import com.hrd.interview.api.req.InterviewHistoryReq;
import com.hrd.interview.api.req.InterviewSubmitReq;
import com.hrd.interview.api.vo.InterviewHistoryVO;
import com.hrd.interview.api.vo.InterviewResultVO;
import com.hrd.interview.server.entity.po.InterviewHistory;

/**
 * 面试汇总记录表(InterviewHistory)表服务接口
 *
 * @author makejava
 * @since 2024-05-23 22:56:03
 */
public interface InterviewHistoryService extends IService<InterviewHistory> {

    void logInterview(InterviewSubmitReq req, InterviewResultVO submit);


    PageResult<InterviewHistoryVO> getHistory(InterviewHistoryReq req);

}
