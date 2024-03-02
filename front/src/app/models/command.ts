export enum StateCommand {
PREPARATION = 'PREPARATION',
INPROGRESS = 'INPROGRESS',
DELIVERED = 'DELIVERED'
}

export class Command {
idCommand: string;
dateCreationCommand: Date;
priceTotalCommand: number;
stateCommand: StateCommand;
    // Autres champs...
}
