package com.code.java.Dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class RequestDto {

    private String  studName;
    private String  studResult;
    private Integer studMarks;


}
