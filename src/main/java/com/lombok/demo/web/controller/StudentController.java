package com.lombok.demo.web.controller;
import com.lombok.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
@Slf4j
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/{id}")
    public ResponseEntity getStudentById(@PathVariable("id")UUID id){
        log.info("get info student by id");
        return new ResponseEntity<>(studentService.findById(id), HttpStatus.OK);
    }

}
