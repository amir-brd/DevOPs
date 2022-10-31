package tn.esprit.rh.achat.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.rh.achat.entities.DetailFournisseur;
import tn.esprit.rh.achat.entities.Fournisseur;
import tn.esprit.rh.achat.entities.SecteurActivite;
import tn.esprit.rh.achat.repositories.DetailFournisseurRepository;
import tn.esprit.rh.achat.repositories.FournisseurRepository;
import tn.esprit.rh.achat.repositories.ProduitRepository;
import tn.esprit.rh.achat.repositories.SecteurActiviteRepository;

import java.util.Date;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
@Slf4j
@Transactional
public class FournisseurServiceImpl implements IFournisseurService {

	@Autowired
	FournisseurRepository fournisseurRepository;
	@Autowired
	DetailFournisseurRepository detailFournisseurRepository;
	@Autowired
	ProduitRepository produitRepository;
	@Autowired
	SecteurActiviteRepository secteurActiviteRepository;

	private static final Logger l = LogManager.getLogger(Fournisseur.class);

	@Override
	public List<Fournisseur> retrieveAllFournisseurs() {
		List<Fournisseur> fournisseurs = null;

		try {

			l.info("In Method retrieveAllFournisseurs :");
			//int i = 1/0;
			fournisseurs = (List<Fournisseur>) fournisseurRepository.findAll();
			for (Fournisseur fournisseur : fournisseurs) {
			}
			l.info("out of Method retrieveAllFournisseurs with succes");
		}catch (Exception e) {
			l.error("out of Method retrieveAllFournisseurs with Errors + e");
		}
		return fournisseurs;
	}

	public Fournisseur addFournisseur(Fournisseur f /*Master*/) {
		try{
			l.info("In Method addFournisseur :");
		DetailFournisseur df= new DetailFournisseur();//Slave
		df.setDateDebutCollaboration(new Date()); //util
		//On affecte le "Slave" au "Master"
		f.setDetailFournisseur(df);
		fournisseurRepository.save(f);
			l.info("out of Method addFournisseur with succes");
		}catch (Exception e) {
			l.error("out of Method addFournisseur with Errors + e");
		}

		return f;
	}

	private DetailFournisseur  saveDetailFournisseur(Fournisseur f){
		l.info("In Method DetailFournisseur :");
		DetailFournisseur df = f.getDetailFournisseur();
		detailFournisseurRepository.save(df);
		l.info("out of Method DetailFournisseur with succes");
		return df;
	}

	public Fournisseur updateFournisseur(Fournisseur f) {
		try{
			l.info("In Method UpdatelFournisseur :");

		DetailFournisseur df = saveDetailFournisseur(f);
		f.setDetailFournisseur(df);
		fournisseurRepository.save(f);
			l.info("out of Method UpdateFournisseur with succes");
		}catch (Exception e) {
			l.error("out of Method UpdateFournisseur with Errors + e");
		}

		return f;
	}

	@Override
	public void deleteFournisseur(Long fournisseurId) {
		try {
			l.info("In Method updateFournisseur :");
			fournisseurRepository.deleteById(fournisseurId);
			l.info("out of Method retrieveAllFournisseurs with succes");
		}catch (Exception e) {
			l.error("out of Method retrieveAllFournisseurs with Errors + e");
		}

	}

	@Override
	public Fournisseur retrieveFournisseur(Long fournisseurId) {
		//try {
		//l.info("In Method  retrieveFournisseur :");
		Fournisseur fournisseur = fournisseurRepository.findById(fournisseurId).orElse(null);
		//l.info("out of Method retrieveFournisseurs with succes");
		//}catch (Exception e) {
		//l.error("out of Method retrieveFournisseurs with Errors + e");
		//}
		return fournisseur;
	}

	@Override

	public void assignSecteurActiviteToFournisseur(Long idSecteurActivite, Long idFournisseur) {
		try {
			l.info("In Method :");


			Fournisseur fournisseur = fournisseurRepository.findById(idFournisseur).orElse(null);
			SecteurActivite secteurActivite = secteurActiviteRepository.findById(idSecteurActivite).orElse(null);
			fournisseur.getSecteurActivites().add(secteurActivite);
			fournisseurRepository.save(fournisseur);
			l.info("out of Method retrieveAllFournisseurs with succes");
		}catch (Exception e) {l.error("out of Method with Errors + e");

		}
	}






}