import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from '../models/command.model'; // Define this model based on your backend

@Injectable({
providedIn: 'root'
})
export class CommandService {

private baseUrl = 'http://localhost:8081/api/commands'; // Adjust if your backend URL is different

constructor(private http: HttpClient) { }

getAllCommands(): Observable<Command[]> {
return this.http.get<Command[]>(`${this.baseUrl}/`);
}

getCommandById(id: string): Observable<Command> {
return this.http.get<Command>(`${this.baseUrl}/${id}`);
}

createCommand(command: Command): Observable<Object> {
return this.http.post(`${this.baseUrl}/`, command);
}

deleteCommand(id: string): Observable<Object> {
return this.http.delete(`${this.baseUrl}/${id}`);
}
}
