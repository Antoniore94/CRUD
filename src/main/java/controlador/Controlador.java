package controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.DAOparticipantes;
import modelo.POJO;

/**
 * Servlet implementation class Controlador

 */
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String opc = request.getParameter("opc");
		DAOparticipantes dao = new DAOparticipantes();
		String respuesta;
		int id;
		String nombre, edad;
		switch(opc) {
		case "Agregar": nombre = request.getParameter("txtNombre");
		edad = request.getParameter("txtEdad");
		respuesta = dao.agregar(nombre, edad);
		response.getWriter().append(respuesta);
		break;
		case "Eliminar": id = Integer.parseInt(request.getParameter("txtId"));
		respuesta = dao.borrar(id);
		response.getWriter().append(respuesta);
		break;
		case "Actualizar": id = Integer.parseInt(request.getParameter("txtId"));
		nombre = request.getParameter("txtNombre");
		edad = request.getParameter("txtEdad");
		respuesta = dao.editar(id, nombre, edad);
		response.getWriter().append(respuesta);
		break;
		case "Mostrar": ArrayList<POJO> lista = dao.mostrar();
		request.setAttribute("lista", lista);
		RequestDispatcher rd = request.getRequestDispatcher("mostrar.jsp");
		rd.forward(request, response);
		break;
		}
	}

}
