package br.com.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/informacao")
public class Informacao {
	
	@GET
	@Path("inf1/{param}/{param2}/{param3}")
	public String inf1(@PathParam("param") String nome, @PathParam("param2") int idade, @PathParam("param3") String prog ) {
		String out = "Eu " + nome +", trabalho e estudo, tenho " + idade + " anos e adoro programar em " + prog;
		return out;
	}
	
	@GET
	@Path("inf2/{param}/{param2}")
	public String inf2(@PathParam("param") float altura, @PathParam("param2") int kg) {
		String out = "Eu tenho " + altura +" de altura e tenho " + kg + " Kg. Eu estou " + (kg/(altura*altura)) + "do peso";
		return out;
	}

}
