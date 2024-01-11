package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Producto;
import modelo.Usuario;

public class DaoProducto implements DaoProductoInterface {

	@Override
	public List<Producto> consultaListaProductos(Usuario us, Connection conn) throws SQLException {

		List<Producto> listaProductos = new ArrayList<>();

		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			String sql = "SELECT * FROM PRODUCTO WHERE ID_USUARIO=?";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, us.getIdUsuario());
			rs = stmt.executeQuery();
			while (rs.next()) {
				Producto prod = new Producto();
				prod.setDescripcion(rs.getString("descripcion"));
				prod.setIdProducto(rs.getInt("id_producto"));
				prod.setNombre(rs.getString("nombre"));
				prod.setPrecio(rs.getBigDecimal("precio"));
				prod.setIdUsuario(rs.getInt("id_usuario"));
				listaProductos.add(prod);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException();
		}

		finally {

			try {
				stmt.close();
			} catch (Exception e) {

			}

		}

		return listaProductos;
	}

	@Override
	public void insertarProducto(Producto prod, Connection conn) throws SQLException {
		PreparedStatement stmt = null;

		try {

			String sql = "INSERT INTO PRODUCTO (NOMBRE,PRECIO,DESCRIPCION,ID_USUARIO) values (?,?,?,?)";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, prod.getNombre());
			stmt.setBigDecimal(2, prod.getPrecio());
			stmt.setString(3, prod.getDescripcion());
			stmt.setInt(4, prod.getIdUsuario());
			stmt.execute();

		} catch (Exception e) {
			throw new SQLException();
		} finally {

			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e1) {

				}
			}

		}

	}

}
