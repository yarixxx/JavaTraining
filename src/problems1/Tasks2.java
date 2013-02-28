package problems1;

import java.util.*;
import java.text.*;

public class Tasks2 {

	public String sayHello(String name) {
		return "Hello ".concat(name).concat("!");
	}
	
	public String extraEnd(String str) {
		if (str.length() < 2) {
			return str.concat(str).concat(str);
		}
		final String end = str.substring(str.length() - 2, str.length());
		return end.concat(end).concat(end);
	}
	
	public String firstTwo(String str) {
		if (str.length() < 2) {
			return str;
		}
		return str.substring(0,2);
	}
	
	public String wrapToTag(String tagName, String value) {
		final String openTag = "<".concat(tagName).concat(">");
		final String closeTag = "</".concat(tagName).concat(">");
		return openTag.concat(value).concat(closeTag);
	}
	
	public String stringTimes(String string, int i) {
		if (i > 0) {
			return stringTimes(string, --i).concat(string);
		}
		return "";
	}
	
}
