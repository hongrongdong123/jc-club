package com.hrd.subject.infra.basic.service;

import com.hrd.subject.common.entity.PageResult;
import com.hrd.subject.infra.basic.entity.SubjectInfoEs;

public interface SubjectEsService {

    boolean insert(SubjectInfoEs subjectInfoEs);

    PageResult<SubjectInfoEs> querySubjectList(SubjectInfoEs subjectInfoEs);

}
