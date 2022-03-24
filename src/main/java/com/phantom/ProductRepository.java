package com.phantom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



@WebServlet(name = "ProductRepository", urlPatterns = "/product")
public class ProductRepository extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(ProductRepository.class);
    private List<Product> productList = new ArrayList<>();
    private int id =1;
    @Override
    public void init() throws ServletException {
        productList.add(new Product(id++,"Milk",79.0));
        productList.add(new Product(id++,"Bread",56.9));
        productList.add(new Product(id++,"Oil",178.5));
        productList.add(new Product(id++,"Banana",99.9));
        productList.add(new Product(id++,"Apple",129.0));
        productList.add(new Product(id++,"Coca-Cola",75.0));
        productList.add(new Product(id++,"Spagetti",279.0));
        productList.add(new Product(id++,"IceCreame",139.0));
        productList.add(new Product(id++,"BigMak",289.0));
        productList.add(new Product(id++,"Peach",579.0));
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("New GET request");
        if (req.getParameter("param1").isEmpty()) {
            for (Product product : productList
            ) {
                resp.getWriter().printf("<h2>ID - %d - %s</h2>", product.getId(), product.toString());
                resp.getWriter().println();
            }
        } else {
            int x = Integer.parseInt(req.getParameter("param1"));

            for (Product product : productList
            ) {
                if (product.getId() == x) {
                    resp.getWriter().printf("<h2> Product with ID = %d - %s</h2>",
                            x, product.toString());
                }
            }
        }
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
