package DAO;

import DTO.CustomerDTO;
import DTO.UserDTO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerDAO implements AccessDatabase<CustomerDTO> {

    @Override
    public ArrayList<CustomerDTO> getAll() {
        ArrayList<CustomerDTO> arr = new ArrayList<CustomerDTO>();
        ConnectDatabase conndb = new ConnectDatabase();
        try {
            Connection conn = conndb.getConnection();
            String query = "Select * from customer";
            ResultSet rs = conn.createStatement().executeQuery(query);
            while (rs.next()) {
                CustomerDTO customer = new CustomerDTO();
                customer.setCustomer_id(rs.getInt("customer_id"));
                customer.setCustomer_name(rs.getString("customer_name"));
                customer.setTel(rs.getInt("tel"));
                customer.setBirthday(rs.getDate("birthday"));
                customer.setEmail(rs.getString("email"));
                customer.setCreate_at(rs.getDate("create_at"));
                arr.add(customer);
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
    public CustomerDTO getById(int id) {
        CustomerDTO customer = new CustomerDTO();
        ConnectDatabase conndb = new ConnectDatabase();

        try {
            Connection conn = conndb.getConnection();
            String query = "select * from customer where customer_id = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setInt(1,id);
            ResultSet rs = st.executeQuery();
            if (rs.next()){
                customer.setCustomer_id(rs.getInt("customer_id"));
                customer.setCustomer_name(rs.getString("customer_name"));
                customer.setTel(rs.getInt("tel"));
                customer.setBirthday(rs.getDate("birthday"));
                customer.setEmail(rs.getString("email"));
                customer.setCreate_at(rs.getDate("create_at"));
            }
            else return null;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            conndb.closeConnection();
        }
        return customer;
    }

    @Override
    public boolean add(CustomerDTO customerDTO) {
        boolean result = false;
        ConnectDatabase conndb = new ConnectDatabase();

        try {
            Connection conn = conndb.getConnection();
            String sql = "insert into customer value (?,?,?,?,?)";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1,customerDTO.getCustomer_id());
            st.setString(2,customerDTO.getCustomer_name());
            st.setInt(3,customerDTO.getTel());
            st.setDate(4,customerDTO.getBirthday());
            st.setString(5,customerDTO.getEmail());

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
    public boolean update(CustomerDTO customerDTO) {
        boolean result = false;
        ConnectDatabase conndb = new ConnectDatabase();

        try {
            Connection conn = conndb.getConnection();
            String sql = "update tour set " +
                    "customer_name=?," +
                    "tel=?," +
                    "birthday=?," +
                    "email=? " +
                    "where customer_id = " + customerDTO.getCustomer_id();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1,customerDTO.getCustomer_name());
            st.setInt(2,customerDTO.getTel());
            st.setDate(3,customerDTO.getBirthday());
            st.setString(4,customerDTO.getEmail());
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
            String sql = "delete from customer where customer_id = ?";
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
            String sql = "select * from customer where customer_id = ?";
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
