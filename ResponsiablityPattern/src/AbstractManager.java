/**
 * Created by zhuxiaolong on 2018/1/13.
 */
abstract public class AbstractManager {

    protected AbstractManager superior;

    public AbstractManager(AbstractManager superior) {
        this.superior = superior;
    }


    abstract public boolean dispatchDuty(int money);
}
