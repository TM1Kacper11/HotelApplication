package kacper.hotelsApplication.remote.rest.api;

import kacper.hotelsApplication.domain.model.OrderStatusType;
import kacper.hotelsApplication.remote.rest.dto.common.PersonOrderDto;
import kacper.hotelsApplication.remote.rest.dto.common.RoomOrderDto;
import kacper.hotelsApplication.remote.rest.dto.response.OrderDto;
import kacper.hotelsApplication.remote.rest.dto.response.OrderStatusDto;
import kacper.hotelsApplication.remote.rest.dto.response.TokenDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static kacper.hotelsApplication.domain.model.OrderStatusType.NEW;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping(value = "/api/v1/reservations", produces = APPLICATION_JSON_VALUE)
@RestController
public class OrderController {
    @PostMapping
    public ResponseEntity<TokenDto> addOrder(@RequestBody OrderDto OrderDto) {
        return ResponseEntity.ok(null);
    }
    @GetMapping
    public ResponseEntity<OrderStatusDto> getOrders(@RequestParam("orderStatusType") OrderStatusType orderStatusType, @RequestHeader("Access-Token") String token) {
        RoomOrderDto roomOrderDto = new RoomOrderDto(3, 1, 5);
        PersonOrderDto personOrderDto = new PersonOrderDto("Jan Kowalski", "123456", "Branickiego 34/2", 1);
        OrderDto OrderDto = new OrderDto(1, NEW, List.of(roomOrderDto), personOrderDto);
        OrderStatusDto orderStatusDto = new OrderStatusDto(List.of(OrderDto));
        return ResponseEntity.ok(orderStatusDto);
    }

    @DeleteMapping("/{reservation-id}")
    public ResponseEntity<Void> deleteReservation(@RequestHeader("Access-Token") String token, @PathVariable("reservation-id") Integer reservationId) {
        return ResponseEntity.ok().build();
    }
}
