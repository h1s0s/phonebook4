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

	// 전화번호 가져오기
	public PersonVo getPerson(int personId) {
		System.out.println("PhoneDao > getPerson()");
		return sqlSession.selectOne("phonebook.selectOne", personId);
	}
	
	// 전체 리스트 가져오기
	public List<PersonVo> getPersonList() {
		System.out.println("PhoneDao > getPersonList()");
		List<PersonVo> personList = sqlSession.selectList("phonebook.selectList");
		System.out.println(personList);

		return personList;
	}

	// 전화번호 추가
	public int personInsert(PersonVo personVo) {
		System.out.println("PhoneDao > personInsert()");
		return sqlSession.insert("phonebook.insert", personVo);
	}

	// 전화번호 삭제
	public int personDelete(int personId) {
		System.out.println("PhoneDao > personDelete()");
		return sqlSession.delete("phonebook.delete", personId);
	}

	// 전화번호 수정
	public int personUpdate(PersonVo personVo) {
		System.out.println("PhoneDao > personUpdate()");
		return sqlSession.update("phonebook.update", personVo);
	}

}