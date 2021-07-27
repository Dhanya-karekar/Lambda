package com.xworkz.lamda.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.lamda.dto.MarketDTO;
import com.xworkz.lamda.search.MarketSearch;

public class MarketDAOimpl implements MarketDAO {

	private Collection<MarketDTO> col = new ArrayList<MarketDTO>();

	public MarketDAOimpl() {
		MarketDTO dto = new MarketDTO("D-Mart", "VijayNagar", 4, "WholeSale");
		MarketDTO dto1 = new MarketDTO("Vishal-Mart", "RajajiNagar", 5, "WholeSale");
		MarketDTO dto2 = new MarketDTO("Hyper-Market", "RR Nagar", 2, "WholeSale");
		MarketDTO dto3 = new MarketDTO("Super-Market", "WhiteField", 1, "WholeSale");
		MarketDTO dto4 = new MarketDTO("Heritage-mart", "BtmLayout", 4, "WholeSale");

		this.col.add(dto4);
		this.col.add(dto3);
		this.col.add(dto2);
		this.col.add(dto1);
		this.col.add(dto);
	}

	@Override
	public MarketDTO find(MarketSearch search) {
		Iterator<MarketDTO> itr = this.col.iterator();
		MarketDTO dto = null;
		while (itr.hasNext()) {
			MarketDTO marketDTO = itr.next();
			if (search.test(marketDTO)) {
				dto = marketDTO;
				break;
			}

		}
		return dto;
	}

	@Override
	public Collection<MarketDTO> findAll(MarketSearch search) {
		Collection<MarketDTO> collection = new ArrayList<MarketDTO>();
		Iterator<MarketDTO> itr = this.col.iterator();

		while (itr.hasNext()) {
			MarketDTO marketDTO = itr.next();
			if (search.test(marketDTO)) {
				collection.add(marketDTO);
			}

		}
		return collection;
	}
}
