package problem2;

public class IntegerList
{
    private int currentSize;
    private int numberOfElements =0;


    int[] list; //values in the list
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        currentSize = size;
        numberOfElements = size;
        list = new int[size];
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    public void increaseSize(){
        int[] newarr = new int[currentSize*2];
        for (int i=0;i<numberOfElements;i++) newarr[i] = list[i];
        list = newarr;

    }

    public void addElement(int newVal) {
        if (numberOfElements >= currentSize) increaseSize();
        list[numberOfElements] = newVal;
        numberOfElements+=1;
    }


    void removeFirst(int newVal) {
        int firstOcc =-1;
        for (int i=0;i<numberOfElements;i++) {
            if (list[i] == newVal){
                firstOcc=i;
                break;
            }
        }

        if (firstOcc<0) return;
        else {
            for (int i=firstOcc;i<numberOfElements-1;i++) list[i] = list[i+1];
            list[numberOfElements-1] = 0;
            numberOfElements--;

        }
    }

 /*   void removeAll(int newVal){
        int numofOcc =0;
        for (int i=0;i<numberOfElements;i++) {
            if (list[i] == newVal){
                numofOcc+=1;
                break;
            }
        }

        for (int i=0;i<numofOcc;i++) this.removeFirst(newVal);




    }*/



}