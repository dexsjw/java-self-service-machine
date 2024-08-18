# Practice Exercise

In the previous exercise, we created our `VendingMachine` class.   Imagine our company also supplies `ClawMachine` and `InfoKiosk`.

This time we want to create an abstract superclass `SelfServiceMachine`, which is a superclass of `VendingMachine`, `ClawMachine` and `InfoKiosk`.

We also have the following interfaces that can be used.
```
interface PaymentEnabled {
  void pay(double amount);
}
```
```
interface Trackable {
  void track();
}
```
- Only `VendingMachine` and `ClawMachine` will have payment enabled
- All `SelfServiceMachine` should be trackable.

### Challenge

1. Create an abstract class `SelfServiceMachine` that implements `Trackable` 
2. Refactor `VendingMachine` to be a subclass of `SelfServiceMachine` and implements `PaymentEnabled`
	1. `insertCoin()` just becomes `pay()`  
3. Create `ClawMachine` which also implements `PaymentEnabled` 
	1. You can set a `static final` variable for the game price
	2. It should have a `play()` method which always returns a prize
	3. **Optional:** return a randomized prize
1. Create InfoKiosk 
	1. It should have a `printInfo()` method that just outputs some generic information.