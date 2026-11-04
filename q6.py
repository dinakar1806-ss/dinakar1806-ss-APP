from automata.fa.nfa import NFA

# NFA that accepts strings containing the substring ab
nfa = NFA(
    states={"q0", "q1", "q2"},
    input_symbols={"a", "b"},
    transitions={
        "q0": {"a": {"q0", "q1"}, "b": {"q0"}},
        "q1": {"a": set(), "b": {"q2"}},
        "q2": {"a": {"q2"}, "b": {"q2"}}
    },
    initial_state="q0",
    final_states={"q2"}
)

n = int(input("Enter number of strings: "))

for _ in range(n):
    string = input("Enter string: ")

    if nfa.accepts_input(string):
        print(string, "Accepted")
    else:
        print(string, "Rejected")
