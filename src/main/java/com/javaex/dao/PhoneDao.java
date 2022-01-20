package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PersonVo;

@Repository
public class PhoneDao {

	@Autowired
	private SqlSession sqlSession;
	
	// selectList
	public List<PersonVo> getPersonList() {

		return null;
	}
//	public PersonVo getPerson(int personId) {
//		PersonVo personVo = null;
//
//		try {
//
//			// 3. SQL문 준비 / 바인딩 / 실행 --> 완성된 sql문을 가져와서 작성할것
//			String query = "";
//			query += " select  person_id, ";
//			query += "         name, ";
//			query += "         hp, ";
//			query += "         company ";
//			query += " from person ";
//			query += " where person_id = ? ";
//
//			pstmt = conn.prepareStatement(query); // 쿼리로 만들기
//
//			pstmt.setInt(1, personId); // ?(물음표) 중 1번째, 순서중요
//
//			rs = pstmt.executeQuery();
//
//			// 4.결과처리
//			rs.next();
//			int id = rs.getInt("person_id");
//			String name = rs.getString("name");
//			String hp = rs.getString("hp");
//			String company = rs.getString("company");
//
//			personVo = new PersonVo(id, name, hp, company);
//
//		} catch (SQLException e) {
//			System.out.println("error:" + e);
//		}
//
//		close();
//
//		return personVo;
//
//	}
//
//	// 사람 추가
//	// 사람 1명정보만 가져올때
//	public int personInsert(PersonVo personVo) {
//		int count = 0;
//		getConnection();
//
//		try {
//
//			// 3. SQL문 준비 / 바인딩 / 실행
//			String query = ""; // 쿼리문 문자열만들기, ? 주의
//			query += " INSERT INTO person ";
//			query += " VALUES (seq_person_id.nextval, ?, ?, ?) ";
//
//			pstmt = conn.prepareStatement(query); // 쿼리로 만들기
//
//			pstmt.setString(1, personVo.getName()); // ?(물음표) 중 1번째, 순서중요
//			pstmt.setString(2, personVo.getHp()); // ?(물음표) 중 2번째, 순서중요
//			pstmt.setString(3, personVo.getCompany()); // ?(물음표) 중 3번째, 순서중요
//
//			count = pstmt.executeUpdate(); // 쿼리문 실행
//
//			// 4.결과처리
//			// System.out.println("[" + count + "건 추가되었습니다.]");
//
//		} catch (SQLException e) {
//			System.out.println("error:" + e);
//		}
//		close();
//		return count;
//	}
//
//
//
//	// 사람 수정
//	public int personUpdate(PersonVo personVo) {
//		int count = 0;
//		getConnection();
//
//		try {
//
//			// 3. SQL문 준비 / 바인딩 / 실행
//			String query = ""; // 쿼리문 문자열만들기, ? 주의
//			query += " update person ";
//			query += " set name = ? , ";
//			query += "     hp = ? , ";
//			query += "     company = ? ";
//			query += " where person_id = ? ";
//
//			pstmt = conn.prepareStatement(query); // 쿼리로 만들기
//
//			pstmt.setString(1, personVo.getName()); // ?(물음표) 중 1번째, 순서중요
//			pstmt.setString(2, personVo.getHp()); // ?(물음표) 중 2번째, 순서중요
//			pstmt.setString(3, personVo.getCompany()); // ?(물음표) 중 3번째, 순서중요
//			pstmt.setInt(4, personVo.getPersonId()); // ?(물음표) 중 4번째, 순서중요
//
//			count = pstmt.executeUpdate(); // 쿼리문 실행
//
//			// 4.결과처리
//			// System.out.println(count + "건 수정되었습니다.");
//
//		} catch (SQLException e) {
//			System.out.println("error:" + e);
//		}
//
//		close();
//		return count;
//	}
//
//	// 사람 삭제
//	public int personDelete(int personId) {
//		int count = 0;
//		getConnection();
//
//		try {
//			// 3. SQL문 준비 / 바인딩 / 실행
//			String query = ""; // 쿼리문 문자열만들기, ? 주의
//			query += " delete person ";
//			query += " where person_id = ? ";
//			pstmt = conn.prepareStatement(query); // 쿼리로 만들기
//
//			pstmt.setInt(1, personId);// ?(물음표) 중 1번째, 순서중요
//
//			count = pstmt.executeUpdate(); // 쿼리문 실행
//
//			// 4.결과처리
//			// System.out.println(count + "건 삭제되었습니다.");
//
//		} catch (SQLException e) {
//			System.out.println("error:" + e);
//		}
//
//		close();
//		return count;
//	}

}