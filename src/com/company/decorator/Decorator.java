package com.company.decorator;

/**
 * Created by zhuxiaolong on 2018/1/9.
 */
public class Decorator extends Component {

    @Override
    public void showMyName() {
        super.showMyName();

        System.out.println("这个操作在没有违反 开放封闭原则的情况下 对原有的类进行了" +
                "功能的扩充  是遵循 开放封闭原则的 典范啊!666 add new str show  decorator");

    }


    public void decoratorMethod() {
        System.out.println("new method by decorator");
    }
}
