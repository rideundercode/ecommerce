package com.ecommerce.back.services;

import com.ecommerce.back.dtos.CommandDTO;
import com.ecommerce.back.entities.Command;
import com.ecommerce.back.exceptions.CommandNotFoundException;

import java.util.List;

public interface CommandService {

    CommandDTO createCommand(CommandDTO commandDTO);
    CommandDTO getCommand(String idCommand) throws CommandNotFoundException;
    List<CommandDTO> getAllCommands();
    void deletedCommand(String idCommand);

}
