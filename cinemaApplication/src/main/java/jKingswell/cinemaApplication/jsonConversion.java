package jKingswell.cinemaApplication;

import java.util.HashMap;

import org.json.JSONObject;

public class jsonConversion {
	JSONObject cinemaJSON = new JSONObject();
	
	public void convertHashMap(HashMap hm) {
		//cinemaJSON.put("movie", movie);
		cinemaJSON.put("movie", hm);
		System.out.print(cinemaJSON);
	}
}
