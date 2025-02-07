package com.spring.app.draft.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.app.draft.model.DraftDAO;


// === 서비스 선언 === //
// 트랜잭션 처리를 담당하는 곳, 업무를 처리하는 곳, 비지니스(Business)단
@Service
public class DraftService_imple implements DraftService {
	
	@Autowired
	private DraftDAO dao;

	@Override
	public List<Map<String, String>> test() {
		List<Map<String, String>> testList = dao.test();
		return testList;
	}

	
}
