package com.ecommerce.back.mappers;

import com.ecommerce.back.dtos.CommandDTO;
import com.ecommerce.back.entities.Command;
import com.ecommerce.back.repositories.CommandRepository;
import org.springframework.stereotype.Service;

@Service
public class CommandMapperImpl {
    public CommandDTO fromCommand (Command command){
        CommandDTO commandDTO= new CommandDTO();
        commandDTO.setIdCommand(command.getIdCommand());
        commandDTO.setDateCreationCommand(command.getDateCreationCommand());
        commandDTO.setPriceTotalCommand(command.getPriceTotalCommand());
        return commandDTO;
    }

    public Command fromCommandDTO(CommandDTO commandDTO){
        Command command = new Command();
        command.setIdCommand(commandDTO.getIdCommand());
        command.setDateCreationCommand(commandDTO.getDateCreationCommand());
        command.setPriceTotalCommand(commandDTO.getPriceTotalCommand());
        return command;
    }
}
