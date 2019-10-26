package hibernate.dao;

import hibernate.model.Planet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Repository
public class DaoPlanet {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Transactional
    public Planet findById(int id) {
        return sessionFactory
                .getSessionFactory()
                .openSession()
                .get(Planet.class, id);
    }

    @Transactional
    public Planet save(Planet galaxy) {
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
}
