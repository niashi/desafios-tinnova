import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { VeiculosComponent } from './veiculos/veiculos.component';
import { EditarComponent } from './editar/editar.component';
import { CadastroVeiculosComponent } from './cadastro-veiculos/cadastro-veiculos.component';
import { SobreComponent } from './sobre/sobre.component';

@NgModule({
  declarations: [
    AppComponent,
    VeiculosComponent,
    EditarComponent,
    CadastroVeiculosComponent,
    SobreComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
