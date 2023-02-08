package r6.siege.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import r6.siege.service.MapsService;

@Controller
@RequestMapping("/")
@Slf4j
public class MainPageController {

    private final MapsService mapsService;

    @Autowired
    public MainPageController(MapsService mapsService) {
        this.mapsService = mapsService;
    }

    @GetMapping
    public String displayMainPage(Model model) {
        log.info("Adding following attributes to model: {}", mapsService.getAllMaps());
        model.addAttribute("maps", mapsService.getAllMaps());
        log.info("Displaying main page.");
        return "mainPage";
    }
}
