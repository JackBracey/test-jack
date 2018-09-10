package hello;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    //Get Requests

    @RequestMapping("/jack")
    public String jack() {
        return "Welcome Jack";
    }

    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/iprequest")
    public String ip() {
        IpGrabber ipGrabber = new IpGrabber();

        return "Your IP:\n" + ipGrabber.ip() + "\nThis doesn't work";
    }

    @GetMapping("/copyme/{copy}")
    public String abc(@PathVariable String copy) {
        if (copy != null) {
            return copy;
        } else {
            return "/copyme/Your Text";
        }
    }

    @GetMapping("/exampleget/{pos}")
    public String exampleGet(@PathVariable int pos) {

        ExampleRequest exampleRequest = new ExampleRequest();

        return " -------------------\n|    " + exampleRequest.getExample(pos) + "     |\n -------------------";

    }


    //Post requests
    @PostMapping("/post/{mesg}")
    public String postmsg(@PathVariable String mesg) {

        System.out.println("\nMessage recieved:\n" + mesg);

        return "Message sent: " + mesg;

    }



    @PostMapping(path = "/jsoncalc", produces = MediaType.APPLICATION_JSON_VALUE)
    public int addition(@RequestBody AdditionJsonTwoNum additionJsonTwoNum) {

        return additionJsonTwoNum.calc(additionJsonTwoNum.getOne(), additionJsonTwoNum.getTwo());

    }


    @PostMapping(path = "/jsonstring", produces = MediaType.APPLICATION_JSON_VALUE)
    public String attatch(@RequestBody JsonStrings jsonStrings) {
        return jsonStrings.calc(jsonStrings.getWordone(), jsonStrings.getWordtwo());
    }

}

