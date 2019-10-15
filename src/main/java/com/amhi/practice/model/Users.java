package com.amhi.practice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME")
    @NotNull
    @Size(min=2, max=30)
    private String name;
    @Column(name = "ADDRESS")
    @NotNull
    private String address;
    @Column(name = "CONT_NO")
    @NotNull
    private String contNo;
    @Column(name = "GENDER")
    @NotNull
    private String gender;
    @Column(name = "AGE")
    @Min(18)
    @NotNull
    private Integer age;
}
