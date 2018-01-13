/**
 * Created by zhuxiaolong on 2018/1/13.
 */
public class FireRiceCommand extends AbstractCommand {
    public FireRiceCommand(String commandName) {
        super(commandName);
    }

    @Override
    public void excute() {
        synchronized (commandName) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.commandName + " fire the rice 耗时3秒");
        }
    }
}
