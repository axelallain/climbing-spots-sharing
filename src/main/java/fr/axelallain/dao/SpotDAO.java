package fr.axelallain.dao;

import java.util.List;

import fr.axelallain.entity.Spot;

public interface SpotDAO {
	
	public List<Spot> findAllSpotsByTopoId(Long id);
	
}