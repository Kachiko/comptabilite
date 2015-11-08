package org.personnel.kachiko.comptabilite.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "Regroupement_Compte" database table.
 * 
 */
@Entity
@Table(name="\"Regroupement_Compte\"")
@NamedQuery(name="Regroupement_Compte.findAll", query="SELECT r FROM Regroupement_Compte r")
public class Regroupement_Compte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String nom;

	public Regroupement_Compte() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}