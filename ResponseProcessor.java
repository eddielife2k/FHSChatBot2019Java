import java.util.Scanner;
public class ResponseProcessor {
   public static String aspen(Scanner followUp) {
      System.out.print("What do you need help with for Aspen? : ");
      if(getFollowUp(followUp).indexOf("password") >= 0) {
         return "If you are struggling with your Aspen password, use this template to help: \n " +
         "-------------------------------------------------------------------------------------\n" +
         "Ms. Patten, \n"+
         "I hope your day is doing well. My name is [name] and I'm in [grade] grade. I use Aspen \n" +
         "regularly, and I no longer am able to access it because I forgot my password. I hope you can \n" +
         "help with resetting my password so I can access this important resource \n" +
         "Thanks, \n" +
         "[name]";
      }
      return "I'm sorry, please contact Ivy Patten by email for help with this inquiry.";
   }
   public static String settings(FHSChatBot panther, Scanner followUp) {
      System.out.print("You can make changes to the following. At this time, these settings are not saved. \n-My name: " + panther.getName() +
       "\n-Your name: " + panther.getStudent() + "\n-Your grade: " + panther.getGrade());
      String changer = getFollowUp(followUp);
      if(changer.indexOf("read your name") >= 0) {
         return "My name is: " + panther.getName();
      }
      else if(changer.indexOf("your name") >= 0) {
         System.out.print("What's my new name?: ");
         panther.setName(getFollowUp(followUp));
         return "My name is: " + panther.getName();
      }
     
      return "I do not understand what you want.";
   }
   public static String getFollowUp(Scanner followUp) {
      String followUpResponse = followUp.nextLine();
      followUpResponse = followUpResponse.toLowerCase();
      return followUpResponse;
   }
      public static String getFollowUp(Scanner followUp) {
      String followUpResponse = followUp.nextLine();
      followUpResponse = followUpResponse.toLowerCase();
      return followUpResponse;
   }
}
