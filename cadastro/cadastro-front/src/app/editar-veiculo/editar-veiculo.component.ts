import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Veiculo } from '../model/Veiculo';
import { VeiculoService } from '../service/veiculo.service';

@Component({
  selector: 'app-editar-veiculo',
  templateUrl: './editar-veiculo.component.html',
  styleUrls: ['./editar-veiculo.component.css']
})
export class EditarVeiculoComponent implements OnInit {

  veiculo: Veiculo = new Veiculo()

  constructor(
    private veiculoService: VeiculoService,
    private router: Router,
    private route: ActivatedRoute
  ) { }

  ngOnInit() {
    let id = this.route.snapshot.params['id']
    this.findByIdVeiculo(id)
  }

  findByIdVeiculo(id: number) {
    this.veiculoService.getByIdVeiculo(id).subscribe((resp: Veiculo) => {
      this.veiculo = resp
    })
  }
}
