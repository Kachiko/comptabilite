package org.personnel.kachiko.comptabilite.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "Lnk_Compte_Regroupement" database table.
 * 
 */
@Embeddable
public class LnkCompteRegroupementEntityPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private Integer fkid;

	@Column(insertable=false, updatable=false)
	private Integer fkcompte;

	public LnkCompteRegroupementEntityPK() {
	}
	public Integer getFkid() {
		return this.fkid;
	}
	public void setFkid(Integer fkid) {
		this.fkid = fkid;
	}
	public Integer getFkcompte() {
		return this.fkcompte;
	}
	public void setFkcompte(Integer fkcompte) {
		this.fkcompte = fkcompte;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof LnkCompteRegroupementEntityPK)) {
			return false;
		}
		LnkCompteRegroupementEntityPK castOther = (LnkCompteRegroupementEntityPK)other;
		return 
			this.fkid.equals(castOther.fkid)
			&& this.fkcompte.equals(castOther.fkcompte);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.fkid.hashCode();
		hash = hash * prime + this.fkcompte.hashCode();
		
		return hash;
	}
}