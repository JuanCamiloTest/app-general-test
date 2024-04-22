package services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.DataModel;
import utils.test.InfoCardAllMapDTO;
import utils.test.InfoCardDTO;
import utils.test.InfoRecordClass;
import utils.test.InfoRobotDTO;
import utils.test.InfoRobotJsonDTO;
import utils.test.InfoCardAllMapDTO.Brand;

@Service
public class LogicaService {

	@Autowired
	private InfoRobotDTO dtoRobot;

	@Autowired
	private InfoRobotJsonDTO dtoRobotJson;

	@Autowired
	private InfoCardDTO dtoCard;

	/*@Autowired
	private InfoRecordClass infoRecord;*/
	
	/*@Autowired
	private InfoCardAllMapDTO infoRecordMap;*/

	@Autowired
	private DataModel data;

	public InfoRobotDTO sendAllTransformsArray() {

		var listModel = this.data.getInfoRobots();
		List<String[]> list = new ArrayList<>();

		for (String[] valueDto : listModel) {
			if (valueDto == listModel[0]) {
				continue;
			}
			list.add(valueDto);
		}

		dtoRobot.setList(list);
		dtoRobot.setPages(7);

		return dtoRobot;

	}

	public InfoRobotJsonDTO sendAllTransformsJson() {

		var listModel = this.data.getInfoRobots();
		List<InfoRobotJsonDTO.Robot> list = new ArrayList<>();

		for (String[] valueDto : listModel) {
			list.add(dtoRobotJson.new Robot(valueDto[0], valueDto[1], valueDto[2]));
		}

		dtoRobotJson.setList(list);
		dtoRobotJson.setPages(7);

		return dtoRobotJson;

	}

	public InfoCardDTO sendAllCards() {

		var listData = data.getInfoCards();
		List<InfoCardDTO.Card> listCards = new ArrayList<>();

		for (String[] card : listData) {
			listCards.add(dtoCard.new Card(card[0], card[1], card[2], card[3]));
		}

		dtoCard.setList(listCards);

		return dtoCard;
	}

	public InfoRecordClass sendAllCardsRecord() {

		/*
		 * var listModel = this.data.getInfoRobots(); List<String[]> list = new
		 * ArrayList<>();
		 * 
		 * for (String[] valueDto : listModel) { if (valueDto == listModel[0]) {
		 * continue; } list.add(valueDto); } String[] x = {"Hola", "Mundo", "!!!",
		 * "Otro"}; list.add(x);
		 * 
		 * return new InfoRecordClass(list, 89);
		 */

		var listData = data.getInfoCards();
		List<InfoCardDTO.Card> listCards = new ArrayList<>();

		for (String[] card : listData) {
			listCards.add(dtoCard.new Card(card[0], card[1], card[2], card[3]));
		}
		
		//List<InfoRecordClass.TestRe> l = new ArrayList<>();
		
		//l.add(infoRecord.new TestRe(""));
		
		//List<InfoRecordClass.Test> lTe = new ArrayList<>();
		
		//lTe.add(infoRecord.new Test(""));
		
		//infoRecord.list();
		//infoRecord.pages();
		
		return new InfoRecordClass(listCards, 27);
		//return new InfoRecordClass(listCards, 27, lTe, l);
	}
	
	public InfoCardAllMapDTO sendAllMonedas() {

		var listData = data.getInfoMonedas();
		List<InfoCardAllMapDTO.Brand> arr = new ArrayList<>();
		Map<String, List<InfoCardAllMapDTO.Brand>> listMones = new HashMap<>();
		//Map<String, List<Object>> listMonesC = new HashMap<>();

		for (String[] mone : listData) {
			arr.add(new Brand(mone[0], Integer.parseInt(mone[1])));
			listMones.put("List", arr);
			System.out.print("listMones ---> " + listMones);
		}

		return new InfoCardAllMapDTO(listMones, listMones);
		//return null;
	}

}
