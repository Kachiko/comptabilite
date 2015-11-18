package org.personnel.kachiko.comptabilite.model;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="comptes")
public class ReferentielComptesView {

	private Integer compte;
	private String libelle;
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
	
}
