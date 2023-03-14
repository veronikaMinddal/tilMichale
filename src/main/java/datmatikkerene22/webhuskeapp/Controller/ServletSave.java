package datmatikkerene22.webhuskeapp.Controller;

import datmatikkerene22.webhuskeapp.Controller.Entitet.Person;
import datmatikkerene22.webhuskeapp.Model.Facade;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletSave", value = "/ServletSave")
public class ServletSave extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Person person = (Person) request.getSession().getAttribute("person");

        String res = Facade.savePerson(person);
        request.setAttribute("msg",res);
        request.getRequestDispatcher("WEB-INF/brugerside.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        request.getSession().invalidate();
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
