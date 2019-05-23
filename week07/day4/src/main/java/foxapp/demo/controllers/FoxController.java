package foxapp.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FoxController {
// toto je uplny yaklad vdaka tomu dasme vediet Html co ma zobrayit a ako sa tam dostane
    @RequestMapping(path = "/route")
    public String displayFOx(Model model) {
        // tento string sa nam zobrazi na stranke
        String str = "text";
        // vzdy musia bit dva parametre
        model.addAttribute("test", str);
        return "index";
    }
 //   @RequestMapping(path = "/login")


}
