package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/listings")
@RestController
@RequiredArgsConstructor
public class ListingController {

    @Autowired
    private ListingService listingService;

    @GetMapping
    public List<Listing> getByName(@RequestParam("name") String name) {
        return listingService.findByName(name);
    }

    @PostMapping
    public void create(@RequestBody ListingReq listingReq) {
        listingService.save(listingReq);
    }

    @DeleteMapping
    public void delete() {
        listingService.delete();
    }
}
