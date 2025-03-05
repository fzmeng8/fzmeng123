package com.test;
import com.test.mapper.TestMapper;
import org.apache.ibatis.session.SqlSession;

public class Main {
    public static void main(String[] args){
        try (SqlSession session = MybatisUtil.getSession(true)){
            TestMapper mapper = session.getMapper(TestMapper.class);
            mapper.selectStudent().forEach(System.out::println);
        }
    }
}
