package com.example.demo1;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import metier.CreditMetierImpl;
import metier.ICreditMetier;

@WebServlet( urlPatterns = { "/" })
public class HelloServlet extends HttpServlet {

    public HelloServlet() {
        super();
    }

    private ICreditMetier metier ;

    public void init() throws ServletException {
        metier = new CreditMetierImpl() ;
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         request.setAttribute("creditModel", new CreditModel(0,0,0,0));
         request.setAttribute("test" , "hfhff");
         request.getRequestDispatcher("/credit.jsp").forward(request,response);
//        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/credit.jsp");
//        request.setAttribute("test", "hhhh");
//        dispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double montant = Double.parseDouble(request.getParameter("montant"));
        double taux = Double.parseDouble(request.getParameter("taux"));
        int duree = Integer.parseInt(request.getParameter("duree"));

        CreditModel model ;

        double res = metier.calculerMesualiteCredit(montant ,taux ,duree);
        model = new CreditModel(montant,taux,duree,res);
        request.setAttribute("creditModel" , model);


        request.getRequestDispatcher("/credit.jsp").forward(request,response);


    }

    public void destroy() {
    }
}