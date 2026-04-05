package Task1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Task1.Model.MessageRequest;
import Task1.Model.MessageResponse;
import Task1.Service.ChatService;

@RestController
@RequestMapping("/webhook")
public class WebHookController {

    @Autowired ChatService chatService;

     /**
     * This endpoint receives POST requests
     * URL: http://localhost:8080/webhook
     */
    @PostMapping
    public MessageResponse receiveMessage(@RequestBody MessageRequest request){
         // Log incoming message
         System.out.println("Incoming Message: " +request.getMessage());

         // Get reply from service
         String reply = chatService.getReply(request.getMessage());

          // Return response
          return new MessageResponse(reply);
         

    }
    
}
