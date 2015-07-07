package tomcat.ws;

import java.util.logging.Logger;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public class HelloWorld {
	
	private final static Logger logger = Logger.getLogger(HelloWorld.class.getName());

	@WebMethod(operationName = "getHelloWorld")
	public String getHelloWorld() {
		logger.info("getHelloWorld invoked.");

		return "Hello";

	}
	
	@WebMethod(operationName = "getTeam")
	public String getTeam() {
		logger.info("getTeam invoked.");

		return "Hello Team";

	}
}
