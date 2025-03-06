package com.test.proxy;

public class ShopperImpl implements Shopper {
    @Override
    public void saleWatermelon(String customer) {
        System.out.println("salesaleWatermelon -----> " + customer);
    }

}
