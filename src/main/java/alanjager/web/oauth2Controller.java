package alanjager.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

/**
 * Created by zouye on 2016/10/31.
 */
@Controller
@RequestMapping("/oauth")
public class oauth2Controller {
    @RequestMapping("/user")
    public Principal user(Principal principal)
    {
        return principal;
    }
}
