package hibernate.service;

import hibernate.model.Account;

import java.math.BigDecimal;
import java.util.List;

public interface AccountService {
    List<Account> getAllAccounts();
    BigDecimal getAccountsSum();
    int getUserIdWithBiggestAccount();
}
