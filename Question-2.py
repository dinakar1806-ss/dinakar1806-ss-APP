
from functools import reduce

salaries = [30000, 35000, 40000, 50000, 25000]

revised = list(map(
    lambda salary: salary * 1.10
    if salary < 40000 else salary,
    salaries
))


eligible = list(filter(
    lambda salary: salary < 40000,
    salaries
))


total = reduce(lambda x, y: x + y, revised, 0)

print("Original salaries:", salaries)
print("Eligible salaries:", eligible)
print("Revised salaries:", revised)
print("Total salary expenditure:", total)
