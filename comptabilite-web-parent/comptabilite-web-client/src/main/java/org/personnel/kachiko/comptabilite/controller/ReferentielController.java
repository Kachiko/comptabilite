package org.personnel.kachiko.comptabilite.controller;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.personnel.kachiko.comptabilite.model.ReferentielComptesView;
import org.personnel.kachiko.comptabilite.service.ReferentielComptableSvc;
import org.personnel.kachiko.framework.utils.DozerUtil;

@ManagedBean(name="referentielController",eager=true)
@SessionScoped
public class ReferentielController implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private ReferentielComptableSvc referentielSvc;
	private List<ReferentielComptesView> listeComptes;
	
	public ReferentielController(){
	}

	public String appelRef(){
		listeComptes = DozerUtil.map(referentielSvc.getListCompteComptable(), ReferentielComptesView.class);
		return "/view/test2";
	}

	public ReferentielComptableSvc getReferentielSvc() {
		return referentielSvc;
	}

	public void setReferentielSvc(ReferentielComptableSvc referentielSvc) {
		this.referentielSvc = referentielSvc;
	}

	public List<ReferentielComptesView> getListeComptes() {
		return listeComptes;
	}

	public void setListeComptes(List<ReferentielComptesView> listeComptes) {
		this.listeComptes = listeComptes;
	}
	
}
