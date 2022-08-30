package com.code.java.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "StudentData")
public class StudentEntity {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studRoll;
    private String  studName;
    private String  studResult;
    private Integer studMarks;
}
