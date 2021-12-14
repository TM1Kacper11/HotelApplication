package kacper.hotelsApplication.remote.rest.dto.response;

import java.util.List;

public class OrderStatusDto {
    private List<OrderDto> reservations;

    public OrderStatusDto() {
    }

    public List<OrderDto> getReservations() {
        return reservations;
    }

    public void setReservations(List<OrderDto> reservations) {
        this.reservations = reservations;
    }

    public OrderStatusDto(List<OrderDto> reservations) {
        this.reservations = reservations;
    }
}
