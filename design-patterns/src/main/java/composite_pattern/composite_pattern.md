Composite Design Pattern - Properties
1. Structural Design Pattern.
2. Composite lets client treat individual objects(Leaf) and compositions of Objects(Composite) uniformly.
3. Four Participants: Component, Leaf, Composite, Client
4. If object is leaf node, request is handled directly, if object is Composite, it forward request to child, so some operation & combine operations.


Implementation:
1. Component - Account class, which contains common method.
2. Leaf - Deposite Account & Savings Account
3. Composite - Composite Account
4. Client - Client class



We'll get balance of all account for a Person.