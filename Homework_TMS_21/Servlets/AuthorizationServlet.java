package by.tms.Homework_TMS_21.Servlets;

import by.tms.Homework_TMS_21.Services.UserService;
import by.tms.Homework_TMS_21.entity.User;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/authorization")
public class AuthorizationServlet extends HttpServlet {
	private final UserService userService = new UserService();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		User byUsername = userService.findByUsername(username);
		if (byUsername.getPassword().equals(password)){
			req.getSession().setAttribute("user", byUsername);
		} else {
			resp.getWriter().print("Wrong password");
		}
	}
}
