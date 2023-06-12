package com.epam.rd.qa.topic10.task11;

public class YearSchoolStat {

	private int yearOfEntering;

	private long numberOfSchools;

	public YearSchoolStat(int yearOfEntering, long numberOfSchools) {
		this.yearOfEntering = yearOfEntering;
		this.numberOfSchools = numberOfSchools;
	}

	public int getYearOfEntering() {
		return yearOfEntering;
	}

	public void setYearOfEntering(int yearOfEntering) {
		this.yearOfEntering = yearOfEntering;
	}

	public long getNumberOfSchools() {
		return numberOfSchools;
	}

	public void setNumberOfSchools(long numberOfSchools) {
		this.numberOfSchools = numberOfSchools;
	}

	@Override
	public String toString() {
		return "YearSchoolStat{" +
				"yearOfEntering=" + yearOfEntering +
				", numberOfSchools=" + numberOfSchools +
				'}';
	}
}
