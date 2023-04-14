package DAO;

import DTO.PlaceDTO;
import DTO.ServiceDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ServiceDAO implements AccessDatabase<ServiceDTO>{
    @Override
    public ArrayList<ServiceDTO> getAll() {
        ArrayList<ServiceDTO> arr = new ArrayList<ServiceDTO>();
        ConnectDatabase conndb = new ConnectDatabase();
        try {
            Connection conn = conndb.getConnection();
            String query = "Select * from service";
            ResultSet rs = conn.createStatement().executeQuery(query);
            while (rs.next()) {
                ServiceDTO service = new ServiceDTO();
                service.setService_id(rs.getInt("service_id"));
                service.setService_name(rs.getString("service_name"));
                service.setService_price(rs.getDouble("service_price"));
                arr.add(service);
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
    public ServiceDTO getById(int id) {
        ServiceDTO service = new ServiceDTO();
        ConnectDatabase conndb = new ConnectDatabase();

        try {
            Connection conn = conndb.getConnection();
            String query = "select * from service where service_id = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setInt(1,id);
            ResultSet rs = st.executeQuery();
            if (rs.next()){
                service.setService_id(rs.getInt("service_id"));
                service.setService_name(rs.getString("service_name"));
                service.setService_price(rs.getDouble("service_price"));
            }
            else return null;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            conndb.closeConnection();
        }
        return service;
    }

    @Override
    public boolean add(ServiceDTO serviceDTO) {
        boolean result = false;
        ConnectDatabase conndb = new ConnectDatabase();

        try {
            Connection conn = conndb.getConnection();
            String sql = "insert into place value (?,?,?)";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1,serviceDTO.getService_id());
            st.setString(2,serviceDTO.getService_name());
            st.setDouble(3,serviceDTO.getService_price());

            if (st.executeUpdate()>=1)
                result = true;

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }
        finally {
            conndb.closeConnection();
        }
        return result;
    }

    @Override
    public boolean update(ServiceDTO serviceDTO) {
        boolean result = false;
        ConnectDatabase conndb = new ConnectDatabase();

        try {
            Connection conn = conndb.getConnection();
            String sql = "update service set " +
                    "service_name=?," +
                    "service_price=? " +
                    "where place_id = " + serviceDTO.getService_id();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1,serviceDTO.getService_name());
            st.setDouble(2,serviceDTO.getService_price());
            if (st.executeUpdate()>=1)
                result = true;

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }
        finally {
            conndb.closeConnection();
        }
        return result;
    }

    @Override
    public boolean delete(int id) {
        boolean result = false;
        ConnectDatabase conndb = new ConnectDatabase();

        try {
            Connection conn = conndb.getConnection();
            String sql = "delete from service where service_id = ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1,id);
            if (st.executeUpdate()>=1)
                result = true;

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }
        finally {
            conndb.closeConnection();
        }
        return result;
    }

    @Override
    public boolean checkExistById(int id) {
        boolean result = false;
        ConnectDatabase conndb = new ConnectDatabase();

        try {
            Connection conn = conndb.getConnection();
            String sql = "select * from service where service_id = ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1,id);
            ResultSet rs = st.executeQuery();
            result = rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }
        finally {
            conndb.closeConnection();
        }
        return result;
    }
}
