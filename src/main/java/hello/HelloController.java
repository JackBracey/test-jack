package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    //Get Requests

    @RequestMapping("/jack")
    public String jack() {
        return "Welcome \"Jack\"";
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

        return " |-------------------|\n    " + exampleRequest.getExample(pos) + "     \n |-------------------|";

    }

    @GetMapping("/exampleall")
    public String exampleall() {
        ExampleRequest exampleRequest = new ExampleRequest();
        return exampleRequest.getExamples().get(15);
    }


    //Post requests
    @PostMapping("/post/{mesg}")
    public String postmsg(@PathVariable String mesg) {

        System.out.println("\nMessage recieved:\n" + mesg);

        return "Message sent: " + mesg;

    }



    @PostMapping(path = "/jsonaddtwo", produces = MediaType.TEXT_PLAIN_VALUE)
    public int addition(@RequestBody AdditionJsonTwoNum additionJsonTwoNum) {

        return additionJsonTwoNum.add();

    }

    @PostMapping(path = "/jsonstring", produces = MediaType.TEXT_PLAIN_VALUE)
    public String attatch(@RequestBody JsonStrings jsonStrings) {
        return jsonStrings.combine();
    }


    @PostMapping(path = "/jsonmultiply", produces = MediaType.TEXT_PLAIN_VALUE)
    public int mult(@RequestBody AdditionJsonTwoNum additionJsonTwoNum) {

        return additionJsonTwoNum.mult();

    }

    @PostMapping(path = "/jsonaddthree", produces = MediaType.TEXT_PLAIN_VALUE)
    public int addthree(@RequestBody AdditionJsonTwoNum additionJsonTwoNum) {
        return additionJsonTwoNum.addthree();
    }

    @PostMapping(path = "/jsonaddfour", produces = MediaType.TEXT_PLAIN_VALUE)
    public int addfour(@RequestBody AdditionJsonTwoNum additionJsonTwoNum) {
        return additionJsonTwoNum.addfour();
    }

    @PostMapping(path = "/jsonaddfive", produces = MediaType.TEXT_PLAIN_VALUE)
    public int addfive(@RequestBody AdditionJsonTwoNum additionJsonTwoNum) {
        return additionJsonTwoNum.addfive();
    }


    @PostMapping(path = "/getemployee", produces = MediaType.APPLICATION_JSON_VALUE)
    public Employee employee(@RequestBody Employee employee) {
        return employee;
    }

    @PostMapping(path = "/personal", produces = MediaType.APPLICATION_JSON_VALUE)
    public Personal personal(@RequestBody Personal personal) {
        return personal;
    }

    @Component
    public static class IpGrabber {

        private HttpServletRequest request;

        @Autowired
        public void hsr(HttpServletRequest request) {
            this.request = request;
        }

        public String ip() {

            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes())
                    .getRequest();

            if (request.getRemoteAddr() != null) {
                return request.getRemoteAddr();
            } else {
                return "No IP Address Available";
            }

        }

    }

}

