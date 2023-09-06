package messagerie.run;

import messagerie.models.Utilisateur;

public class ProgTest {

	public static void main(String[] args) {
		try {
			Utilisateur user = new Utilisateur("POISSARD", "Roger", 45);
			System.out.println(user);
			user.setAge(22);
			System.out.println(user);
			user.setAge(300);
		} catch (Exception e) {
			System.out.println("Age incorrect");
		}
	}
	
}