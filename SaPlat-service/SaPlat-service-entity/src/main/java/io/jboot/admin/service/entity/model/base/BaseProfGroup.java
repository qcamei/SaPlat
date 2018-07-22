package io.jboot.admin.service.entity.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseProfGroup<M extends BaseProfGroup<M>> extends JbootModel<M> implements IBean {

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

	public void setOrgID(java.lang.Long orgID) {
		set("orgID", orgID);
	}
	
	public java.lang.Long getOrgID() {
		return getLong("orgID");
	}

	public void setScope(java.lang.String scope) {
		set("scope", scope);
	}
	
	public java.lang.String getScope() {
		return getStr("scope");
	}

	public void setPerformance(java.lang.String performance) {
		set("performance", performance);
	}
	
	public java.lang.String getPerformance() {
		return getStr("performance");
	}

	public void setResume(java.lang.String resume) {
		set("resume", resume);
	}
	
	public java.lang.String getResume() {
		return getStr("resume");
	}

	public void setContent(java.lang.String content) {
		set("content", content);
	}
	
	public java.lang.String getContent() {
		return getStr("content");
	}

	public void setCapital(java.lang.Double capital) {
		set("capital", capital);
	}
	
	public java.lang.Double getCapital() {
		return getDouble("capital");
	}

	public void setAdministrator(java.lang.String administrator) {
		set("administrator", administrator);
	}
	
	public java.lang.String getAdministrator() {
		return getStr("administrator");
	}

	public void setContact(java.lang.String contact) {
		set("contact", contact);
	}
	
	public java.lang.String getContact() {
		return getStr("contact");
	}

	public void setIdentity(java.lang.String identity) {
		set("identity", identity);
	}
	
	public java.lang.String getIdentity() {
		return getStr("identity");
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

	public void setIsEnable(java.lang.Boolean isEnable) {
		set("isEnable", isEnable);
	}
	
	public java.lang.Boolean getIsEnable() {
		return get("isEnable");
	}

}
