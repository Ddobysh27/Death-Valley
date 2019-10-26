package hibernate.service;


import hibernate.dao.AccountDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;




@Service
public class AccountServiceImpl{// implements AccountService {

    private AccountDAOImpl accountDAO;

    @Autowired
    private void setAccountDAO(AccountDAOImpl accountDAO) {
        this.accountDAO = accountDAO;
    }


    public BigDecimal getAccountsSum() {
            return accountDAO.getAccountsSum();
    }

    public int getUserIdWithBiggestAccount() {
        return accountDAO.getUserIdWithBiggestAccount();
    }

}
