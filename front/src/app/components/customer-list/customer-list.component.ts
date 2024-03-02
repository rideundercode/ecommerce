import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../../services/customer.service';
import { Customer } from '../../models/customer'; // Assurez-vous de définir ce modèle

@Component({
selector: 'app-customer-list',
templateUrl: './customer-list.component.html',
styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
customers: Customer[];

constructor(private customerService: CustomerService) { }

ngOnInit(): void {
this.customerService.getAllCustomers().subscribe(data => {
this.customers = data;
});
}

deleteCustomer(id: string) {
this.customerService.deleteCustomer(id).subscribe(() => {
this.customers = this.customers.filter(customer => customer.id !== id);
      // Mise à jour de la liste après suppression
});
}
}
