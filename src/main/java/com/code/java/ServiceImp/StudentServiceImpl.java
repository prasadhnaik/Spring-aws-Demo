package com.code.java.ServiceImp;

import com.code.java.Dto.RequestDto;
import com.code.java.Dto.ResponseDto;
import com.code.java.Entity.StudentEntity;
import com.code.java.Service.StudentRepo;
import com.code.java.Utill.AppUtil;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class StudentServiceImpl{

    @Autowired
    StudentRepo studentRepo;

   public ResponseDto   addStudent(RequestDto requestDto){
       StudentEntity studData  = AppUtil.mapRequestDtoToEntity(requestDto);
       StudentEntity save = studentRepo.save(studData);
       ResponseDto respose  =AppUtil.mapEntitydataToResposeDto(save);
       return respose;
    }

      public ResponseDto   getStudent(Integer studId){
       StudentEntity stud =  studentRepo.findById(studId).orElseThrow(()-> new RuntimeException("student is not exit"));
        ResponseDto respose  =AppUtil.mapEntitydataToResposeDto(stud);
        return respose;
    }

    public ResponseDto   upDateObject(Integer studId, RequestDto requestDto ){
        StudentEntity stud =  studentRepo.findById(studId).orElseThrow(()-> new RuntimeException("student is not exit"));
        StudentEntity responseDate = AppUtil.mapUpdateEntitydataToResposeDto(stud, requestDto);
        responseDate.setStudRoll(stud.getStudRoll());
        studentRepo.save(responseDate);
        ResponseDto resdat = AppUtil.mapEntitydataToResposeDto(responseDate);
        return resdat;
    }


    public void deleteDate(Integer studId) {
       studentRepo.deleteById(studId);
    }


    public List<ResponseDto>  getAll(){
       List<StudentEntity> listStudent =  studentRepo.findAll();
     return   listStudent.stream().map(student->AppUtil.mapEntitydataToResposeDto(student)).collect(Collectors.toList());

    }
}
