package messagerie.models;

import java.util.Date;

public class Utilisateur extends Object{
	private String nom = "Didier";
	private String prenom;
	private Date dNaissance;
	
	public Utilisateur(String nom, String prenom, Date dNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.dNaissance = dNaissance;
	}
	
	public Utilisateur(String nom, String prenom) {
		this(nom, prenom, null);
	}
	
	public Utilisateur() {
		this("?", "?", null);
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void afficher() {
		System.out.println(nom + "...");
	}
	
	public void setAge(int age) throws  {
		if(age >= 0 && age <= 130) {
			this.age = age;
		} else {
			throw new NumberFormatException();
		}
	}
	
	public int getAge() {
		
	}
	
	@Override
	public String toString() {
		return nom + " " + prenom + " (" + age + ")";
	}
	
}
