package ruggy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
// import antlr.collections.List;

@SpringBootApplication
@RestController
public class RuggyApplication {

	public static void main(String[] args) {
		SpringApplication.run(RuggyApplication.class, args);
	}

	@GetMapping
	public List<String> hello() {
		return List.of("Jaston","Ruggy");
	}

}
