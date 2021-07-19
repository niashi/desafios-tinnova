import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ApagarVeiculoComponent } from './apagar-veiculo/apagar-veiculo.component';
import { EditarVeiculoComponent } from './editar-veiculo/editar-veiculo.component';
import { SobreComponent } from './sobre/sobre.component';
import { VeiculosComponent } from './veiculos/veiculos.component';

const routes: Routes = [

  {path: '', redirectTo: 'veiculos', pathMatch: 'full'},

  {path: 'veiculos', component: VeiculosComponent},

  {path: 'sobre', component: SobreComponent},

  {path: 'editar/:id', component: EditarVeiculoComponent},

  {path: 'apagar/:id', component: ApagarVeiculoComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
