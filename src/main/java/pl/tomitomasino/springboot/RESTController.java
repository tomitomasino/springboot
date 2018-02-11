package pl.tomitomasino.springboot;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {

	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/testREST")
	public Response testREST(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Response(counter.incrementAndGet(), "mymessage" + name);
	}
}