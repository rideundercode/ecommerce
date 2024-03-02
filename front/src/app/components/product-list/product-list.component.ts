import { Component, OnInit } from '@angular/core';
import { ProductService } from '../../services/product.service';
import { Product } from '../../models/product';

@Component({
selector: 'app-product-list',
templateUrl: './product-list.component.html',
styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
products: Product[];

constructor(private productService: ProductService) { }

ngOnInit() {
this.productService.getAllProducts().subscribe(data => {
this.products = data;
});
}

deleteProduct(id: string) {
this.productService.deleteProduct(id).subscribe(() => {
this.products = this.products.filter(product => product.id !== id);
});
}
}
