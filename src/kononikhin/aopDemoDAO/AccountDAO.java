package kononikhin.aopDemoDAO;


import kononikhin.Entity.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAccount(Account account) {
        System.out.println(getClass() + " Doing my JDBC work! Adding account");
    }
}
