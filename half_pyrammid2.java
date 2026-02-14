public class half_pyrammid2 {
    public static void half_py(int totalRows){
        for(int i=0;i<totalRows;i++){
            for(int j=1;j<=(totalRows-i);j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        half_py(5);
    }
}
