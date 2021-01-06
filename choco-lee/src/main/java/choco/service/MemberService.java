package choco.service;

import choco.member.dto.MemberDto;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

public interface MemberService {
    //ȸ�� ������ �߰��ϴ� ����Ͻ� ������ �����ϴ� �޼ҵ� ���� �����ϱ�
    public void addUser(ModelAndView mView, MemberDto dto);
    //�α��� ó���� �ϴ� �޼ҵ�
    public void validUser(HttpSession session, ModelAndView mView, MemberDto dto);
    //���̵� ��밡�� ���θ� Map �� ��Ƽ� �����ϴ� ���� ó��
    public Map<String, Object> canUseId(String inputId);
    //���������� �����ֱ� ���� ����Ͻ� ���� ó��
    public void showInfo(HttpSession session, ModelAndView mView);
    //�������� �����ݿ��ϴ� �޼ҵ�
    public void updateUser(MemberDto dto);
    //�������� �����ϴ� �޼ҵ�
    public void deleteUser(HttpSession session);
    //��й�ȣ �����ݿ��ϴ� �޼ҵ�
    public void updatePwd(HttpServletRequest request);
}