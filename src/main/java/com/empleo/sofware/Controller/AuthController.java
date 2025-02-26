package com.empleo.sofware.Controller;
import org.springframework.ui.ModelMap;

import ch.qos.logback.core.model.Model;
import com.empleo.sofware.Entidades.User;
import com.empleo.sofware.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {
    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String showRegistrationForm() {
        return "register";
    }


    @PostMapping("/register")
    public String registerUser(User user, @RequestParam("g-recaptcha-response") String recaptchaResponse, ModelMap model) {
        if (!userService.verifyRecaptcha(recaptchaResponse)) {
            model.addAttribute("error", "Captcha inválido");
            return "register";
        }
        userService.registerUser(user);
        return "redirect:/login";
    }
}
