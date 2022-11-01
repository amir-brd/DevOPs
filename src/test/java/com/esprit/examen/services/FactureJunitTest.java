package com.esprit.examen.services;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.rh.entities.DetailFacture;
import tn.esprit.rh.entities.Facture;
import tn.esprit.rh.services.IFactureService;
import tn.esprit.rh.services.IOperateurService;

/*@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)


public class FactureJunitTest {

   @Autowired
   IFactureService f;

   @Autowired
   IOperateurService op;


  /* @Test
   @Order(1)
   void all() {
      List<Facture> factures = f.retrieveAllFactures();
      Assertions.assertEquals(0, factures.size());
   }*/

  //@Test
  // @Order(2)
  /* public void addFacture_ok() {
      List<Facture> factures = f.retrieveAllFactures();
      int currentSize = factures.size();
      Facture facture = new Facture();
      facture.setMontantFacture("montantfacture");
      DetailFacture detailFacture = new DetailFacture();
      facture.setDateCreationFacture(detailFacture);
      facture.setMontantFacture("300dt");
      Set<Operateur> operateur = new HashSet<>();
      facture.setOperateur(operateur);
      Set<Facture> factures = new HashSet<>();
      facture.setIdFacture(factures);
      Facture savedFacture = f.addFacture(facture);
      assertEquals(currentSize + 1, f.retrieveAllFactures().size());

   }*/

  /* @Test
   @Order(3)
   void cancelFacture_ok() {
      f.cancelFacture(2L);
      Assertions.assertNull(f.retrieveFacture(1l));
   }*/

  /* @Test
   @Order(4)
   void updateFacture_ok() {
      Facture facture = f.retrieveFacture(3l);
      float montantFacture = facture.getMontantFacture();
      float montantRemise = UUID.randomUUID().toString();
      facture.setMontantRemise(montantRemise);
      f.updateFacture(facture);
      Facture f2 = f.retrieveFacture(3L);
      assertEquals(montantRemise, f2.getMontantRemise());
      assertNotEquals(montantFacture, f2.getMontantFacture());
   }*/

   /*@Test
   @Order(5)
   public void retriveFacture_ok() {
      Facture retrived = f.retrieveFacture(3l);
      Assertions.assertEquals(3l, retrived.getIdFacture());

   }*/

   /*@Test()
   @Order(6)
   @Transactional
   public void assignOperateurToFacture() {

      f.assignOperateurToFacture(1l, 3L);
      Facture facture =f.retrieveFacture(3l);
      assertEquals(1, facture.getOperateur().size());
      assertEquals(1L, Optional.ofNullable(facture.getOperateur().iterator().next().getIdOperateur()).get().longValue());

   }*/
