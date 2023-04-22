public class sushuhe {
    public static void main(String[] args)
{
    int sum = 1;
    for(int i=2; i <= 10000; i++){
        int a = 0;
        for(int j = i - 1;j > 1 ; j--){
        if(i % j == 0)
        a = 1;
}
        if(a == 0)
        sum = sum + i;
}
        System.out.println(sum);
}}