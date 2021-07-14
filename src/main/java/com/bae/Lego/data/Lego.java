package com.bae.Lego.data;

public class Lego {

	private String seriesName;
	private int kitNumber;
	private String kitName;
	private int releaseYear;

	public Lego(String seriesName, int kitNumber, String kitName, int releaseYear) {
		super();
		this.seriesName = seriesName;
		this.kitNumber = kitNumber;
		this.kitName = kitName;
		this.releaseYear = releaseYear;
	}

	public Lego() {

	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public int getKitNumber() {
		return kitNumber;
	}

	public void setKitNumber(int kitNumber) {
		this.kitNumber = kitNumber;
	}

	public String getKitName() {
		return kitName;
	}

	public void setKitName(String kitName) {
		this.kitName = kitName;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	@Override
	public String toString() {
		return "Lego [Series Name=" + seriesName + ", Kit Number=" + kitNumber + ", Kit Name=" + kitName
				+ ", Release Year=" + releaseYear + "]";

	}
}