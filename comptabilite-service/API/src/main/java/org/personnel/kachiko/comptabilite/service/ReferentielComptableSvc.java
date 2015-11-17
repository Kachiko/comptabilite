package org.personnel.kachiko.comptabilite.service;

import java.io.Serializable;
import java.util.List;

import org.personnel.kachiko.comptabilite.persistence.dto.CompteComptableDto;

public interface ReferentielComptableSvc extends Serializable{

	public List<CompteComptableDto> getListCompteComptable();

}
