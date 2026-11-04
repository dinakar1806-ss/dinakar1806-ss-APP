from automata.fa.dfa import DFA

# DFA that accepts binary strings ending with 01
dfa = DFA(
    states={"q0", "q1", "q2"},
    input_symbols={"0", "1"},
    transitions={
        "q0": {"0": "q1", "1": "q0"},
        "q1": {"0": "q1", "1": "q2"},
        "q2": {"0": "q1", "1": "q0"}
    },
    initial_state="q0",
    final_states={"q2"}
)

n = int(input("Enter number of strings: "))

for _ in range(n):
    string = input("Enter binary string: ")

    if dfa.accepts_input(string):
        print(string, "Accepted")
    else:
        print(string, "Rejected")
