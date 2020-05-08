/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import cart.ShoppingCart;
import entity.Avis;
import entity.Categories;
import entity.Comptes;
import entity.Produit;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import session.CategoriesFacade;
import session.ComptesFacade;
import session.ProduitFacade;

/**
 *
 * @author julie
 */

@WebServlet(name = "Controller",
            loadOnStartup = 1,
            urlPatterns = {"/category",
                           "/addToCart",
                           "/cart",
                           "/updateCart",
                           "/checkout",
                           "/product",
                           "/purchase",
                           "/compte",
                           "/deconnect",
                           "/connection",
                           "/createAccount",
                           "/connect"})
public class ControllerServlet extends HttpServlet {

    @EJB
    private CategoriesFacade categoryFacade;
    @EJB
    private ProduitFacade productFacade;
    @EJB
    private ComptesFacade accountFacade;
    
    @Override
    public void init() throws ServletException {

        // store category list in servlet context
        getServletContext().setAttribute("categories", categoryFacade.findAll());
        getServletContext().setAttribute("produit", productFacade.findAll());
        getServletContext().setAttribute("produitRecents", productFacade.getMostRecents());
        getServletContext().setAttribute("produitFamous", productFacade.getMostFamous());
        getServletContext().setAttribute("isConnected", false);
        
        List<Comptes> connectionAccount = accountFacade.findByMail("emilien.ferrandi@edu.esiee.fr");
        getServletContext().setAttribute("connectedAccount", connectionAccount.get(0));
            
        
        
        ShoppingCart cart = new ShoppingCart();
        
        getServletContext().setAttribute("cart", cart);
        getServletContext().setAttribute("lastUrl","");
        
    }
        
    
    /**
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String userPath = request.getServletPath();

            
        // if category page is requested
        if (userPath.equals("/category")) {
            // get categoryId from request
            String categoryId = request.getQueryString();
            HttpSession session = request.getSession();

            if (categoryId != null) 
            {
                // get selected category
                Categories selectedCategory = categoryFacade.find(Integer.parseInt(categoryId));
                // place selected category in request scope
                session.setAttribute("selectedCategory", selectedCategory);
                
                // get all products for selected category
                Collection<Produit> categoryProducts = selectedCategory.getProduitCollection();
                // place category products in request scope
                session.setAttribute("categoryProducts", categoryProducts);                
            }

        // if cart page is requested
        } else if (userPath.equals("/cart")) {
            HttpSession session = request.getSession();
            String clear = request.getParameter("clear");

            if ((clear != null) && clear.equals("true")) {

                ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
                cart.clear();
            }

        // if checkout page is requested
        } else if (userPath.equals("/checkout")) {
            // TODO: Implement checkout page request

        // if user switches language
        } 
         
        else if (userPath.equals("/compte")) {
            // get accountId from request
            String accountId = request.getQueryString();

            if (accountId != null) 
            {
                // get selected account
                Comptes selectedAccount = accountFacade.find(Integer.parseInt(accountId));
                // place selected category in request scope
                request.setAttribute("selectedAccount", selectedAccount); 
                
                Collection<Produit> accountProduct = selectedAccount.getProduitCollection();
                request.setAttribute("accountProducts", accountProduct); 
                
                
            }
        }
        
        else if (userPath.equals("/product")) {
            // get categoryId from request
            String productId = request.getQueryString();
            HttpSession session = request.getSession();
            
            getServletContext().setAttribute("lastUrl","product"+"?"+productId);

            if (productId != null) 
            {               
                // get selected product
                Produit selectedProduct = productFacade.find(Integer.parseInt(productId));
                // place selected category in request scope
                session.setAttribute("selectedProduct", selectedProduct); 
                
                //get IdProducteur
                Comptes idProducteur = selectedProduct.getIdCompte();  
                // place selected Producer in request scope
                session.setAttribute("producer", idProducteur); 
                
                //get IdCategorie
                Categories idCategorie = selectedProduct.getIdCategorie();
                // place selected Category in request scope
                request.setAttribute("category", idCategorie); 
                
                // get all products for selected category
                Collection<Produit> categoryProducts = idCategorie.getProduitCollection();
                categoryProducts.remove(selectedProduct);
                // place category products in request scope
                request.setAttribute("categoryProducts", categoryProducts);
                
                Collection<Avis> avisProduct = selectedProduct.getAvisCollection();
                request.setAttribute("avisProduct", avisProduct);
                
                HashMap<Avis, Comptes> hm = new HashMap();
                for (Avis avis : avisProduct) {
                    hm.put(avis, avis.getIdCompte());
                    
                }
                session.setAttribute("hmAvis", hm);   
            }

        }
         else if (userPath.equals("/connection")) {
            // TODO: Implement checkout page request

        } 
        else if (userPath.equals("/createAccount")) {
            
        }

        // use RequestDispatcher to forward request internally
        String url = userPath + ".jsp";

        try {
            request.getRequestDispatcher(url).forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String userPath = request.getServletPath();
        HttpSession session = request.getSession();
        ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");

        // if addToCart action is called
        if (userPath.equals("/addToCart")) {
            
            // if user is adding item to cart for first time
            // create cart object and attach it to user session
            if (cart == null) {

                cart = new ShoppingCart();
                session.setAttribute("cart", cart);
            }

            // get user input from request
            String productId = request.getParameter("productId");
            int quantity = Integer.parseInt(request.getParameter("quantity"));

            if (!productId.isEmpty()) {
                for (int i=0;i<quantity;i++)
                {
                    Produit product = productFacade.find(Integer.parseInt(productId));
                    cart.addItem(product);
                }

            }

            //userPath = "/product";
            response.sendRedirect((String) getServletContext().getAttribute("lastUrl")  );

        // if updateCart action is called
        } else if (userPath.equals("/updateCart")) {
            // TODO: Implement update cart action

        // if purchase action is called
        } else if (userPath.equals("/purchase")) {
            // TODO: Implement purchase action

            //userPath = "/confirmation";
        }
         else if (userPath.equals("/connect")) {
            // TODO: Implement purchase action
            
            String email = request.getParameter("email");
            String mdp = request.getParameter("mdp");

            List<Comptes> connectionAccount = accountFacade.findByMail(email);
            if (connectionAccount.size()==1 && connectionAccount.get(0).getMdp().equals(mdp))
            {
                getServletContext().setAttribute("connectedAccount", connectionAccount.get(0));
                getServletContext().setAttribute("isConnected", true);
                response.sendRedirect((String) getServletContext().getAttribute("lastUrl")  );
            }
            else {
                response.sendRedirect("connection");
            }
            
        }
        else if (userPath.equals("/deconnect")) {
                // TODO: Implement purchase action

                //getServletContext().setAttribute("connectedAccount", null);
                getServletContext().setAttribute("isConnected", false);
                //getServletContext().removeAttribute("connectedAccount");

                response.sendRedirect((String) getServletContext().getAttribute("lastUrl"));
                userPath = "welcome";
            }
      else if (userPath.equals("/createAccount")) {
            // TODO: Implement purchase action
            
            String email = request.getParameter("email");
            String mdp = request.getParameter("mdp");
            String nom = request.getParameter("name");
            String prenom = request.getParameter("firstName");
            String adress = request.getParameter("adress");

            accountFacade.createAccount(nom, prenom, email, mdp, adress);

        }

        // use RequestDispatcher to forward request internally
        String url = userPath + ".jsp";

//        try {
//            request.getRequestDispatcher(url).forward(request, response);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
    }

}
