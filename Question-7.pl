
% Facts: Parking slot, vehicle type, availability
parking(s1, car, available).
parking(s2, bike, occupied).
parking(s3, car, available).
parking(s4, bike, available).
parking(s5, car, occupied).

% Rule: Find available slots for a vehicle type
available_slot(Slot, Vehicle) :-
    parking(Slot, Vehicle, available).

% Query: Find available car parking slots
% ?- available_slot(Slot, car).
