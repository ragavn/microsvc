package demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LuckyWordController {
	@Value("${fortune.fallbackFortune}") String luckyWord;

	@RequestMapping("/lucky-word")
		public String showLuckyWord() {
		return "The lucky word is: " + luckyWord;
	  }

}
