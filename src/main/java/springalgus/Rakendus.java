package springalgus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import java.lang.Math;

@RestController
@SpringBootApplication
public class Rakendus {
	@RequestMapping("/algus")
    String tervitusfunktsioon() {
        return "Ahoi!";
    }
    
    @RequestMapping("/tervitus")
    String tervitus2(String eesnimi){
        return "Tere, "+eesnimi;
    }
	
	@RequestMapping("/arvutamine")
	int korrutamine(int arv1, int arv2){
		return arv1*arv2;
	}
	
	@RequestMapping("/kmi")
	int kehamassiindeks(int kaal, int pikkus){
		return kaal / Math.pow(pikkus);
	}
 
    public static void main(String[] args) {
		/*System.getProperties().put("server.port", 40305);*/
        SpringApplication.run(Rakendus.class, args);
    }
}

//java -jar -Dserver.port=43004 target/boot3-1.0-SNAPSHOT.jar

