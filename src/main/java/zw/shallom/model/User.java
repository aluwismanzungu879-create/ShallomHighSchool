package zw.shallom.model;
import java.io.Serializable;
public class User implements Serializable {
 private static final long serialVersionUID=1L;
 private final String username,password,name,className; private final Role role;
 public User(String u,String p,String n,String c,Role r){username=u;password=p;name=n;className=c;role=r;}
 public String getUsername(){return username;} public String getPassword(){return password;} public String getName(){return name;} public String getClassName(){return className;} public Role getRole(){return role;}
}
