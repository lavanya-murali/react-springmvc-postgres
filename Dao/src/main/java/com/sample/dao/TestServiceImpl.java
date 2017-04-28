package com.sample.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dao.entity.TestEntity;
import com.sample.dao.entity.TestRepository;

@Service
public class TestServiceImpl implements TestService{
	@Autowired
	TestRepository testRepository;	
	
public String checkService(){
	TestEntity testEntity = new TestEntity();
	testEntity.setTestString("checking");
	testRepository.save(testEntity);
	return "Hello in Service";
}
}
