package com.company.fectorymethod;

/**
 * Created by zhuxiaolong on 2018/1/7.
 */
public class PlantFactory implements FactoryMethodCreator {
    @Override
    public AbstractProduct create() {
        return new PlantProduct();
    }
}
