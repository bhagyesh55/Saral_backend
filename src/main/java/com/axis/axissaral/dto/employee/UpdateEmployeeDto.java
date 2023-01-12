package com.axis.axissaral.dto.employee;

public class UpdateEmployeeDto {
	private Integer id;
	private  String firstName;
    private  String lastName;
    private String email;
    private  String gender;
    private  String status;
    private  Long mobileNumber;
    private  String designation;    
    private String projectName;
    private String moduleName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getProjectName() {
		return projectName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public UpdateEmployeeDto(Integer id, String firstName, String lastName, String email, String gender, String status,
			Long mobileNumber, String designation, String projectName, String moduleName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.status = status;
		this.mobileNumber = mobileNumber;
		this.designation = designation;
		this.projectName = projectName;
		this.moduleName = moduleName;
	}

    

}
