package com.hrd.subject.application.convert;

import com.hrd.subject.application.dto.SubjectAnswerDTO;
import com.hrd.subject.domain.entity.SubjectAnswerBO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-16T15:49:23+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.4.1 (Oracle Corporation)"
)
public class SubjectAnswerDTOConverterImpl implements SubjectAnswerDTOConverter {

    @Override
    public SubjectAnswerBO convertDtoToAnswerBO(SubjectAnswerDTO SubjectAnswerDTO) {
        if ( SubjectAnswerDTO == null ) {
            return null;
        }

        SubjectAnswerBO subjectAnswerBO = new SubjectAnswerBO();

        subjectAnswerBO.setOptionType( SubjectAnswerDTO.getOptionType() );
        subjectAnswerBO.setOptionContent( SubjectAnswerDTO.getOptionContent() );
        subjectAnswerBO.setIsCorrect( SubjectAnswerDTO.getIsCorrect() );

        return subjectAnswerBO;
    }

    @Override
    public List<SubjectAnswerDTO> convertBOToAnswerDTOList(List<SubjectAnswerBO> subjectAnswerBOList) {
        if ( subjectAnswerBOList == null ) {
            return null;
        }

        List<SubjectAnswerDTO> list = new ArrayList<SubjectAnswerDTO>( subjectAnswerBOList.size() );
        for ( SubjectAnswerBO subjectAnswerBO : subjectAnswerBOList ) {
            list.add( subjectAnswerBOToSubjectAnswerDTO( subjectAnswerBO ) );
        }

        return list;
    }

    @Override
    public List<SubjectAnswerBO> convertListDTOToBO(List<SubjectAnswerDTO> subjectAnswerDTOList) {
        if ( subjectAnswerDTOList == null ) {
            return null;
        }

        List<SubjectAnswerBO> list = new ArrayList<SubjectAnswerBO>( subjectAnswerDTOList.size() );
        for ( SubjectAnswerDTO subjectAnswerDTO : subjectAnswerDTOList ) {
            list.add( convertDtoToAnswerBO( subjectAnswerDTO ) );
        }

        return list;
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
}
