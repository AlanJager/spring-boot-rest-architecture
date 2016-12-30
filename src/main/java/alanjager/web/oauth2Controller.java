package alanjager.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zouye on 2016/10/31.
 */
@Controller
@RequestMapping("/oauth")
public class oauth2Controller {
    @RequestMapping(value = "/github", method = RequestMethod.GET)
    @ResponseBody
    public Object oauth2github()
    {
        return null;
    }

    @RequestMapping(value = "/facebook", method = RequestMethod.GET)
    @ResponseBody
    public Object oauth2facebool()
    {
        return null;
    }
}
