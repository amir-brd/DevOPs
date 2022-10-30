package tn.esprit.rh.achat;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.rh.achat.dto.SecteurDTO;
import tn.esprit.rh.achat.entities.SecteurActivite;
import tn.esprit.rh.achat.repositories.SecteurActiviteRepository;
import tn.esprit.rh.achat.services.SecteurActiviteServiceImpl;
//@SpringBootTest
//@TestMethodOrder(OrderAnnotation.class)
class SecteurJUNITTest {
	/*@Autowired SecteurActiviteServiceImpl s;
	@Test
	@Order(1)
	 void all() {
	List<SecteurDTO> list = s.retrieveAllSecteurActivite2();
	Assertions.assertEquals(0, list.size());}
@Test
@Order(2)
 void add() throws ParseException{
	
	SecteurDTO so = new SecteurDTO(null, "libelle","code");
	SecteurDTO us = s.addANDupdate2(so);
	Assertions.assertEquals(us.getIdSecteurActivite(),us.getIdSecteurActivite());
	
}
@Test
@Order(3)
 void update() throws ParseException{
	
	SecteurDTO so = new SecteurDTO(null, "libelle","code");
	SecteurDTO us = s.addANDupdate2(so);
	Assertions.assertEquals(us.getIdSecteurActivite(),us.getIdSecteurActivite());
	
}
@Test
@Order(4)
 void one() {
	SecteurDTO retrived = s.retrieveSecteurActivite2((long) 3);
Assertions.assertEquals(1,retrived.getIdSecteurActivite());
}
@Test
@Order(5)
 void delete() {
 s.deleteSecteurActivite((long) 3);
Assertions.assertNull(s.retrieveSecteurActivite2((long) 3));
}*/
}
