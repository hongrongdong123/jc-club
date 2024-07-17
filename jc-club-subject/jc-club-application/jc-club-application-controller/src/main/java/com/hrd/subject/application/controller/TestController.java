package com.hrd.subject.application.controller;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Preconditions;
import com.hrd.subject.application.convert.SubjectLabelDTOConverter;
import com.hrd.subject.application.dto.SubjectLabelDTO;
import com.hrd.subject.common.entity.PageResult;
import com.hrd.subject.common.entity.Result;
import com.hrd.subject.domain.entity.SubjectLabelBO;
import com.hrd.subject.domain.service.SubjectLabelDomainService;
import com.hrd.subject.infra.basic.entity.SubjectInfoEs;
import com.hrd.subject.infra.basic.service.SubjectEsService;
import com.hrd.subject.infra.entity.UserInfo;
import com.hrd.subject.infra.rpc.UserRpc;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 标签controller
 *
 * @author: ChickenWing
 * @date: 2023/10/3
 */
@RestController
@RequestMapping("/subject/category")
@Slf4j
public class TestController {

    @Resource
    private UserRpc userRpc;

    @Resource
    private RocketMQTemplate rocketMQTemplate;

    @Resource
    private SubjectEsService subjectEsService;


    @GetMapping("testmq")
    public String testMq() {
        rocketMQTemplate.convertAndSend("first-topic", "hello world");
        return "ok";
    }

    @GetMapping("testfegin")
    public void testFegin() {
        UserInfo userInfo = userRpc.getUserInfo("jichi");
        log.info("testFegin,{}", userInfo);
    }

    @GetMapping("testEs")
    public void testEs() {
        SubjectInfoEs subjectInfoEs = new SubjectInfoEs();
        subjectInfoEs.setKeyWord("mysql");
        PageResult<SubjectInfoEs> pageResult = subjectEsService.querySubjectList(subjectInfoEs);
        log.info("testEs,{}", JSON.toJSONString(pageResult));
    }

}

