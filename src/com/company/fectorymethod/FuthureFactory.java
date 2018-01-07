package com.company.fectorymethod;

/**
 * Created by zhuxiaolong on 2018/1/7.
 */
public class FuthureFactory implements FactoryMethodCreator {
    @Override
    public AbstractProduct create() {

        return new FuthrueAddProduct();
    }
}
