package com.marketec.bd;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BDAPP {

	private Connection cn;

	public void conectarse() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba?characterEncoding=latin1", "root",
					"root");
			System.out.println("Se conectó a la base de datos MySQL");

		} catch (Exception e) {
			System.out.println("Este fue el error " + e.getMessage());
		}

	}

	public void desconectarse() {

		try {
			if (cn != null) {

				cn.close();
				System.out.println("Conexion cerrada");

			}
		} catch (Exception e) {
			System.out.println("Este fue el error " + e.getMessage());
		}

	}

	public List<Persona> listar() throws SQLException {
		List<Persona> personas = new ArrayList<>();
		Statement st = null;
		ResultSet rs = null;

		try {
			st = cn.createStatement();
			rs = st.executeQuery("SELECT * FROM MARCA");
			while (rs.next()) {
				Persona per = new Persona();
				per.setCodigo(rs.getInt("id_marca"));
				per.setNombre(rs.getString("nombre"));
				per.setEdad(rs.getInt("id_marca"));
				personas.add(per);
			}

		} catch (Exception e) {
			System.out.println("El error al traer la data fue: " + e.getMessage());
		} finally {

			rs.close();
			st.close();

		}

		return personas;
	}

	public void registrar() throws SQLException {

		PreparedStatement ps = null;
		
		try {
			String sql = "INSERT INTO MARCA(id_marca, nombre) VALUES(?,?)";
			ps = cn.prepareStatement(sql);
			ps.setInt(1, 4);
			ps.setString(2, "Mayonesa");
			ps.executeUpdate();

		} catch (Exception e) {
			System.out.println("El error fue : "+e.getMessage());
			
		} finally {

			ps.close();
			
		}

	}

	public void registrarProcedure() throws SQLException{

		CallableStatement cs = null;
		
		try {
			String sql = "call sp_marca(?,?)";
			cs = cn.prepareCall(sql);
			cs.setInt(1, 5);
			cs.setString(2, "Sello de Oro");
			cs.execute();

		} catch (Exception e) {
			System.out.println("El error fue : "+e.getMessage());
			
		} finally {
			cs.close();
		}
	}
	
	
	public static void main(String[] args) {

		BDAPP bd = new BDAPP();

		try {
			bd.conectarse();
			bd.registrarProcedure();
			/*
			 * bd.listar().forEach(x -> System.out.println(x.getCodigo()+" - "
			 * +x.getNombre()+" - "+x.getEdad()));
			 */
			List<Persona> lp = bd.listar();
			for (Persona persona : lp) {
				System.out.println(persona.getCodigo() + " - " + persona.getNombre() + " - " + persona.getEdad());
			}
			bd.desconectarse();

		} catch (Exception e) {
			System.out.println("Error fue: " + e.getMessage());
		}

		/*
		 * try { Thread.sleep(3000); } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 */

	}

}
