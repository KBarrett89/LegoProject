package com.bae.Lego.service;

import java.util.List;

import com.bae.Lego.data.Lego;

public interface LegoKitService {

	public void createLegoKit(Lego legoKit);

	public List<Lego> getAllLegoKits();

	public Lego getLegoKit(int id);

	public Lego replaceLegoKit(int id, Lego newlegoKit);

	public String deleteLegoKit(int id);

}
