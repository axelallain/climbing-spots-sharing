package fr.axelallain.service;

import java.util.List;

import fr.axelallain.entity.Spot;

public interface SpotService {
	
	public List<Spot> findAllSpotsByTopoId(Long id);

}