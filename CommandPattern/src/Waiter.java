/**
 * Created by zhuxiaolong on 2018/1/13.
 */
public class Waiter extends AbstractReceiver {


    public Waiter(AbstractInvoker invoker) {
        super(invoker);
    }


    public void sendList(){
        this.invoker.receiveCommandList(this.commands);
    }




}
