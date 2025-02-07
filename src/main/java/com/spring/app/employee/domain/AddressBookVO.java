package com.spring.app.employee.domain;

public class AddressBookVO {

	private String addressBookNo;   // 주소록고유번호
	private String FK_employeeNo;   // 사번
	private String firstName;       // 성
	private String middleName;      // 중간이름
	private String lastName;        // 이름(마지막 이름)
	private String company;         // 회사
	private String department;      // 부서
	private String rank;            // 직위
	private String email;           // 이메일  
	private String phoneNo;         // 휴대전화
	private String directCal;       // 내선번호
	private String companyAddress;  //회사주소
	
	//////////////////////////////////////////////////
	
	public String getAddressBookNo() {
		return addressBookNo;
	}
	
	public void setAddressBookNo(String addressBookNo) {
		this.addressBookNo = addressBookNo;
	}
	
	public String getFK_employeeNo() {
		return FK_employeeNo;
	}
	
	public void setFK_employeeNo(String fK_employeeNo) {
		FK_employeeNo = fK_employeeNo;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getRank() {
		return rank;
	}
	
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}
	
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public String getDirectCal() {
		return directCal;
	}
	
	public void setDirectCal(String directCal) {
		this.directCal = directCal;
	}
	
	public String getCompanyAddress() {
		return companyAddress;
	}
	
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	
}
