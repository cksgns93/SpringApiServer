package kr.or.chan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChanController {
	@GetMapping(path = "/main")
	public String main() {
		return "mainpage";
	}

	@GetMapping(path = "/detail")
	public String detail() {
		return "detail";
	}

	@GetMapping(path = "/review")
	public String review() {
		return "review";
	}

	@GetMapping(path = "/reserve")
	public String reserve() {
		return "reserve";
	}

	@GetMapping(path = "/myreservation")
	public String myreservation() {
		return "myreservation";
	}
}
