package com.yedam.list;

public interface EmpService {
	// 기능정의. 구현X
	
	// 한건생성.
	public void createEmp(Employee emp); // public abstract void createEmp();
	
	// 전체조회.
	public void getEmpList();

	// 한건수정.
	public void ChangeEmp(Employee emp);

	// 한건삭제.
	public void removeEmp(int empId);
}
