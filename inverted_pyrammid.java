public class inverted_pyrammid {
    public static void invert_py(int totalRows){
        for(int i=1;i<=totalRows;i++){
            for(int j=1;j<=(totalRows-i);j++){
                System.out.print(" ");
                
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        invert_py(7);
    }
}
