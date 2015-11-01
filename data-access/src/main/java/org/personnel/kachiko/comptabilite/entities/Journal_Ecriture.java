package org.personnel.kachiko.comptabilite.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the "Journal_Ecriture" database table.
 * 
 */
@Entity
@Table(name="\"Journal_Ecriture\"")
@NamedQuery(name="Journal_Ecriture.findAll", query="SELECT j FROM Journal_Ecriture j")
public class Journal_Ecriture implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	@Temporal(TemporalType.DATE)
	private Date datevaleur;

	private String libelle;

	private double montant;

	private String sens;

	//bi-directional many-to-one association to Compte_Comptable
	@ManyToOne
	@JoinColumn(name="fkcompte")
	private Compte_Comptable compteComptable;

	public Journal_Ecriture() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDatevaleur() {
		return this.datevaleur;
	}

	public void setDatevaleur(Date datevaleur) {
		this.datevaleur = datevaleur;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public double getMontant() {
		return this.montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public String getSens() {
		return this.sens;
	}

	public void setSens(String sens) {
		this.sens = sens;
	}

	public Compte_Comptable getCompteComptable() {
		return this.compteComptable;
	}

	public void setCompteComptable(Compte_Comptable compteComptable) {
		this.compteComptable = compteComptable;
	}

}