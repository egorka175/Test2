

import by.tms.Homework_TMS_21.Services.UserService;
import by.tms.Homework_TMS_21.entity.User;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
	private final UserService userService = new UserService();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		User user = new User(name, username, password);
		boolean add = userService.add(user);
		if (add){
			resp.getWriter().print("Ok");
		} else {
			resp.getWriter().print("Error");
		}
	}
}
