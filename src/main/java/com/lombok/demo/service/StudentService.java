package com.lombok.demo.service;

import com.lombok.demo.web.model.StudentDto;

import java.util.UUID;

public interface StudentService {
    StudentDto findById(UUID id);
}
