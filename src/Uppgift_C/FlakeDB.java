package Uppgift_C;
import java.util.Map;
import java.util.TreeMap;

public class FlakeDB {
	public Map<String,Flake> theFlakes = new TreeMap<String,Flake>();
	
	public FlakeDB() {
		theFlakes.put("Convex Koch",new ConvexKoch());
		theFlakes.put("Mandelbrot PS",new MandelbrotPScurve());
		theFlakes.put("Concave Koch", new ConcaveKoch());
		theFlakes.put("Penta", new Penta());

		// Add your favourite flake objects here ...
		
	}
}
