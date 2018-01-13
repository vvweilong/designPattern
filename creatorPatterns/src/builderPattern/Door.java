package builderPattern;

import builderPattern.interfaces.IDoor;

/**
 * Created by zhuxiaolong on 2018/1/11.
 */
public class Door implements IDoor {


    @Override
    public IDoor build() {
        System.out.println("build a door");
        return new Door();
    }
}
