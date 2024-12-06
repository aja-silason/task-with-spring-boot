package com.aja.taskwithspring.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsContructor;

@Getter
@Setter
@AllArgsContructor
public class User {
    private String name;
    private String email;

}