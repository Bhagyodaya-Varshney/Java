class Stopwatch{
    public static void main(String[] args) {
        try{
            int hrs , min , sec;
            for(hrs=00;hrs<24;hrs++){
                for(min=00;min<60;min++){
                    for(sec=00;sec<60;sec++){
                    System.out.println(hrs+":"+min+":"+sec);
                    Thread.sleep(1000);
            
                    }
                }
                if((hrs+1)==24){
                    hrs=-1;
                    min=-1;
                    sec=-1;
                }
            }
        }
        catch(Exception e){
            System.out.println("Complete");
        }
    }
}
/*
 * Custom Exception
 */