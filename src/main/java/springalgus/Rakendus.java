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
	
	@RequestMapping("/korrutus")
	int korrutamine(int arv1, int arv2){
		return arv1*arv2;
	}
	
	@RequestMapping("/kmi")
	double kehamassiindeks(float kaal, float pikkus){
		return kaal / Math.pow((pikkus/100),2);
	}
 
    public static void main(String[] args) {
		/*System.getProperties().put("server.port", 40305);*/
        SpringApplication.run(Rakendus.class, args);
    }
}

//java -jar -Dserver.port=43004 target/boot3-1.0-SNAPSHOT.jar