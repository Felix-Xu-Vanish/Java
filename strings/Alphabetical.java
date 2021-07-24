package strings;

/**
 * Alphabetical order is a system whereby character strings are placed in order based on the
 * position of the characters in the conventional ordering of an alphabet. Wikipedia:
 * https://en.wikipedia.org/wiki/Alphabetical_order
 */
class Alphabetical {
  // OK
  
  public static void main(String[] args) {
    assert !isAlphabetical("123abc");
    assert isAlphabetical("aBC");
    assert isAlphabetical("abc");
    assert !isAlphabetical("xyzabc");
    assert isAlphabetical("abcxyz");
  }

  /**
   * Check if a string is alphabetical order or not
   *
   * @param s a string
   * @return {@code true} if given string is alphabetical order, otherwise {@code false}
   */
  public static boolean isAlphabetical(String s) {
    s = s.toLowerCase();
    // change everything in to lower case to compare
    for (int i = 0; i < s.length() - 1; ++i) {
      // loop for the length of the string

      // two condition
      if (!Character.isLetter(s.charAt(i)) || !(s.charAt(i) <= s.charAt(i + 1))) {
        // !Character.isLetter(s.charAt(i))    ->     is the letter character
        // !(s.charAt(i) <= s.charAt(i + 1))   ->     is the first one less than the second one
        return false;
        // ! means if yes, return false;
      }
    }
    return true;
  }
}
