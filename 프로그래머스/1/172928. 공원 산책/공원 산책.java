import java.util.HashMap;

class Solution {
    public boolean isOut(int x, int y, String[][] newPark) {
        if(x < 0 || y < 0 || x >= newPark.length || y >= newPark[0].length) {
            return false;
        }
        return true;
    }
    
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        String[][] newPark = new String[park.length][park[0].length()];
        int x=-1, y=-1;
        
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('E',0);
        map.put('W',2);
        map.put('S',1);
        map.put('N',3);
        
        // E: y+, W: y-, S: x-, N: x+
        for(int i=0; i<park.length; i++) {
            newPark[i] = park[i].split("");
            for(int j=0; j<newPark[i].length; j++) {
                if(newPark[i][j].equals("S")) {
                    x = i;
                    y = j;
                }
            }
        }
        
        for(int i=0; i<routes.length; i++) {
            char a = routes[i].charAt(0);
            int b = Character.getNumericValue(routes[i].charAt(2));
            int ddx = x, ddy = y;
            boolean isCorr = true;
            int go = map.get(a);
            
            
            for(int j=0; j<b; j++) {
                if(isOut(ddx+dx[go], ddy+dy[go], newPark) && !newPark[ddx+dx[go]][ddy+dy[go]].equals("X")){
                    ddx +=dx[go];
                    ddy +=dy[go];
                } else {
                    isCorr = false;
                    break;
                }
            }
            if(isCorr) {
                x = ddx;
                y = ddy;
            }
        }
        
        answer = new int[]{x, y};
        
        return answer;
    }
}