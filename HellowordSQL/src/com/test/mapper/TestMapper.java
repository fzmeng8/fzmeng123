package com.test.mapper;

import com.test.entity.Student;

import java.util.List;

public interface TestMapper {
    // MyBatis 使用"动态代理" 机制来拦截 TestMapper 接口的方法调用，并自动执行 SQL 语句。
    // TestMapper 只是一个接口，没有具体的实现，但是 MyBatis 代理类会拦截 selectStudent() 方法：
    // 代理对象 发现 selectStudent() 方法被调用。
    // 在 TestMapper.xml 中查找 id="selectStudent" 的 SQL 语句：
    // 执行 SQL：SELECT * FROM study.student
    // 返回 List<Student>，并自动将查询结果映射到 Student 对象。
    List<Student> selectStudent();
}
