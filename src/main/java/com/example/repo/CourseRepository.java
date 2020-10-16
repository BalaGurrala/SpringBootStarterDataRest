package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;

import com.example.entity.Course;

//@RepositoryRestController
//@Repository
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface CourseRepository extends JpaRepository<Course, Long> {

}
