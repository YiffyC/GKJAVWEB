package fr.futurskill.formation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.futurskill.formation.business.Court;
import fr.futurskill.formation.dao.CourtDAO;
import fr.futurskill.formation.service.CourtService;

@Service
public class CourtServiceImpl implements CourtService {
	@Autowired
	private CourtDAO dao;

	@Override
	public List<Court> getAll() {
		return dao.getAll();
	}

	@Override
	public Court get(int id) {
		return dao.get(id);
	}

}
