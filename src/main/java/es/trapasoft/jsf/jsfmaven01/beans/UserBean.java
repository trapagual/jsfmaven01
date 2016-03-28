/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package es.trapasoft.jsf.bean;


import es.trapasoft.jsf.jsfmaven01.dao.DAOFactory;
import es.trapasoft.jsf.jsfmaven01.dao.UserDAO;
import es.trapasoft.jsf.jsfmaven01.models.User;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author alejandro
 */
@ManagedBean
@ViewScoped
public class UserBean {

    private DAOFactory javabase;
    private UserDAO userDAO;
    private List<User> users;
    
    /**
     * Creates a new instance of UserBean
     */
    public UserBean() {
    }
    
    @PostConstruct
    public void init() {
        javabase = DAOFactory.getInstance("javabase.jdbc");
        userDAO = javabase.getUserDAO();
        users = userDAO.list();
    }
    
    
    /* ------------- GETTERS / SETTERS ----------------- */

    public List<User> getUsers() {
        return users;
    }
    
}
