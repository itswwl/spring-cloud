package com.itswwl.practice.entry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "springcloud")
public class SpringCloud {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "springcloud")
	private String springCloud;
	
	@Column(name = "username")
	private String userName;
	
	@Column(name = "password")
	private String passWord;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSpringCloud() {
		return springCloud;
	}

	public void setSpringCloud(String springCloud) {
		this.springCloud = springCloud;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "SpringCloud [id=" + id + ", springCloud=" + springCloud + ", userName=" + userName + ", passWord="
				+ passWord + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((passWord == null) ? 0 : passWord.hashCode());
		result = prime * result + ((springCloud == null) ? 0 : springCloud.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SpringCloud other = (SpringCloud) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (passWord == null) {
			if (other.passWord != null)
				return false;
		} else if (!passWord.equals(other.passWord))
			return false;
		if (springCloud == null) {
			if (other.springCloud != null)
				return false;
		} else if (!springCloud.equals(other.springCloud))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	public SpringCloud() {
		super();
	}

	public SpringCloud(Long id, String springCloud, String userName, String passWord) {
		super();
		this.id = id;
		this.springCloud = springCloud;
		this.userName = userName;
		this.passWord = passWord;
	}


}
