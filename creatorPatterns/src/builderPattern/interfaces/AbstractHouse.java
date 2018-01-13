package builderPattern.interfaces;

/**
 * Created by zhuxiaolong on 2018/1/11.
 */
abstract public class AbstractHouse {

    protected IRoom room;
    protected IDoor door;
    protected IWindow window;


    public void setRoom(IRoom room) {
        this.room = room;
    }

    public void setDoor(IDoor door) {
        this.door = door;
    }

    public void setWindow(IWindow window) {
        this.window = window;
    }
}
