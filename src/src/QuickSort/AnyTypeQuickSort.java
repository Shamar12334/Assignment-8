package QuickSort;

public class AnyTypeQuickSort <T extends Comparable<T>>
{
        public void quickSort(T[] A, int lowerBound, int upperBound)
        {
            if(lowerBound < upperBound)
            {
                int q = partition(A, lowerBound, upperBound);
                quickSort(A, lowerBound, q - 1);
                quickSort(A, q + 1, upperBound);
            }
        }
        public int randomizedPartition(T[] A, int lowerBound, int upperBound)
        {
            int i= lowerBound+(int)(Math.random()*(upperBound-lowerBound+1));
            T temp= A[i];
            A[i]=A[upperBound];
            A[upperBound]=temp;
            return partition(A,lowerBound,upperBound);
        }
        public void randomizedSort(T []A,int lowerBound, int upperBound)
        {
            if(lowerBound< upperBound)
            {
                int q = randomizedPartition(A, lowerBound, upperBound);
                randomizedSort(A, lowerBound, q - 1);
                randomizedSort(A, q + 1, upperBound);
            }
        }
        public int partition(T[] A, int lowerBound,int upperBound)
        {
            T x = A[upperBound];
            int i =lowerBound-1;
            for(int j=lowerBound; j< upperBound; j++)
            {
                if(A[j].compareTo(x) <=0)
                {
                    i++;
                    T  temp = A[i];
                    A[i]= A[j];
                    A[j]=temp;
                }
            }
            T temp=A[i+1];
            A[i+1]= A[upperBound];
            A[upperBound]=temp;
            return i+1;
        }

}

