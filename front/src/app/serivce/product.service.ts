import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from '../models/product'; // Définissez ce modèle

@Injectable({ providedIn: 'root' })
export class ProductService {
private baseUrl = 'http://localhost:8080/api/products';

constructor(private http: HttpClient) {}

getAllProducts(): Observable<Product[]> {
return this.http.get<Product[]>(`${this.baseUrl}/`);
}

getProductById(id: string): Observable<Product> {
return this.http.get<Product>(`${this.baseUrl}/${id}`);
}

createProduct(product: Product): Observable<Object> {
return this.http.post(`${this.baseUrl}/`, product);
}

deleteProduct(id: string): Observable<Object> {
return this.http.delete(`${this.baseUrl}/${id}`);
}
}
