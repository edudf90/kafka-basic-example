package producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import producer.service.MessageService;

@RestController
@RequestMapping("producer")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping
    @RequestMapping("produce/{message}")
    public String produceMessage(@PathVariable("message") String message){
        try {
            messageService.produceMessage(message);
            return "Success!";
        } catch (Exception e) {
            return "It was not possible to send the message. Please, try again!";
        }
    }

}
