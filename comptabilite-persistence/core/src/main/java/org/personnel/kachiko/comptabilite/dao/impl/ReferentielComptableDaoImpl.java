package org.personnel.kachiko.comptabilite.dao.impl;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.personnel.kachiko.comptabilite.entities.CompteComptableEntity;
import org.personnel.kachiko.comptabilite.entities.RegroupementCompteEntity;
import org.personnel.kachiko.comptabilite.persistence.dao.ReferentielComptableDao;
import org.personnel.kachiko.comptabilite.persistence.dto.CompteComptableDto;
import org.personnel.kachiko.comptabilite.persistence.dto.RegroupementCompteDto;
import org.personnel.kachiko.framework.dao.AbstractDao;
import org.personnel.kachiko.framework.utils.DozerUtil;

@Stateless
@Remote(ReferentielComptableDao.class)
public class ReferentielComptableDaoImpl extends AbstractDao implements ReferentielComptableDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unchecked")
	public List<CompteComptableDto> getListCompteComptable() {
		List<CompteComptableEntity> listeCompte;
		Query qry = getEm().createNamedQuery("Compte_Comptable.findAll");
		listeCompte = qry.getResultList();
		return DozerUtil.map(listeCompte, CompteComptableDto.class);
	}

	@SuppressWarnings("unchecked")
	public List<RegroupementCompteDto> getListRegroupement() {
		List<RegroupementCompteEntity> listeRegroupement;
		Query qry = getEm().createNamedQuery("Regroupement_Compte.findAll");
		listeRegroupement = qry.getResultList();
		return DozerUtil.map(listeRegroupement, RegroupementCompteDto.class);
	}
	
}
