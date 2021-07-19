import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment.prod';
import { Veiculo } from '../model/Veiculo';

@Injectable({
  providedIn: 'root'
})
export class VeiculoService {

  constructor(private http: HttpClient) { }

  getAllVeiculos(): Observable<Veiculo[]> {
    return this.http.get<Veiculo[]>(`${environment.server}/veiculos`)
  }

 /*  getByFindVeiculo() {
    
  } */

  getByIdVeiculo(id: number): Observable<Veiculo>{
    return this.http.get<Veiculo>(`${environment.server}/veiculos/${id}`)
  }

  postVeiculo(veiculo: Veiculo): Observable<Veiculo> {
    return this.http.post<Veiculo>(`${environment.server}/veiculos`, veiculo)
  }

  putVeiculo(veiculo: Veiculo): Observable<Veiculo>{
    return this.http.put<Veiculo>(`${environment.server}/veiculos`, veiculo)
  }

 /*  putVeiculo(id: number): Observable<Veiculo>{
    return this.http.put<Veiculo>(`${environment.server}/veiculos/${id}`, id)
  } */

  deleteVeiculo(id: number) {
    return this.http.delete(`${environment.server}/veiculos/${id}`)
  }
}
