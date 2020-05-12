package com.lombok.demo.mappers;

import com.lombok.demo.entities.Student;
import com.lombok.demo.web.model.StudentDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface StudentMapper {
    StudentDto convertEntityToDto(Student student);
    Student convertDtoToEntity(StudentDto student);
}
