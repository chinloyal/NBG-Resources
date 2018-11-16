package abstracts;

import org.alicebot.ab.*;

import com.chinloyal.speak.*;
public abstract class ArtificialIntelligence extends Voice{
	
	private String response;
	private Chat chatSession;
	private Bot bot;
	
	
	public ArtificialIntelligence() {
		String resourcesPath = getResourcesPath();
		MagicBooleans.trace_mode = false;
		bot = new Bot("super", resourcesPath);
		chatSession = new Chat(bot);
		response = "";
	}
	
	public String respond(String input) {
	
		if ((input == null) || (input.length() < 1))
			input = MagicStrings.null_input;
		else {
			response = chatSession.multisentenceRespond(input);
			response = response.replaceAll("&lt;", "<");
			response = response.replaceAll("&gt;",	 ">");

			processAction(response, input);

			return response;
		}
		
		return response;
	}
	
	private String getResourcesPath() {
		return getClass().getResource("/ai").getFile();
	}
	
	/**
	 * This method should execute an action based on the response of the bot
	 * and the user's request.
	 * 
	 * @param response
	 * @param request
	 */
	public abstract void processAction(String response, String request);

}
