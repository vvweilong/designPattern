package com.company;

import com.company.staticfactory.AbstractProduct;
import com.company.staticfactory.StaticCreator;

public class Main {

    public static void main(String[] args) {
        // write your code here


//        简单工厂(静态工厂)模式


        AbstractProduct product0 = StaticCreator.creatorProduct(0);
        product0.showProductName();
        AbstractProduct product1 = StaticCreator.creatorProduct(1);
        product1.showProductName();


    }
}
