package services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.EntityMapeoMenuDAO;
import dto.UserMenuDTO;
import utils.MapeoMenuDAO;

@Service
public class MapeoMenuService {
	
	@Autowired
	private LogicaTestService logicaTest;
	
	@Autowired
	private UserMenuDTO userMenuDto;
	
	@Autowired
	private MapeoMenuDAO mapMenuDao;

	public Map<String, List<UserMenuDTO.Menu>> sendMenuCompled() {

		Map<String, List<UserMenuDTO.Menu>> mapMenu = new HashMap<>();
		List<UserMenuDTO.Menu> listMenu = new ArrayList<>();
		AtomicBoolean isRecursoNull = new AtomicBoolean();
		
		mapMenuDao.getAllMenus().forEach(menu -> {
			isRecursoNull.set(menu.getRecurso() == "");
			
			if (isRecursoNull.get()) {
				listMenu.add(userMenuDto.new Menu(
						menu.getName(), String.valueOf(menu.getTypeMenu()), new ArrayList<>()));
			} else {
				listMenu.add(userMenuDto.new Menu(
						menu.getName(), menu.getRecurso(), new ArrayList<>()));
			}
		
		});

		mapMenu.put("listMap", listMenu);

		// Llamando al servicio de prueba:
		logicaTest.useValidationDataType();
		logicaTest.useSwitchExpresion();
		logicaTest.useForEachLoops();
		logicaTest.useStream();
		
		return mapMenu;
	}

	public UserMenuDTO sendMenuCompledDto() {

		List<UserMenuDTO.Menu> listMenu = new ArrayList<>();
		List<UserMenuDTO.Menu> listMenuMain = new ArrayList<>();
		List<EntityMapeoMenuDAO> menus = mapMenuDao.getAllMenus();
		List<EntityMapeoMenuDAO> menusMain = mapMenuDao.getAllMenusMain();
		
		for (EntityMapeoMenuDAO entMenuMain : menusMain) {			
			listMenuMain.add(this.userMenuDto.new Menu(
					entMenuMain.getName(),
					String.valueOf(entMenuMain.getTypeMenu()),
					new ArrayList<>()));
		}
		
		for (EntityMapeoMenuDAO entMenu : menus) {			
			listMenu.add(this.userMenuDto.new Menu(
					entMenu.getName(),
					entMenu.getRecurso(),
					new ArrayList<>()));
		}

		return new UserMenuDTO(listMenuMain, 7,770);
	}

}
