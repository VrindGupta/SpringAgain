package SpringDI;

public class BaseBallCoach implements Coach{
	
	public void setService(FortuneService service) {
		this.service = service;
	}

	private FortuneService service;
	
	public BaseBallCoach(FortuneService theFortuneService) {
		// TODO Auto-generated constructor stub
		service= theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practise batting in a batting cage";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return service.getDailyFortune();
	}

}
