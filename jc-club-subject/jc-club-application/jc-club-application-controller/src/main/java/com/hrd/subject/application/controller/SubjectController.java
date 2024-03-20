package com.hrd.subject.application.controller;

import com.hrd.subject.infra.basic.entity.SubjectCategory;
import com.hrd.subject.infra.basic.service.SubjectCategoryService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:刷题Controller
 */

@RestController
public class SubjectController {

    @Resource
    private SubjectCategoryService subjectCategoryService;

    @GetMapping("test")
    public String test() {
        SubjectCategory subjectCategory = subjectCategoryService.queryById((1L));
        return subjectCategory.getCategoryName();
        //return "hello world";
    }
}
