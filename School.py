class Student:
    def __init__(self, name, grade, age):
        self.name = name
        self.grade = grade
        self.age = age

    def display(self):
        print(f"Name: {self.name}, Grade: {self.grade}, Age: {self.age}")


class School(Student):
    def __init__(self, name, grade, age, school_name):
        super().__init__(name, grade, age)
        self.school_name = school_name

    def school_student_display(self):
        print(f"Name: {self.name}, Grade: {self.grade}, Age: {self.age}, School: {self.school_name}")


# Example usage
if __name__ == "__main__":
    # Creating an object using Student class
    student1 = Student("Raja", "A", 27)
    print("Displaying Student:")
    student1.display()

    print()

    # Creating an object using School class (inherits from Student)
    school_student1 = School("Raja", "B", 15, "ABC School")
    print("Displaying School Student:")
    school_student1.school_student_display()
