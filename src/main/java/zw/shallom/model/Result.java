package zw.shallom.model;
import java.io.Serializable;
public class Result implements Serializable { private static final long serialVersionUID=1L; private final String student,subject,teacher;private final int mark;public Result(String s,String sub,int m,String t){student=s;subject=sub;mark=m;teacher=t;}public String getStudent(){return student;}public String getSubject(){return subject;}public int getMark(){return mark;}public String getTeacher(){return teacher;} }
