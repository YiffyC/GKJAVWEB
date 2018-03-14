package metier;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

//
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte
{
	private long code;
	private double solde;
	
	//une fos transforme en xml, dateCreation n'est aos sauvegarde
	@XmlTransient
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
	
	
	
	
}
