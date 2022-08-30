package com.code.java.Controller;

import com.code.java.Dto.RequestDto;
import com.code.java.Dto.ResponseDto;
import com.code.java.Dto.StudentDto;

import com.code.java.ServiceImp.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.logging.Logger;


@RestController
@RequestMapping("/root")
public class StudentController {


    @Autowired
    StudentServiceImpl studentService;

    @PostMapping("/student/save")
    public ResponseEntity<ResponseDto> createStudentData(@RequestBody RequestDto requestDto){
        ResponseDto rsdto =  studentService.addStudent(requestDto);
        return new ResponseEntity<>(rsdto, HttpStatus.ACCEPTED);
    }

    @GetMapping("student/{studentId}")
    public  ResponseEntity<ResponseDto> getStudentData(@PathVariable("studentId") Integer studentId){
      ResponseDto rstDto =  studentService.getStudent(studentId);
      return  new ResponseEntity<>(rstDto,HttpStatus.OK);
    }

    @PutMapping("student/{studentId}")
    public ResponseEntity<ResponseDto> updateStudent(@PathVariable("studentId") Integer studId, @RequestBody RequestDto requestDto){
      ResponseDto responseDto  =  studentService.upDateObject(studId, requestDto);
      return new  ResponseEntity<>(responseDto,HttpStatus.OK);
    }


    @DeleteMapping("student/{studentId}")
    public ResponseEntity<?> deleteStudent(@PathVariable("studentId") Integer studId){
         studentService.deleteDate(studId);
         return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

     @GetMapping("student/getall")
    public  ResponseEntity<List<ResponseDto>> getAllStudent(){
       List<ResponseDto> studets = studentService.getAll();
       return new ResponseEntity<>(studets,HttpStatus.OK);
    }

}
