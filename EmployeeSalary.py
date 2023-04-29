# This is a sample Python script.
class EmployeeSalary:

    def __init__(self):
        self.baseHrPay=19
        self.bonus=3
        self.empName=input("Enter employee name:")
        self.empID = input("Enter employee id:")
        self.weeklyHr=int(input("Enter hour weekly:"))
        self.yearOfExp=int(input("Enter years of experience:"))

    def salaryCal(self , baseHrPay, weeklyHr):
        if self.yearOfExp < 8 :
            self.salary=self.baseHrPay*self.weeklyHr*4
        else :
            self.salary = (self.baseHrPay + self.bonus) * self.weeklyHr * 4

    def taxCal(self, salary):
        self.tax=self.salary*(13/100)
    def display(self):
        print()
        EmployeeSalary.salaryCal(self,self.baseHrPay,self.weeklyHr)
        EmployeeSalary.taxCal(self,self.salary)
        print("Payslip for ",self.empName,"Employee id :",self.empID)
        print("Employee name:",self.empName)
        print("Employee name:", self.empID)
        print("Employee salary:",self.salary)
        print("Income tax:",self.tax)
        print("Net salary:",(self.salary-self.tax))
        print("-----Thank you------")

myobj=EmployeeSalary()
myobj.display()












