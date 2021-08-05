package com.example.demo;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ListingESRepository extends ElasticsearchRepository<Listing, String> {
    List<Listing> findAllByAddress(String name);
}
