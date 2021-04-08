package twopointer;

public class LongestWord {
    public String findLongestWord(String s, String[] d){
        String longestWord = "";
        for (String target : d){
            int l1 = longestWord.length(), l2 = target.length();
            if(l1 > l2 || (l1 == l2 && longestWord.compareTo(target) < 0)){
                continue;
            }
            if(isSubStr(s, target)){
                longestWord = target;
            }
        }
        return longestWord;
    }

    private boolean isSubStr(String s, String target) {
        int i = 0, j = 0;
        while (i < s.length() && j < target.length()){
            if(s.charAt(i) == target.charAt(j)){
                j++;
            }
            i++;
        }
        return j == target.length();
    }

    public static void main(String[] args) {
        LongestWord longestWord = new LongestWord();
        System.out.println(longestWord.findLongestWord("bpcplea", new String[]{"ale", "apple", "monkey", "plea"}));
    }
}
