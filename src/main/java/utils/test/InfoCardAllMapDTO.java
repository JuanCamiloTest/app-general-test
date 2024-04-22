package utils.test;

import java.util.List;
import java.util.Map;

//public record InfoCardAllMapDTO(Map<String, String> list, Map<String, String> listC) {
public record InfoCardAllMapDTO(Map<String, List<InfoCardAllMapDTO.Brand>> list, Map<String, List<InfoCardAllMapDTO.Brand>> listC) {


	public record Brand(String moneda, Integer value) {}
	
}
