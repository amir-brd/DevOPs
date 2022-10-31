package tn.esprit.rh.achat;
import tn.esprit.rh.achat.dto.SecteurDTO;
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

	@Test
	@Order(3)
	 void deleteFournisseur_ok(){
		f.deleteFournisseur(2L);
		Assertions.assertNull(f.retrieveFournisseur(1l));
	}

	@Test
	@Order(4)
	void updateFournisseur_ok(){

	}
	@Test
	@Order(5)
	public void retriveFournisseur_ok(){
	Fournisseur retrived = f.retrieveFournisseur(3l);
		Assertions.assertEquals(3l,retrived.getIdFournisseur());

	}
	@Test()
	@Order(6)
	public void assignSecteurActiviteToFournisseur(){
		
	}

}
