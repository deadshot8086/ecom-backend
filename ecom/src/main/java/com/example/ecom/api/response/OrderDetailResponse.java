package com.example.ecom.api.response;

import com.example.ecom.database.entity.OrderItem;
import com.example.ecom.database.entity.OrderStatus;
import com.example.ecom.database.entity.PaymentStatus;
import com.example.ecom.database.entity.User;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class OrderDetailResponse {
    private Long id;
    private List<OrderItem> orderItemList;
//    private Discount discount;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String phone;
    private String orderNotes;
    private Float totalOrderPrice;
    private Float totalPrice;
    private PaymentStatus paymentStatus;
    private OrderStatus orderStatus;
    private Date createdAt;
}
