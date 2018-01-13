package builderPattern;

import builderPattern.interfaces.IWindow;

/**
 * Created by zhuxiaolong on 2018/1/11.
 */
public class BigWindow implements IWindow {


    @Override
    public IWindow build() {
        BigWindow bigWindow = new BigWindow();
        System.out.println("build a big window");
        return bigWindow;
    }
}
