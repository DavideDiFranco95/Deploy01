package co.develhope.deploy1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
    @Value("${myCustomEnvs.devName}")
    String myCustomEnvs;
    @GetMapping
    public String getDevName(){
        return myCustomEnvs;
    }
}