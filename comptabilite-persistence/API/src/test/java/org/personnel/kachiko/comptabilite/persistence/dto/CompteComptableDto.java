package org.personnel.kachiko.comptabilite.persistence.dto;

import java.io.Serializable;

public class CompteComptableDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer compte;
	private String libelle;
	private String sens;
	
	public Integer getCompte() {
		return compte;
	}
	
	public void setCompte(Integer compte) {
		this.compte = compte;
	}
	
	public String getLibelle() {
		return libelle;
	}
	
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public String getSens() {
		return sens;
	}
	
	public void setSens(String sens) {
		this.sens = sens;
	}
	
	
}
