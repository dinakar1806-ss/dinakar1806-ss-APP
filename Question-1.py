
from functools import reduce

students = {
    "Arun": 45,
    "Bala": 68,
    "Charan": 92,
    "Divya": 50,
    "Ezhil": 100
}


qualified = dict(filter(lambda item: item[1] >= 50,
                        students.items()))


grace_marks = dict(map(
    lambda item: (item[0], min(item[1] + 5, 100)),
    students.items()
))


total = reduce(lambda x, y: x + y,
               grace_marks.values(), 0)

print("Students scoring 50 or above:", qualified)
print("Marks after grace:", grace_marks)
print("Total marks after grace:", total)
