//package by.devincubator.dobysh.controller;
//
//import by.devincubator.dobysh.service.AccountService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//
//public class AccountController {
//
//    private AccountService accountService;
//
//    @Autowired
//    public void setAccountService(AccountService accountService) {
//        this.accountService = accountService;
//    }
//
//    public ModelAndView getAccountSum() {
//        double accountSum = accountService.getAccountsSum();
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("sums");
//        modelAndView.addObject("accountSum", accountSum);
//        return modelAndView;
//    }
//
//    @GetMapping(value = "/")
//    public String index() {
//        return "index";
//    }
//
//}
