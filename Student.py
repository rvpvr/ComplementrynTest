class Student:
    def __init__(self, name, grade, age):
        self.name = name
        self.grade = grade
        self.age = age

    def display(self):
        print(f"Name: {self.name}, Grade: {self.grade}, Age: {self.age}")


# Example usage
if __name__ == "__main__":
    # Creating an object using Student class
    student1 = Student("Raja", "A", 27)

    # Calling the display method to show the details
    student1.display()