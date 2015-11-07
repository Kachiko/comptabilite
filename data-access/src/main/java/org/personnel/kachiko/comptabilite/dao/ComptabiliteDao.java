package org.personnel.kachiko.comptabilite.dao;

import java.util.List;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.personnel.kachiko.comptabilite.entities.Compte_Comptable;

@Stateful
public class ComptabiliteDao {

	@PersistenceUnit(unitName="compta")
	private EntityManager em;
	
	public List<Compte_Comptable> listeCompte(){
		Query qry = em.createNamedQuery("Compte_Comptable.findAll");
		return qry.getResultList();
	}
	
}
