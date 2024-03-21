package com.hrd.subject.domain.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 题目标签表(SubjectLabel)BO
 *
 * @author makejava
 * @since 2024-03-20 17:43:10
 */

@Data
public class SubjectLabelBO implements Serializable {
    private static final long serialVersionUID = 929626104474070744L;
/**
     * 主键
     */
    private Long id;
/**
     * 标签分类
     */
    private String labelName;
/**
     * 排序
     */
    private Integer sortNum;

    /**
     * 分类id
     */
    private Long categoryId;


}

