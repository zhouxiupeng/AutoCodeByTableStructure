/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.code.util;

import java.util.StringTokenizer;

public class StringUtility {
	public static boolean stringHasValue(String s) {
		return ((s != null) && (s.length() > 0));
	}

	public static String composeFullyQualifiedTableName(String catalog,
			String schema, String tableName, char separator) {
		StringBuilder sb = new StringBuilder();

		if (stringHasValue(catalog)) {
			sb.append(catalog);
			sb.append(separator);
		}

		if (stringHasValue(schema)) {
			sb.append(schema);
			sb.append(separator);
		} else if (sb.length() > 0) {
			sb.append(separator);
		}

		sb.append(tableName);

		return sb.toString();
	}

	public static boolean stringContainsSpace(String s) {
		return ((s != null) && (s.indexOf(32) != -1));
	}

	public static String escapeStringForJava(String s) {
		StringTokenizer st = new StringTokenizer(s, "\"", true);
		StringBuilder sb = new StringBuilder();
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			if ("\"".equals(token))
				sb.append("\\\"");
			else {
				sb.append(token);
			}
		}

		return sb.toString();
	}

	public static String escapeStringForXml(String s) {
		StringTokenizer st = new StringTokenizer(s, "\"", true);
		StringBuilder sb = new StringBuilder();
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			if ("\"".equals(token))
				sb.append("&quot;");
			else {
				sb.append(token);
			}
		}

		return sb.toString();
	}

	public static boolean isTrue(String s) {
		return "true".equalsIgnoreCase(s);
	}

	public static boolean stringContainsSQLWildcard(String s) {
		if (s == null) {
			return false;
		}

		return ((s.indexOf(37) != -1) || (s.indexOf(95) != -1));
	}

	public static String getCamelCaseString(String inputString,
			boolean firstCharacterUppercase) {
		StringBuilder sb = new StringBuilder();

		boolean nextUpperCase = false;
		for (int i = 0; i < inputString.length(); ++i) {
			char c = inputString.charAt(i);

			switch (c) {
			case ' ':
			case '#':
			case '$':
			case '&':
			case '-':
			case '/':
			case '@':
			case '_':
				if (sb.length() > 0)
					nextUpperCase = true;
				break;
			default:
				if (nextUpperCase) {
					sb.append(Character.toUpperCase(c));
					nextUpperCase = false;
				} else {
					sb.append(Character.toLowerCase(c));
				}
			}

		}

		if (firstCharacterUppercase) {
			sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
		}

		return sb.toString();
	}
}