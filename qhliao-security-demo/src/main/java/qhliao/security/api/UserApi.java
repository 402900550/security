package qhliao.security.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApi {



    @GetMapping(value = "/getUserInfo")
    public String getUserInfo(){

        return "wowowowo";
    }

}
