/**
 * Created by zhuxiaolong on 2018/1/13.
 */
public class Boss extends AbstractManager {


    public Boss(AbstractManager superior) {
        super(superior);

    }

    @Override
    public boolean dispatchDuty(int money) {
        if (money < 3000) {
            System.out.println("大老板同意加薪");
            return true;
        } else {
            System.out.println("大老板不同意加薪");
            return false;
        }
    }
}
