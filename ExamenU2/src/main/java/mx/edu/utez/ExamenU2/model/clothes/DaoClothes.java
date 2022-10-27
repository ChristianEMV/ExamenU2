package mx.edu.utez.ExamenU2.model.clothes;

import mx.edu.utez.ExamenU2.model.Repository;
import mx.edu.utez.ExamenU2.utils.MySQLConnection;
import mx.edu.utez.ExamenU2.utils.Response;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoClothes implements Repository<BeanClothes>{

    Connection con;

    PreparedStatement pstm;

    ResultSet rs;

    MySQLConnection conexion = new MySQLConnection();

    BeanClothes clothes = new BeanClothes();

    private final String GET_CLOTHES = "SELECT * FROM clothes";
    private final String GET_CLOTHE = "SELECT * FROM clothes WHERE clothe_id=?";
    private final String INSERT_CLOTHE = "INSERT INTO clothes(clothe_id, price, size, brand, stock, cloth_type, created_at, category_id, clothe_type_id, ) VALUES (,?,?,?,?,?,?,?,?,?)";
    private final String UPDATE_CLOTHE = "UPDATE clothes SET price=?, size=?, brand=?, stock=?, cloth_type=?, created_at=?, category_id=? clothe_type_id=?  WHERE clothe_id=?";
    private final String DELETE_CLOTHE = "DELETE FROM clothes WHERE clothes_id|=?";

    @Override
    public Response<List> findAll() {
        List<BeanClothes> employeeList = new ArrayList<>();
        Response<List> response = new Response<>();

        try {
            con = conexion.getConnection();
            String sql = GET_CLOTHES;
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                clothes.setClothe_id(rs.getInt("clothe_id"));
                clothes.setName(rs.getString("name"));
                clothes.setPrice(rs.getInt("price"));
                clothes.setSize(rs.getString("size"));
                clothes.setBrand(rs.getString("brand"));
                clothes.setStock(rs.getInt("stock"));
                clothes.setCloth_type(rs.getString("clothe_type"));
                clothes.setCreated_at(rs.getString("create_at"));
                clothes.setStatus(rs.getBoolean("status"));
                clothes.setCategory_id(rs.getInt("category_id"));
                clothes.setClothe_type_id(rs.getInt("clothe_type_id"));

                employeeList.add(clothes);
            }

            if (employeeList.isEmpty()) {
                response.setError(false);
                response.setStatus(200);
                response.setMessage("lista vacia");
                response.setData(null);
            } else {
                response.setError(false);
                response.setStatus(200);
                response.setMessage("ok");
                response.setData(employeeList);
            }


        } catch (Exception e) {
            Logger.getLogger(DaoClothes.class.getName()).log(Level.SEVERE, "Error -> findAll_DaoEmployee" + e.getMessage());
            response.setError(true);
            response.setStatus(400);
            response.setMessage("Error ->" + e.getMessage());
            response.setData(null);

        } finally {
            conexion.close(con, pstm, rs);
        }
        return response;
    }
    @Override
    public Response<BeanClothes> findOne(Long id) {
        Response<BeanClothes> response = new Response<>();

        try {
            con = conexion.getConnection();
            String sql = GET_CLOTHES;
            pstm = con.prepareStatement(sql);
            pstm.setLong(1,id);
            rs = pstm.executeQuery();

            if(rs.next()){
                clothes.setClothe_id(rs.getInt("clothe_id"));
                clothes.setName(rs.getString("name"));
                clothes.setPrice(rs.getInt("price"));
                clothes.setSize(rs.getString("size"));
                clothes.setBrand(rs.getString("brand"));
                clothes.setStock(rs.getInt("stock"));
                clothes.setCloth_type(rs.getString("clothe_type"));
                clothes.setCreated_at(rs.getString("create_at"));
                clothes.setStatus(rs.getBoolean("status"));
                clothes.setCategory_id(rs.getInt("category_id"));
                clothes.setClothe_type_id(rs.getInt("clothe_type_id"));

                response.setError(false);
                response.setStatus(200);
                response.setMessage("ok");
                response.setData(clothes);
            }else{
                response.setError(false);
                response.setStatus(200);
                response.setMessage("no se encontro nada");
                response.setData(null);
            }

        } catch (Exception e) {

            Logger.getLogger(DaoClothes.class.getName()).log(Level.SEVERE, "Error -> findOne_DaoClothes" + e.getMessage());
            response.setError(true);
            response.setStatus(400);
            response.setMessage("Error ->" + e.getMessage());
            response.setData(null);

        } finally {
            conexion.close(con, pstm, rs);
        }
        return response;
    }

    @Override
    public Response<BeanClothes> save(BeanClothes employee) {
        Response<BeanClothes> response = new Response<>();

        try {
            con = conexion.getConnection();
            String sql = INSERT_CLOTHE;
            pstm = con.prepareStatement(sql);
            pstm.setLong(1,clothes.getClothe_id());
            pstm.setString(2,clothes.getName());
            pstm.setDouble(3,clothes.getPrice());
            pstm.setString(4,clothes.getSize());
            pstm.setString(5,clothes.getBrand());
            pstm.setInt(6,clothes.getStock());
            pstm.setString(7,clothes.getCloth_type());
            pstm.setString(8,clothes.getCreated_at());
            pstm.setBoolean(9,clothes.isStatus());
            pstm.setInt(10,clothes.getCategory_id());
            pstm.setInt(11,clothes.getClothe_type_id());

            if(pstm.executeUpdate()==1){
                response.setError(false);
                response.setStatus(200);
                response.setMessage("ok");
                response.setData(employee);
            }else{
                response.setError(false);
                response.setStatus(200);
                response.setMessage("no se pudo guardar");
                response.setData(null);
            }


        } catch (Exception e) {

            Logger.getLogger(DaoClothes.class.getName()).log(Level.SEVERE, "Error -> save_DaoClothe" + e.getMessage());
            response.setError(true);
            response.setStatus(400);
            response.setMessage("Error ->" + e.getMessage());
            response.setData(null);

        } finally {
            conexion.close(con, pstm, rs);
        }


        return response;
    }

    @Override
    public Response<BeanClothes> update(BeanClothes object) {
        return null;
    }

    @Override
    public Response<BeanClothes> delete(Long id) {
        return null;
    }


}
