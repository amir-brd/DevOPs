package com.esprit.examen.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.rh.entities.DetailFacture;
import tn.esprit.rh.entities.Facture;
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
	
	void test_addFacture_ok() {
		DetailFacture df= new DetailFacture();
		df.setIdDetailFacture(1L);
		//mock
		when(factureRepository.save(any())).thenReturn(df);	
		//call function 
		factureServiceImpl.addFacture(new Facture());
		//assert
		assertEquals(1L,df.getIdDetailFacture());
		}

	
}


