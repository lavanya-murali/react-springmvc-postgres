package com.sample.dao;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{
//	@Autowired
//	TestRepository testRepository;	
	
public String checkService(){
//	TestEntity testEntity = new TestEntity();
//	testEntity.setTestString("checking");
//	testRepository.save(testEntity);
	return "Hello in Service";
}
}
