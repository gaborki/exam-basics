import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Gabor on 18/04/2017.
 */
public class Copy {

  String args[];
  File newFile;

  boolean isThereArgs(){
    return (args.length > 0);
  }

  public boolean areThereTwoArgs(){
    return (args.length == 2);
  }

  public boolean sourceIsFile( ) {
    if args(0)
  }

  public void readInFile() {
    if (areThereTwoArgs()) {
      Path path = Paths.get("args[0]");
      try {
        List<String> file = Files.readAllLines(path);
        for (String line : file) {
        }
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    }
  }

  public Copy(String[]args){
      this.args = args;
    }

  void printMessage(){
    if (!isThereArgs()){
      System.out.println("copy [source] [destination]");
    } else if(args.length == 1){
      System.out.println("No destination provided");
    }
  }
}
