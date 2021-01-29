package kononikhin.aopDemo;

import kononikhin.Entity.Account;
import kononikhin.DAO.MemberShipDAO;
import kononikhin.aopDemo.Config.DemoConfig;
import kononikhin.DAO.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO accountDAO = context.getBean("accountDAO",AccountDAO.class);
        MemberShipDAO memberShipDAO = context.getBean("memberShipDAO",MemberShipDAO.class);
        Account account = new Account();

        account.setLevel("6");
        account.setName("6");


        accountDAO.addAccount(account);
        memberShipDAO.addMemberShipAccount();
        memberShipDAO.print(true);

        context.close();

    }
}
