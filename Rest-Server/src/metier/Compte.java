package metier;


import java.util.Date;




public class Compte
{
	private long code;
	private double solde;

	private Date dateCreation;

	
	
	//cstr
	public Compte (long i, double solde, Date dateCreation) {
		super();
		this.code = i;
		this.solde = solde;
		this.dateCreation = dateCreation;
	}
	
	
	public Compte() 
	{
		this(0, 0, new Date());
	}

	public long getCode() {
		return code;
	}

	
	
	
	//getset
	public void setCode(long code) {
		this.code = code;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	
	public Compte creerCompte(Compte c)
	{
		Compte newCompte = new Compte();
		newCompte.setSolde(2*c.getSolde());
		newCompte.setSolde(c.getCode()+100);
		return newCompte;
	}
	
	
	
}