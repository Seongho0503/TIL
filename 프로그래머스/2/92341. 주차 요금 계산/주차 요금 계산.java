import java.util.*;

class Solution {
  
    public int[] solution(int[] fees, String[] records) {
      int finish  = timeConvert("23:59");  
   
      HashMap<String, LinkedList<Integer>> map = new HashMap<>();
    
     // 파싱
        for(String record : records){
            String[] cars = record.split(" ");
            String name = cars[1];
             int timeSum = timeConvert(cars[0]); 

            if(map.containsKey(name)){
                map.get(name).add(timeSum);
            }else{
                map.put(name, new LinkedList<>());
                map.get(name).add(timeSum);
            }
        }
        
      
        
        // 비용 계산
        String[] carName = map.keySet().toArray(new String[map.size()]);
        Arrays.sort(carName);

        int[] priceSum = new int[carName.length];
      
            for(int i = 0; i < carName.length; i++){
            
            LinkedList<Integer> times = map.get(carName[i]); 
            int tSum = 0;
            while(times.size() > 0){
             
                if(times.size() > 1){
                   int t1 = times.pop();
                   int t2 = times.pop();
                    tSum += (t2 - t1);
                }else {
                   int t3 = times.pop();
                    tSum += (finish - t3);
                }
            }
            int carPrice = priceConvert(tSum, fees);
            priceSum[i] = carPrice; 
        }
        
        return priceSum;
        
    }
    
    static int timeConvert(String time){
        String[] times = time.split(":");
        int hour = Integer.parseInt(times[0]) * 60;
        int min =  Integer.parseInt(times[1]);
        return hour+min;    
    }
    
    static int priceConvert(int time, int[] fees){
        int basePrice = fees[1];
        if(time > fees[0]){
             int timeCheck = time - fees[0];
            if(timeCheck > 0 && timeCheck < 10) {
                timeCheck = 1;
            }else{
                timeCheck = (int)(Math.ceil((double)timeCheck/fees[2]));   
            }
            int surPrice = (timeCheck) * fees[3];  
              return basePrice + surPrice; 
        }else return basePrice;
    }
    
}