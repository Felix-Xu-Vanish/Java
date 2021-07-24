package strings;

import java.util.HashMap;
// HashMap ?
import java.util.Map;
// Map ?

/**
 * Two strings are anagrams if they are made of the same letters arranged differently (ignoring the
 * case).
 */
public class CheckAnagrams {
  // Not OK

  public static void main(String[] args) {
    assert isAnagrams("Silent", "Listen");
    assert isAnagrams("This is a string", "Is this a string");
    assert !isAnagrams("There", "Their");
  }

  /**
   * Check if two strings are anagrams or not
   *
   * @param s1 the first string
   * @param s2 the second string
   * @return {@code true} if two string are anagrams, otherwise {@code false}
   */
  public static boolean isAnagrams(String s1, String s2) {
    int l1 = s1.length(); 
    int l2 = s2.length();
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();
    // get ready

    Map<Character, Integer> charAppearances = new HashMap<>();
    // Map<Character, Integer> ?

    for (int i = 0; i < l1; i++) {
      char c = s1.charAt(i);
      int numOfAppearances = charAppearances.getOrDefault(c, 0);
      // getOrDefault
      charAppearances.put(c, numOfAppearances + 1);
    }

    for (int i = 0; i < l2; i++) {
      char c = s2.charAt(i);
      if (!charAppearances.containsKey(c)) {
        return false;
      }
      charAppearances.put(c, charAppearances.get(c) - 1);
    }

    for (int cnt : charAppearances.values()) {
      if (cnt != 0) {
        return false;
      }
    }
    return true;
  }
}
