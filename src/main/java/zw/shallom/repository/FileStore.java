package zw.shallom.repository;
import java.io.*;import java.nio.file.*;import java.util.*;
/** Synchronized generic Java serialization store; files live outside the public web root. */
public class FileStore {
 private final Path directory;
 public FileStore(String path){directory=Paths.get(path);}
 @SuppressWarnings("unchecked") public synchronized <T> List<T> read(String file){Path p=directory.resolve(file);if(!Files.exists(p))return new ArrayList<T>();try(ObjectInputStream in=new ObjectInputStream(new BufferedInputStream(Files.newInputStream(p)))){return (List<T>)in.readObject();}catch(Exception e){return new ArrayList<T>();}}
 public synchronized <T> void write(String file,List<T> values)throws IOException{Files.createDirectories(directory);Path dest=directory.resolve(file),tmp=directory.resolve(file+".tmp");try(ObjectOutputStream out=new ObjectOutputStream(new BufferedOutputStream(Files.newOutputStream(tmp)))){out.writeObject(new ArrayList<T>(values));}try{Files.move(tmp,dest,StandardCopyOption.REPLACE_EXISTING,StandardCopyOption.ATOMIC_MOVE);}catch(AtomicMoveNotSupportedException e){Files.move(tmp,dest,StandardCopyOption.REPLACE_EXISTING);}}
}
