import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer="";
        Map<String,Integer> map = new HashMap();
        
        for(String name : participant){
            if(map.get(name)==null){
                map.put(name,1);
            }else{
                int value = map.get(name)+1;
                //key값은 중복 되지 않으므로 밸류값만 1 증가해서 다시 넣어준다
                map.put(name,value);
            }
        }
        for(String name : completion){
            int value = map.get(name)-1;
            map.put(name,value);
            }
        //map.keySet()함수는 map의 키값을 전부 가져와준다 
        for(String name: map.keySet()){
            if(map.get(name)!=0){
                answer=name;
            }
        }
        return answer;
    }
}