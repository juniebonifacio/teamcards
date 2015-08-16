/**
 * 
 */
package com.customer.controller.security;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Controller;

import com.customer.utility.RestResponse;

import jxl.common.Logger;

/**
 * @author Junie D. Bonifacio
 *
 */
@Controller
@Path("/security")
@Produces(MediaType.APPLICATION_JSON)
public class LoginController {

	private static final Logger logger = Logger.getLogger(LoginController.class);
	
	@POST
	@Path("/login")
	@Consumes(MediaType.APPLICATION_JSON)
	public RestResponse login(Credentials credentials) {
		
		String userName = credentials.getUserName();
		String password = credentials.getPassword();
		logger.debug("userName: " + userName);
		logger.debug("password: " + password);
		
		RestResponse response = new RestResponse();
		response.setMessage("Successful");
		return response;
	}
	
}
