package hibernate.controller;

import hibernate.service.AccountService;
import hibernate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class UserBankController {

    private AccountService accountService;
    private UserService userService;

    @Autowired
    public void setService(AccountService accountService, UserService userService) {
        this.accountService = accountService;
        this.userService = userService;
    }

    @GetMapping(value = "/")
    public String showStartPage(ModelMap model) {
        return "index";
    }

    @PostMapping(value = "/TheMostRichest")
    public String theMostRichest(ModelMap model) {
        model.addAttribute("theMostRichest",
                userService.getUserById(accountService.getUserIdWithBiggestAccount()).getName());
        return "index";
    }

    @PostMapping(value = "/AccountsSum")
    public String accountsSum(ModelMap model) {
        model.addAttribute("accountsSum", accountService.getAccountsSum());
        return "index";
    }

}
