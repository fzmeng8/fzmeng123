package com.test;
import com.test.entity.Student;
import com.test.mapper.TestMapper;
import com.test.proxy.Shopper;
import com.test.proxy.ShopperImpl;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Main {
    public static void main(String[] args){
        Shopper impl = new ShopperImpl();
        Shopper proxy = new ShopperImpl();
        proxy.saleWatermelon("111");
    }
}
