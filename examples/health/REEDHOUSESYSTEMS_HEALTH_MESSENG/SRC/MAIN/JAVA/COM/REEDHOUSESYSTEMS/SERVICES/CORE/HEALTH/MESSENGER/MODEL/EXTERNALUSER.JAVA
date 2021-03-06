package com.reedhousesystems.services.core.health.messenger.model;

import java.security.Principal;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ExternalUser implements Principal {

    private String id;

	@NotNull
	private String firstName;
	
	@NotNull
	private String lastName;
	
	@NotNull
	private String userName;
	
	@NotNull
	private int status;

    private boolean isVerified;

    private String role;
    
    private Demographic demographic;

    public ExternalUser() {}

    public ExternalUser(String userId) {
        this.id = userId;
    }

    public ExternalUser(User user) {
        this.id = user.getUuid().toString();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.role = user.getRole().toString();
        this.demographic = user.getDemographics() != null ? user.getDemographics() : null;
    }

    public ExternalUser(User user, SessionToken activeSession) {
        this(user);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public String getName() {
        return userName;
    }

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

    public String getRole() {
        return role;
    }

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Demographic getDemographic() {
		return demographic;
	}

	public void setDemographic(Demographic demographic) {
		this.demographic = demographic;
	}
}
