package hibernate.dao;

import hibernate.model.Account;
import org.springframework.stereotype.Component;


import java.math.BigDecimal;
import java.util.List;

@Component
public interface AccountDAO {
    List<Account> getAllAccounts();
    BigDecimal getAccountsSum();
    int getUserIdWithBiggestAccount();
}
