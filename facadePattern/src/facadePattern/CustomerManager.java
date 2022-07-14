package facadePattern;

public class CustomerManager implements CustomerService {
	private CrossCuttingConcernsFacade crossCuttingConcernsFacade;

	public CustomerManager() {
		crossCuttingConcernsFacade = new CrossCuttingConcernsFacade();
	}

	@Override
	public void save() {

		crossCuttingConcernsFacade.cacheService.cache();
		crossCuttingConcernsFacade.authorizeService.checkUser();
		crossCuttingConcernsFacade.logService.log();
		System.out.println("Saved");
	}

}
