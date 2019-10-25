package hibernate.model;

import hibernate.config.HibernateConfig;
import hibernate.config.WebConfig;
import hibernate.dao.DaoPlanet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Test;


@ComponentScan(basePackages = "hibernate")
@ContextConfiguration(classes = {WebConfig.class, HibernateConfig.class})
@WebAppConfiguration
@PropertySource("classpath:db.properties")
@PropertySource(value = "classpath:hibernate.properties")
public class AccountTest extends AbstractTestNGSpringContextTests {

    @Autowired
    DaoPlanet daoPlanet;

    @Test
    public void testGetIdAccount() {

        Planet account = new Planet();
        account.setName("sqdwf");
        daoPlanet.save(account);

    }
}

