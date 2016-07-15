package module6;

import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.SimpleLinesMarker;

import java.util.HashMap;
import java.util.List;


public class LineMarkerPlusKey extends SimpleLinesMarker {
	private int source;
	
	public LineMarkerPlusKey(List<Location> locs, HashMap<String, Object> properties, int key) {
		super(locs, properties);
		source = key;
	}
	
	public int getSource() {
		return source;
	}
	
	public void setSource(int value) {
		source = value;
	}
}
