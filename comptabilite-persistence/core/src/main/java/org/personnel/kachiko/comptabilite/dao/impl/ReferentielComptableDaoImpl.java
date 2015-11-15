package org.personnel.kachiko.comptabilite.dao.impl;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.personnel.kachiko.comptabilite.entities.CompteComptableEntity;
import org.personnel.kachiko.comptabilite.entities.RegroupementCompteEntity;
import org.personnel.kachiko.comptabilite.persistence.dao.ReferentielComptableDao;
import org.personnel.kachiko.comptabilite.persistence.dto.CompteComptableDto;
import org.personnel.kachiko.comptabilite.persistence.dto.RegroupementCompteDto;
import org.personnel.kachiko.framework.utils.DozerUtil;

@Stateful
@Remote(ReferentielComptableDao.class)
public class ReferentielComptableDaoImpl implements ReferentielComptableDao {

	@PersistenceUnit(unitName="compta")
	private EntityManager em;

	Mapper mapper = new DozerBeanMapper();
	
	@SuppressWarnings("unchecked")
	public List<CompteComptableDto> getListCompteComptable() {
		List<CompteComptableEntity> listeCompte;
		Query qry = em.createNamedQuery("Compte_Comptable.findAll");
		listeCompte = qry.getResultList();
		return DozerUtil.map(listeCompte, CompteComptableDto.class);
	}

	@SuppressWarnings("unchecked")
	public List<RegroupementCompteDto> getListRegroupement() {
		List<RegroupementCompteEntity> listeRegroupement;
		Query qry = em.createNamedQuery("Regroupement_Compte.findAll");
		listeRegroupement = qry.getResultList();
		return DozerUtil.map(listeRegroupement, RegroupementCompteDto.class);
	}
	
}
