
public class firstclass {
	private String nom;
	private String prenom;
	private int age;
	firstclass(String nom,String prenom,int age){
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
	}
	public void setprenom(String prenom) {
		this.prenom=prenom;
	}
	public void setnom(String nom) {
		this.nom=nom;
	}
	public void setage(int age) {
		this.age=age;
	}
	public String getprenom() {
		return prenom;
	}
	public String getnom() {
		return nom;
	}
 public int getage() {
	 return age;
 }
}
