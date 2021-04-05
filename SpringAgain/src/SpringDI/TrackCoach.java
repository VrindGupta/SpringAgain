package SpringDI;

public class TrackCoach implements Coach{
	
	private FortuneService service;
	
	public TrackCoach(FortuneService theFortuneService) {
		// TODO Auto-generated constructor stub
		service= theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run 3k metres";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return service.getDailyFortune();
	}

}
