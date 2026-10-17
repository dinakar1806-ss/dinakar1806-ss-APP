
from functools import reduce

consumption = [8, 12, 15, 9, 20, 11]

high_consumption = list(filter(
    lambda units: units > 10,
    consumption
))


daily_cost = list(map(
    lambda units: units * 6,
    consumption
))


total_units = reduce(
    lambda x, y: x + y,
    consumption, 0
)


def electricity_bill(units):
    return units * 6

total_bill = electricity_bill(total_units)

print("Consumption above 10 units:", high_consumption)
print("Daily electricity cost:", daily_cost)
print("Total consumption:", total_units, "units")
print("Total electricity bill: Rs.", total_bill)
print("Original consumption:", consumption)
