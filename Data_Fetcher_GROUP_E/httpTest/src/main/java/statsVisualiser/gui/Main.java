package statsVisualiser.gui;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetData data = new GetData("SP.POP.TOTL","2001","2012","Can");
		data.fetchData();
		for(int i = 0 ; i<data.valueOfYear.size(); i++) {
			System.out.println("Years: " + data.year.get(i) + " Value: " + data.valueOfYear.get(i));
			}
		}
}