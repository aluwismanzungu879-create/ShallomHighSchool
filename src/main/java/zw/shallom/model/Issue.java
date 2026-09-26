package zw.shallom.model;
import java.io.Serializable;import java.util.Date;
public class Issue implements Serializable {private static final long serialVersionUID=1L;private final String reporter,description;private final Date timestamp=new Date();public Issue(String r,String d){reporter=r;description=d;}public String getReporter(){return reporter;}public String getDescription(){return description;}public Date getTimestamp(){return new Date(timestamp.getTime());}}
