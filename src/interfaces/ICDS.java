package interfaces;

public interface ICDS {
	double length = 0;
	String director = "";
	String genre = "";
	int yearMade = 0;
	
	public double getLength();
	public void setLength(double length);
	
	public String getDirector();
	public void setDirector(String director);
	
	public String getGenre();
	public void setGenre(String genre);
	
	public int getYearMade(); 
	public void setYearMade(int yearMade);

}
