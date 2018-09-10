package hello;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Component
public class IpGrabber {

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
