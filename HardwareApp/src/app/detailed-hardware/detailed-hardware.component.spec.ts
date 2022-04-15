import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailedHardwareComponent } from './detailed-hardware.component';

describe('DetailedHardwareComponent', () => {
  let component: DetailedHardwareComponent;
  let fixture: ComponentFixture<DetailedHardwareComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DetailedHardwareComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DetailedHardwareComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
