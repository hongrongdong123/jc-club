package com.hrd.subject.domain.entity;

import com.hrd.subject.common.entity.PageInfo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 题目信息表(SubjectInfo)DTO
 *
 * @author makejava
 * @since 2024-03-20 19:48:52
 */
@Data
public class SubjectOptionBO implements Serializable {
    private static final long serialVersionUID = 551353953368991231L;

    /**
     * 题目答案
     */
    private String subjectAnswer;


    /**
     * 答案选项
     */
    private List<SubjectAnswerBO> optionList;



}

