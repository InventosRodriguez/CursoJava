package edu.devacademy;
// Generated 30-sep-2017 14:04:26 by Hibernate Tools 5.2.3.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Countries generated by hbm2java
 */
@Entity
@Table(name = "COUNTRIES", schema = "HR")
public class Countries implements java.io.Serializable {

	private String countryId;
	private Regions regions;
	private String countryName;
	private Set<Locations> locationses = new HashSet<Locations>(0);

	public Countries() {
	}

	public Countries(String countryId) {
		this.countryId = countryId;
	}

	public Countries(String countryId, Regions regions, String countryName, Set<Locations> locationses) {
		this.countryId = countryId;
		this.regions = regions;
		this.countryName = countryName;
		this.locationses = locationses;
	}

	@Id

	@Column(name = "COUNTRY_ID", unique = true, nullable = false, length = 2)
	public String getCountryId() {
		return this.countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "REGION_ID")
	public Regions getRegions() {
		return this.regions;
	}

	public void setRegions(Regions regions) {
		this.regions = regions;
	}

	@Column(name = "COUNTRY_NAME", length = 40)
	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "countries")
	public Set<Locations> getLocationses() {
		return this.locationses;
	}

	public void setLocationses(Set<Locations> locationses) {
		this.locationses = locationses;
	}

}
