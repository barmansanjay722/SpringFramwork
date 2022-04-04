package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// invoke static method , variables and creating object

@Component
public class Demo {
	
	//Spring Expresion(spEL)
	@Value("#{22+11}")
	private int x;
	
	@Value("#{2+4+5+5}")
	private int y;
	
	// calling static method and variables
	
	@Value("#{ T(java.lang.Math).sqrt(144)}")
	private double z;
	
	@Value("#{ T(java.lang.Math).E}")
	private double e;
	
	@Value("#{ T(java.lang.Math).PI }")
	private double pi;
	
	// creating object
	@Value("#{ new java.lang.String(' Sanjay ') }")
	private String name;
	
	// boolean type 
	@Value("#{ 8 > 3}")
	private boolean isActive;
	
	
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", pi=" + pi + ", name=" + name + ", isActive="
				+ isActive + "]";
	}

	
}
