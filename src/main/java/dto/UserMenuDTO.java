package dto;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public final class UserMenuDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public List<Menu> list;
	public Integer totalItemsMenu;
	public Integer totalPagesMenu;
	
	public UserMenuDTO() {}
	
	public UserMenuDTO(List<Menu> list, Integer totalItemsMenu, Integer totalPagesMenu) {
		this.list = list;
		this.totalItemsMenu = totalItemsMenu;
		this.totalPagesMenu = totalPagesMenu;
	}
	
	public class Menu {
		
		public String name;
		public String route;
		public List<UserMenuDTO.Menu> children;
		
		public Menu(String name, String route, List<UserMenuDTO.Menu> children) {
			this.name = name;
			this.route = route;
			this.children = children;
		}
	
	}
	
}