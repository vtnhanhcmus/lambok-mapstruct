package com.lombok.demo.repositories;

import com.lombok.demo.entities.Student;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface StudentRepository extends PagingAndSortingRepository<Student, UUID> {
}
