package kacper.hotelsApplication.remote.rest.dto.request;

public class DeleteOrderDto {
    private Integer id;

    public DeleteOrderDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DeleteOrderDto(Integer id) {
        this.id = id;
    }
}
