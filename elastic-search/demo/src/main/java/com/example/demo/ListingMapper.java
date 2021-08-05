package com.example.demo;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ListingMapper {

    ListingMapper INSTANCE = Mappers.getMapper( ListingMapper.class );

    Listing of(ListingReq listingReq);
}
