package com.code.java.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentDto {

    private Integer studRoll;
    private String  studName;
    private String  studResult;
    private Integer studMarks;


}
