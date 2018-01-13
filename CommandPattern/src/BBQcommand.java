/**
 * Created by zhuxiaolong on 2018/1/13.
 */
public class BBQcommand extends AbstractCommand {
    public BBQcommand(String commandName) {
        super(commandName);
    }

    @Override
    public void excute() {
        synchronized (commandName) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.commandName + "cooking BBQ 耗时 1秒");
        }
    }
}
