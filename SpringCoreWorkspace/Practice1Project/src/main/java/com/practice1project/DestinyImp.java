package com.practice1project;

public class DestinyImp implements Scooty {
	
	public CommonFeatureClass comm;

	public DestinyImp(CommonFeatureClass comm) {
		this.comm = comm;
	}

	public void getseetBelt() {
		comm.getBelt();
	}
	
	public void getbreak() {
		System.out.println("Distiny Provids the break service");
	}

	public void getEngine() {
		System.out.println("Distiny Provids the Engine service");

	}

	public void getAccelator() {
		System.out.println("Distiny Provids the Accelator service");

	}

}
