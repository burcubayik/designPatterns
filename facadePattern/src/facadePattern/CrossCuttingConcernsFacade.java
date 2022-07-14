package facadePattern;

public class CrossCuttingConcernsFacade {
	public LogService logService;
	public CacheService cacheService;
	public AuthorizeService authorizeService;
	public CrossCuttingConcernsFacade() {
		logService = new LogManager();
		cacheService =new CacheManager();
		authorizeService = new AuthorizeManager();
				
	 
		
	}
}
