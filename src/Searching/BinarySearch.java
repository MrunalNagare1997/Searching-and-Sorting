package Searching;

public class BinarySearch {

    public BinarySearch() {
    }

    public void search(int key, int[] dataSet,int min,int max) {

        boolean flag=false;
        int count=0;
        long startTime=System.nanoTime();
        while (max>=min) {
            int mid= (min+max)/2;
            //System.out.println("min-"+min+" max-"+max);
            if(key==dataSet[mid])
            {
                System.out.println("Data found at index: "+mid);
                flag=true;
                break;
            }
            else if(key< dataSet[mid])
            {
                //System.out.println("Key less than mid");
                max=mid-1;
            }
            else if(key>dataSet[mid]) {
                //System.out.println("Key greater than mid");
                min = mid + 1;
            }

        }
        long endTime=System.nanoTime();
        //System.out.println("time required: "+(endTime-startTime));
        if(!flag) {
            System.out.println("Data not found...");
            return;
        }
    }
}
