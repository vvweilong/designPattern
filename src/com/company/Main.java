package com.company;

import com.company.abstractFactory.IFactory;
import com.company.abstractFactory.IProduct;
import com.company.fectorymethod.AbstractProduct;
import com.company.fectorymethod.FactoryMethodCreator;
import com.company.fectorymethod.FruitFactory;
import com.company.fectorymethod.FuthureFactory;
import com.company.staticfactory.StaticCreator;

public class Main {

    public static void main(String[] args) {
        // write your code here


//      简单工厂(静态工厂)模式 这里需要在工厂中添加判断
//        staticFactory();

//        工厂方法
//        factoryMethod();
//        抽象工厂模式
        abstractFactory();
    }

    private static void abstractFactory() {
//
        IFactory factory = new com.company.abstractFactory.FruitFactory();
        IProduct product = factory.create();
        product.showMyName();
    }


    private static void factoryMethod() {
        /**
         *
         * 因为需要修改 原有的类 所以 扩展开放 了  修改也开放了  违反了开放-封闭原则
         * */
        FactoryMethodCreator factory = new FruitFactory();
        AbstractProduct appleProduct = factory.create();
        appleProduct.showMyName();

        /**
         * 工厂方法模式下 采用接口的形式 将逻辑判断的过程给调用者,不再对原有的类进行更改
         * 主要就是通过 运用接口的抽象 盖上了简单工厂方法违反 开放-封闭原则的情况
         * 当时 由于需要增加新的产品类 所以增加了开发量这点与简单工厂一样
         */
        FactoryMethodCreator futhureFactory = new FuthureFactory();
        AbstractProduct product = futhureFactory.create();
        product.showMyName();
    }


    private static void staticFactory() {
        com.company.staticfactory.AbstractProduct product0 = StaticCreator.creatorProduct(0);
        com.company.staticfactory.AbstractProduct product1 = StaticCreator.creatorProduct(1);

        product0.showProductName();
        product1.showProductName();

    }

}
