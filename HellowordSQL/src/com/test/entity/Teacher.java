package com.test.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.List;

@Data
@Alias("Teacher")
public class Teacher {
    int tid;
    String name;
    List<Student> studentList;
}
