package com.test.web.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

public interface TestDao {

	List<String> selectAll(SqlSessionTemplate session);
	
}
