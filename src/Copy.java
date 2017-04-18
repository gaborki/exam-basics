/**
 * Created by Gabor on 18/04/2017.
 */
public class Copy {

  String args[];

  boolean isThereArgs(){
    return (args.length > 0);
  }

  public boolean areThereTwoArgs(){
    return (args.length == 2);
  }

  public Copy(String[] args) {
    this.args = args;
  }

  void printUsage(){
    if (!isThereArgs()){
      System.out.println("copy [source] [destination]");
    }
  }
}
