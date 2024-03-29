package com.example.logisticssystem.model.dto;

import io.swagger.annotations.ApiModel;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ApiModel("Данные о заказе")
public class OrderResponseDto {

    String id;

    String movingDate;

    Double packing;

    Double loading;

    String carId;

    Double distance;

    String pointAName;

    List<Double> pointA;

    String pointBName;

    List<Double> pointB;

    String time;

    String numberOfMovers;

    String numberOfPackers;

    Double price;

}