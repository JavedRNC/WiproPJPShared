package com;

import com.automobile.twowheeler.*;

public class test {

	public static void main(String[] args)
	{
		Hero v = new Hero("Hero Motocorp","1A67TYU","Javed",91);
		
		System.out.println("Hero Motocorp details: modelName, registrationNumber,ownerName & speed");
		System.out.println(v.getModelName());
		System.out.println(v.getRegistrationNumber());
		System.out.println(v.getOwnerName());
		System.out.println(v.getSpeed());
		v.radio();
		System.out.println();
		System.out.println("Honda details: modelName, registrationNumber,ownerName & speed");
		Honda h = new Honda("Honda","7YTR564E","Shahid",96);
		System.out.println(h.getModelName());
		System.out.println(h.getRegistrationNumber());
		System.out.println(h.getOwnerName());
		System.out.println(h.getSpeed());
		h.cdplayer();
		
	}
}