class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;
        
        Map<Character,Integer> mapS = new HashMap<>();
        Map<Character,Integer> mapT = new HashMap<>();

        for(char c : s.toCharArray()){
                int count = mapS.getOrDefault(c,0) + 1;
                mapS.put(c,count);
        }

        for(char c : t.toCharArray()){
                int count = mapT.getOrDefault(c,0) + 1;
                mapT.put(c,count);
        }

        return mapS.equals(mapT);


    }
}
