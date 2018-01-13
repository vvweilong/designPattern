import java.util.ArrayList;

/**
 * Created by zhuxiaolong on 2018/1/13.
 */
abstract public class AbstractInvoker {


    protected ArrayList<ArrayList<AbstractCommand>> orderLists;

    public AbstractInvoker() {
        orderLists = new ArrayList<>();
    }

    public void receiveCommandList(ArrayList<AbstractCommand> commands) {
        if (orderLists != null) {
            orderLists.add(commands);
        }
        excuteCommand();
    }


    public void excuteCommand() {
        new Thread() {
            @Override
            public void run() {
                super.run();
                for (ArrayList<AbstractCommand> orderList : orderLists) {
                    synchronized (orderList) {
                        for (AbstractCommand command : orderList) {
                            command.excute();
                        }
                    }
//            清空完成命令
                    orderList.clear();
                }
            }
        }.start();

    }

    public void cancelCommand(AbstractCommand command) {
        if (orderLists != null) {
            for (ArrayList<AbstractCommand> list : orderLists) {
                if (list != null && list.contains(command)) {
                    list.remove(command);
                    break;
                }
            }
        }
    }

}
