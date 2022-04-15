import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AllHardwareComponent } from './all-hardware.component';

describe('AllHardwareComponent', () => {
  let component: AllHardwareComponent;
  let fixture: ComponentFixture<AllHardwareComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AllHardwareComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AllHardwareComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
