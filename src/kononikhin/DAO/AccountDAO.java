package kononikhin.DAO;


import kononikhin.Entity.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    private String name;
    private int code;

    public void addAccount(Account account) {
        System.out.println(getClass() + " Doing my JDBC work! Adding account");
    }

    public String getName() {
        System.out.println("In get name");
        return name;
    }

    public void setName(String name) {
        System.out.println("In set name");
        this.name = name;
    }

    public int getCode() {
        System.out.println("In set code");
        return code;
    }

    public void setCode(int code) {
        System.out.println("In set code");
        this.code = code;
    }
}
