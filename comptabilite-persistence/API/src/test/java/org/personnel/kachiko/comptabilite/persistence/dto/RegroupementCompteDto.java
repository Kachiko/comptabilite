package org.personnel.kachiko.comptabilite.persistence.dto;

import java.io.Serializable;
import java.util.List;

public class RegroupementCompteDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nom;
	private List<CompteComptableDto> listeComtpe;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<CompteComptableDto> getListeComtpe() {
		return listeComtpe;
	}
	public void setListeComtpe(List<CompteComptableDto> listeComtpe) {
		this.listeComtpe = listeComtpe;
	}
	
	
	
}
