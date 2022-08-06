package observer_pattern;

import java.util.ArrayList;
import java.util.List;

interface Subject {
	void register(Observer obj);

	void unregister(Observer obj);

	void notifyObservers();
}

class DeliveryData implements Subject {
	private List<Observer> observers;
	private String location;

	public DeliveryData() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void register(Observer obj) {
		observers.add(obj);
	}

	@Override
	public void unregister(Observer obj) {
		observers.remove(obj);
	}

	@Override
	public void notifyObservers() {
		for (Observer obj : observers) {
			obj.update(location);
		}
	}

	public void locationChanged() {
		this.location = getLocation();
		notifyObservers();
	}

	public String getLocation() {
		return "YPlace";
	}

}

interface Observer {
	public void update(String location);
}

class Seller implements Observer {

	private String location;

	@Override
	public void update(String location) {
		this.location = location;
		showLocation();
	}

	public void showLocation() {
		System.err.println("Notification at Seller - Current Location : " + this.location);
	}

}

class User implements Observer {

	private String location;

	@Override
	public void update(String location) {
		this.location = location;
		showLocation();
	}

	public void showLocation() {
		System.err.println("Notification at User - Current Location : " + this.location);
	}

}

class DeliveryWarehousingCenter implements Observer {

	private String location;

	@Override
	public void update(String location) {
		this.location = location;
		showLocation();
	}

	public void showLocation() {
		System.err.println("Notification at Delivery Warehousing Center - Current Location : " + this.location);
	}

}

public class ObserverPattern {
	public static void main(String[] args) {
		DeliveryData topic = new DeliveryData();

		Observer ob1 = new Seller();
		Observer ob2 = new User();
		Observer ob3 = new DeliveryWarehousingCenter();

		topic.register(ob1);
		topic.register(ob2);
		topic.register(ob3);

		topic.locationChanged();

		topic.unregister(ob3);
		System.err.println();
		topic.locationChanged();
	}
}
