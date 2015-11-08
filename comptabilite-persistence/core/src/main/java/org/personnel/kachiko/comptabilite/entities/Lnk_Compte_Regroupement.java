package org.personnel.kachiko.comptabilite.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "Lnk_Compte_Regroupement" database table.
 * 
 */
@Entity
@Table(name="\"Lnk_Compte_Regroupement\"")
@NamedQuery(name="Lnk_Compte_Regroupement.findAll", query="SELECT l FROM Lnk_Compte_Regroupement l")
public class Lnk_Compte_Regroupement implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Lnk_Compte_RegroupementPK id;

	public Lnk_Compte_Regroupement() {
	}

	public Lnk_Compte_RegroupementPK getId() {
		return this.id;
	}

	public void setId(Lnk_Compte_RegroupementPK id) {
		this.id = id;
	}

}