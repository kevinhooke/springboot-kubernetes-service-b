package kh.spring.exampleservice.rest;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kh.spring.exampleservice.domain.HelloResult;

@RestController
@RequestMapping("/example-b")
public class ExampleRestController {

	@GetMapping("/hello")
	public HelloResult getHello() throws UnknownHostException {
		HelloResult result = new HelloResult();
		result.setMessage("hello from exampleservice-b on " + InetAddress.getLocalHost() );
		return result;
	}
	
}
