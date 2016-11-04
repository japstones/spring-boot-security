package pe.spring.portal.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Usuario on 04/11/2016.
 */
@Controller
public class PortalController {
    @RequestMapping("/")
    String index(Authentication au){
        if(au!= null && au.isAuthenticated()){
            return "redirect:dashboard";
        }
        return "login";
    }

    @RequestMapping("/login")
    String login(){
        return "login";
    }

    @RequestMapping("/dashboard")
    String portal(){
        return "dashboard";
    }

    @RequestMapping("/403")
    String noAutorizado(){
        return "403";
    }

}
