package com.supra.imanager.dto;
// Generated Jun 1, 2018 7:55:07 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * SupraLeaveUserBalance generated by hbm2java
 */
@Entity
@Table(name = "supra_leave_user_balance", uniqueConstraints = @UniqueConstraint(columnNames = {
		"username", "leavecode", "leaveyear" }))
public class SupraLeaveUserBalance implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9056448168714266522L;
	private SupraLeaveUserBalanceId id;

	public SupraLeaveUserBalance() {
	}

	public SupraLeaveUserBalance(SupraLeaveUserBalanceId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "username", column = @Column(name = "username", length = 50)),
			@AttributeOverride(name = "leavebandid", column = @Column(name = "leavebandid", length = 50)),
			@AttributeOverride(name = "leavecode", column = @Column(name = "leavecode")),
			@AttributeOverride(name = "leavebalance", column = @Column(name = "leavebalance", length = 50)),
			@AttributeOverride(name = "totalallotedleave", column = @Column(name = "totalallotedleave", length = 50)),
			@AttributeOverride(name = "leaveyear", column = @Column(name = "leaveyear", length = 50)),
			@AttributeOverride(name = "balanceupdationflag", column = @Column(name = "balanceupdationflag", length = 5)),
			@AttributeOverride(name = "lastmodifiedby", column = @Column(name = "lastmodifiedby", length = 50)),
			@AttributeOverride(name = "lastmodifiedon", column = @Column(name = "lastmodifiedon", length = 19)) })
	public SupraLeaveUserBalanceId getId() {
		return this.id;
	}

	public void setId(SupraLeaveUserBalanceId id) {
		this.id = id;
	}

}
