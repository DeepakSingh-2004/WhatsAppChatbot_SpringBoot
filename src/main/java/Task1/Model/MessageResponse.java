package Task1.Model;

import lombok.Data;

@Data


/**
 * This class represents response JSON
 * Example:
 * {
 *   "reply": "Hello"
 * }
 */
public class MessageResponse {
    private String reply;    

    public MessageResponse(String reply) {
        this.reply = reply;
    }
}
