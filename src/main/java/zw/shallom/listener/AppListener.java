package zw.shallom.listener;
import javax.servlet.*;import zw.shallom.service.SchoolService;import java.io.File;
public class AppListener implements ServletContextListener {
 private Thread saver;
 public void contextInitialized(ServletContextEvent e){String path=System.getProperty("shallom.data");if(path==null){path=System.getProperty("catalina.base",System.getProperty("user.home"))+File.separator+"ShallomHighSchool-data";System.setProperty("shallom.data",path);}final SchoolService service=new SchoolService(path);e.getServletContext().setAttribute("school",service);saver=new Thread(()->{while(!Thread.currentThread().isInterrupted()){try{Thread.sleep(30000);service.report();}catch(InterruptedException stop){Thread.currentThread().interrupt();}catch(Exception ignored){}}},"shallom-autosave");saver.setDaemon(true);saver.start();}
 public void contextDestroyed(ServletContextEvent e){if(saver!=null)saver.interrupt();}
}
