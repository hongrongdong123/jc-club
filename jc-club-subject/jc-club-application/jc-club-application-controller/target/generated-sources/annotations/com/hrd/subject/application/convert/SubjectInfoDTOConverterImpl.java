package com.hrd.subject.application.convert;

import com.hrd.subject.application.dto.SubjectAnswerDTO;
import com.hrd.subject.application.dto.SubjectInfoDTO;
import com.hrd.subject.domain.entity.SubjectAnswerBO;
import com.hrd.subject.domain.entity.SubjectInfoBO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-16T15:49:23+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.4.1 (Oracle Corporation)"
)
public class SubjectInfoDTOConverterImpl implements SubjectInfoDTOConverter {

    @Override
    public SubjectInfoBO convertDTOToBO(SubjectInfoDTO SubjectInfoDTO) {
        if ( SubjectInfoDTO == null ) {
            return null;
        }

        SubjectInfoBO subjectInfoBO = new SubjectInfoBO();

        subjectInfoBO.setPageNo( SubjectInfoDTO.getPageNo() );
        subjectInfoBO.setPageSize( SubjectInfoDTO.getPageSize() );
        subjectInfoBO.setId( SubjectInfoDTO.getId() );
        subjectInfoBO.setSubjectName( SubjectInfoDTO.getSubjectName() );
        subjectInfoBO.setSubjectDifficult( SubjectInfoDTO.getSubjectDifficult() );
        subjectInfoBO.setSubjectType( SubjectInfoDTO.getSubjectType() );
        subjectInfoBO.setSubjectScore( SubjectInfoDTO.getSubjectScore() );
        subjectInfoBO.setSubjectParse( SubjectInfoDTO.getSubjectParse() );
        subjectInfoBO.setSubjectAnswer( SubjectInfoDTO.getSubjectAnswer() );
        List<Integer> list = SubjectInfoDTO.getCategoryIds();
        if ( list != null ) {
            subjectInfoBO.setCategoryIds( new ArrayList<Integer>( list ) );
        }
        List<Integer> list1 = SubjectInfoDTO.getLabelIds();
        if ( list1 != null ) {
            subjectInfoBO.setLabelIds( new ArrayList<Integer>( list1 ) );
        }
        List<String> list2 = SubjectInfoDTO.getLabelName();
        if ( list2 != null ) {
            subjectInfoBO.setLabelName( new ArrayList<String>( list2 ) );
        }
        subjectInfoBO.setOptionList( subjectAnswerDTOListToSubjectAnswerBOList( SubjectInfoDTO.getOptionList() ) );
        subjectInfoBO.setCategoryId( SubjectInfoDTO.getCategoryId() );
        subjectInfoBO.setLabelId( SubjectInfoDTO.getLabelId() );
        subjectInfoBO.setKeyWord( SubjectInfoDTO.getKeyWord() );
        subjectInfoBO.setCreateUser( SubjectInfoDTO.getCreateUser() );
        subjectInfoBO.setCreateUserAvatar( SubjectInfoDTO.getCreateUserAvatar() );
        subjectInfoBO.setSubjectCount( SubjectInfoDTO.getSubjectCount() );
        subjectInfoBO.setLiked( SubjectInfoDTO.getLiked() );
        subjectInfoBO.setLikedCount( SubjectInfoDTO.getLikedCount() );
        subjectInfoBO.setNextSubjectId( SubjectInfoDTO.getNextSubjectId() );
        subjectInfoBO.setLastSubjectId( SubjectInfoDTO.getLastSubjectId() );

        return subjectInfoBO;
    }

