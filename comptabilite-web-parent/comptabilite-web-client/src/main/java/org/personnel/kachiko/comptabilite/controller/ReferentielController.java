package org.personnel.kachiko.comptabilite.controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.personnel.kachiko.comptabilite.service.ReferentielComptableSvc;

@ManagedBean(name="referentielController",eager=true)
@SessionScoped
public class ReferentielController {
	
//	@EJB
//	private ReferentielComptableSvc referentielSvc;
	
	public ReferentielController(){
		System.out.println("referentielController");
	}

	public String appelRef(){
//		referentielSvc.getListCompteComptable();
		return "/faces/test2";
	}
	
}
