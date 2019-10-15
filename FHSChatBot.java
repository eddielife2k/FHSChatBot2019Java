// This file serves as the main hub for all responses our chatbot can process.
// If it cannot answer a question, a response will allow users to refer their questions to administration.
public class FHSChatBot
{
  private String name;
  public FHSChatBot() {
    name = "Pat the Panther";
  }
  public String getGreeting()
	{
      return "Hello! I'm " + name + ". Do you have questions about FHS? If so, please tell me what it is you want to know!";
	}

	public String getResponse(String statement)
	{
    if(statement.indexOf("schedule") != 0) {
      return "Here are the schedules.";
    }
    if(statement.indexOf("aspen") != 0) {
      ResponseProcessor.aspen();
    }
    return "I don't know the answer to that question! You can contact the following people listed. [Departments with Name of Teacher] ";
	}

}
