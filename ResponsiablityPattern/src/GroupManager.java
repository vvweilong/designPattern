/**
 * Created by zhuxiaolong on 2018/1/13.
 */
public class GroupManager extends AbstractManager {


    public GroupManager(AbstractManager superior) {
        super(superior);
    }

    @Override
    public boolean dispatchDuty(int money) {
        if (money < 500) {
            System.out.println("部门经理 同意加薪");
            return true;
        } else {
            System.out.println("超过部门经理权限 向上级提交申请");
            return superior.dispatchDuty(money);
        }
    }
}
