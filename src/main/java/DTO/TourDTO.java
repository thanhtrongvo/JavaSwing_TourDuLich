/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;
import java.sql.Date;
/**
 *
 * @author Admin
 */
public class TourDTO {
    private int tour_id;
    private String tour_name;
    private int tourguide_id;
    private int hotel_id;
    private double price;
    private Date start_day;
    private Date end_day;
    private String departure_place;
    private String schedule_describe;
    private Date create_at;
    public TourDTO(int tour_id, String tour_name, int tourguide_id, int hotel_id, double price, Date start_day, Date end_day, String departure_place, String schedule_describe, Date create_at) {
        this.tour_id = tour_id;
        this.tour_name = tour_name;
        this.tourguide_id = tourguide_id;
        this.hotel_id = hotel_id;
        this.price = price;
        this.start_day = start_day;
        this.end_day = end_day;
        this.departure_place = departure_place;
        this.schedule_describe = schedule_describe;
        this.create_at = create_at;
    }

    public TourDTO() {

    }

    public int getTour_id() {
        return tour_id;
    }

    public void setTour_id(int tour_id) {
        this.tour_id = tour_id;
    }

    public String getTour_name() {
        return tour_name;
    }

    public void setTour_name(String tour_name) {
        this.tour_name = tour_name;
    }

    public int getTourguide_id() {
        return tourguide_id;
    }

    public void setTourguide_id(int tourguide_id) {
        this.tourguide_id = tourguide_id;
    }

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getStart_day() {
        return start_day;
    }

    public void setStart_day(Date start_day) {
        this.start_day = start_day;
    }

    public Date getEnd_day() {
        return end_day;
    }

    public void setEnd_day(Date end_day) {
        this.end_day = end_day;
    }

    public String getDeparture_place() {
        return departure_place;
    }

    public void setDeparture_place(String departure_place) {
        this.departure_place = departure_place;
    }

    public String getSchedule_describe() {
        return schedule_describe;
    }

    public void setSchedule_describe(String schedule_describe) {
        this.schedule_describe = schedule_describe;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }
}
