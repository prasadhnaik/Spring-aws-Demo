package com.code.java.Utill;

import com.code.java.Dto.RequestDto;
import com.code.java.Dto.ResponseDto;
import com.code.java.Entity.StudentEntity;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.ResponseEntity;

public class AppUtil {
    //Conver Dto to Entity

    public static StudentEntity mapRequestDtoToEntity( RequestDto requestDto){
        StudentEntity save = new StudentEntity();
        save.setStudName(requestDto.getStudName());
        save.setStudResult(requestDto.getStudResult());
        save.setStudMarks(requestDto.getStudMarks());
        return save;
    }

    public static ResponseDto mapEntitydataToResposeDto(StudentEntity studentEntity){
          ResponseDto resObject = new ResponseDto();
          resObject.setStudMarks(studentEntity.getStudMarks());
          resObject.setStudName(studentEntity.getStudName());
          resObject.setStudRoll(studentEntity.getStudRoll());
          resObject.setStudResult(studentEntity.getStudResult());
        return resObject;
    }


    public static StudentEntity mapUpdateEntitydataToResposeDto(StudentEntity studentEntity,RequestDto resObject){
        studentEntity.setStudName(resObject.getStudName());
        studentEntity.setStudMarks(resObject.getStudMarks());
        studentEntity.setStudResult(resObject.getStudResult());
        return studentEntity;
    }




}
