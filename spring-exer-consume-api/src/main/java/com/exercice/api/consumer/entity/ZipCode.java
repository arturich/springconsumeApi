package com.exercice.api.consumer.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ZipCode {	
	
	public ZipCode()
	{
		
	}
	
	public ZipCode(String zipCode, double lat, double lng, String city) {
		this.zip_code = zipCode;
		this.lat = lat;
		this.lng = lng;
		this.city = city;
	}
	public String getZipCode() {
		return zip_code;
	}
	public void setZipCode(String zipCode) {
		this.zip_code = zipCode;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}	
	
	
	
	@Override
	public String toString() {
		return "ZipCode [zipCode=" + zip_code + ", lat=" + lat + ", lng=" + lng + ", city=" + city + "]";
	}




	private String zip_code;
	private double lat;
	private double lng;
	private String city;
	
	

}
