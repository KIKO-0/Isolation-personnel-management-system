package com.yqxd.entity;

/**
 * 隔离人员表
 * @author 15187
 *
 */
public class QuarantineQuarantine2 {
	private String quarantineId;
	private String quarantineName;
	private String quarantineSex;
	private int quarantineAge;
	private String quarantineNumber;
	private String quarantineSymptom;
	private String quarantineCheckDate;
	private String quarantineQuarantineDate;
	private String quarantineTravelPath;
	private String quarantinePassword;	
	private int departmentId;
	private String roomId;
	private String nucleicAcidResult;
	
	public String getQuarantineId() {
		return quarantineId;
	}
	public void setQuarantineId(String quarantineId) {
		this.quarantineId = quarantineId;
	}
	public String getQuarantineName() {
		return quarantineName;
	}
	public void setQuarantineName(String quarantineName) {
		this.quarantineName = quarantineName;
	}
	public String getQuarantineSex() {
		return quarantineSex;
	}
	public void setQuarantineSex(String quarantineSex) {
		this.quarantineSex = quarantineSex;
	}
	public int getQuarantineAge() {
		return quarantineAge;
	}
	public void setQuarantineAge(int quarantineAge) {
		this.quarantineAge = quarantineAge;
	}
	public String getQuarantineNumber() {
		return quarantineNumber;
	}
	public void setQuarantineNumber(String quarantineNumber) {
		this.quarantineNumber = quarantineNumber;
	}
	public String getQuarantineSymptom() {
		return quarantineSymptom;
	}
	public void setQuarantineSymptom(String quarantineSymptom) {
		this.quarantineSymptom = quarantineSymptom;
	}
	public String getQuarantineCheckDate() {
		return quarantineCheckDate;
	}
	public void setQuarantineCheckDate(String quarantineCheckDate) {
		this.quarantineCheckDate = quarantineCheckDate;
	}
	public String getQuarantineQuarantineDate() {
		return quarantineQuarantineDate;
	}
	public void setQuarantineQuarantineDate(String quarantineQuarantineDate) {
		this.quarantineQuarantineDate = quarantineQuarantineDate;
	}
	public String getQuarantineTravelPath() {
		return quarantineTravelPath;
	}
	public void setQuarantineTravelPath(String quarantineTravelPath) {
		this.quarantineTravelPath = quarantineTravelPath;
	}
	public String getQuarantinePassword() {
		return quarantinePassword;
	}
	public void setQuarantinePassword(String quarantinePassword) {
		this.quarantinePassword = quarantinePassword;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getNucleicAcidResult() {
		return nucleicAcidResult;
	}
	public void setNucleicAcidResult(String nucleicAcidResult) {
		this.nucleicAcidResult = nucleicAcidResult;
	}
	public QuarantineQuarantine2(String quarantineId, String quarantineName, String quarantineSex, int quarantineAge,
			String quarantineNumber, String quarantineSymptom, String quarantineCheckDate,
			String quarantineQuarantineDate, String quarantineTravelPath, String quarantinePassword, int departmentId,
			String roomId, String nucleicAcidResult) {
		super();
		this.quarantineId = quarantineId;
		this.quarantineName = quarantineName;
		this.quarantineSex = quarantineSex;
		this.quarantineAge = quarantineAge;
		this.quarantineNumber = quarantineNumber;
		this.quarantineSymptom = quarantineSymptom;
		this.quarantineCheckDate = quarantineCheckDate;
		this.quarantineQuarantineDate = quarantineQuarantineDate;
		this.quarantineTravelPath = quarantineTravelPath;
		this.quarantinePassword = quarantinePassword;
		this.departmentId = departmentId;
		this.roomId = roomId;
		this.nucleicAcidResult = nucleicAcidResult;
	}
	public QuarantineQuarantine2() {
		super();
	}
	@Override
	public String toString() {
		return "QuarantineQuarantine [quarantineId=" + quarantineId + ", quarantineName=" + quarantineName
				+ ", quarantineSex=" + quarantineSex + ", quarantineAge=" + quarantineAge + ", quarantineNumber="
				+ quarantineNumber + ", quarantineSymptom=" + quarantineSymptom + ", quarantineCheckDate="
				+ quarantineCheckDate + ", quarantineQuarantineDate=" + quarantineQuarantineDate
				+ ", quarantineTravelPath=" + quarantineTravelPath + ", quarantinePassword=" + quarantinePassword
				+ ", departmentId=" + departmentId + ", roomId=" + roomId + ", nucleicAcidResult=" + nucleicAcidResult
				+ "]";
	}
}
