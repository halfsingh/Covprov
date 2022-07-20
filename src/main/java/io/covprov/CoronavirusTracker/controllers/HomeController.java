package io.covprov.CoronavirusTracker.controllers;

import io.covprov.CoronavirusTracker.models.LocationStats;
import io.covprov.CoronavirusTracker.services.CoronavirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {


    @Autowired
    CoronavirusDataService coronavirusDataService;


    @GetMapping("/")
    public String home(Model model){
        List<LocationStats> allStats = coronavirusDataService.getAllStats();
        int totalreportedcases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();

        int totalnewcases = allStats.stream().mapToInt(stat -> stat.getDifffromprevday()).sum();
        model.addAttribute("totalReportedCases", totalreportedcases);
        model.addAttribute("locationStats", allStats);
        model.addAttribute("totalnewcases", totalnewcases);



        return "home";
    }
}
