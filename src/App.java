/**
 * Created by Gabor on 18/04/2017.
 */
public class App {

  public static void main(String[] args) {

    Copy copy = new Copy(args);

    copy.printUsage();



    // This should be the basic replica of the 'cp' command
    // If ran from the command line without arguments
    // It should print out the usage:
    // copy [source] [destination]
    // When just one argument is provided print out
    // No destination provided
    // When both arguments provided and the source is a file
    // Read all contents from it and write it to the destination
  }

}
