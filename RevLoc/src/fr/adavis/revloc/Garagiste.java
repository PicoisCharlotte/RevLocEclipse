package fr.adavis.revloc;

public class Garagiste {

		private String nom;
		private String adresse;
		private String prenom;
		
		public Garagiste(String nom, String adresse) {
			super();
			this.nom = nom;
			this.adresse = adresse;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getAdresse() {
			return adresse;
		}

		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}
		
	
}
