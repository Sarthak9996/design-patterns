package bridge_pattern;

abstract class TV {
	Remote remote;

	TV(Remote r) {
		this.remote = r;
	}

	abstract void on();

	abstract void off();
}

class Sony extends TV {
	Remote remoteType;

	Sony(Remote r) {
		super(r);
		this.remoteType = r;
	}

	public void on() {
		System.err.println("SONY TV on");
		remoteType.on();
	}

	public void off() {
		System.err.println("SONY TV off");
		remoteType.off();
	}
}

class Phillips extends TV {
	Remote remoteType;

	Phillips(Remote r) {
		super(r);
		this.remoteType = r;
	}

	public void on() {
		System.err.println("Phillips TV on");
		remoteType.on();
	}

	public void off() {
		System.err.println("Phillips TV off");
		remoteType.off();
	}
}

interface Remote {
	public void on();

	public void off();
}

class OldRemote implements Remote {

	@Override
	public void on() {
		System.err.println("ON with old remote");
	}

	@Override
	public void off() {
		System.err.println("OFF with old remote");
	}

}

class NewRemote implements Remote {

	@Override
	public void on() {
		System.err.println("ON with new remote");
	}

	@Override
	public void off() {
		System.err.println("OFF with new remote");
	}

}

public class Bridge {
	public static void main(String[] args) {
		TV sonyOldRemote = new Sony(new OldRemote());
		sonyOldRemote.on();
		sonyOldRemote.off();
		System.err.println();

		TV sonyNewRemote = new Sony(new NewRemote());
		sonyNewRemote.on();
		sonyNewRemote.off();
		System.err.println();

		TV phillipsOldRemote = new Phillips(new OldRemote());
		phillipsOldRemote.on();
		phillipsOldRemote.off();
		System.err.println();

		TV phillipsNewRemote = new Phillips(new NewRemote());
		phillipsNewRemote.on();
		phillipsNewRemote.off();

	}
}
