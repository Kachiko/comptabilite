package org.personnel.kachiko.comptabilite.service.impl;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;

import org.personnel.kachiko.comptabilite.persistence.dao.ReferentielComptableDao;
import org.personnel.kachiko.comptabilite.persistence.dto.CompteComptableDto;
import org.personnel.kachiko.comptabilite.service.ReferentielComptableSvc;

@Stateless
@Remote(ReferentielComptableSvc.class)
public class ReferentielComptableSvcImpl implements ReferentielComptableSvc {

	@Inject
	ReferentielComptableDao dao;
	
	public List<CompteComptableDto> getListCompteComptable(){
		return dao.getListCompteComptable();
	}
	
}
