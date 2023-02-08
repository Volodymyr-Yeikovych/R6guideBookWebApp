package r6.siege.controller.maps;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import r6.siege.service.MapsService;

@RequestMapping("Coastline")
@Controller
@Slf4j
public class CoastlineController {

    private final MapsService mapsService;

    @Autowired
    public CoastlineController(MapsService mapsService) {
        this.mapsService = mapsService;
    }

    @GetMapping
    public String displayCoastlinePage(Model model) {
        log.info("Displaying coastline page");
        return "coastlinePage";
    }
}
