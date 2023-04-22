public class averageWord {
    public static void  main(String[] args){
    
        String s = "Java is an object oriented programming language.";
        char []b = s.toCharArray();   //将字符串放到字节数组中
        int kgcount =  0;  //计数
        for(int i=0; b[i] == ' ';){ kgcount++;
    } 
    int slong = s.length();
    int dcount = kgcount + 1;
    int j = (slong - kgcount) / dcount;
    System.out.println(j);
}
}