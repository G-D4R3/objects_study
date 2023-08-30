package dare.dare.object_study.chapter1;

import dare.dare.object_study.chapter1.domains.Audience;
import dare.dare.object_study.chapter1.domains.Bag;
import dare.dare.object_study.chapter1.domains.Invitation;
import dare.dare.object_study.chapter1.services.Verse1Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDateTime;

@Controller
@RequestMapping(value = "/chapter1")
public class Chapter1Controller {

    @GetMapping("")
    public String chapter1(Model model) {
        return "chapter1/index";
    }

    @GetMapping("verse1")
    public String verse1(Model model) {
        return "chapter1/verse1/enter";
    }

    @PostMapping("verse1/enter")
    public String enter(Long audienceId, Long theaterId) {
        Bag hasNotInvitationBag = new Bag(30000L);
        Audience hasNotInvitationAudience = new Audience(hasNotInvitationBag);

        LocalDateTime today = LocalDateTime.now();
        Invitation invitation = new Invitation(today);
        Bag hasInvitationBag = new Bag(invitation, 30000L);
        Audience hasInvitationAudience = new Audience(hasInvitationBag);

        Verse1Service service = new Verse1Service();
        service.enter(hasNotInvitationAudience);
        service.enter(hasInvitationAudience);
        return "redirect:/chapter1/verse1/enterComplete";
    }

    @GetMapping("verse1/enterComplete")
    public String enterComplete(Model model) {
        return "chapter1/verse1/enterComplete";
    }
}
