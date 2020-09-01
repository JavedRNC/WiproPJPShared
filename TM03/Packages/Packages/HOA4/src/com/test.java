package com;

import com.automobile.FourWheeler.Ford;
import com.automobile.FourWheeler.Logan;
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
		
		System.out.println();
		System.out.println("Logan details: modelName, registrationNumber,ownerName & speed");
		Logan l = new Logan("Logan","7YTO564E","",96);
		System.out.println(l.getModelName());
		System.out.println(l.getRegistrationNumber());
		System.out.println(l.getOwnerName());
		System.out.println(l.getSpeed());
		l.gps();
		
		System.out.println();
		System.out.println("Ford details: modelName, registrationNumber,ownerName & speed");
		Ford f= new Ford("Ford","78TR564E","Aatif",96);
		System.out.println(f.getModelName());
		System.out.println(f.getRegistrationNumber());
		System.out.println(f.getOwnerName());
		System.out.println(f.getSpeed());
		f.tempControl();
		
	}
}
