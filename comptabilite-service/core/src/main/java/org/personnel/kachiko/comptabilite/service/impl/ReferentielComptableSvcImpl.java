package org.personnel.kachiko.comptabilite.service.impl;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;

import org.personnel.kachiko.comptabilite.persistence.dao.ReferentielComptableDao;
import org.personnel.kachiko.comptabilite.persistence.dto.CompteComptableDto;
import org.personnel.kachiko.comptabilite.service.ReferentielComptableSvc;

@Stateless
@Local
public class ReferentielComptableSvcImpl implements ReferentielComptableSvc {

	@Inject
	ReferentielComptableDao dao;
	
	public List<CompteComptableDto> getListCompteComptable(){
		return dao.getListCompteComptable();
	}
	
}
