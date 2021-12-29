import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Brand } from './brand';
import { BrandService } from './brand.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  public brand!: Brand[];

  constructor(private brandService: BrandService) { }

  ngOnInit(): void {
      this.getBrands();
  }


  public getBrands(): void {
    this.brandService.getBrand().subscribe(
      (response: Brand[]) => {
        this.brand = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    )
  }

}
