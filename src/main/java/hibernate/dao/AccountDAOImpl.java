package hibernate.dao;

import hibernate.model.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Repository
public class AccountDAOImpl {

   // private static final String SQL_GET_ALL= "SELECT user.name, user.surName, user.userId, SUM(account) as totalAccount from user join account on account.userId = user.userId GROUP BY userId ";
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Transactional
    public Account save(Account galaxy) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(galaxy);
        transaction.commit();
        session.close();
        return galaxy;
    }

    @Transactional
    public BigDecimal getAccountsSum() {
            Session session = sessionFactory.getCurrentSession();
        Query query = session.createSQLQuery("SELECT SUM(account) FROM userbank.Account;");
        return (BigDecimal) query.getSingleResult();
    }

    @Transactional
     public int getUserIdWithBiggestAccount(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createSQLQuery("SELECT DISTINCT userId FROM userbank.Account WHERE account =(SELECT  MAX(account) FROM Account);");
        return (Integer) query.getSingleResult();
    }
}
