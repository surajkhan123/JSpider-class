class Pattern9 {
  public static void main(String[] args){
    int rows =5;
    int cols=5;
    for(int i=1;i<=rows;i++)
      {
      for(int j=1;j<=cols;j++){
        if(i==1|| i==3|| i==5|| (i==2 && j==1)||(i==4 && j==cols))
        // if(i==1|| i==cols|| j==1|| i==rows/2+1 && j>rows/2 || j==cols && i>rows/2 )
        {
          System.out.print("* ");
        }
        else{
          System.out.print("  ");
        }

      }
      System.out.println();
    }
  }
}