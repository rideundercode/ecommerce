import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ProductService } from '../../services/product.service';
import { Product } from '../../models/product'; // Assurez-vous de définir ce modèle

@Component({
selector: 'app-product-detail',
templateUrl: './product-detail.component.html',
styleUrls: ['./product-detail.component.css']
})
export class ProductDetailComponent implements OnInit {
product: Product;
id: string;

constructor(
private productService: ProductService,
private route: ActivatedRoute
) {}

ngOnInit(): void {
this.id = this.route.snapshot.paramMap.get('id');
this.productService.getProductById(this.id).subscribe(data => {
this.product = data;
});
}

deleteProduct() {
this.productService.deleteProduct(this.id).subscribe(() => {
      // Rediriger l'utilisateur ou mettre à jour l'UI après suppression

