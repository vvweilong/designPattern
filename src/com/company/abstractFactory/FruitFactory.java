package com.company.abstractFactory;

/**
 * Created by zhuxiaolong on 2018/1/7.
 */
public class FruitFactory implements IFactory {
    @Override
    public IProduct create() {
        return new FruitProduct();
    }
}
