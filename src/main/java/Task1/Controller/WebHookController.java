package Task1.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Task1.Model.MessageRequest;
import Task1.Model.MessageResponse;
import Task1.Service.ChatService;

@RestController
@RequestMapping("/webhook")
public class WebHookController {

    //  Logger at class level
    private static final Logger logger = LoggerFactory.getLogger(WebHookController.class);

    @Autowired
    private ChatService chatService;

    /**
     * This endpoint receives POST requests
     * URL: http://localhost:8080/webhook
     */
    @PostMapping
    public MessageResponse receiveMessage(@RequestBody MessageRequest request) {

        // logging
        logger.info("Incoming Message: {}", request.getMessage());

        // Get reply from service
        String reply = chatService.getReply(request.getMessage());

        // Log response also 
        logger.info("Reply Sent: {}", reply);

        // Return response
        return new MessageResponse(reply);
    }

    //  For browser testing
    @GetMapping("/")
    public String home() {
        return "WhatsApp Chatbot is running ";
    }
}