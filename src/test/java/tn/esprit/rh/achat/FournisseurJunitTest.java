package tn.esprit.rh.achat;
import tn.esprit.rh.achat.services.IFournisseurService;
import tn.esprit.rh.achat.entities.Fournisseur;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;


@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)


public class FournisseurJunitTest {
	//private static final long serialVersionUID = 1L;
	@Autowired
	IFournisseurService f;
	@Test
	@Order(1)
	 void all() {
	List<Fournisseur> fournisseurs = f.retrieveAllFournisseurs();
	Assertions.assertEquals(0, fournisseurs.size());
	}
	@Test
	@Order(2)
	public void addFournisseur_ok(){
		List<Fournisseur> fournisseurs = f.retrieveAllFournisseurs();
		int expected=fournisseurs.size();
		Fournisseur fournisseur = new Fournisseur();
		fournisseur.setLibelle("libelle");
		//fournisseur.setDetailFournisseur();
		fournisseur.setCode("1234AAA");
		//fournisseur.setSecteurActivites();
		//fournisseur.setFactures();
		Fournisseur savedFournisseur= f.addFournisseur(fournisseur);
		assertEquals(expected+1, f.retrieveAllFournisseurs().size());

	}
	/*void delete() {
 s.deleteSecteurActivite((long) 3);
Assertions.assertNull(s.retrieveSecteurActivite2((long) 3));
}*/
	@Test
	@Order(3)
	 void deleteFournisseur_ok(){
		//List<Fournisseur> fournisseurs = f.retrieveAllFournisseurs();
		//int expected=fournisseurs.size();
		f.deleteFournisseur(2L);
		//assertEquals(expected-1, f.retrieveAllFournisseurs().size());


	}
	@Test
	@Order(4)
	void updateFournisseur_ok(){
		f.updateFournisseur();
	}

}
