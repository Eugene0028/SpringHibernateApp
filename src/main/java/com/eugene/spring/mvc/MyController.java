package com.eugene.spring.mvc;



import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


import jakarta.validation.*;
import java.util.ArrayList;
import java.util.List;


@EnableWebMvc
@Validated
@Controller
//@RequestMapping("/employee")
public class MyController {
    @RequestMapping("/")
    public String showFirstView()
    {
        //RootConfig rootConfig = new RootConfig();
        //rootConfig.configureDefaultServletHandling(defaultServletHandlerConfigurer);
        return "myView";
    }
    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model){
        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view";
    }

    @GetMapping(value = "/showDetails")
    public String showEmpDetails(@Valid @RequestBody @ModelAttribute("employee") Employee emp, BindingResult bindingResult)
    {
        return bindingResult.hasErrors() ? "ask-emp-details-view" : "show-emp-details-view";
    }

}


//@Controller
//@RequestMapping("/employee")
//public class MyController {
//    @RequestMapping("/")
//    public String showFirstView(){
//        return "myView";
//    }
//    @RequestMapping("/askDetails")
//    public String askEmployeeDetails(){
//        return "ask-emp-details-view";
//    }
//
//    @RequestMapping("/showDetails")
//    public String showEmpDetails(@RequestParam("employeeName") String empName, Model model){
//        empName = empName + "!!!111!!!";
//        model.addAttribute("nameAttribute",empName);
//        return "show-emp-details-view";
//    }
//
//}






//    @RequestMapping("/showDetails")
//    public String showEmpDetails(){
//        return "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails(HttpServletRequest request, Model model){
//
//        String empName = request.getParameter("employeeName");
//        empName = "Mr. " + empName;
//        model.addAttribute("nameAttribute", empName);
//
//
//        return "show-emp-details-view";
//    }