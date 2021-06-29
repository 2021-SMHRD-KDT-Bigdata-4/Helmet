package kr.smhrd.model;

import java.io.InputStream;
import java.sql.Connection;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class LoginDAO {

	// 프레임 워크에서 변수 이름을 만들 때 변수 이름을 축약하지 않고, 맨 앞의 문자를 소문자로 설정
	private static SqlSessionFactory sqlSessionFactory;

	static {

		try {
			// 컨넥션 툴을 만드는 작업
			String resource = "kr/smhrd/mybatis/config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public LoginVO loginMember(LoginVO vo) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		vo = sqlSession.selectOne("loginMember", vo);
		sqlSession.close();
		return vo;
	}

	public LoginVO memberInsert(LoginVO vo) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		vo = sqlSession.selectOne("memberInsert", vo);
		sqlSession.close();
		return vo;
	}

	public int reserveInsert(RentVO vo) {

		SqlSession sqlSession = sqlSessionFactory.openSession();
		System.out.println(vo.getRentplaceid());
		System.out.println(vo.getMemberid());
		System.out.println(vo.getHelmetid());
		int cnt = sqlSession.insert("reserveInsert", vo);
		System.out.println("나와라얍!2");
		sqlSession.commit();
		sqlSession.close();
		return cnt;
	}

	public int returnUpdate(RentVO vo) {

		SqlSession sqlSession = sqlSessionFactory.openSession();

		int cnt = sqlSession.update("returnUpdate", vo);
		System.out.println("나와라얍!3");
		sqlSession.commit();
		sqlSession.close();
		return cnt;
	}

	public int memberUpdate(LoginVO vo) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int cnt = sqlSession.update("memberUpdate", vo);
		sqlSession.commit();
		sqlSession.close();
		return cnt;
	}

	public List<PointVO> pointlist(String memberid) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<PointVO> list = sqlSession.selectList("pointlist", memberid);
		sqlSession.close();// 반납
		return list;
	}

	public List<RentVO> rentlist(String memberid) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<RentVO> list = sqlSession.selectList("rentlist", memberid);
		sqlSession.close();// 반납
		return list;
	}

	public List<HelmetVO> helmetlist() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<HelmetVO> list = sqlSession.selectList("helmetlist");
		sqlSession.close();// 반납
		return list;
	}

	public HelmetVO helmetInsert(HelmetVO hvo) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		hvo = sqlSession.selectOne("helmetInsert", hvo);
		sqlSession.close();
		return hvo;
	}

	public List<LoginVO> memberlist() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<LoginVO> list = sqlSession.selectList("memberlist");
		sqlSession.close();// 반납
		return list;
	}

	public List<RentalshopVO> rentalshoplist() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<RentalshopVO> list = sqlSession.selectList("rentalshoplist");
		sqlSession.close();// 반납
		return list;
	}

	public List<ContactusVO> contactuslist() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<ContactusVO> list = sqlSession.selectList("contactuslist");
		sqlSession.close();// 반납
		return list;
	}

	public int pointPlus(PointVO vo) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int cnt = sqlSession.insert("pointPlus", vo);
		System.out.println("나와라얍!2");
		sqlSession.commit();
		sqlSession.close();
		return cnt;
	}
}