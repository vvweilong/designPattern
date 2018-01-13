/**
 * Created by zhuxiaolong on 2018/1/13.
 */
public class main {


    public static void main(String[] args) {

//        main 就是顾客
//        首先创建 命令

        BBQcommand bbQcommand1 = new BBQcommand("烤肉筋");
        BBQcommand bbQcommand2 = new BBQcommand("烤鸡翅");
        BBQcommand bbQcommand3 = new BBQcommand("烤心管");
        FireRiceCommand fireRiceCommand1 = new FireRiceCommand("鸡蛋炒饭");
        FireRiceCommand fireRiceCommand2 = new FireRiceCommand("肉丝炒饭");
        FireRiceCommand fireRiceCommand3 = new FireRiceCommand("鱼翅炒饭");


        Waiter waiter = new Waiter(new Cooker());


        waiter.addCommand(bbQcommand1);
        waiter.addCommand(fireRiceCommand1);
        waiter.addCommand(bbQcommand2);
        waiter.addCommand(fireRiceCommand2);
        waiter.addCommand(bbQcommand3);
        waiter.addCommand(fireRiceCommand3);

        new Thread() {

            @Override
            public void run() {
                super.run();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (bbQcommand2) {
                    waiter.cancelCommand(bbQcommand2);
                }
            }
        }.start();
        waiter.sendList();


    }
}
