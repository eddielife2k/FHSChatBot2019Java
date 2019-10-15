import java.util.Scanner;
public class ResponseProcessor {
   Scanner followUp = new Scanner(System.in);
   public static String aspen() {
      System.out.println("What do you need help with for Aspen? : ");
      String followUp = followUp.nextLine();
      followUp.toLowerCase();
      if(followUp.indexOf("password") != 0) {
         return "If you are struggling with your Aspen password, use this template to help \n: " +
         "-------------------------------------------------------------------------------------\n" +
         "Ms. Patten, \n"+
         "I hope your day is doing well. My name is [name] and I'm in [grade] grade. I use Aspen \n" +
         "regularly, and I no longer am able to acess it because I forgot my password. I hope you can \n" +
         "help with resetting my password so I can acesse this important resource \n" +
         "Thanks, \n" +
         "[name]";
      }
      return "I'm sorry, please contact Ivy Patten for help with this inquiry.";
   }
   
}
