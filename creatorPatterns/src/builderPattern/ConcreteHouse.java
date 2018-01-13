package builderPattern;

import builderPattern.interfaces.AbstractHouse;
import builderPattern.interfaces.IDoor;
import builderPattern.interfaces.IRoom;
import builderPattern.interfaces.IWindow;

/**
 * Created by zhuxiaolong on 2018/1/11.
 */
public class ConcreteHouse extends AbstractHouse {
    //    复杂类  房子



    public void showDetail(){

        System.out.println();

    }

    public static class Builder {


        public AbstractHouse build() {
            AbstractHouse result = new ConcreteHouse();

            result.setRoom(room.build());
            result.setDoor(door);
            result.setWindow(window);

            return result;
        }


        //这里直接依赖了底层类  需要优化为 依赖抽象
        private IRoom room;
        private IDoor door;
        private IWindow window;


    }


}
