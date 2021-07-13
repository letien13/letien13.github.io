package vn.techmaster.basicthymeleaf.model;


import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Person {
    private String name;
    private String nationality;
    private String birthdate;
    private String gender; 
}
