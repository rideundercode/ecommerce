package com.ecommerce.back.controller;

import com.ecommerce.back.dtos.CommandDTO;
import com.ecommerce.back.entities.Command;
import com.ecommerce.back.exceptions.CommandNotFoundException;
import com.ecommerce.back.services.CommandService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/commands")
@AllArgsConstructor
@Slf4j
public class CommandController {

    private CommandService commandService;
    @PostMapping("/")
    public CommandDTO createCommand(@RequestBody CommandDTO commandDTO){
        return commandService.createCommand(commandDTO);
    }

    @GetMapping("/{id}")
    public CommandDTO getCommand(@PathVariable(name = "id") String idProduct) throws CommandNotFoundException {
        return commandService.getCommand(idProduct);
    }

    @GetMapping("/")
    public List<CommandDTO> getAllCommands(){
        return commandService.getAllCommands();
    }

    @DeleteMapping("/{id}")
    public void  deletedCommand(@PathVariable(name ="id") String idCommand){
        commandService.deletedCommand(idCommand);
    }



}
