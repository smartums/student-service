package org.sums.student.ejbs;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_DETAILS")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="ID")
	private long id;
	
	@Column(name="FIRM_ID")
	private long firmId;
	
	@Column(name="CODE", length=15)
	private String code;
	
	@Column(name="FIRST_NAME", length=50, nullable=false)
	private String firstName;
	
	@Column(name="MIDDLE_NAME", length=30)
	private String middleName;
	
	@Column(name="LAST_NAME", length=30)
	private String lastName;
	
	@Column(name="GENDER", length=1)
	private String gender;
	
	@Column(name="DOB")
	private Date dob;

	@Column(name="ADMISSION_DATE")
	private Date admissionDate;
	
	@Column(name="CLASS_ID")
	private long classId;
	
	@Column(name="SECTION_ID")
	private long sectionId;
	
	@Column(name="STATUS", length=1)
	private String status;
	
	@Column(name="USERNAME", length=100)
	private String username;
	
	@Column(name="PASSWORD", length=30)
	private String password;
	
	@Column(name="CREATED_BY", length=100)
	private String createdBy;
	
	@Column(name="CREATED_ON", length=30)
	private Date createdOn;
	
	@Column(name="UPDATED_BY", length=100)
	private String updatedBy;
	
	@Column(name="UPDATED_ON")
	private Date updatedOn;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getFirmId() {
		return firmId;
	}

	public void setFirmId(long firmId) {
		this.firmId = firmId;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public long getClassId() {
		return classId;
	}

	public void setClassId(long classId) {
		this.classId = classId;
	}

	public long getSectionId() {
		return sectionId;
	}

	public void setSectionId(long sectionId) {
		this.sectionId = sectionId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
