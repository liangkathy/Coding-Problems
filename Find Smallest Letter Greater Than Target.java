class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        List<Character> orderedLetters = new ArrayList<>();

        for(char l: letters){
            orderedLetters.add(Character.valueOf(l));
        }

        Collections.sort(orderedLetters, (a,b) -> a - b);

        Character c = 0;

        for(Character l: orderedLetters){
            if(l > target){
                c = l;
                break;
            } else {
                c = letters[0];
            }
        }

        return c;
    }
}
