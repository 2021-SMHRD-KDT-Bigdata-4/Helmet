package kr.smhrd.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.smhrd.model.HelmetVO;
import kr.smhrd.model.LoginDAO;

public class HelmetjoinController implements Controller {

   @Override
   public String requestHandler(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {

      String helmetid = request.getParameter("helmetid");// 파라메터값이 join 받아오는건지 아니면 sql문
      String helmetsize = request.getParameter("helmetsize");
      int loss = Integer.parseInt(request.getParameter("loss"));
      String helmetregister = request.getParameter("helmetregister");
      int disinfection = Integer.parseInt(request.getParameter("disinfection")); 
      String rentalshopid = request.getParameter("rentalshopid");

      HelmetVO hvo = new HelmetVO();
      hvo.setHelmetid(helmetid);
      hvo.setHelmetsize(helmetsize);
      hvo.setLoss(loss);
      hvo.setHelmetregister(helmetregister);
      hvo.setDisinfection(disinfection);
      hvo.setRentalshopid(rentalshopid);
      System.out.println(hvo.getLoss());
      String view = null;

      LoginDAO dao = new LoginDAO();
      HelmetVO helmetVO = dao.helmetInsert(hvo);
      
      // int cnt=dao.memberInsert(vo);
      PrintWriter hout = response.getWriter();
      if (helmetVO != null) {
         hout.print("YES");
         HttpSession hsession = request.getSession();
         hsession.setAttribute("helmetVO", helmetVO);
         System.out.println(helmetVO.getHelmetid());
      } else {
         hout.print("NO");
      }
      

      return null;
      
   }

}