class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");

        List<Pair<String, Integer>> scoredWords = new ArrayList<Pair<String, Integer>>();

        for(String w: words) {
            Integer l = w.length();
            Integer i = Integer.parseInt(w.substring(l-1, l));
            String word = w.substring(0, l-1);

            scoredWords.add(new Pair<String, Integer>(word, i));
        }

        Collections.sort(scoredWords, Comparator.comparing(p -> p.getValue()));

        StringBuilder result = new StringBuilder();
        scoredWords.forEach(word -> {result.append(word.getKey() + " ");});

        return result.toString().trim();
    }
}
