package pl.tomitomasino.springboot;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response {

	long id;
	String message;

	public Response(long id, String s){
		this.id=id;
		this.message=s;
	}

}
