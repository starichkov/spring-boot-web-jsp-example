package org.starichkov.java.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Vadim Starichkov
 * @since 12.02.2018 13:46
 */
@Controller
public class ViewController {
    @RequestMapping("/welcome")
    public String welcome(Model model, @RequestParam(name = "name", required = false, defaultValue = "Anonymous User") String name) {
        model.addAttribute("user", name);
        return "welcome";
    }
}
