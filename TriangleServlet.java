import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TriangleServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 从表单中获取数据
        double side1 = Double.parseDouble(request.getParameter("side1"));
        double side2 = Double.parseDouble(request.getParameter("side2"));
        double angle = Double.parseDouble(request.getParameter("angle"));

        // 创建Triangle对象并设置属性
        Triangle triangle = new Triangle();
        triangle.setSide1(side1);
        triangle.setSide2(side2);
        triangle.setAngle(angle);

        // 计算三角形的面积
        double area = triangle.calculateArea();

        // 输出结果
        response.setContentType("text/html");
        response.getWriter().println("<html><head><title>三角形面积</title></head><body>");
        response.getWriter().println("<h1>三角形的边长分别为：" + side1 + ", " + side2  + "</h1>");
        response.getWriter().println("<h1>三角形的夹角为：" + angle + "</h1>");
        response.getWriter().println("<h1>三角形面积为：" + area + "</h1>");
        response.getWriter().println("</body></html>");
    }
}
