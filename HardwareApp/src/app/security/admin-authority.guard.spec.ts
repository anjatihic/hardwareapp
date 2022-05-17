import { TestBed } from '@angular/core/testing';

import { AdminAuthorityGuard } from './admin-authority.guard';

describe('AdminAuthorityGuard', () => {
  let guard: AdminAuthorityGuard;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    guard = TestBed.inject(AdminAuthorityGuard);
  });

  it('should be created', () => {
    expect(guard).toBeTruthy();
  });
});
