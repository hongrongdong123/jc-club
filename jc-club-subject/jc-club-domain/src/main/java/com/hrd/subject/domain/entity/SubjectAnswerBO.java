package com.hrd.subject.domain.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 题目答案dto
 *
 * @author makejava
 * @since 2024-03-20 19:48:52
 */
@Data
public class SubjectAnswerBO implements Serializable {
    private static final long serialVersionUID = 551353953368991231L;
    /**
     * 答案选项标识
     */
    private Integer optionType;

    /**
     * 答案
     */
    private String optionContent;

    /**
     * 是否正确
     */
    private Integer isCorrect;




}