    @Override
    public SubjectInfoDTO convertBOToDTO(SubjectInfoBO SubjectInfoBO) {
        if ( SubjectInfoBO == null ) {
            return null;
        }

        SubjectInfoDTO subjectInfoDTO = new SubjectInfoDTO();

        subjectInfoDTO.setPageNo( SubjectInfoBO.getPageNo() );
        subjectInfoDTO.setPageSize( SubjectInfoBO.getPageSize() );
        subjectInfoDTO.setId( SubjectInfoBO.getId() );
        subjectInfoDTO.setSubjectName( SubjectInfoBO.getSubjectName() );
        subjectInfoDTO.setSubjectDifficult( SubjectInfoBO.getSubjectDifficult() );
        subjectInfoDTO.setSubjectType( SubjectInfoBO.getSubjectType() );
        subjectInfoDTO.setSubjectScore( SubjectInfoBO.getSubjectScore() );
        subjectInfoDTO.setSubjectParse( SubjectInfoBO.getSubjectParse() );
        subjectInfoDTO.setSubjectAnswer( SubjectInfoBO.getSubjectAnswer() );
        List<Integer> list = SubjectInfoBO.getCategoryIds();
        if ( list != null ) {
            subjectInfoDTO.setCategoryIds( new ArrayList<Integer>( list ) );
        }
        List<Integer> list1 = SubjectInfoBO.getLabelIds();
        if ( list1 != null ) {
            subjectInfoDTO.setLabelIds( new ArrayList<Integer>( list1 ) );
        }
        subjectInfoDTO.setOptionList( subjectAnswerBOListToSubjectAnswerDTOList( SubjectInfoBO.getOptionList() ) );
        List<String> list3 = SubjectInfoBO.getLabelName();
        if ( list3 != null ) {
            subjectInfoDTO.setLabelName( new ArrayList<String>( list3 ) );
        }
        subjectInfoDTO.setCategoryId( SubjectInfoBO.getCategoryId() );
        subjectInfoDTO.setLabelId( SubjectInfoBO.getLabelId() );
        subjectInfoDTO.setKeyWord( SubjectInfoBO.getKeyWord() );
        subjectInfoDTO.setCreateUser( SubjectInfoBO.getCreateUser() );
        subjectInfoDTO.setCreateUserAvatar( SubjectInfoBO.getCreateUserAvatar() );
        subjectInfoDTO.setSubjectCount( SubjectInfoBO.getSubjectCount() );
        subjectInfoDTO.setLiked( SubjectInfoBO.getLiked() );
        subjectInfoDTO.setLikedCount( SubjectInfoBO.getLikedCount() );
        subjectInfoDTO.setNextSubjectId( SubjectInfoBO.getNextSubjectId() );
        subjectInfoDTO.setLastSubjectId( SubjectInfoBO.getLastSubjectId() );

        return subjectInfoDTO;
    }

    @Override
    public List<SubjectInfoDTO> convertBOToDTOList(List<SubjectInfoBO> subjectInfoBOList) {
        if ( subjectInfoBOList == null ) {
            return null;
        }

        List<SubjectInfoDTO> list = new ArrayList<SubjectInfoDTO>( subjectInfoBOList.size() );
        for ( SubjectInfoBO subjectInfoBO : subjectInfoBOList ) {
            list.add( convertBOToDTO( subjectInfoBO ) );
        }

        return list;
    }

    protected SubjectAnswerBO subjectAnswerDTOToSubjectAnswerBO(SubjectAnswerDTO subjectAnswerDTO) {
        if ( subjectAnswerDTO == null ) {
            return null;
        }

        SubjectAnswerBO subjectAnswerBO = new SubjectAnswerBO();

        subjectAnswerBO.setOptionType( subjectAnswerDTO.getOptionType() );
        subjectAnswerBO.setOptionContent( subjectAnswerDTO.getOptionContent() );
        subjectAnswerBO.setIsCorrect( subjectAnswerDTO.getIsCorrect() );

        return subjectAnswerBO;
    }

    protected List<SubjectAnswerBO> subjectAnswerDTOListToSubjectAnswerBOList(List<SubjectAnswerDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<SubjectAnswerBO> list1 = new ArrayList<SubjectAnswerBO>( list.size() );
        for ( SubjectAnswerDTO subjectAnswerDTO : list ) {
            list1.add( subjectAnswerDTOToSubjectAnswerBO( subjectAnswerDTO ) );
        }

        return list1;
    }

    protected SubjectAnswerDTO subjectAnswerBOToSubjectAnswerDTO(SubjectAnswerBO subjectAnswerBO) {
        if ( subjectAnswerBO == null ) {
            return null;
        }

        SubjectAnswerDTO subjectAnswerDTO = new SubjectAnswerDTO();

        subjectAnswerDTO.setOptionType( subjectAnswerBO.getOptionType() );
        subjectAnswerDTO.setOptionContent( subjectAnswerBO.getOptionContent() );
        subjectAnswerDTO.setIsCorrect( subjectAnswerBO.getIsCorrect() );

        return subjectAnswerDTO;
    }

    protected List<SubjectAnswerDTO> subjectAnswerBOListToSubjectAnswerDTOList(List<SubjectAnswerBO> list) {
        if ( list == null ) {
            return null;
        }

        List<SubjectAnswerDTO> list1 = new ArrayList<SubjectAnswerDTO>( list.size() );
        for ( SubjectAnswerBO subjectAnswerBO : list ) {
            list1.add( subjectAnswerBOToSubjectAnswerDTO( subjectAnswerBO ) );
        }

        return list1;
    }
}
