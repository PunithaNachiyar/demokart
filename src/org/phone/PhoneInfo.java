package org.phone;

public class PhoneInfo {
	private void phoneName() {
		System.out.println("Phone Name is VIVO");
	}
	private void phoneMieimum() {
		System.out.println("Phone Mieium is good");
		
	}
	private void camera() {
		System.out.println("Camera quality good");
		
	}
	private void storage() {
		System.out.println("Storage is high");
	}
	private void os() {
		System.out.println("OS is lollyPop");
	}
	public static void main(String[] args) {
		PhoneInfo p=new PhoneInfo();
		p.phoneName();
		p.phoneMieimum();
		p.camera();
		p.storage();
		p.os();
				
	}

}
