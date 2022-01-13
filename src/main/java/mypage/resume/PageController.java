package mypage.resume;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/")
    public String home(){
        return "main_page/index";
    }

    @RequestMapping("/about_me")
    public String about_me(){
        return "about_me/index";
    }

    @RequestMapping("/project")
    public String project(){
        return "project/index";
    }

    @RequestMapping("/contest")
    public String contest(){
        return "contest/index";
    }

    @RequestMapping("/about_book")
    public String about_book(){
        return "about_book/index";
    }
}
