package utils.test;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class InfoCardDTO {
	
	private final List<Card> list;
	
	public InfoCardDTO(List<Card> list) {
		this.list = list;
	}

	public List<Card> getList() {
		return list;
	}

	public void setList(List<Card> list) {
		//this.list = list;
	}

	public class Card {
		
		private String name;
		private String color;
		private String brand;
		private String engie;
		
		public Card(String name, String color, String brand, String engie) {
			this.name = name;
			this.color = color;
			this.brand = brand;
			this.engie = engie;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public String getEngie() {
			return engie;
		}

		public void setEngie(String engie) {
			this.engie = engie;
		}
		
	}

}
