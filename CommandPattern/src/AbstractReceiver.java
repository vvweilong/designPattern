import java.util.ArrayList;

/**
 * Created by zhuxiaolong on 2018/1/13.
 */
abstract public class AbstractReceiver {


    protected AbstractInvoker invoker;
    protected ArrayList<AbstractCommand> commands;

    public AbstractReceiver(AbstractInvoker invoker) {
        this.invoker = invoker;
    }

    public void addCommand(AbstractCommand command) {
        if (commands == null) {
            commands = new ArrayList<>();
        }
        commands.add(command);
    }


    public void cancelCommand(AbstractCommand command) {
        System.out.println("取消命令 "+command.commandName);
        invoker.cancelCommand(command);
    }
}
