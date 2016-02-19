package se.abc.dot;

public abstract class Component implements CharSequence {

	private final StringBuffer buf = new StringBuffer();

	protected final void append(final CharSequence charSequence) {
		buf.append(charSequence);
	}

	@Override
	public final char charAt(int index) {
		return buf.charAt(index);
	}

	@Override
	public final int length() {
		return buf.length();
	}

	@Override
	public final CharSequence subSequence(int start, int end) {
		return buf.subSequence(start, end);
	}

	@Override
	public final String toString() {
		return buf.toString();
	}
}
