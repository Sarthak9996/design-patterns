package decorator_pattern;

interface Dress {
	public void assembly();
}

class BasicDress implements Dress {

	@Override
	public void assembly() {
		System.err.println("Adding Basic Dress Features");
	}

}

class DressDecorator implements Dress {
	protected Dress dress;

	public DressDecorator(Dress c) {
		this.dress = c;
	}

	@Override
	public void assembly() {
		this.dress.assembly();
	}
}

class CasualDress extends DressDecorator {
	public CasualDress(Dress c) {
		super(c);
	}

	@Override
	public void assembly() {
		super.assembly();
		System.err.println("Adding Casual Dress Features");
	}

}

class SportyDress extends DressDecorator {
	public SportyDress(Dress c) {
		super(c);
	}

	@Override
	public void assembly() {
		super.assembly();
		System.err.println("Adding Sporty Dress Features");
	}

}

class FancyDress extends DressDecorator {
	public FancyDress(Dress c) {
		super(c);
	}

	@Override
	public void assembly() {
		super.assembly();
		System.err.println("Adding Fancy Dress Features");
	}

}

public class Decorator {
//Client class
	public static void main(String[] args) {
		Dress sportyDress = new SportyDress(new BasicDress());
		sportyDress.assembly();
		System.err.println();

		Dress fancyDress = new FancyDress(new BasicDress());
		fancyDress.assembly();
		System.err.println();

		Dress casualDress = new CasualDress(new BasicDress());
		casualDress.assembly();
		System.err.println();

		Dress sportyFancyDress = new SportyDress(new FancyDress(new BasicDress()));
		sportyFancyDress.assembly();
		System.err.println();

		Dress casualFancyDress = new CasualDress(new FancyDress(new BasicDress()));
		casualFancyDress.assembly();
	}
}
