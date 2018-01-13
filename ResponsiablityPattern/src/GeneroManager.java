/**
 * Created by zhuxiaolong on 2018/1/13.
 */
public class GeneroManager extends AbstractManager {

    public GeneroManager(AbstractManager superior) {
        super(superior);
    }

    @Override
    public boolean dispatchDuty(int money) {
        if (money < 1000) {
            System.out.println("总经理 同意加薪");
            return true;
        } else {
            System.out.println("超过 总经理权限 向上提交申请");
            return superior.dispatchDuty(money);
        }
    }
}
