package com.code.java.Service;


import com.code.java.Entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity, Integer> {

}
