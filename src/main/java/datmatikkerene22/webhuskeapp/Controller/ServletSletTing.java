package datmatikkerene22.webhuskeapp.Controller;

import datmatikkerene22.webhuskeapp.Controller.Entitet.Person;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletSletTing", value = "/ServletSletTing")
public class ServletSletTing extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String emne = request.getParameter("fjern");
        Person person = (Person) request.getSession().getAttribute("person");
        if(person.getStringArrayList().contains(emne))
        {
            person.getStringArrayList().remove(emne);
            request.getRequestDispatcher("WEB-INF/brugerside.jsp").forward(request,response);
        }
        else{
            request.setAttribute("msg","Denne ting kunne ikke fjernes");
            request.getRequestDispatcher("WEB-INF/brugerside.jsp").forward(request,response);
        }
    }
}
