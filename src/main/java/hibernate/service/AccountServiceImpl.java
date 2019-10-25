package hibernate.service;

import hibernate.dao.AccountDAO;
import hibernate.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;



@Service
public class AccountServiceImpl implements AccountService {
    private AccountDAO accountDAO;


    @Autowired
    public void setAccountDAO(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    public List<Account> getAllAccounts() {
        return accountDAO.getAllAccounts();
    }

    public BigDecimal getAccountsSum() {
            return accountDAO.getAccountsSum();
    }

    public int getUserIdWithBiggestAccount() {
        return accountDAO.getUserIdWithBiggestAccount();
    }

}
