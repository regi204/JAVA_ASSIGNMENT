#coding to calculate student grade
print("Enter the values from the keyboard")
name=input("Enter the student name:")
id=input("Enter student ID: ")
subject=["Java","python","C++","Bigdata"]
total=0
mark={}
for i in subject:
    print("Enter mark for ",i,":")
    mark[i]=input()
    total=float(total) + float(mark[i])
per=float(total/400*100)
print("The name of student is :",name)
print("The student id is :",id)
print("The total mark of student ",name," is",total)
print("The percentage is ",per)
if per>90:
    print("Excellent Division")
elif per>=80 and per <=90:
    print("First Division")
elif per>=70 and per<=79:
    print("Second Division")
elif per>=60 and per<=69:
    print("Pass")
else:
    print("fail")