package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController("/pkce")
public class controller {

    private final Map<String, String> database;

    public controller(Map<String, String> database) {
        this.database = database;
    }

    @GetMapping("/message")
    public String getMessage(){
        return "200";
    }

    @PostMapping("/postMessage/{id}")
    public String postMessage(@PathVariable String id, String message){
        database.put(id,message);
        return id;
    }
}
