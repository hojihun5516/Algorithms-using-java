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
                //key���� �ߺ� ���� �����Ƿ� ������� 1 �����ؼ� �ٽ� �־��ش�
                map.put(name,value);
            }
        }
        for(String name : completion){
            int value = map.get(name)-1;
            map.put(name,value);
            }
        //map.keySet()�Լ��� map�� Ű���� ���� �������ش� 
        for(String name: map.keySet()){
            if(map.get(name)!=0){
                answer=name;
            }
        }
        return answer;
    }
}