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
public class RentRV implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int RentRVID;
	private String FindRV;
	private double Price;
	
	@JsonIgnore
	@OneToMany(mappedBy = "RentRV")
	private List<PlanTrip> planTrips = new ArrayList<PlanTrip>();
	
	public RentRV() {
		super();
	}

	public RentRV(int rentRVID, String findRV, double price) {
		super();
		this.RentRVID = rentRVID;
		this.FindRV = findRV;
		this.Price = price;
	}

	public int getRentRVID() {
		return RentRVID;
	}

	public void setRentRVID(int rentRVID) {
		RentRVID = rentRVID;
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
		return Objects.hash(RentRVID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RentRV other = (RentRV) obj;
		return RentRVID == other.RentRVID;
	}
	
}
