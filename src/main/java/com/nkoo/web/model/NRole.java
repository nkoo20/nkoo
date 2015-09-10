package com.nkoo.web.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * 角色模型
 * 
 * @author StarZou
 * @since 2014年7月17日 下午1:02:25
 **/
@Entity
@Table(name = "role", catalog="nkoo")
public class NRole implements Serializable{
	
	private static final long serialVersionUID = 7983250258077472636L;

	private Long id;

    private String name;

    private Set<NPermission> permissions;
    
    public NRole(Long id) {
		super();
		this.id = id;
	}

	public NRole() {
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

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


    @ManyToMany
    public Set<NPermission> getPermissions() {
		return permissions;
	}

	public void setPermissions(Set<NPermission> permissions) {
		this.permissions = permissions;
	}


}