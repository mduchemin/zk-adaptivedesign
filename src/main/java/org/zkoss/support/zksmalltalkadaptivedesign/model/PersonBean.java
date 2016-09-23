package org.zkoss.support.zksmalltalkadaptivedesign.model;

public class PersonBean {

	private String firstName;
	private String lastName;
	private Boolean activated;
	private String jobTitle;
	private int employeeId;
	
	public PersonBean(int employeeId,String firstName, String lastName, String jobTitle, Boolean activated) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.activated = activated;
		this.jobTitle = jobTitle;
		this.employeeId = employeeId;
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
	public Boolean getActivated() {
		return activated;
	}
	public void setActivated(Boolean activated) {
		this.activated = activated;
	}
	public String getjobTitle() {
		return jobTitle;
	}
	public void setjobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
}
