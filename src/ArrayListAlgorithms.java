import java.util.ArrayList;

public class ArrayListAlgorithms
{
    /** Returns true if any of the elements in stringList contain
     *  target as a substring; false otherwise.  Use indexOf instead of contains
     *  for AP practice! (although in reality, contains is preferred)
     *
     *  Does NOT mutate (modify) elements of stringList.
     *  PRECONDITION: stringList.size() > 0
     *
     *  @param stringList  original arraylist of Strings
     *  @return  true if target is found in any of the strings, false otherwise
     */
    public static boolean containsTarget(ArrayList<String> stringList, String target) {
        for (String str : stringList) {
            if (str.indexOf(target) != -1) {
                return true;
            }
        }
        return false;
    }

    /** Returns number of elements in intList that are less than the
     *  average of all elements.
     *
     *  Does NOT mutate (modify) elements of intList.
     *  PRECONDITION: intList.size() > 0
     *
     *  @param intList  original arraylist of Integers
     *  @return  the number of ints in intList that are less than the average
     */
    public static int belowAverage(ArrayList<Integer> intList) {
        double avg = 0.0;
        for (int num : intList) {
            avg += num;
        }
        avg /= intList.size();
        int count = 0;
        for (int num : intList) {
            if (num < avg) {
                count++;
            }
        }
        return count;
    }

    /** Replaces all words in wordList that end in "s" with the all-uppercase
     *  version of the word.  For example, "apples" should be replaced with "APPLES".
     *  Assume all letters of all words in wordList are lowercase initially (no need
     *  to worry about checking for case or converting first to lowercase)
     *
     *  DOES mutate (modify) elements of wordList.
     *  PRECONDITION: wordList.size() > 0
     *
     *  @param wordList  original arraylist of words
     */
    public static void replaceWithCaps(ArrayList<String> wordList) {
        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).substring(wordList.get(i).length() - 1).equals("s")) {
                wordList.set(i, wordList.get(i).toUpperCase());
            }
        }
    }

    /** Returns the index at which the minimum value of all integers in
     *  intList appears; if the minimum value appears more than once in
     *  the arraylist, return the index of the first occurrence
     *
     *  Does NOT mutate (modify) elements in intList.
     *  PRECONDITION: intList.size() > 0
     *
     *  @param intList  original arraylist of Integers
     *  @return  the index at which the minimum value occurs
     */
    public static int indexOfMinimum(ArrayList<Integer> intList) {
        int min = intList.get(0);
        int minIdx = 0;
        for (int i = 1; i < intList.size(); i++) {
            if (intList.get(i) < min) {
                min = intList.get(i);
                minIdx = i;
            }
        }
        return minIdx;
    }

    /** Returns true if two array lists of the same length contain the exact
     *  same elements in the same order (i.e. the two arraylists are identical).
     *  Returns false otherwise.
     *
     *  Does NOT mutate (modify) elements in either arraylist
     *  PRECONDITION: numList1.size() == numList2.size()
     *
     *  @param numList1  first arraylist of Integers
     *  @param numList2  second arraylist of Integers, has the same size a first
     *  @return  true if both arraylists are identical, element for element
     */
    public static boolean areIdentical(ArrayList<Integer> numList1, ArrayList<Integer> numList2) {
        if (numList1.size() == numList2.size()) {
            for (int i = 0; i < numList1.size(); i++) {
                if (!(numList1.get(i) == numList2.get(i))) {
                    return false;
                }
            }
        }

    }
}