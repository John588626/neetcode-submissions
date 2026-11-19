class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chars = s.toCharArray();
        char[] cha = t.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(cha);

        String newChars = new String(chars);
        String newCha = new String(cha);


        return newChars.equals(newCha);
    }
}