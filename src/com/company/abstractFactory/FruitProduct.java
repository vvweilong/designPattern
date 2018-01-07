package com.company.abstractFactory;

/**
 * Created by zhuxiaolong on 2018/1/7.
 */
public class FruitProduct implements IProduct {
    @Override
    public void showMyName() {
        System.out.println("this is a fruit product");
    }
}
