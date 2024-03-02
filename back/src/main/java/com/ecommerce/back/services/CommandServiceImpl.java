package com.ecommerce.back.services;

import com.ecommerce.back.dtos.CommandDTO;
import com.ecommerce.back.entities.Command;
import com.ecommerce.back.exceptions.CommandNotFoundException;
import com.ecommerce.back.mappers.CommandMapperImpl;
import com.ecommerce.back.repositories.CommandRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CommandServiceImpl implements CommandService {
    private CommandRepository commandRepository;

    private CommandMapperImpl commandMapper;

    @Override
    public CommandDTO createCommand(CommandDTO commandDTO) {
        Command command = commandMapper.fromCommandDTO(commandDTO);
        Command commandSaved = commandRepository.save(command);
        return commandMapper.fromCommand(commandSaved);
    }

    @Override
    public CommandDTO getCommand(String idCommand) throws CommandNotFoundException {
        Command command = commandRepository.findById(idCommand)
                .orElseThrow(() -> new CommandNotFoundException("Command not found with ID:" + idCommand));
        CommandDTO commandDTO = commandMapper.fromCommand(command);
        return commandDTO;

    }

    @Override
    public List<CommandDTO> getAllCommands() {

        if(commandRepository == null){
            return Collections.emptyList();
        }

        List<Command> commands =  commandRepository.findAll();
        List<CommandDTO> commandsDTO = commands.stream()
                .map(command -> commandMapper.fromCommand(command))
                .collect(Collectors.toList());
        return commandsDTO;
        //return commandRepository.findAll();
    }

    @Override
    public void deletedCommand(String idCommand) {
        commandRepository.deleteById(idCommand);
    }


}
