package choco.member.controller;



import choco.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MemberController {
    @Autowired
    private MemberService service;

    //회원 가입 폼 요청 처리
    @RequestMapping("/member/signup_form")
    public String signupForm() {
        return "member/signup_form";
    }

}