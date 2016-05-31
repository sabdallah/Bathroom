package org.mypackage.controllers;

import org.json.simple.JSONObject;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.internet.AddressException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import org.mypackage.models.Encryption;
import org.mypackage.models.StringHolder;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;
import javax.naming.InitialContext;
//import org.mypackage.models.UserDatabaseHandler;

/**
 *
 * @author Sam Abdallah
 */
public class ReviewWriteServlet extends HttpServlet {

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
        int reviewID = 1; // should each review have a unique id we assign behind the scenes to act as the key for the json hashmap?
        // overall, cleanliness, tubShower, towelRobe, lighting, amenities - ratings from 1-5
        //reviewTitle, description, img;        
        // these are all the variables Andrew wants according to ppt, not sure which should be required and which should not
        String hotelNameAndLocation; // not sure how we are going to delineate these, need to look at the hotel API thing
        JSONObject reviewMap = new JSONObject; // in reality, we need to have each hotel have its own hashMap, so we'd need a database method for this
        String[] reviewInfo = new String[9];
        // I was thinking the each spot in the array corresponds to different variable, and that the array would be value in the shmap

        
        // I was thinking for radio buttons we could have the default be filled in
        // at three stars, so this null checking wouldn't even be necesary
        if (request.getParameter("overall") != null 
                && request.getParameter("cleanliness") != null 
                && request.getParameter("tubShower") != null 
                && request.getParameter("towelRobe") != null
                && request.getParameter("lighting") != null
                && request.getParameter("amenities") != null){
            
            
            // not sure how we'll get an int from the html page, he said he wants radio buttons
            reviewInfo[0] = (String) request.getParameter("password");           
            reviewInfo[1] = (String) request.getParameter("password2");
           reviewInfo[2] = (String) request.getParameter("username");
            reviewInfo[3] = (String) request.getParameter("email");
            reviewInfo[4] = (String) request.getParameter("email");
            reviewInfo[5] = (String) request.getParameter("email");
            
            
         
            }
         else {
            // don't think this will be needed if we default all values to 3 stars
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
        
        reviewMap.put(reviewID, reviewInfo);
        
        dispatcher = getServletContext().getRequestDispatcher("/index.html");
        dispatcher.forward(request, response);

    }
    
     
     public void addUser(String email, String password){
         //UserDatabaseHandler.addUser(email, password);
     }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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