package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListingService {

    @Autowired
    private ListingESRepository listingESRepository;

    public void save(ListingReq listingReq) {
        Listing listing = ListingMapper.INSTANCE.of(listingReq);
        listingESRepository.save(listing);
    }

    public List<Listing> findByName(String name) {
        return listingESRepository.findAllByAddress(name);
    }

    public void delete() {
        listingESRepository.deleteAll();
    }
}
