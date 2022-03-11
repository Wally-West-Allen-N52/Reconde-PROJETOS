package br.com.rvrentagency.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class BuyRV implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int BuyRVID;
	private String FindRV;
	private double Price;

	@JsonIgnore
	@OneToMany(mappedBy = "buyRV")
	private List<PlanTrip> planTrips = new ArrayList<PlanTrip>();
	
	public BuyRV() {
		super();
	}

	public BuyRV(int buyRVID, String findRV, double price) {
		super();
		this.BuyRVID = buyRVID;
		this.FindRV = findRV;
		this.Price = price;
	}

	public int getBuyRVID() {
		return BuyRVID;
	}

	public void setBuyRVID(int buyRVID) {
		BuyRVID = buyRVID;
	}

	public String getFindRV() {
		return FindRV;
	}

	public void setFindRV(String findRV) {
		FindRV = findRV;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public List<PlanTrip> getPlanTrips() {
		return planTrips;
	}

	@Override
	public int hashCode() {
		return Objects.hash(BuyRVID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BuyRV other = (BuyRV) obj;
		return BuyRVID == other.BuyRVID;
	}
}
