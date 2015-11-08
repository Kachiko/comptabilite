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
@NamedQuery(name="Compte_Comptable.findAll", query="SELECT c FROM CompteComptableEntity c")
public class CompteComptableEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer compte;

	@Column(length=50)
	private String libelle;

	@Column(length=1)
	private String sens;

	//bi-directional many-to-one association to Journal_Ecriture
	@OneToMany(mappedBy="compteComptable", fetch=FetchType.LAZY)
	private List<JournalEcritureEntity> journalEcritures;

	public CompteComptableEntity() {
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

	public List<JournalEcritureEntity> getJournalEcritures() {
		return this.journalEcritures;
	}

	public void setJournalEcritures(List<JournalEcritureEntity> journalEcritures) {
		this.journalEcritures = journalEcritures;
	}

	public JournalEcritureEntity addJournalEcriture(JournalEcritureEntity journalEcriture) {
		getJournalEcritures().add(journalEcriture);
		journalEcriture.setCompteComptable(this);

		return journalEcriture;
	}

	public JournalEcritureEntity removeJournalEcriture(JournalEcritureEntity journalEcriture) {
		getJournalEcritures().remove(journalEcriture);
		journalEcriture.setCompteComptable(null);

		return journalEcriture;
	}

}