package DAO;

import DTO.HotelDTO;


import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

public class HotelDAO implements AccessDatabase<HotelDTO>{


    @Override
    public ArrayList<HotelDTO> getAll() {
        ArrayList<HotelDTO> arr = new ArrayList<HotelDTO>();
        ConnectDatabase conndb = new ConnectDatabase();
        try {
            Connection conn = conndb.getConnection();
            String query = "Select * from hotel";
            ResultSet rs = conn.createStatement().executeQuery(query);
            while (rs.next()) {
                HotelDTO hotel = new HotelDTO();
                hotel.setHotel_id(rs.getInt("hotel_id"));
                hotel.setHotel_name(rs.getString("hotel_name"));

//                arr.add(tour);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        finally {
            conndb.closeConnection();
        }
        return arr;
    }

    @Override
    public HotelDTO getById(int id) {
        return null;
    }

    @Override
    public boolean add(HotelDTO HotelDTO) {
        return false;
    }

    @Override
    public boolean update(HotelDTO HotelDTO) {
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
