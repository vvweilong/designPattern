/**
 * Created by zhuxiaolong on 2018/1/13.
 */
abstract public class AbstractCommand {


    protected String commandName;

    public AbstractCommand(String commandName) {
        this.commandName = commandName;
    }

    abstract public void excute();


}
