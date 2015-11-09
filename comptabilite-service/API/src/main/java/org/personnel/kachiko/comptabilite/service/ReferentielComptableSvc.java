package org.personnel.kachiko.comptabilite.service;

import java.util.List;

import javax.ejb.Remote;

import org.personnel.kachiko.comptabilite.persistence.dto.CompteComptableDto;

@Remote
public interface ReferentielComptableSvc {

	public List<CompteComptableDto> getListCompteComptable();

}
