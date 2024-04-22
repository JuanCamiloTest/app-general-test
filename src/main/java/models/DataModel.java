package models;

import org.springframework.stereotype.Component;

@Component
public class DataModel {
	
	private String[][] infoRobots = {
			{"Optimus Prime", "Lider", "Autobots"},
			{"Megatron", "Lider", "Decepticons"},
			{"Darksteel", "Lider", "Predacons"},
			{"Airachnid", "Lider", "Insecticons"},
			{"Bulkhead", "Constructor", "Autobots"},
			{"Starscream", "Lider", "Decepticons"},
			{"Ratchet", "Médico", "Autobots"},
			{"Bumblebee", "Explorador", "Autobots"},
			{"Arcee", "Guerrero", "Autobots"},
			{"Insecto # 1", "Guerrero", "Insecticons"},
			{"Soldado # 1", "Guerrero", "Decepticons"},
	};

	private String[][] infoCards = {
			{"Alto 800", "Plata", "Zusuki Autos", "0.8 Ltrs"},
			{"i35", "Blanza", "Hyundai", "1.5 Ltrs"},
			{"Joy Sedán", "Negro", "Chevrolet", "1.4 Ltrs"},
			{"Accen", "Gris", "Hyndai", "1.5 Ltrs"},
	};
	
	private String[][] infoMonedas = {
			{"COP", "1500"},
			{"EU", "4300"},
			{"EEU", "4900"}
	};
	
	public String[][] getInfoRobots() {
		return infoRobots;
	}

	public String[][] getInfoCards() {
		return infoCards;
	}
	
	public String[][] getInfoMonedas() {
		return infoMonedas;
	}
	
}
