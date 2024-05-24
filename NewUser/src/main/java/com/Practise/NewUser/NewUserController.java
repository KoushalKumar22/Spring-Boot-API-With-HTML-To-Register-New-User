package com.Practise.NewUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NewUserController {

    @Autowired
    NewUserRepository nrepo;

    @GetMapping("/")
    public String newuser(){
        return "NewUser";
    }

    @PostMapping("/register")
    public String userinput(@ModelAttribute NewUser newUser, Model model){
        System.out.println(newUser.toString());

        NewUser userinput=nrepo.save(newUser);

        model.addAttribute("message", newUser.getName()+" "+"Inserted");
        return "Welcome";
    }
}
