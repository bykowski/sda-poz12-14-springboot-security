package pl.bykowski.pozspringsec;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {

    @GetMapping("/helloAdmin")
    public String helloAdmin() {
        return "helloAdmin";
    }

    @GetMapping("/helloUser")
    public String helloUser() {
        return "helloUser";
    }

    @GetMapping("/forAll")
    public String forAll() {
        return "forAll";
    }
}
