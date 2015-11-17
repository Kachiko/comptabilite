package org.personnel.kachiko.comptabilite.persistence.dao;

import java.io.Serializable;
import java.util.List;

import org.personnel.kachiko.comptabilite.persistence.dto.CompteComptableDto;
import org.personnel.kachiko.comptabilite.persistence.dto.RegroupementCompteDto;

public interface ReferentielComptableDao extends Serializable{

	public List<CompteComptableDto> getListCompteComptable();
	
	public List<RegroupementCompteDto> getListRegroupement();
}
