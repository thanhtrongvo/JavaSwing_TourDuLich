package BUS;

import DAO.BookingDAO;
import DAO.Booking_DetailDAO;
import DAO.CustomerDAO;
import DTO.*;

import java.util.ArrayList;

public class BookingBUS {

    BookingDAO booking ;
    Booking_DetailDAO booking_detail ;

    public BookingBUS() {
        booking = new BookingDAO();
        booking_detail = new Booking_DetailDAO();
    }
    public ArrayList<BookingDTO> getAll() {
        return booking.getAll();
    }

    public String add(BookingDTO bookingDTO, ArrayList<ServiceDTO> serviceDTOs) {


        if (booking.checkExistById(bookingDTO.getBooking_id())) {
            return "ID hoá đơn booking đã tồn tại";
        }

        if (bookingDTO.getTotal_cost() == 0) {
            double sum = 0;
            for (ServiceDTO service : serviceDTOs)
                sum += service.getService_price();
            bookingDTO.setTotal_cost(sum);
        }

        if (!booking.add(bookingDTO))
            return "Thêm booking thất bại!";


        for (ServiceDTO service : serviceDTOs) {
            Booking_DetailDTO bd = new Booking_DetailDTO();
            bd.setBooking_id(bookingDTO.getBooking_id());
            bd.setService_id(service.getService_id());
            booking_detail.add(bd);
        }

        return "thêm booking thành công!";

    }


    public ArrayList<ServiceDTO> getServicesOfBooking(int id) {
        return booking.getServicesOfBooking(id);
    }

    public CustomerDTO getCustomerOfBooking (int customer_id) {
        CustomerDAO cusDAO = new CustomerDAO();
        return cusDAO.getById(customer_id);
    }
}
