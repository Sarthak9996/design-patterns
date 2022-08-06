Proxy Design Pattern - Properties
1. Structural Design Pattern
2. Used when we want to control access. i.e. in Databases, we would want to control the 'delete' query available only for certain users like admin.


Implementation:
1. In general, we've class which is executing interface executor method, which is executing all commands.
2. To control this, we add a Proxy class which implements the same interface & write the conditions for 'admin' user before proceeding 	to actual executor.

