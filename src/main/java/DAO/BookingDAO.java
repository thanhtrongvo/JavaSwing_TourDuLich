package DAO;

import DTO.BookingDTO;

import java.util.ArrayList;

public class BookingDAO implements AccessDatabase<BookingDTO>{
    @Override
    public ArrayList<BookingDTO> getAll() {
        return null;
    }

    @Override
    public BookingDTO getById(int id) {
        return null;
    }

    @Override
    public boolean add(BookingDTO bookingDTO) {
        return false;
    }

    @Override
    public boolean update(BookingDTO bookingDTO) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean checkExistById(int id) {
        return false;
    }
}
