
package io.johnvincent.diff.exec;

public class PrintLine implements OutputLine {
	public void println(String msg) {
		System.out.println(msg);
	}
	public void close() {}
}
