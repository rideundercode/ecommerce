package com.ecommerce.back.controller;

import com.ecommerce.back.dtos.CommandDTO;
import com.ecommerce.back.entities.Command;
import com.ecommerce.back.exceptions.CommandNotFoundException;
import com.ecommerce.back.services.CommandService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/commands")
@AllArgsConstructor
@Slf4j
public class CommandController {

    private final CommandService commandService;

    @PostMapping("/")
    public ResponseEntity<CommandDTO> createCommand(@RequestBody CommandDTO commandDTO){
        CommandDTO createdCommand = commandService.createCommand(commandDTO);
        return new ResponseEntity<>(createdCommand, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CommandDTO> getCommand(@PathVariable String id) throws CommandNotFoundException {
        CommandDTO commandDTO = commandService.getCommand(id);
        return ResponseEntity.ok(commandDTO);
    }

    @GetMapping("/")
    public ResponseEntity<List<CommandDTO>> getAllCommands(){
        List<CommandDTO> commands = commandService.getAllCommands();
        return ResponseEntity.ok(commands);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCommand(@PathVariable String id){
        commandService.deletedCommand(id);
        return ResponseEntity.noContent().build();
    }
}
