package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListingReq {
    private String name;
    private String address;
    private Double price;
    private Integer bedrooms;
    private Integer bathrooms;
    private String district;
    private String ward;
    private String street;
}
