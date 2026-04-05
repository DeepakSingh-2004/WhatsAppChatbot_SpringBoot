package Task1.Model;

import lombok.Data;

@Data

/**
 * This class represents incoming JSON request
 * Example:
 * {
 *   "message": "Hi"
 * }
 */
public class MessageRequest {
    
    private String message;

}
