package com.test.mapper;

import com.test.entity.Student;
import com.test.entity.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface TestMapper {
    @Insert("insert into student values (#{sid}, #{name}, #{sex})")
    int addStudent(Student student);

    @Select("select * from student where sid = #{sid}")
    Student getStudentBySid(int sid);


    @Results({
            @Result(column = "tid", property = "tid"),
            @Result(column = "name", property = "name"),
            @Result(column = "tid", property = "studentList", many =
                @Many(select = "getStudentByTid")),

    })
    @Select("select * from teacher where tid = #{tid}")
    Teacher getTeacherByTid(int tid);

    @Select("select * from student inner join teach on student.sid = teach.sid where tid = #{tid}")
    List<Student> getStudentByTid(int tid);

    @Select("select * from teacher inner join teach on teacher.tid = teach.tid where sid = #{sid}")
    Teacher getTeacherBySid(int sid);
}
