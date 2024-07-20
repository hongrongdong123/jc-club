package com.hrd.circle.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hrd.circle.api.common.PageResult;
import com.hrd.circle.api.req.GetShareMomentReq;
import com.hrd.circle.api.req.RemoveShareMomentReq;
import com.hrd.circle.api.req.SaveMomentCircleReq;
import com.hrd.circle.api.vo.ShareMomentVO;
import com.hrd.circle.server.entity.po.ShareMoment;

/**
 * <p>
 * 动态信息 服务类
 * </p>
 *
 * @author ChickenWing
 * @since 2024/05/16
 */
public interface ShareMomentService extends IService<ShareMoment> {

    Boolean saveMoment(SaveMomentCircleReq req);

    PageResult<ShareMomentVO> getMoments(GetShareMomentReq req);

    Boolean removeMoment(RemoveShareMomentReq req);

}
