package com.hrd.subject.infra.basic.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 简答题(SubjectBrief)实体类
 *
 * @author makejava
 * @since 2024-03-20 19:49:15
 */
@Data
public class SubjectBrief implements Serializable {
    private static final long serialVersionUID = 716130262642663719L;
/**
     * 主键
     */
    private Long id;
/**
     * 题目id
     */
    private Integer subjectId;
/**
     * 题目答案
     */
    private String subjectAnswer;
/**
     * 创建人
     */
    private String createdBy;
/**
     * 创建时间
     */
    private Date createdTime;
/**
     * 更新人
     */
    private String updateBy;
/**
     * 更新时间
     */
    private Date updateTime;

    private Integer isDeleted;




}

