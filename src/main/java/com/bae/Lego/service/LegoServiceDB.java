package com.bae.Lego.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bae.Lego.data.Lego;

@Service // future functionality - don't use
public class LegoServiceDB implements LegoKitService {

	@Override
	public void createLegoKit(Lego legoKit) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Lego> getAllLegoKits() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lego getLegoKit(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lego replaceLegoKit(int id, Lego newlegoKit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteLegoKit(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}