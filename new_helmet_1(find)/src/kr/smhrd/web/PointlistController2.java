package kr.smhrd.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import kr.smhrd.model.LoginDAO;
import kr.smhrd.model.Point2VO;

public class PointlistController2 implements Controller {

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("접속성공?");

		String memberid = request.getParameter("memberid");
		LoginDAO dao = new LoginDAO();
		List<Point2VO> list = dao.pointlist2(memberid);

		Gson g = new Gson();
		String polist = g.toJson(list);
		System.out.println(polist);
		PrintWriter out = response.getWriter();
		out.println(polist);

		return null;
	}

}
