import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProductListComponent } from './components/product-list/product-list.component';
import { CustomerListComponent } from './components/customer-list/customer-list.component';
import { CommandListComponent } from './components/command-list/command-list.component';

const routes: Routes = [
{ path: 'products', component: ProductListComponent },
{ path: 'customers', component: CustomerListComponent },
{ path: 'commands', component: CommandListComponent },
{ path: 'products/:id', component: ProductDetailComponent },
{ path: '', redirectTo: '/products', pathMatch: 'full' }
];

@NgModule({
imports: [RouterModule.forRoot(routes)],
exports: [RouterModule]
})
export class AppRoutingModule { }
