/*package tn.esprit.rh.achat;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.rh.achat.entities.DetailFournisseur;
import tn.esprit.rh.achat.entities.Facture;
import tn.esprit.rh.achat.entities.Fournisseur;
import tn.esprit.rh.achat.entities.Operateur;
import tn.esprit.rh.achat.entities.SecteurActivite;
import tn.esprit.rh.achat.services.IOperateurService;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class OperateurJunitTest {

@Autowired
IOperateurService o ;

@Test
@Order(1)
void all() {
	List<Operateur> operateurs = o.retrieveAllOperateurs();
	Assertions.assertEquals(0, operateurs.size());
}

@Test
@Order(2)
void addOperateur_ok() {
	List<Operateur> operateurs = o.retrieveAllOperateurs();
	int currentSize = operateurs.size();
	Operateur operateur = new Operateur();
	operateur.setNom("wiem");
	
	operateur.setPrenom("1234AAA");
	operateur.setPassword("secteurActivites");
	
	Set<Facture> factures = new HashSet<>();
	operateur.setFactures(factures);
	Operateur savedOperateur = o.addOperateur(operateur);
	assertEquals(currentSize + 1, o.retrieveAllOperateurs().size());

}


@Test
@Order(3)
void deleteOperateur_ok() {
	o.deleteOperateur(7L);
	Assertions.assertNull(o.retrieveOperateur(7L));
}

@Test
@Order(4)
void updateOperateur_ok() {
	Operateur operateur = o.retrieveOperateur(8L);
	String oldname= operateur.getNom();
	String randomCode = UUID.randomUUID().toString();
	operateur.setNom(randomCode);
	o.updateOperateur(operateur);
	Operateur o2 = o.retrieveOperateur(8L);
	assertEquals(randomCode, o2.getNom());
	assertNotEquals(oldname, o2.getNom());
}


@Test
@Order(5)
 void retriveOperateur_ok() {
	Operateur retrived = o.retrieveOperateur(8l);
	Assertions.assertEquals(8l, retrived.getIdOperateur());

}
}
*/
