package foxapp.demo.controllers;

import foxapp.demo.models.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class FoxController {

    List<Fox> foxes;

    public FoxController() {

        this.foxes = new ArrayList<>(Arrays.asList(new Fox("Robocop", "iron", "kill")));
    }

    @RequestMapping(path = "/")
    public String displayFOx(Model model, @RequestParam(required = false) String name) {
        if (name.equals(foxes.get(0).getName())) {
            model.addAttribute("name", foxes.get(0).getName());
            model.addAttribute("food",foxes.get(0).getDrink());
            model.addAttribute("drink", foxes.get(0).getFood());
        }
        return "index";
    }

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public String LoginGet() {
        return "login";
    }

    @RequestMapping(path = "/login", method = RequestMethod.PUT)
    public String LoginPut(@RequestParam(required = false) String name) {
        return "redirect:/?name=" + name;
    }
}
