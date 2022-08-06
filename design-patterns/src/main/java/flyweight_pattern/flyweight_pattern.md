Flyweight Design Pattern - Properties
1. Structural Design Pattern
2. Used when we need to create many Objects of a class. We use it to reduce creation of Object.
3. Intrinsic Properties : Which are same for an Object.
4. Extrinsic Properties : Which are different for an Object.


Implementation:
1. Interface - which contain common method : Employee
2. Object - Individual class : Developer, Tester
3. Intrinsic Property - (Developer: Fix the issue, Tester: Test the issue)
4. Extrinsic Property - Skills
5. We use factory to return Object : EmployeeFactory
6. Client - Client class
7. We will assign issues as per skills.