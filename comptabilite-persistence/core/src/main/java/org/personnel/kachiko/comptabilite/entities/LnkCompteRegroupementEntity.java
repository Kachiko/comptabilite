package org.personnel.kachiko.comptabilite.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "Lnk_Compte_Regroupement" database table.
 * 
 */
@Entity
@Table(name="\"Lnk_Compte_Regroupement\"")
@NamedQuery(name="Lnk_Compte_Regroupement.findAll", query="SELECT l FROM LnkCompteRegroupementEntity l")
public class LnkCompteRegroupementEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private LnkCompteRegroupementEntityPK id;

	public LnkCompteRegroupementEntity() {
	}

	public LnkCompteRegroupementEntityPK getId() {
		return this.id;
	}

	public void setId(LnkCompteRegroupementEntityPK id) {
		this.id = id;
	}

}