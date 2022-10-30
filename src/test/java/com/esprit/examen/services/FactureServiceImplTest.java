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

import com.esprit.examen.entities.DetailFacture;
import com.esprit.examen.entities.Facture;
import com.esprit.examen.repositories.DetailFactureRepository;
import com.esprit.examen.repositories.FactureRepository;
import com.esprit.examen.repositories.FournisseurRepository;
import com.esprit.examen.repositories.OperateurRepository;
import com.esprit.examen.repositories.ProduitRepository;


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


