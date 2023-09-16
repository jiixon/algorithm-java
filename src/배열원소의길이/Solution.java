package 배열원소의길이;

public class Solution {
    public int[] solution(String[] strlist) {
        int x = strlist.length;
        int[] lenlist = new int[x];
        for (int i=0; i<x; i++){
            lenlist[i] = strlist[i].length();
        }
        return lenlist;
    }
}
