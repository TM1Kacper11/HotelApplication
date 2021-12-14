package kacper.hotelsApplication.remote.rest.dto.response;

import kacper.hotelsApplication.domain.model.OrderStatusType;
import kacper.hotelsApplication.remote.rest.dto.common.PersonOrderDto;
import kacper.hotelsApplication.remote.rest.dto.common.RoomOrderDto;

import java.util.List;

public class OrderDto {
    private Integer id;
    private OrderStatusType status;
    private List<RoomOrderDto> rooms;
    private PersonOrderDto person;

    public OrderDto() {
    }

    public OrderDto(Integer id, OrderStatusType status, List<RoomOrderDto> rooms, PersonOrderDto person) {
        this.id = id;
        this.status = status;
        this.rooms = rooms;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OrderStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public List<RoomOrderDto> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomOrderDto> rooms) {
        this.rooms = rooms;
    }

    public PersonOrderDto getPerson() {
        return person;
    }

    public void setPerson(PersonOrderDto person) {
        this.person = person;
    }
}