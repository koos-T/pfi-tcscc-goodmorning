package in.koos_t.pfi_tcscc_goodmorning.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodMorning {

    @GetMapping("/greet")
    public String great(){

        return "good morning welcome home";

    }

}
