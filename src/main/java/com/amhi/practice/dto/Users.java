package com.amhi.practice.dto;

import com.amhi.practice.customvalidator.DateValidatorConstraint;
import com.amhi.practice.customvalidator.FieldsValueMatch;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldsValueMatch.List({ @FieldsValueMatch(field = "password", fieldMatch = "verifyPassword", message = "Passwords do not match!"), @FieldsValueMatch(field = "email", fieldMatch = "verifyEmail", message = "Email addresses do not match!") })
public class Users {
    private Long id;
    private String name;
    private String address;
    private String contNo;
    private String gender;
    private Integer age;
    private String email;
    private String verifyEmail;
    private String password;
    @DateValidatorConstraint
    private Date dob;
    private String verifyPassword;
}
