package kacper.hotelsApplication.data.entity.order;

import kacper.hotelsApplication.data.entity.orderRoom.OrderRoomEntity;
import kacper.hotelsApplication.domain.model.OrderStatusType;

import javax.persistence.*;
import java.util.Set;

public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "status")
    private OrderStatusType status;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "floor")
    private Integer floor;

    @Column(name = "token")
    private String token;

    @OneToMany(mappedBy = "reservation")
    private Set<OrderRoomEntity> Room;
}
