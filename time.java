
    public class time {
        public static void main(String[] args) {
            long time = System.currentTimeMillis();
            System.out.println(time);
            long totalsec = time/1000;
            // System.out.println(totalsec);
            long sec = totalsec % 60;
            // System.out.println(sec);
            long totalmin = totalsec/60;
            // System.out.println(totalmin);
            long min = totalmin%60;
            // System.out.println(min);
            long totalhrs = totalmin / 60;
            // System.out.println(totalhrs);
            long hrs = totalhrs%24;
            // System.out.println(hrs);
            System.out.println("Current Time is:"+hrs+":"+min+":"+sec+" GMT");
    
        }
    }
    

