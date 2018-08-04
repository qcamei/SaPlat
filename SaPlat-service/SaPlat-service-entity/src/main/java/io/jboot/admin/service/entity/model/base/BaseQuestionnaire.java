package io.jboot.admin.service.entity.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseQuestionnaire<M extends BaseQuestionnaire<M>> extends JbootModel<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public void setSpell(java.lang.String spell) {
		set("spell", spell);
	}
	
	public java.lang.String getSpell() {
		return getStr("spell");
	}

	public void setProjectID(java.lang.Long projectID) {
		set("projectID", projectID);
	}
	
	public java.lang.Long getProjectID() {
		return getLong("projectID");
	}

	public void setDepartment(java.lang.String department) {
		set("department", department);
	}
	
	public java.lang.String getDepartment() {
		return getStr("department");
	}

	public void setSurveyTime(java.util.Date surveyTime) {
		set("surveyTime", surveyTime);
	}
	
	public java.util.Date getSurveyTime() {
		return get("surveyTime");
	}

	public void setType(java.lang.Integer type) {
		set("type", type);
	}
	
	public java.lang.Integer getType() {
		return getInt("type");
	}

	public void setUnit(java.lang.String unit) {
		set("unit", unit);
	}
	
	public java.lang.String getUnit() {
		return getStr("unit");
	}

	public void setUnitAddress(java.lang.String unitAddress) {
		set("unitAddress", unitAddress);
	}
	
	public java.lang.String getUnitAddress() {
		return getStr("unitAddress");
	}

	public void setUnitTel(java.lang.String unitTel) {
		set("unitTel", unitTel);
	}
	
	public java.lang.String getUnitTel() {
		return getStr("unitTel");
	}

	public void setPersonName(java.lang.String personName) {
		set("personName", personName);
	}
	
	public java.lang.String getPersonName() {
		return getStr("personName");
	}

	public void setPersonGender(java.lang.Integer personGender) {
		set("personGender", personGender);
	}
	
	public java.lang.Integer getPersonGender() {
		return getInt("personGender");
	}

	public void setNationID(java.lang.Long nationID) {
		set("nationID", nationID);
	}
	
	public java.lang.Long getNationID() {
		return getLong("nationID");
	}

	public void setAddr(java.lang.String addr) {
		set("addr", addr);
	}
	
	public java.lang.String getAddr() {
		return getStr("addr");
	}

	public void setPhone(java.lang.String phone) {
		set("phone", phone);
	}
	
	public java.lang.String getPhone() {
		return getStr("phone");
	}

	public void setIDCard(java.lang.String IDCard) {
		set("IDCard", IDCard);
	}
	
	public java.lang.String getIDCard() {
		return getStr("IDCard");
	}

	public void setAge(java.lang.Integer age) {
		set("age", age);
	}
	
	public java.lang.Integer getAge() {
		return getInt("age");
	}

	public void setOccupationID(java.lang.Long occupationID) {
		set("occupationID", occupationID);
	}
	
	public java.lang.Long getOccupationID() {
		return getLong("occupationID");
	}

	public void setDegreeOfEducationID(java.lang.Long degreeOfEducationID) {
		set("degreeOfEducationID", degreeOfEducationID);
	}
	
	public java.lang.Long getDegreeOfEducationID() {
		return getLong("degreeOfEducationID");
	}

	public void setCreateUserID(java.lang.Long createUserID) {
		set("createUserID", createUserID);
	}
	
	public java.lang.Long getCreateUserID() {
		return getLong("createUserID");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("createTime", createTime);
	}
	
	public java.util.Date getCreateTime() {
		return get("createTime");
	}

	public void setLastUpdateUserID(java.lang.Long lastUpdateUserID) {
		set("lastUpdateUserID", lastUpdateUserID);
	}
	
	public java.lang.Long getLastUpdateUserID() {
		return getLong("lastUpdateUserID");
	}

	public void setLastAccessTime(java.util.Date lastAccessTime) {
		set("lastAccessTime", lastAccessTime);
	}
	
	public java.util.Date getLastAccessTime() {
		return get("lastAccessTime");
	}

	public void setSort(java.lang.Integer sort) {
		set("sort", sort);
	}
	
	public java.lang.Integer getSort() {
		return getInt("sort");
	}

	public void setRemark(java.lang.String remark) {
		set("remark", remark);
	}
	
	public java.lang.String getRemark() {
		return getStr("remark");
	}

	public void setIsEnable(java.lang.Integer isEnable) {
		set("isEnable", isEnable);
	}
	
	public java.lang.Integer getIsEnable() {
		return getInt("isEnable");
	}

}