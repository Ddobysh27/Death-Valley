//package by.devincubator.dobysh.controller;
//
//import by.devincubator.dobysh.model.User;
//import by.devincubator.dobysh.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//public class UserController {
//
//    private UserService userService;
//
//    @Autowired
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }
//
//    @RequestMapping(method = RequestMethod.GET)//post
//    public ModelAndView richestUser() {
//        ModelAndView modelAndView = new ModelAndView();
////        User user = userService.getRichestUser();
////        modelAndView.setViewName("richest");
////        modelAndView.addObject("userslist", user);
//        modelAndView.setViewName("richest");
//
//        return modelAndView;
//    }
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public ModelAndView editPage() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("index");
//        return modelAndView;
//    }
//}
