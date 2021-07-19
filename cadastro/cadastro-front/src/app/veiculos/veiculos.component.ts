import { VeiculoService } from '../service/veiculo.service';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Veiculo } from '../model/Veiculo';

@Component({
  selector: 'app-veiculos',
  templateUrl: './veiculos.component.html',
  styleUrls: ['./veiculos.component.css']
})
export class VeiculosComponent implements OnInit {

    listaVeiculos: Veiculo[]

  constructor(
    private router: Router,
    private route: ActivatedRoute,
    private veiculoService: VeiculoService
  ) { }

  ngOnInit() {
    this.findAllVeiculos()
  }

  findAllVeiculos() {
    this.veiculoService.getAllVeiculos().subscribe((resp: Veiculo[]) => {
      this.listaVeiculos = resp
    })
  }

  cadastrar() {
  }
}
