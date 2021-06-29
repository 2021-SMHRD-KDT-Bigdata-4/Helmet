package kr.smhrd.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.LoginDAO;
import kr.smhrd.model.RentVO;

public class ReserveController implements Controller {

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		String rentplaceid = request.getParameter("rentplaceid");
		String memberid = request.getParameter("memberid");
		String helmetid = request.getParameter("helmetid");
		
		RentVO vo = new RentVO();
		vo.setRentplaceid(rentplaceid);
		vo.setMemberid(memberid);
		vo.setHelmetid(helmetid);
		
		LoginDAO dao = new LoginDAO();
		
		int cnt = dao.reserveInsert(vo);
		
		PrintWriter out = response.getWriter();
		out.println(cnt);

		return null;

	}

}
