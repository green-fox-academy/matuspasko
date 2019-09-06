package com.greenfox.form.controllers;

import com.greenfox.form.models.Student;
import com.greenfox.form.servicies.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/enroll")
    public String newRegistration(ModelMap model){
        Student student = new Student();
        model.addAttribute("student", student);
        return "enroll";
    }

    @PostMapping("/save")
    public String saveRegistration(@Valid Student student, BindingResult result, ModelMap model, RedirectAttributes redirectAttributes){

        if (result.hasErrors()){
            System.out.println("has errors");
            return "enroll";
        }
        studentService.saveStudent(student);
        return "redirect:/viewstudents";
    }

    @RequestMapping("/viewstudents")
    public ModelAndView getAll(){

        List<Student> list = studentService.FindAll();
        return new ModelAndView("viewstudents","list",list);
    }
    @RequestMapping("/editstudent/{id}")
    public String edit (@PathVariable int id,ModelMap model){

        Student student=studentService.findOne(id);
        model.addAttribute("student",student);
        return "editstudent";
    }

    @PostMapping("/editsave")
    public ModelAndView editSave(@ModelAttribute("student") Student p){
        Student student=studentService.findOne(p.getId());

        student.setFirstName(p.getFirstName());
        student.setLastName(p.getLastName());
        student.setCountry(p.getCountry());
        student.setEmail(p.getEmail());
        student.setSection(p.getSection());
        student.setSex(p.getSex());

        studentService.saveStudent(student);
        return new ModelAndView("redirect:/viewstatus");
    }

    @GetMapping("/deletestudent/{id}")
    public ModelAndView delete(@PathVariable int id){
        Student student=studentService.findOne(id);
        studentService.delete(student);
        return new ModelAndView("redirect:/viewstudents");
    }

    @ModelAttribute("sections")
    public List<String> initializeSections(){
        List<String> sections = new ArrayList<String>();
        sections.add("Graduate");
        sections.add("Post Graduate");
        sections.add("Reasearch");
        return sections;
    }

    /*
     * Method used to populate the country list in view. Note that here you can
     * call external systems to provide real data.
     */
    @ModelAttribute("countries")
    public List<String> initializeCountries() {

        List<String> countries = new ArrayList<String>();
        countries.add("INDIA");
        countries.add("USA");
        countries.add("CANADA");
        countries.add("FRANCE");
        countries.add("GERMANY");
        countries.add("ITALY");
        countries.add("OTHER");
        return countries;
    }
}
