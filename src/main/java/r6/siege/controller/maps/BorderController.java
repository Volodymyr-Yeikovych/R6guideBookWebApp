package r6.siege.controller.maps;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import r6.siege.service.MapsService;

@RequestMapping("/Border")
@Controller
@Slf4j
public class BorderController {

    private final MapsService mapsService;

    @Autowired
    public BorderController(MapsService mapsService) {
        this.mapsService = mapsService;
    }

    @GetMapping
    public String displayBorderPage(Model model) {
        log.info("Displaying border page.");
        return "borderPage";
    }
}
