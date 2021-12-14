package kacper.hotelsApplication.remote.rest.dto.request;

import kacper.hotelsApplication.remote.rest.dto.common.PersonOrderDto;
import kacper.hotelsApplication.remote.rest.dto.common.RoomOrderDto;

import java.util.List;

public class AddOrderDto {
    private List<RoomOrderDto> hotels;
    private PersonOrderDto person;

    public AddOrderDto() {
    }


    public AddOrderDto(List<RoomOrderDto> hotels, PersonOrderDto person) {
        this.hotels = hotels;
        this.person = person;
    }

    public List<RoomOrderDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<RoomOrderDto> hotels) {
        this.hotels = hotels;
    }

    public PersonOrderDto getPerson() {
        return person;
    }

    public void setPerson(PersonOrderDto person) {
        this.person = person;
    }
}
