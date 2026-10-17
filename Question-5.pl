
% a) Student result facts
python_pass(arun).
ds_pass(arun).

python_pass(bala).
ds_fail(bala).

python_pass(charan).
ds_pass(charan).

python_fail(divya).
ds_pass(divya).

% b) Eligibility rule
eligible(X) :-
    python_pass(X),
    ds_pass(X).

% c) Query
% ?- eligible(X).
