import { Component, OnInit } from '@angular/core';
import { CommandService } from '../../services/command.service';
import { Command } from '../../models/command'; // Assurez-vous de définir ce modèle

@Component({
selector: 'app-command-list',
templateUrl: './command-list.component.html',
styleUrls: ['./command-list.component.css']
})
export class CommandListComponent implements OnInit {
commands: Command[];

constructor(private commandService: CommandService) { }

ngOnInit(): void {
this.commandService.getAllCommands().subscribe(data => {
this.commands = data;
});
}

deleteCommand(id: string) {
this.commandService.deleteCommand(id).subscribe(() => {
this.commands = this.commands.filter(command => command.id !== id);
      // Mise à jour de la liste après suppression
});
}
}
