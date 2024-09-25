package murach.email;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import murach.business.User;

import java.util.TimeZone;

public class EmailListServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String url = "/index.html";

        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }
        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/index.html";    // the "join" page
        }
        else if (action.equals("add")) {
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String dateString = request.getParameter("date");
            String sourceInfor = request.getParameter("sourceInfor");
            String offer = request.getParameter("offer");
            String contact =request.getParameter("contact");


            // Parse the string date to a Date object using Vietnam timezone
            SimpleDateFormat inputFormatter = new SimpleDateFormat("yyyy-MM-dd");
            inputFormatter.setTimeZone(TimeZone.getTimeZone("Asia/Ho_Chi_Minh")); // Set Vietnam timezone

            Date date = null;
            try {
                date = inputFormatter.parse(dateString);
            } catch (ParseException e) {
                e.printStackTrace();
                // handle invalid date format here (e.g., set a default date or return an error)
            }

            // Format the date for display (dd/MM/yyyy)
            SimpleDateFormat outputFormatter = new SimpleDateFormat("dd/MM/yyyy");
            outputFormatter.setTimeZone(TimeZone.getTimeZone("Asia/Ho_Chi_Minh")); // Set Vietnam timezone

            // Format the date as a string in dd/MM/yyyy format
            String formattedDate = outputFormatter.format(date);

            // store data in User object and save User object in db
            User user = new User(firstName, lastName, email, date, sourceInfor, offer, contact);

            // set User object in request object and set URL
            request.setAttribute("user", user);
            request.setAttribute("formattedDate", formattedDate);
            url = "/thanks.jsp";   // the "thanks" page
        }

        // forward request and response objects to specified URL
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
