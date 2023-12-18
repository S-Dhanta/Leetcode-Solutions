class Solution {
    public int countTime(String time) {
        String[] help = time.split(":");
        int res = 1;
        String hour = help[0];
        String m = help[1];
        int hourChoices = getHour(hour);
        int timeChoices = getTime(m);
        res = res * hourChoices * timeChoices;
        return res;
    }
    public int getHour(String h) {
        if (h.charAt(0) == '?') {
            if (h.charAt(1) == '?') {
                return 24; 
            } else if (h.charAt(1) > '3'){
                return 2;
            } else {
                return 3;
            }
        } else {
            if (h.charAt(1) != '?') {
                return 1;
            } else if (h.charAt(0) == '2') {
                return 4;
            } else {
                return 10;
            }
        }
    }
    public int getTime(String t) {
        int res = 1;
        if (t.charAt(0) == '?') {
            res *= 6;
        } 
        if (t.charAt(1) == '?') {
            res *= 10;
        }
        return res;
    }
}