package com.company.staticfactory;

/**
 * Created by zhuxiaolong on 2018/1/7.
 */
public class StaticCreator {
    /**
     * 包含了 产品的判断逻辑 和生产逻辑
     * 如果增加了新的产品 我需要 增加新的产品类  并 修改 StaticCreator 判断
     *
     * */

    public static AbstractProduct creatorProduct(int productCode) {
        switch (productCode) {
            case 0:
                return new CleanerProduct();
            case 1:
                return new ToyProduct();

//            由于增加了新的产品 需要对工厂类增加逻辑判断
            case 2:
                return new FuthureAddProduct();

            default:
                break;


        }
        return null;
    }

}
