package Task1.Service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {

    /**
     * This method processes the incoming message
     * and returns a predefined response
     */
    public String getReply(String message){

        //Handle Null Case
        if(message == null || message.trim().isEmpty()){
            return "Please provide a valid message.";
        }
        // Convert message to lowercase for case-insensitive matching
          String msg = message.toLowerCase();

          // Predefined responses
          switch(msg){
            case "hi":
              return "Hello";
            case "how are you":
              return "I'm doing well, thank you for asking!";
              case"bye":
              return "GoodBye!";
            default:
              return "I'm sorry, I didn't understand that.";
          }
    }
    
}
