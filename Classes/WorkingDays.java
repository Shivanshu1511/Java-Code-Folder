public class WorkingDays{
    enum Days {
        Sunday,
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday
        }
        public static void main(String[] args ){
            for(Days d : Days.values()){
                weekend(d);
            }
        }
        private static void weekend (Days d){
            
            if(d==Days.Sunday){
            System.out.println("value ="+d+"  is a holiday");
                
            }else{
                System.out.println("value ="+d+" is working day");
            }
        }
}