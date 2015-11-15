package org.personnel.kachiko.comptabilite.service;

import java.util.List;

import org.personnel.kachiko.comptabilite.persistence.dto.CompteComptableDto;

public interface ReferentielComptableSvc {

	public List<CompteComptableDto> getListCompteComptable();

}
