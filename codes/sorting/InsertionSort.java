//insertion sort
class InsertionSort
{
  static void insert(int a[],int start)
  {
       // Your code here
       int value=a[start];
       int pointer=start;
       while(pointer>0){
            if(a[pointer-1]>value){
                a[pointer]=a[pointer-1];
                pointer--;
            }
            else break;
        }
        a[pointer]=value;
  }
}