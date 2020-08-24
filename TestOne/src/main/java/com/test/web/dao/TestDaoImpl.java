package com.test.web.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TestDaoImpl implements TestDao {

	@Override
	public List<String> selectAll(SqlSessionTemplate session) {
		return session.selectList("selectAll");
	}
	
	
	
}
