package com.esprit.examen.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.rh.entities.DetailFacture;
import tn.esprit.rh.entities.Facture;
import tn.esprit.rh.entities.Fournisseur;
import tn.esprit.rh.entities.Operateur;
import tn.esprit.rh.repositories.DetailFactureRepository;
import tn.esprit.rh.repositories.FactureRepository;
import tn.esprit.rh.repositories.FournisseurRepository;
import tn.esprit.rh.repositories.OperateurRepository;
import tn.esprit.rh.repositories.ProduitRepository;
import tn.esprit.rh.services.FactureServiceImpl;
import tn.esprit.rh.services.ReglementServiceImpl;


@ExtendWith(MockitoExtension.class)
public class FactureServiceImplTest {
	
@InjectMocks
	
	FactureServiceImpl factureServiceImpl;

	@Mock
	FactureRepository factureRepository;
	@Mock
	OperateurRepository operateurRepository;
	@Mock
	DetailFactureRepository detailFactureRepository;
	@Mock
	FournisseurRepository fournisseurRepository;
	@Mock
	ProduitRepository produitRepository;
	@Mock
    ReglementServiceImpl reglementService;
	
	@Test
	void test_retrieveAllFactures_ok() {
		
		when(factureRepository.findAll()).thenReturn(new ArrayList());
		List<Facture> response= factureServiceImpl.retrieveAllFactures();
		assertEquals(0, response.size());
	}
	/*@Test
	void test_addFacture_ok() {
		DetailFacture df= new DetailFacture();
		df.setIdDetailFacture(1L);
		//mock
		when(factureRepository.save(any())).thenReturn(df);	
		//call function 
		factureServiceImpl.addFacture(new Facture());
		//assert
		assertEquals(1L,df.getIdDetailFacture());
		}*/
	
	
	/*@Test
	   void test_updateFacture_ok() {
	     Fournisseur df= new Fournisseur();
	      Facture facture = new Facture();
	      df.setIdFournisseur(1L);
	      //mock
	      when(factureRepository.save(any())).thenReturn(df);
	      facture.setFournisseur(df);
	      facture.setIdFacture(10L);
	      when(factureRepository.save(any())).thenReturn(facture);
	      //call function
	    factureServiceImpl.updateFacture(facture);
	      //assert
	      assertEquals(1L,df.getIdFournisseur());
	      assertEquals(10L,facture.getIdFacture());
	      assertEquals(1L,facture.getFournisseur().getIdFournisseur());
	   }*/

	  /* @Test
	   void test_cancelFacture_ok() {
	      Long factureId = 1L;
	      //mock
	      doNothing().when(factureRepository).deleteById(factureId);
	      //call function
	      factureServiceImpl.cancelFacture(factureId);
	      //assert
	      verify(factureRepository, times(1)).deleteById(factureId);
	   }*/
	  /* @Test
	   void test_retrieveFacture_ok() {
		   
		   Facture facture = new Facture();
	      Long factureId = 1L;
	      //mock
	      when(factureRepository.findById(factureId)).thenReturn(Optional.ofNullable(facture));
	      //call function
	      Facture facture1 = factureServiceImpl.retrieveFacture(factureId);
	      //assert
	      assertEquals(null,facture1);
	   }*/
	 /*  @Test
	   void test_assignOperateurToFacture_ok() {
	      Long factureId = 1L;
	      Operateur operateur = null;
	      Facture facture = new Facture();
	      //facture.setOperateur(new HashSet<>());
	      facture.setIdFacture(factureId);
	      //mock
	      when(factureRepository.findById(factureId)).thenReturn(Optional.ofNullable(facture));
	      when(operateurRepository.findById(any())).thenReturn(Optional.ofNullable(operateur));
	      when(fournisseurRepository.save(any())).thenReturn(facture);
	      //call function
	      factureServiceImpl.assignOperateurToFacture(1L, 1L);
	      //assert
	      verify(factureRepository, times(1)).findById(factureId);
	      verify(operateurRepository, times(1)).findById(1L);
	      verify(factureRepository, times(1)).save(any());
	   }*/

	
}


