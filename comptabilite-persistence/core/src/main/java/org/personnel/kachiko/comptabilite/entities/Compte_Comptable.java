package org.personnel.kachiko.comptabilite.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "Compte_Comptable" database table.
 * 
 */
@Entity
@Table(name="\"Compte_Comptable\"")
@NamedQuery(name="Compte_Comptable.findAll", query="SELECT c FROM Compte_Comptable c")
public class Compte_Comptable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer compte;

	private String libelle;

	private String sens;

	//bi-directional many-to-one association to Journal_Ecriture
	@OneToMany(mappedBy="compteComptable")
	private List<Journal_Ecriture> journalEcritures;

	public Compte_Comptable() {
	}

	public Integer getCompte() {
		return this.compte;
	}

	public void setCompte(Integer compte) {
		this.compte = compte;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getSens() {
		return this.sens;
	}

	public void setSens(String sens) {
		this.sens = sens;
	}

	public List<Journal_Ecriture> getJournalEcritures() {
		return this.journalEcritures;
	}

	public void setJournalEcritures(List<Journal_Ecriture> journalEcritures) {
		this.journalEcritures = journalEcritures;
	}

	public Journal_Ecriture addJournalEcriture(Journal_Ecriture journalEcriture) {
		getJournalEcritures().add(journalEcriture);
		journalEcriture.setCompteComptable(this);

		return journalEcriture;
	}

	public Journal_Ecriture removeJournalEcriture(Journal_Ecriture journalEcriture) {
		getJournalEcritures().remove(journalEcriture);
		journalEcriture.setCompteComptable(null);

		return journalEcriture;
	}

}