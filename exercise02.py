# Exercise Two
import datetime

# print the current date and time
datetime_object = datetime.datetime.now()
print("Current date and time: ", datetime_object)

# modify the following print statements using datetime_object appropriately
print("Current year: ", datetime_object.year)
print("Current month: ", datetime_object.month)
print("Current day: ", datetime_object.day)
print("Current time: ", datetime_object.time()) # time is a function here
# import class datetime. that class has the function time 

# modify the following statement that creates another datetime_object.
# the second datetime_object contains information about yesterday
datetime_object2 = datetime_object - datetime.timedelta(1)

# print yesterday's date and time
print("Yesterday's date and time: ", datetime_object2)

# modify the following statement to print the current date and time in
# dd-mm-YY H:M:S format
datetime_object3 = datetime_object.strftime("%d-%m-%Y-%H:%M:%S")
print("Current date and time: ", datetime_object3)
