class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        Map<Character,Integer> countS = new HashMap<>();
        Map<Character,Integer> countT = new HashMap<>();


        for(int i = 0; i < s.length(); i++){

            if(countS.containsKey(s.charAt(i))){
                int count = countS.get(s.charAt(i));
                countS.put(s.charAt(i),count + 1);
            }else{
                countS.put(s.charAt(i),1);
            }

            if(countT.containsKey(t.charAt(i))){
                int count = countT.get(t.charAt(i));
                countT.put(t.charAt(i),count + 1);
            }else{
                countT.put(t.charAt(i),1);
            }

        }


        return countS.equals(countT);
    }
}
