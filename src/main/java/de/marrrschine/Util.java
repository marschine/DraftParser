package de.marrrschine;

public class Util {
	public static String prepareThreadElements(String currentElement) {
		String[] newString = currentElement.split("-");
		if (newString[0].equals(currentElement)) {
			newString = currentElement.split("–");
		}
		String name = newString[0].split(",")[0].trim();
		return name;
	}
}
