import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        HashMap<Character, Integer> X_Map = new HashMap<>();
        HashMap<Character, Integer> Y_Map = new HashMap<>();

        // X 문자열의 각 문자의 빈도를 계산하여 X_Map에 저장
        for (int i = 0; i < X.length(); i++) {
            X_Map.put(X.charAt(i), X_Map.getOrDefault(X.charAt(i), 0) + 1);
        }

        // Y 문자열의 각 문자의 빈도를 계산하여 Y_Map에 저장
        for (int i = 0; i < Y.length(); i++) {
            Y_Map.put(Y.charAt(i), Y_Map.getOrDefault(Y.charAt(i), 0) + 1);
        }

        // 0부터 9까지의 숫자에 해당하는 문자에 대해 반복
        for (int j = 0; j < 10; j++) {
            char x = (char) (j + '0');  // 숫자 j를 문자로 변환
            if (X_Map.containsKey(x) && Y_Map.containsKey(x)) {
                int count = Math.min(X_Map.get(x), Y_Map.get(x));
                String repeated = String.valueOf(x).repeat(count);
                if (answer.length() == 0 || answer.charAt(0) <= x)
                    answer.insert(0, repeated);
                else
                    answer.append(repeated);
            }
        }

        if (answer.length() == 0) {
            return "-1";
        }

        String result = answer.toString();
        if (result.matches("0+")) {
            return "0";
        }

        // 결과를 내림차순으로 정렬하여 반환
        char[] resultArr = result.toCharArray();
        Arrays.sort(resultArr);

        return new StringBuilder(new String(resultArr)).reverse().toString();
    }
}