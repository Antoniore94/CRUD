package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOparticipantes {
	
	public Connection getConnection() {
		String url = "jdbc:mysql://127.0.0.1:3306/generation?serverTimezone=UTC";
		String user = "root";
		String password = "root";
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con = DriverManager.getConnection(url, user, password);
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
		return con;
	}
	
	public ArrayList<POJO> mostrar(){
		ArrayList<POJO> lista = new ArrayList<>();
		Connection con = getConnection();
		String sql = "SELECT * FROM participantes";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(1); 
				String nombre = rs.getString(2);
				String edad = rs.getString(3);
				POJO pojo = new POJO(id, nombre, edad);
				lista.add(pojo);
			}
			rs.close();
			stmt.close();
		}catch(SQLException e)
		{
			System.err.print(e.getMessage());
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return lista;
	}
	
	
	public String editar(int id, String nombre, String edad) {
		Connection con = getConnection();
		String response = "";
		String sql = "UPDATE participantes SET nombre = ?, edad = ? WHERE id_participantes = ?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, nombre);
			stmt.setString(2, edad);
			stmt.setInt(3, id);
			int cambios = stmt.executeUpdate();
			if(cambios>0)
				response = "Registros afectados: "+cambios;
			else
				response = "No se cambiaron registros";
		}catch(SQLException e) {
			response = e.getMessage();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return response;
	}
	
	public String borrar(int id) {
		Connection con = getConnection();
		String response = "";
		String sql = "DELETE FROM participantes WHERE id_participantes = ?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			int cambios = stmt.executeUpdate();
			if(cambios>0)
				response = "Registros borrados: "+cambios;
			else
				response = "No se borraron registros";
			stmt.close();
		} catch(SQLException e) {
			response = e.getMessage();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return response;
	}
	
	public String agregar(String nombre, String edad) {
		Connection con = getConnection();
		String response = "";
		String sql = "INSERT INTO participantes (nombre, edad) VALUES (?, ?)";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, nombre);
			stmt.setString(2, edad);
			int cambios = stmt.executeUpdate();
			if(cambios>0)
				response = "Registros guardados: "+cambios;
			else 
				response = "No se agregaron resgitros";
			stmt.close();
		}catch(SQLException error){
			response = error.getMessage();
		}finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return response;
	}
}





