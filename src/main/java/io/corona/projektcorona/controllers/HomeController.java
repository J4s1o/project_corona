package io.corona.projektcorona.controllers;

import io.corona.projektcorona.models.LocationStats;
import io.corona.projektcorona.services.CoronaVirusDataServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    CoronaVirusDataServices coronaVirusDataServices;
    @GetMapping("/")
    public String home(Model model){
        List<LocationStats> allStats=coronaVirusDataServices.getAllStats();
        int totalCases = allStats.stream().mapToInt(stat ->stat.getLatestTotalCases()).sum();
        int totalActualCases=allStats.stream().mapToInt(stat->stat.getPreviousDayCases()).sum();
        model.addAttribute("LocationStats",allStats);
        model.addAttribute("totalReportedCases",totalCases);
        model.addAttribute("totalActualCases",totalActualCases);
        return "home";
    }
}
