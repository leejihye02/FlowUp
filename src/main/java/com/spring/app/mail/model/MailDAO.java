package com.spring.app.mail.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.spring.app.mail.domain.MailVO;

@Mapper //@Mapper 어노테이션을 붙여서 DAO 역할의 Mapper 인터페이스 파일을 만든다. 
		//EmpDAO 인터페이스를 구현한 DAO 클래스를 생성하면 오류가 뜨므로 절대로 DAO 클래스를 생성하면 안된다.!!! 
		//@Mapper 어노테이션을 사용하면 빈으로 등록되며 Service단에서 @Autowired 하여 사용할 수 있게 된다.
public interface MailDAO {

	// 전체 메일
	List<MailVO> mailListAll();

	// 메일 작성
	
}
