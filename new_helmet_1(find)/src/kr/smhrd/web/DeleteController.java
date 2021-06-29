package kr.smhrd.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.LoginDAO;

public class DeleteController implements Controller {

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//controller가 안들어감...!@!!!
		System.out.println("실행?");
		System.out.println("why?");
		String memberid = request.getParameter("memberid");
		LoginDAO dao=new LoginDAO();
		
		
		System.out.println("삭제전 실행");
		int cnt=dao.memberDelete(memberid);
		System.out.println("삭제후 실행");
		
		PrintWriter out=response.getWriter();
		out.println(cnt);
		
		return null;
	}

}
