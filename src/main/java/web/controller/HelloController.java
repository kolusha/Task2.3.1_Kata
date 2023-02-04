package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.dao.UserDao;


@Controller
public class HelloController {
    private final UserDao userDao;

    @Autowired
    public HelloController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/")
    public String printWelcome(Model model) {
        model.addAttribute("users", userDao.getAllUsers());

        return "index";
    }

}