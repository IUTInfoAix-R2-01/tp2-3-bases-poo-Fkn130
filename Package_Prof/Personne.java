public class Personne{
	private String Nom;
	private String Prenom;
	
	public Personne(String Prenom, String Nom) {
		this.Prenom=Prenom;
		this.Nom=Nom;
	}
	
	public Personne(String Nom) {
		this.Nom=Nom;
	}
	
	public String getNom() {
		return Nom;
	}
	
	public String getPrenom() {
		return Prenom;
	}
	
	@Override
	public String toString() {
		if (Prenom != null)
			return "Personne " + this.Nom + this.Prenom;
		else return "Personne " + this.Nom ;
	}
	
}