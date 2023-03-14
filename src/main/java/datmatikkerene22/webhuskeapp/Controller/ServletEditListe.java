package datmatikkerene22.webhuskeapp.Controller;

import datmatikkerene22.webhuskeapp.Controller.Entitet.Person;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletEditListe", value = "/ServletEditListe")
public class ServletEditListe extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String emne = request.getParameter("emne");
        Person person = (Person) request.getSession().getAttribute("person");
        System.out.println(person.getNavn());
        person.getStringArrayList().add(emne);
        request.getRequestDispatcher("WEB-INF/brugerside.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }
}
