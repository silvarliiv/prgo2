public class Arvutused{
	public static double pikkus(double dx, double dy){
		return Math.sqrt(Math.pow(dx, 2)+dy*dy);
	}
	public static double pikkus(double x1, double x2,double y1, double y2 ){
		return Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1,2));	
	}
}