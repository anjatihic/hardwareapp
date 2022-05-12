import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FindReviewComponent } from './find-review.component';

describe('FindReviewComponent', () => {
  let component: FindReviewComponent;
  let fixture: ComponentFixture<FindReviewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FindReviewComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FindReviewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
