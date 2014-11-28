package com.vialent.warranty.controllers;

import com.vialent.warranty.model.Account;
import com.vialent.warranty.model.Device;
import com.vialent.warranty.model.InputParameters;
import com.vialent.warranty.repos.Repository;
import com.vialent.warranty.support.web.MessageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private Repository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute(new InputParameters());
        return "home/home";
    }

    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public String signup(@Valid @ModelAttribute InputParameters input, Errors errors, Model model, RedirectAttributes ra) {
        if (errors.hasErrors()) {
            return "home/home";
        }
        Account account = repository.findByEmail(input.getEmail());
        if (account != null) {
            List<Device> devices = repository.findBySerial(input.getSerial());
            if (devices != null && !devices.isEmpty()){
                model.addAttribute(devices);
            } else {
                MessageHelper.addErrorAttribute(ra, "serial.notfound");
            }
        } else {
           MessageHelper.addErrorAttribute(ra, "email.notfound");
        }
        return "home/home";
    }
}
