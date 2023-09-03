package dare.dare.object_study.chapter2;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/chapter2")
public class Chapter2Contoller {

    @GetMapping("")
    public String chapter2(Model model) {
        return "chapter2/index";
    }
}
