package kr.smhrd.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import kr.smhrd.model.LoginDAO;
import kr.smhrd.model.PointVO;
import kr.smhrd.model.RentVO;

public class plusController implements Controller {

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String memberid = request.getParameter("memberid");

		PointVO vo = new PointVO();
		vo.setMemberid(memberid);

		LoginDAO dao = new LoginDAO();

		int cnt = dao.pointPlus(vo);

		PrintWriter out = response.getWriter();
		out.println(cnt);

		return null;
	}

}