package tn.esprit.rh.achat.services;

import tn.esprit.rh.achat.dto.SecteurDTO;
import tn.esprit.rh.achat.entities.SecteurActivite;

import java.util.List;

public interface ISecteurActiviteService {
	List<SecteurActivite> retrieveAllSecteurActivite();
	void deleteSecteurActivite(Long id);
	SecteurActivite updateADDSecteurActivite(SecteurActivite sa);
	SecteurActivite retrieveSecteurActivite(Long id);

}