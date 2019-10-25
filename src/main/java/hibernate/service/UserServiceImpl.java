package hibernate.service;

import hibernate.dao.UserDAO;
import hibernate.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    @Autowired
    public void setUserDAO(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }



}
