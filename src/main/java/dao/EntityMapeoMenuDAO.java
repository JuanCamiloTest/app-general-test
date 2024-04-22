package dao;

public class EntityMapeoMenuDAO {

	private Integer rowNum;
	private Integer id;
	private String name;
	private Integer typeMenu;
	private Integer parentItem;
	private String recurso;
	
	public EntityMapeoMenuDAO() {}
	
	public EntityMapeoMenuDAO(Integer rowNum, Integer id, String name, Integer typeMenu, Integer parentItem, String recurso) {
		this.rowNum = rowNum;
		this.id = id;
		this.name = name;
		this.typeMenu = typeMenu;
		this.parentItem = parentItem;
		this.recurso = recurso;
	}
	
	public Integer getRowNum() {
		return rowNum;
	}

	public void setRowNum(Integer rowNum) {
		this.rowNum = rowNum;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTypeMenu() {
		return typeMenu;
	}

	public void setTypeMenu(Integer typeMenu) {
		this.typeMenu = typeMenu;
	}

	public Integer getParentItem() {
		return parentItem;
	}

	public void setParentItem(Integer parentItem) {
		this.parentItem = parentItem;
	}

	public String getRecurso() {
		return recurso;
	}

	public void setRecurso(String recurso) {
		this.recurso = recurso;
	}

	@Override
	public String toString() {
		return "EntityMapeoMenuDAO [id=" + id + ", name=" + name + ", typeMenu=" + typeMenu + ", parentItem="
				+ parentItem + ", recurso=" + recurso + "]";
	}
	
	
}
