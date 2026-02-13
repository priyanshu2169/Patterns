public class hollow_rect {
    public static void hollow_rectF(int totalRows,int totalCols){
        for(int i=1;i<=totalRows;i++){
            for(int j=1;j<=totalCols;j++){
                if(i==1 || i==totalRows || j==1 || j==totalCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_rectF(8, 8);
    }
    
}
