public class Character{
    public static void main(String[] args) {
        char ch='A';
        for(int line=1;line<=4;line++){
            for(int num=1;num<=line;num++){
                System.out.print(ch);
               ch++;
            }
            System.out.println();
        }
    }
}