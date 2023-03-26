
public class CheckArraysEqual
{
    boolean isEqualArrays(int[] firstArray,int[] secondArray)
{
    if (firstArray.length != secondArray.length)
        return false;
    for (int index = 0; index < firstArray.length;index++)
        if (firstArray[index] != secondArray[index])
            return false;   
    return true;
}
}
