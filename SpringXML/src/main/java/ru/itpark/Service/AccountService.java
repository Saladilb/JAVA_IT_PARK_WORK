package ru.itpark.Service;

import java.util.List;

/**
 * Created by Student3 on 24.05.2017.
 */
public interface AccountService {
    void ADD(Account account );
    List<Account> getAll();
    void deposit(Account account, int sum) ;
    void withdraw(Account account, int sum) ;
    void transfer(Account sender,Account recipient, int sum) ;
}
