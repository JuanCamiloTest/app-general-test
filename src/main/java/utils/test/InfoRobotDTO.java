package utils.test;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class InfoRobotDTO {

	private List<String[]> list;
	private Integer pages;

	public List<String[]> getList() {
		return list;
	}

	public void setList(List<String[]> list) {
		this.list = list;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}
	
}