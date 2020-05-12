package com.lombok.demo.service;

import com.lombok.demo.mappers.StudentMapper;
import com.lombok.demo.repositories.StudentRepository;
import com.lombok.demo.web.model.StudentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    @Override
    public StudentDto findById(UUID id) {
        return studentMapper.convertEntityToDto(studentRepository.findById(id).orElseThrow(RuntimeException::new));
    }
}
