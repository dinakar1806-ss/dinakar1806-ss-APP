import sympy as sp

t = sp.symbols("t")

# Displacement function
s = t**3 - 6*t**2 + 9*t + 5
print("Displacement:", s)

# Velocity = first derivative of displacement
v = sp.diff(s, t)
print("Velocity:", v)

# Acceleration = derivative of velocity
a = sp.diff(v, t)
print("Acceleration:", a)

# Find times when the vehicle is momentarily at rest
rest_times = sp.solve(v, t)
print("Vehicle is at rest at:", rest_times)

for value in rest_times:
    print("Acceleration at t =", value, ":", a.subs(t, value))

# Displacement over a user-given time interval
start = sp.Rational(input("Enter starting time: "))
end = sp.Rational(input("Enter ending time: "))

displacement = sp.integrate(v, (t, start, end))
print("Displacement over interval:", displacement)
