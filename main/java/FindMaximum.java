public class FindMaximum {

    public static Integer findMaximumInteger(Integer firstValue, Integer secondValue, Integer thirdValue){
        Integer maxValue = firstValue;
        if(secondValue.compareTo(maxValue) > 0){
            maxValue = secondValue;
        }
        if(thirdValue.compareTo(maxValue) > 0){
            maxValue = thirdValue;
        }
        return maxValue;
    }

}
