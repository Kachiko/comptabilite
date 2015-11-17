package org.personnel.kachiko.comptabilite.controller;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.personnel.kachiko.comptabilite.service.ReferentielComptableSvc;

@ManagedBean(name="referentielController",eager=true)
@SessionScoped
public class ReferentielController implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private ReferentielComptableSvc referentielSvc;
	
	public ReferentielController(){
		System.out.println("referentielController");
	}

	public String appelRef(){
		referentielSvc.getListCompteComptable();
		return "/faces/test2";
	}

	public ReferentielComptableSvc getReferentielSvc() {
		return referentielSvc;
	}

	public void setReferentielSvc(ReferentielComptableSvc referentielSvc) {
		this.referentielSvc = referentielSvc;
	}
	
}
