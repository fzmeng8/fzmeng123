package com.test.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@AllArgsConstructor
@Alias("Student")
public class Student {
    int sid;
    String name;
    String sex;
}
