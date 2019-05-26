package com.redbus;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;

@Path("/travel")
public class Provider {
	@GET
	@Path("/booking")
	public String showMsg(@HeaderParam("user")String un,
			              @HeaderParam("pwd")String pass) {
		return "Redbus Credentials: "+un+","+pass;
		
	}

}
