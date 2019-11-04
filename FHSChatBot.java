// This file serves as the main hub for all responses our chatbot can process.
// If it cannot answer a question, a response will allow users to refer their questions to administration.
import java.util.Scanner;
public class FHSChatBot
{
  private String name;
  private String student;
  private String studentGrade;
  public FHSChatBot() {
    name = "Pat the Panther";
    student = "[name]";
    studentGrade = "[grade]";
  }
  public void setName(String n) {
     name = n;
  }
  public void setStudent(String n) {
     name = n;
  }
  public void setGrade(String grade) {
      studentGrade = grade;
  }
  public String getName() {
      return name;
  }
  public String getStudent() {
      return student;
  }
  public String getGrade() {
      return studentGrade;
  }
  public String getGreeting()
  {
      return "Hello! I'm " + name + ". Do you have questions about FHS? If so, please tell me what it is you want to know!";
  }

  public String getResponse(String statement, FHSChatBot panther, Scanner in)
  {
        String whatsNext = "\n\nDo you need help with anything else?";
        System.out.println(statement.indexOf("schedule"));
        if(statement.indexOf("schedule") >= 0) {
            return "Here are the schedules.";
        }
        else if(statement.indexOf("aspen") >= 0) {
            return(ResponseProcessor.aspen(in) + whatsNext);
        }
        else if(statement.indexOf("preferences") >= 0 || statement.indexOf("settings") >= 0 || statement.indexOf("info") >= 0) {
            return(ResponseProcessor.settings(panther, in) + whatsNext);
        }
        return "I don't know the answer to that question! You can contact the following people listed. [Departments with Name of Teacher] "
        + whatsNext;
    }

}
