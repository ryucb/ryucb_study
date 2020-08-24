package com.test.web.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.web.dao.TestDao;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestDao dao;
	
	@Autowired
	private SqlSessionTemplate session;

	@Override
	public List<String> selectAll() {
		return dao.selectAll(session);
	}
	
	
	

}
