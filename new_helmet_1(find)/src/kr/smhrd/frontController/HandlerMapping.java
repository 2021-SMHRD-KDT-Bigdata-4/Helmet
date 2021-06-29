package kr.smhrd.frontController;

import java.util.HashMap;

import kr.smhrd.web.LoginCheckController;
import kr.smhrd.web.LogoutCheckController;
import kr.smhrd.web.controller_python;
import kr.smhrd.web.plusController;
import kr.smhrd.web.MemberUpdateController;
import kr.smhrd.web.PointlistController;
import kr.smhrd.web.RentalshoplistController;
import kr.smhrd.web.ReserveController;
import kr.smhrd.web.AmemberlistController;
import kr.smhrd.web.ContactusController;
import kr.smhrd.web.Controller;
import kr.smhrd.web.HelmetjoinController;
import kr.smhrd.web.HelmetlistController;
import kr.smhrd.web.HelmetrentlistController;
import kr.smhrd.web.JoinController;

public class HandlerMapping {
	private HashMap<String, Controller> mappings;

	public HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		mappings.put("/loginCheck.go", new LoginCheckController());
		mappings.put("/logoutCheck.go", new LogoutCheckController());
		mappings.put("/join.go", new JoinController());
		mappings.put("/controller_python.go", new controller_python());
		mappings.put("/memberupdate.go", new MemberUpdateController());
		mappings.put("/mypointlist.go", new PointlistController());
		mappings.put("/helmet.go", new HelmetlistController());
		mappings.put("/amemberlist.go", new AmemberlistController());
		mappings.put("/helmetrentlist.go", new HelmetrentlistController());
		mappings.put("/rentalshoplist.go", new RentalshoplistController());
		mappings.put("/reserve.go", new ReserveController());
		mappings.put("/helmetjoin.go", new HelmetjoinController());
		mappings.put("/contactus.go", new ContactusController());
		mappings.put("/plus.go", new plusController());
	}

	public Controller getController(String command) {
		return mappings.get(command);
	}
}
