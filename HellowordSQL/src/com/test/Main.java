package com.test;
import com.test.entity.Student;
import com.test.mapper.TestMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Main {
    public static void main(String[] args){
        try (SqlSession session = MybatisUtil.getSession(true)){
            TestMapper mapper = session.getMapper(TestMapper.class);
//            List<Student> students =mapper.selectStudent();
            System.out.println(mapper.getTeacherById(1));
//            System.out.println("all students is : \n" + students);
//
//            Student newStudent = new Student(1940618810, "小及", "男");
//            mapper.insertStudent(newStudent);
//
//            Student stu = mapper.selectStudentById(1940618801);
//            System.out.println(stu);
//
//            newStudent.setName("李华");
//            newStudent.setSex("男");
//            mapper.updateStudent(newStudent);
//            System.out.println("更新后：" + mapper.selectStudentById(1940618810));
//
//            mapper.deleteStudent(1940618810);


        }
    }
}
