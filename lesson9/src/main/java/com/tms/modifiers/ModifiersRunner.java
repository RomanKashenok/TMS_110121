package com.tms.modifiers;

public class ModifiersRunner {
	public static void main(String[] args) {

	ClassRoom cm = new ClassRoom();

		System.out.println(cm.vasya);			//Sergey
		System.out.println(cm.getVasya());
//		System.out.println(user);				//Alexandr

		System.out.println(cm.getPetya());
//		System.out.println(User.petya);			// Ilya
		System.out.println(ClassRoom.petya);	// Ilya
		System.out.println(ClassRoom.getPetya());	// Roma
		System.out.println(cm.petya);

		System.out.println(cm.getKatya());
		System.out.println(cm.katya);

//		System.out.println(user.polina); 		//Ilya
		System.out.println(cm.polina);
		System.out.println(ClassRoom.polina);
		System.out.println(cm.getPolina());		//Ilya
		System.out.println(ClassRoom.getPolina());

		System.out.println(cm.getRoma());
//		System.out.println(user.roma);
		System.out.println(cm.roma);

		System.out.println(cm.getAlesya());
		System.out.println(ClassRoom.getAlesya());

		System.out.println(cm.getKirill());

		System.out.println(cm.getLusya());
		System.out.println(ClassRoom.getLusya());

	}
}
