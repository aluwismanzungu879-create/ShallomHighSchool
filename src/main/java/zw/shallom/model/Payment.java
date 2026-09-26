package zw.shallom.model;
import java.io.Serializable;import java.util.Date;
public class Payment implements Serializable {
 private static final long serialVersionUID=1L; private final String reference,student,studentId,method; private final double amount; private final Date timestamp;
 public Payment(String ref,String s,String id,double a,String m){reference=ref;student=s;studentId=id;amount=a;method=m;timestamp=new Date();}
 public String getReference(){return reference;} public String getStudent(){return student;} public String getStudentId(){return studentId;} public double getAmount(){return amount;} public String getMethod(){return method;} public Date getTimestamp(){return new Date(timestamp.getTime());}
}
