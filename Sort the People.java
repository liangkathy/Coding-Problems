class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        List<Pair<Integer, String>> heightNameList = new ArrayList<>();
        String[] sortedNames = new String[names.length];

        for(int i = 0; i<names.length; i++){
            heightNameList.add(new Pair<Integer, String>(heights[i], names[i]));
        }

        Collections.sort(heightNameList, (a,b) -> b.getKey() - a.getKey());

        for(int i = 0; i<heightNameList.size(); i++){
            sortedNames[i] = heightNameList.get(i).getValue();
        }

        return sortedNames;
    }
}
