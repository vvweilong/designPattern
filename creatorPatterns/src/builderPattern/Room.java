package builderPattern;

import builderPattern.interfaces.IRoom;

/**
 * Created by zhuxiaolong on 2018/1/11.
 */
public class Room implements IRoom{


    @Override
    public IRoom build() {
        System.out.println("build a room");
        return new Room();
    }
}
