package com.code.java.Dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class ResponseDto {

    private String  studName;
    private String  studResult;
    private Integer studMarks;
    private Integer studRoll;
}
