class Solution {
    public boolean isAnagram(String s, String t) {

        var sa = s.toCharArray();
        Arrays.sort(sa);
        var ta = t.toCharArray();
        Arrays.sort(ta);

        if(new String(sa).equals(new String(ta))){
            return true;
        }

        return false;



    }
}
