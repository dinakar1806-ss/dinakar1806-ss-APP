
% Facts: Employee experience in years
experience(ravi, 6).
experience(priya, 3).
experience(kumar, 8).
experience(meena, 7).

% Facts: Mandatory training status
training(ravi, completed).
training(priya, completed).
training(kumar, not_completed).
training(meena, completed).

% Facts: Employee performance ratings
rating(ravi, 5).
rating(priya, 4).
rating(kumar, 5).
rating(meena, 4).

% Rule: All three conditions must be satisfied
promotion_eligible(X) :-
    experience(X, Years),
    Years >= 5,
    training(X, completed),
    rating(X, Rating),
    Rating >= 4.

% Query:
% ?- promotion_eligible(X).
