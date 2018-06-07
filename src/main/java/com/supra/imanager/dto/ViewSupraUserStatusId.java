package com.supra.imanager.dto;
// Generated Jun 1, 2018 7:55:07 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ViewSupraUserStatusId generated by hbm2java
 */
@Embeddable
public class ViewSupraUserStatusId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6239852173836430933L;
	private String module;
	private long statuscount;
	private String status;
	private String username;

	public ViewSupraUserStatusId() {
	}

	public ViewSupraUserStatusId(String module, long statuscount) {
		this.module = module;
		this.statuscount = statuscount;
	}

	public ViewSupraUserStatusId(String module, long statuscount, String status, String username) {
		this.module = module;
		this.statuscount = statuscount;
		this.status = status;
		this.username = username;
	}

	@Column(name = "module", nullable = false, length = 13)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	@Column(name = "statuscount", nullable = false)
	public long getStatuscount() {
		return this.statuscount;
	}

	public void setStatuscount(long statuscount) {
		this.statuscount = statuscount;
	}

	@Column(name = "status", length = 50)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "username", length = 50)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ViewSupraUserStatusId))
			return false;
		ViewSupraUserStatusId castOther = (ViewSupraUserStatusId) other;

		return ((this.getModule() == castOther.getModule()) || (this.getModule() != null
				&& castOther.getModule() != null && this.getModule().equals(castOther.getModule())))
				&& (this.getStatuscount() == castOther.getStatuscount())
				&& ((this.getStatus() == castOther.getStatus()) || (this.getStatus() != null
						&& castOther.getStatus() != null && this.getStatus().equals(castOther.getStatus())))
				&& ((this.getUsername() == castOther.getUsername()) || (this.getUsername() != null
						&& castOther.getUsername() != null && this.getUsername().equals(castOther.getUsername())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getModule() == null ? 0 : this.getModule().hashCode());
		result = 37 * result + (int) this.getStatuscount();
		result = 37 * result + (getStatus() == null ? 0 : this.getStatus().hashCode());
		result = 37 * result + (getUsername() == null ? 0 : this.getUsername().hashCode());
		return result;
	}

}
