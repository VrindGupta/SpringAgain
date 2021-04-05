package SpringIOC;

public class MyApp {

	public static void main(String[] args) {
		Coach bsb= new BaseBallCoach();
		Coach tr= new TrackCoach();
		
		System.out.println(bsb.getDailyWorkout());
		System.out.println(tr.getDailyWorkout());
	}

}
