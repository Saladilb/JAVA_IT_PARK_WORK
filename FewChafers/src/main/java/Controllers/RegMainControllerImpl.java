package Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RegMainControllerImpl {

    @RequestMapping("/reg")
    public String startReg() {
        return "reg";
    }
}
