package io.jboot.admin.service.entity.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseInitialRiskExpertise<M extends BaseInitialRiskExpertise<M>> extends JbootModel<M> implements IBean {

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

    public void setExpertID(java.lang.Long expertID) {
        set("expertID", expertID);
    }

    public java.lang.Long getExpertID() {
        return getLong("expertID");
    }

    public void setRiskFactor(java.lang.String riskFactor) {
        set("riskFactor", riskFactor);
    }

    public java.lang.String getRiskFactor() {
        return getStr("riskFactor");
    }

    public void setRiskExpertise(java.lang.Integer riskExpertise) {
        set("riskExpertise", riskExpertise);
    }

    public java.lang.Integer getRiskExpertise() {
        return getInt("riskExpertise");
    }

    public void setRiskProbability(java.lang.Float riskProbability) {
        set("riskProbability", riskProbability);
    }

    public java.lang.Float getRiskProbability() {
        return getFloat("riskProbability");
    }

    public void setIncidenceExpertise(java.lang.Integer incidenceExpertise) {
        set("incidenceExpertise", incidenceExpertise);
    }

    public java.lang.Integer getIncidenceExpertise() {
        return getInt("incidenceExpertise");
    }

    public void setIncidenceProbability(java.lang.Float incidenceProbability) {
        set("incidenceProbability", incidenceProbability);
    }

    public java.lang.Float getIncidenceProbability() {
        return getFloat("incidenceProbability");
    }

    public void setRiskLevel(java.lang.Float riskLevel) {
        set("riskLevel", riskLevel);
    }

    public java.lang.Float getRiskLevel() {
        return getFloat("riskLevel");
    }

    public void setStatus(java.lang.Integer status) {
        set("status", status);
    }

    public java.lang.Integer getStatus() {
        return getInt("status");
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
