package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

@Document(indexName = "bankaccountdetails1")
@Getter
@Setter
@Setting(settingPath = "/erp-company.json")
public class Listing {

    @Id
    private String id;
    private String name;
    @Field(type = FieldType.Text, analyzer = "custom_analyzer")
    private String address;
    private Double price;
    private Integer bedrooms;
    private Integer bathrooms;
    private String district;
    private String ward;
    private String street;
}
