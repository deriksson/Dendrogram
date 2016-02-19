package se.abc.dot;

public final class Font {
	
	private final int size;
	private final String name;
	private final String color;
	
	public Font(final String name, final int size, final String color) {
		super();
		this.name = name;
		this.size = size;
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}
}
