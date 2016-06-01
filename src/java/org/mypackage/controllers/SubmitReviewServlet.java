package org.mypackage.controllers;

import org.json.simple.JSONArray;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import org.mypackage.models.Encryption;
import org.mypackage.models.StringHolder;

//import org.mypackage.models.UserDatabaseHandler;

/**
 *
 * @author Sam Abdallah
 */
public class SubmitReviewServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/failReview.jsp");
        
        // overall, cleanliness, tubShower, towelRobe, lighting, amenities - ratings from 1-5
        // reviewTitle, description, img;        
        // these are all the variables Andrew wants according to ppt, not sure which should be required and which should not
        
        JSONArray allReviewsHotel = new JSONArray();
        JSONArray allReviewsUser = new JSONArray(); // in reality these should be passed in from info on the html page, hotel and user
        String[] reviewInfo = new String[9];
      // each spot in reviewInfo corresponds to a different variable listed above

        
        // I was thinking for radio buttons we could have the default be filled in at three stars, so this null checking wouldn't even be necesary
        if (request.getParameter("overall") != null 
                && request.getParameter("cleanliness") != null 
                && request.getParameter("tubShower") != null 
                && request.getParameter("towelRobe") != null
                && request.getParameter("lighting") != null
                && request.getParameter("amenities") != null){
            
            
            // you'll have to figure out how to get an int or string from the radio button rating system he wants
            reviewInfo[0] = (String) request.getParameter("password");           
            reviewInfo[1] = (String) request.getParameter("password2");
           reviewInfo[2] = (String) request.getParameter("username");
            reviewInfo[3] = (String) request.getParameter("email");
            reviewInfo[4] = (String) request.getParameter("email");
            reviewInfo[5] = (String) request.getParameter("email");
            
            
         
            }
         else {
            // don't think this will be needed if we default all values to 3 stars and description, title, and img aren't required
            request.setAttribute("error", new StringHolder("Please fill out all of the required information"));
            dispatcher.forward(request, response);
            return;
        }

       if (request.getParameter("reviewTitle") != null) 
           reviewInfo[6] = (String)request.getParameter("reviewTitle");
       if (request.getParameter("description") != null) 
           reviewInfo[7] = (String)request.getParameter("description");
       if (request.getParameter("img") != null) 
           reviewInfo[8] = (String)request.getParameter("img");
       
      
       // profanity checck for reviews here?
        // still need error catching for image
        
       allReviewsHotel.add(reviewInfo);
       allReviewsUser.add(reviewInfo);
        
        dispatcher = getServletContext().getRequestDispatcher("/index.html");
        dispatcher.forward(request, response);

    }
    
     
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
