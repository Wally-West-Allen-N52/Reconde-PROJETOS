package br.com.rvrentagency.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PlanTrip implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Plan_tripID;
	private String Beginning_from;
	private String Arriving_at;
	
	@ManyToOne
	@JoinColumn(name = "RentRVID")
	private RentRV rentRV;
	
	@ManyToOne
	@JoinColumn(name = "BuyRVID")
	private BuyRV buyRV;
	
	@ManyToOne
	@JoinColumn(name = "ContactID")
	private ContactUs contactUs;

	public PlanTrip() {
		super();
	}

	
	public PlanTrip(int plan_tripID, String beginning_from, String arriving_at, RentRV rentRV, BuyRV buyRV,
			ContactUs contactUs) {
		super();
		this.Plan_tripID = plan_tripID;
		this.Beginning_from = beginning_from;
		this.Arriving_at = arriving_at;
		this.rentRV = rentRV;
		this.buyRV = buyRV;
		this.contactUs = contactUs;
	}


	public int getPlan_tripID() {
		return Plan_tripID;
	}

	public void setPlan_tripID(int plan_tripID) {
		Plan_tripID = plan_tripID;
	}

	public String getBeginning_from() {
		return Beginning_from;
	}

	public void setBeginning_from(String beginning_from) {
		Beginning_from = beginning_from;
	}

	public String getArriving_at() {
		return Arriving_at;
	}

	public void setArriving_at(String arriving_at) {
		Arriving_at = arriving_at;
	}

	public RentRV getRentRV() {
		return rentRV;
	}

	public void setRentRV(RentRV rentRV) {
		this.rentRV = rentRV;
	}

	public BuyRV getBuyRV() {
		return buyRV;
	}

	public void setBuyRV(BuyRV buyRV) {
		this.buyRV = buyRV;
	}

	public ContactUs getContactUs() {
		return contactUs;
	}

	public void setContactUs(ContactUs contactUs) {
		this.contactUs = contactUs;
	}
}
