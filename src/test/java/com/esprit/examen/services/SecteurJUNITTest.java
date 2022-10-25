package com.esprit.examen.services;

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

import com.esprit.examen.dto.SecteurDTO;


@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class SecteurJUNITTest {
	@Autowired SecteurActiviteServiceImpl s;
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
	SecteurDTO retrived = s.retrieveSecteurActivite2((long) 5);
Assertions.assertEquals(1,retrived.getIdSecteurActivite());
}

}
