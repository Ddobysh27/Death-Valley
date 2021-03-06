package hibernate.model;

import hibernate.config.HibernateConfig;
import hibernate.config.WebConfig;
import hibernate.dao.AccountDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;


@ComponentScan(basePackages = "hibernate")
@ContextConfiguration(classes = {WebConfig.class, HibernateConfig.class})
@WebAppConfiguration
@PropertySource("classpath:db.properties")
@PropertySource(value = "classpath:hibernate.properties")
public class AccountTest extends AbstractTestNGSpringContextTests {

//    @Autowired
//    DaoPlanet daoPlanet;


    @Autowired
    private AccountDAOImpl accountDAO;

    @Test
    public void testGetIdAccount() {
        BigDecimal decimal = new BigDecimal(11966);
        Assert.assertEquals(decimal, accountDAO.getAccountsSum());
    }

    @Test
    public void testGetUserIdWithBiggestAccount(){
        Assert.assertEquals(9, accountDAO.getUserIdWithBiggestAccount());

    }
}
