package org.personnel.kachiko.comptabilite.service.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.personnel.kachiko.comptabilite.persistence.dao.ReferentielComptableDao;
import org.personnel.kachiko.comptabilite.persistence.dto.CompteComptableDto;
import org.personnel.kachiko.comptabilite.service.ReferentielComptableSvc;

@Stateless
@Remote(ReferentielComptableSvc.class)
public class ReferentielComptableSvcImpl implements ReferentielComptableSvc {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	ReferentielComptableDao dao;
	
	public List<CompteComptableDto> getListCompteComptable(){
		return dao.getListCompteComptable();
	}

	public ReferentielComptableDao getDao() {
		return dao;
	}

	public void setDao(ReferentielComptableDao dao) {
		this.dao = dao;
	}
	
}
