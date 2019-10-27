package hibernate.model;

import hibernate.config.HibernateConfig;
import hibernate.config.WebConfig;
import hibernate.dao.UserDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@ComponentScan(basePackages = "hibernate")
@ContextConfiguration(classes = {WebConfig.class, HibernateConfig.class})
@WebAppConfiguration
@PropertySource("classpath:db.properties")
@PropertySource(value = "classpath:hibernate.properties")
public class UserDAOImplTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private UserDAOImpl userDAO;

    @Test
    public void testGetUserById()  {
        User user = new User();
        user.setId(1);
        user.setName("John");
        user.setSurname("Snow");
        Assert.assertEquals(user, userDAO.getUserById(1));
                // Comment
    }
}