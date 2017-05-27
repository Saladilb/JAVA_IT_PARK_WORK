package ru.itpark.Repository;

import ru.itpark.Service.Account;

import java.util.List;

/**
 * Created by Student3 on 24.05.2017.
 */
public interface AccountRepository {
    List<Account>
    void add(Account account);
    void save(Account account);
    void remove(Account account);

}
