package com.example.mybatisplus;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private Integer id;
    private Character name;
    private Character age;
    private Character email;
}
