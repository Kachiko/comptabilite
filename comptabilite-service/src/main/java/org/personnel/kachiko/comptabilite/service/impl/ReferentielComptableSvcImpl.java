package org.personnel.kachiko.comptabilite.service.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import org.personnel.kachiko.comptabilite.dao.ComptabiliteDao;
import org.personnel.kachiko.comptabilite.service.ReferentielComptableSvc;

@Stateless
public class ReferentielComptableSvcImpl implements ReferentielComptableSvc {

	@Inject
	ComptabiliteDao dao;
	
	public List getList(){
		return dao.listeCompte();
	}
	
}
