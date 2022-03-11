package br.com.rvrentagency.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ContactUs implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ContactID;
	private String Email;
	private String Phone;
	private String NewMessage;
	
	@JsonIgnore
	@OneToMany(mappedBy = "contactUs")
	private List<PlanTrip> planTrips = new ArrayList<PlanTrip>();
	
	public ContactUs() {
		super();
	}

	public int getContactID() {
		return ContactID;
	}

	public ContactUs(int contactID, String email, String phone, String newMessage) {
		super();
		this.ContactID = contactID;
		this.Email = email;
		this.Phone = phone;
		this.NewMessage = newMessage;
	}

	public void setContactID(int contactID) {
		ContactID = contactID;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getNewMessage() {
		return NewMessage;
	}

	public void setNewMessage(String newMessage) {
		NewMessage = newMessage;
	}

	public List<PlanTrip> getPlanTrips() {
		return planTrips;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ContactID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactUs other = (ContactUs) obj;
		return ContactID == other.ContactID;
	}	
}
