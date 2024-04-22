package utils;

import java.util.List;

import dao.EntityMapeoMenuDAO;

public interface MapeoMenuDAO {

	public List<EntityMapeoMenuDAO> getAllMenus();
	public List<EntityMapeoMenuDAO> getAllMenusMain();
	
}
