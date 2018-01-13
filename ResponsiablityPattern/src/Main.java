/**
 * Created by zhuxiaolong on 2018/1/13.
 */
public class Main {


    public static void main(String[] args) {


//        创建公司人员
//        老板
        Boss boss = new Boss(null);
//        总经理
        GeneroManager generoManager = new GeneroManager(boss);
//        部门经理
        GroupManager gm = new GroupManager(generoManager);


        int money1=300;
        int money2=900;
        int money3=3000;

        System.out.println("请求加薪 "+money1);
        gm.dispatchDuty(money1);
        System.out.println("请求加薪 "+money2);
        gm.dispatchDuty(money2);
        System.out.println("请求加薪 "+money3);
        gm.dispatchDuty(money3);





    }
}
