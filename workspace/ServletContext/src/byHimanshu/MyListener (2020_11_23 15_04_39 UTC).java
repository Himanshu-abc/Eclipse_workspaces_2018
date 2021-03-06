package byHimanshu;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent e)  { 
         
    List<User> li = UserDao.fetch();
    
    ServletContext sc= e.getServletContext();
    sc.setAttribute("data", li);
    }

    public void contextDestroyed(ServletContextEvent arg0)  { 
        System.out.println("project undeployed");
    }
}
