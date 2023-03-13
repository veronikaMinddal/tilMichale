package datmatikkerene22.webhuskeapp;

import datmatikkerene22.webhuskeapp.Controller.AppStart;
import datmatikkerene22.webhuskeapp.Controller.Entitet.Person;
import datmatikkerene22.webhuskeapp.Model.Facade;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        Map<String , Person> personMap = Facade.getAllperson();

        System.out.println("størrelsen er " + personMap.size());

        request.setAttribute("personer", personMap);

        request.getRequestDispatcher("index.jsp").forward(request,response);



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
