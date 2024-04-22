package utils.test;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class InfoRobotJsonDTO {

	private List<Robot> list;
	private Integer pages;

	public List<Robot> getList() {
		return list;
	}

	public void setList(List<Robot> list) {
		this.list = list;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}
	
	public class Robot {
		
		private String name;
		private String range;
		private String team;
		
		public Robot(String name, String range, String team) {
			this.name = name;
			this.range = range;
			this.team = team;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRange() {
			return range;
		}

		public void setRange(String range) {
			this.range = range;
		}

		public String getTeam() {
			return team;
		}

		public void setTeam(String team) {
			this.team = team;
		}
		
	}
	
}