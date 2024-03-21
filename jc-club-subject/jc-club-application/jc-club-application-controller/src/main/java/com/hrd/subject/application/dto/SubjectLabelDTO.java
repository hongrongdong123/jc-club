package com.hrd.subject.application.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 题目标签表(SubjectLabel)DTO
 *
 * @author makejava
 * @since 2024-03-20 17:43:10
 */

@Data
public class SubjectLabelDTO implements Serializable {
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

