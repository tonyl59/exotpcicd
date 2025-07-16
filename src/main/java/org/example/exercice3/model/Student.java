package org.example.exercice3.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {

    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
}
