import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Yeah
 * @date 2021/2/16 - 13:38
 * @intention:
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get it");
        req.getRequestDispatcher("/WEB-INF/demo1.jsp").forward(req,resp);

    }
}
