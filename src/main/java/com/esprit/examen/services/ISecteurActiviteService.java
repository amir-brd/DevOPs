package com.esprit.examen.services;

import java.util.List;

import com.esprit.examen.dto.SecteurDTO;
import com.esprit.examen.entities.SecteurActivite;


public interface ISecteurActiviteService {

	void deleteSecteurActivite(Long id);


	 public List<SecteurDTO> retrieveAllSecteurActivite2();
	 public SecteurDTO retrieveSecteurActivite2( Long id);
	 SecteurDTO addANDupdate2( SecteurDTO dto);

}
