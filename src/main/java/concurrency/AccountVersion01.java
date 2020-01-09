package concurrency;

/**
 * @author zhangyue95
 * @date 2019/10/10.
 */
public class AccountVersion01 {

    //actr应该是单例
    private Allocator actr;
    private int balance;
    //转账
    void transer(AccountVersion01 target, int amt) {
        //一次性申请转出账户和转入账户，直到成功
        while (!actr.apply(this, target)) {};
        try {
            //锁定转出账户
            synchronized (this) {
                //锁定转入账户
                synchronized (target) {
                    if (balance > amt) {
                        balance -= amt;
                        target.balance += amt;
                    }
                }
            }
        } finally {
            actr.free(this, target);
        }
    }
}
