# WiproTraining
https://mdbootstrap.com/docs/standard/forms/examples-and-customization/
<h2>Login Form</h2>
		<form action="login" method="post">
			Enter Userid: <input   type="text" name="userid" size="20" /> <br>
			Enter Password: <input type="password" name="password"  size="20"/><br>
			<input type="submit"  value="Login"/>
		</form>
////
try {
			PrintWriter out = response.getWriter();
			String email = request.getParameter("email");
			String password =  request.getParameter("password");
			
			System.out.println(email + "," +password);
			
			out.println("<html><body><h2>Your Credentials:"+ email+","+password+"</h2></body></html>");
			
		
		}catch(Exception e) {
			response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR,e.getMessage());
		}
