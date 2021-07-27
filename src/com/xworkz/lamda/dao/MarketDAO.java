package com.xworkz.lamda.dao;

import java.util.Collection;

import com.xworkz.lamda.dto.MarketDTO;
import com.xworkz.lamda.search.MarketSearch;

public interface MarketDAO {

	MarketDTO find(MarketSearch search);

	Collection<MarketDTO> findAll(MarketSearch search);

}
