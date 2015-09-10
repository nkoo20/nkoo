package com.nkoo.web.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user", catalog="nkoo")
public class NUser implements Serializable{
	
	private static final long serialVersionUID = -4014708250972125369L;

	private Long id;
    
    private String phone;
    
    private String email;

    private String username;
    
    private String password;

    private String state;

    private Date createTime;
    
    private Set<NRole> roles;

    
    public NUser(Long id) {
		super();
		this.id = id;
	}

	public NUser() {
		super();
	}

	@Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @ManyToMany
    public Set<NRole> getRoles() {
		return roles;
	}

	public void setRoles(Set<NRole> roles) {
		this.roles = roles;
	}


}