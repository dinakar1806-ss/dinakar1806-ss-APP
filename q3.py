import sympy as sp

x, y = sp.symbols("x y")

# Expand an algebraic expression
expr = (x + y)**2 + 2*x*y
print("Original Expression:", expr)
print("Expanded Expression:", sp.expand(expr))

# Factorize an expression
factor_expr = x**2 - y**2
print("Expression to factorize:", factor_expr)
print("Factorized Expression:", sp.factor(factor_expr))

# Simplify an expression
simplify_expr = (x**2 - 1) / (x - 1)
print("Simplified Expression:", sp.simplify(simplify_expr))

# Solve a quadratic equation
equation = x**2 - 5*x + 6
print("Quadratic Equation:", equation, "= 0")
print("Roots:", sp.solve(equation, x))
