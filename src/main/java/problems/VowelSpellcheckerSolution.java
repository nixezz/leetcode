package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class VowelSpellcheckerSolution {
    private boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    private String hashFunc(String w){
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < w.length(); ++i){
            char ch = w.charAt(i);
            if(isVowel(Character.toLowerCase(ch))) s.append(i + 1);
        }

        return s.toString();
    }

    private String canSensitive(String s, List<String> list){
        for (int i = 0 ; i < list.size(); ++i){
            String st = list.get(i);
            if(s.equalsIgnoreCase(st))
                return st;
        }
        return "";
    }

    private boolean canFind(String s, String st){
        StringBuilder sb = new StringBuilder();
        if(s.length() != st.length()){
            return false;
        }
        for(int i = 0; i < st.length(); ++i){
            char ch = s.charAt(i);
            boolean found = true;
            if(isVowel(Character.toLowerCase(ch))){
                char ch1 = st.charAt(i);
                found = false;
                sb.append(ch1);
            }
            if(found){
                sb.append(ch);
            }
        }

        String k = sb.toString();
        return k.equalsIgnoreCase(st);
    }

    private String canMatch(String s, List<String> list){
        for (String string : list) {
            if (canFind(s, string))
                return string;
        }
        return "";
    }

    public String[] spellchecker(String[] wordlist, String[] queries) {
        HashMap<String, List<String>> map = new HashMap<>();
        LinkedHashSet<String> set = new LinkedHashSet<>();

        for (int i = 0; i < wordlist.length; i++) {
            String s = wordlist[i];
            String hf = hashFunc(s);
            set.add(s);
            if(map.containsKey(hf)){
                List<String> list = map.get(hf);
                list.add(s);
                map.put(hf, list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(hf, list);
            }
        }

        String[] answer = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String s = queries[i];
            String hf = hashFunc(s);
            if(set.contains(s)){
                answer[i] = s;
            } else if(!map.containsKey(hf)){
                answer[i] = "";
            } else {
                String st = canSensitive(s, map.get(hf));
                if(st.equals("")){
                    answer[i] = canMatch(s, map.get(hf));
                } else {
                    answer[i] = st;
                }
            }
        }

        return answer;
    }
}
