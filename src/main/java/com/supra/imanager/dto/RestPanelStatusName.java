package com.supra.imanager.dto;
// Generated Jun 1, 2018 7:55:07 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * RestPanelStatusName generated by hbm2java
 */
@Entity
@Table(name = "restPanelStatusName")
@NamedQueries({
	@NamedQuery(name="M11", query="select rs from RestPanelStatusName rs where rs.panelId in (:selectedPanels)")
})
public class RestPanelStatusName implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7262268151986152540L;
	private int id;
	private String panelId;
	private String statusName;
	private String moduleName;
	private String statuscount;
	private String panelName;
	private String panelCode;
	
	
	
	
	public RestPanelStatusName() {
	}

	
	public RestPanelStatusName(int id, String panelId, String statusName, String moduleName, String statuscount,
			String panelName, String panelCode) {
		this.id = id;
		this.panelId = panelId;
		this.statusName = statusName;
		this.moduleName = moduleName;
		this.statuscount = statuscount;
		this.panelName = panelName;
		this.panelCode = panelCode;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "panelId", nullable = false, length = 45)
	public String getPanelId() {
		return this.panelId;
	}

	public void setPanelId(String panelId) {
		this.panelId = panelId;
	}

	@Column(name = "statusName", nullable = false, length = 45)
	public String getStatusName() {
		return this.statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	@Column(name = "moduleName", nullable = false, length = 45)
	public String getModuleName() {
		return this.moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	@Column(name = "statuscount", nullable = false, length = 45)
	public String getStatuscount() {
		return this.statuscount;
	}

	public void setStatuscount(String statuscount) {
		this.statuscount = statuscount;
	}

	@Column(name = "panelName", nullable = false, length = 45)
	public String getPanelName() {
		return this.panelName;
	}

	public void setPanelName(String panelName) {
		this.panelName = panelName;
	}

	@Column(name = "panelCode", nullable = false, length = 45)
	public String getPanelCode() {
		return this.panelCode;
	}

	public void setPanelCode(String panelCode) {
		this.panelCode = panelCode;
	}



		
	
}
