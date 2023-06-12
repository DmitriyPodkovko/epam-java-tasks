package com.epam.rd.qa.topic10.task11;

import java.util.List;

public class Entrant {

	private int schoolNumber;

	private int yearOfEntering;

	private String lastName;

	public Entrant(int schoolNumber, int yearOfEntering, String lastName) {
		this.schoolNumber = schoolNumber;
		this.yearOfEntering = yearOfEntering;
		this.lastName = lastName;
	}

	public int getSchoolNumber() {
		return schoolNumber;
	}

	public void setSchoolNumber(int schoolNumber) {
		this.schoolNumber = schoolNumber;
	}

	public int getYearOfEntering() {
		return yearOfEntering;
	}

	public void setYearOfEntering(int yearOfEntering) {
		this.yearOfEntering = yearOfEntering;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<YearSchoolStat> getYearSchoolStat (List<Entrant> ls){
		return null;
	}
	@Override
	public String toString() {
		return "Entrant{" +
				"schoolNumber=" + schoolNumber +
				", yearOfEntering=" + yearOfEntering +
				", lastName='" + lastName + '\'' +
				'}';
	}
}
