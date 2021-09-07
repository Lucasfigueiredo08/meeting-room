package one.digitalinnovation.crud.saladereuniao.model;

import lombok.Data;

import javax.persistence.*;

@Entity
//@Data
@Table(name = "meetingRoom")
public class Room {

    private Long id;
    private String name;
    private String date;
    private String startHour;
    private String endHour;

    public Room() {

    }

    private Room(long id, String name, String date, String startHour, String endHour){
        this.id = id;
        this.name = name;
        this.date = date;
        this.startHour = startHour;
        this.endHour = endHour;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "date", nullable = false)
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Column(name = "startHour", nullable = false)
    public String getStartHour() {
        return startHour;
    }

    public void setStartHour(String startHour) {
        this.startHour = startHour;
    }

    @Column(name = "endHour", nullable = false)
    public String getEndHour() {
        return endHour;
    }

    public void setEndHour(String endHour) {
        this.endHour = endHour;
    }

    public String toString(){
        return "Room [id="+id+",name="+ name+",startHour="+startHour+",endHour="+endHour+" ]";
    }
}
