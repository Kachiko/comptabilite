package org.personnel.kachiko.comptabilite;

import org.junit.Test;
import org.personnel.kachiko.comptabilite.dao.ComptabiliteDao;

import junit.framework.Assert;

public class TestDeDependance {

	@Test
	public void test(){
		ComptabiliteDao dao = new ComptabiliteDao();		
		Assert.assertNotNull(dao.listeCompte());
	}
}

