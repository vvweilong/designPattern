package com.company.staticfactory;

/**
 * Created by zhuxiaolong on 2018/1/7.
 */
public class FuthureAddProduct extends AbstractProduct {

    /**
     * 这是后台添加的类  除了创建新类以外 还要在工厂 增加产品的判断
     * */
    @Override
    public void showProductName() {
        System.out.println("I am A new Product ");
    }
}
