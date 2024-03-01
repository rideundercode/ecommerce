package com.ecommerce.back.mappers;

import com.ecommerce.back.dtos.CommandDTO;
import com.ecommerce.back.entities.Command;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CommandMapperImpl {
    public CommandDTO fromCommand (Command command){
        CommandDTO commandDTO= new CommandDTO();
        BeanUtils.copyProperties(command, commandDTO );

        /*
        commandDTO.setIdCommand(command.getIdCommand());
        commandDTO.setDateCreationCommand(command.getDateCreationCommand());
        commandDTO.setPriceTotalCommand(command.getPriceTotalCommand());
         */
        return commandDTO;
    }

    public Command fromCommandDTO(CommandDTO commandDTO){
        Command command = new Command();
        BeanUtils.copyProperties(commandDTO, command );
        /*
        command.setIdCommand(commandDTO.getIdCommand());
        command.setDateCreationCommand(commandDTO.getDateCreationCommand());
        command.setPriceTotalCommand(commandDTO.getPriceTotalCommand());
         */
        return command;
    }
}
