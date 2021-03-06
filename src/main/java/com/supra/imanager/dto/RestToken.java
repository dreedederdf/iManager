package com.supra.imanager.dto;
// Generated May 31, 2018 10:48:57 PM by Hibernate Tools 4.0.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * RestToken generated by hbm2java
 */
@Entity
@Table(name = "restToken")
public class RestToken implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 657485909844932394L;
	private Long idrestToken;
	private String deviceId;
	private String deviceName;
	private String userName;
	private String token;

	public RestToken() {
	}

	public RestToken(Long idrestToken, String deviceId, String deviceName, String userName, String token) {
		this.idrestToken = idrestToken;
		this.deviceId = deviceId;
		this.deviceName = deviceName;
		this.userName = userName;
		this.token = token;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "idrestToken", unique = true, nullable = false)
	public Long getIdrestToken() {
		return this.idrestToken;
	}

	public void setIdrestToken(Long idrestToken) {
		this.idrestToken = idrestToken;
	}

	@Column(name = "deviceId", nullable = false, length = 45)
	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	@Column(name = "deviceName", nullable = false, length = 45)
	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	@Column(name = "userName", nullable = false, length = 45)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "token", nullable = false, length = 45)
	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
