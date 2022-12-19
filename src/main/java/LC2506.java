public class LC2506 {


    public static void main(String[] args) {

        String[] words = new String[] {"aba","aabb","abcd","bac","aabc"};
        String[] words2 = new String[] {"aabb","ab","ba"};
        String[] words3 = new String[] {"nba","cba","dba"};

        System.out.println(similarPairs(words));
        System.out.println(similarPairs(words2));
        System.out.println(similarPairs(words3));

    }

    public static int similarPairs(String[] words){

        //You are given a 0-indexed string array words.
        //
        //Two strings are similar if they consist of the same characters.
        //
        //For example, "abca" and "cba" are similar since both consist of characters 'a', 'b', and 'c'.
        //However, "abacba" and "bcfd" are not similar since they do not consist of the same characters.
        //Return the number of pairs (i, j) such that 0 <= i < j <= word.length - 1 and the two strings words[i] and words[j] are similar.

        int ans = 0;

        for(int i = 0;i<words.length-1;i++){
            int[] a = new int[26];
            for(char c: words[i].toCharArray()){
                a[c-'a']++;
            }

            for(int j = i+1;j<words.length;j++){
                int[] b = new int[26];

                for(char d: words[j].toCharArray()){
                    b[d-'a']++;
                }

                int check;
                for(check = 0;check<26;check++){

                    if(a[check] == 0 && b[check] != 0 || b[check] == 0 && a[check] != 0){
                        break;
                    }
                }

                if(check == 26){
                    ans++;
                }
            }
        }

        return ans;



    }
}
