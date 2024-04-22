package models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dao.EntityMapeoMenuDAO;
import utils.MapeoMenuDAO;

@Repository
public class MapeoMenuDAOImpl implements MapeoMenuDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<EntityMapeoMenuDAO> getAllMenus() {

		String sql = "select id, name, type_menu, parent_item, recurso from menu";

		return this.jdbcTemplate.query(sql, (resultSet, rowNum) -> {
			String recurso = resultSet.getString("recurso") == null ? "" : resultSet.getString("recurso");

			return new EntityMapeoMenuDAO(rowNum, resultSet.getInt("id"), resultSet.getString("name"),
					resultSet.getInt("type_menu"), resultSet.getInt("parent_item"), recurso);
		});
	}

	public List<EntityMapeoMenuDAO> getAllMenusMain() {

		try {
			String sql = "select id, name, type_menu from menu where type_menu = 0";

			return this.jdbcTemplate.query(sql, (resultSet, rowNum) -> {

				return new EntityMapeoMenuDAO(rowNum, resultSet.getInt("id"), resultSet.getString("name"),
						resultSet.getInt("type_menu"), null, null);
			});
		} catch (Exception e) {
			System.out.println("e: " + e);
			return null;
		}
	}

}
