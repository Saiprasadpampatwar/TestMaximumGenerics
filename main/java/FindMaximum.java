import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FindMaximum <T extends Comparable<T>>{

    T firstValue;
    T secondValue;
    T thirdValue;

    public FindMaximum(T firstValue, T secondValue, T thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

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

    public static Float findMaximumFloat(Float firstValue, Float secondValue, Float thirdValue){
        Float maxValue = firstValue;
        if(secondValue.compareTo(maxValue) > 0){
            maxValue = secondValue;
        }
        if(thirdValue.compareTo(maxValue) > 0){
            maxValue = thirdValue;
        }
        return maxValue;
    }

    public static String findMaximumString(String firstValue, String secondValue, String thirdValue){
        String maxValue = firstValue;
        if(secondValue.compareTo(maxValue) > 0){
            maxValue = secondValue;
        }
        if(thirdValue.compareTo(maxValue) > 0){
            maxValue = thirdValue;
        }
        return maxValue;
    }

    public static <T extends Comparable<T>> T maximumOfObject(T first, T second, T third) {
        T maximumValue = first;
        if (second.compareTo(maximumValue) > 0)
            maximumValue = second;
        if (third.compareTo(maximumValue) > 0)
            maximumValue = third;
        return maximumValue;
    }

    public T findMaxValueAtAnyPosition() {
        return FindMaximum.maximumOfObject(firstValue, secondValue, thirdValue);
    }

    public static <T extends Comparable<T>> T maximumOfObjects(T... values) {
       List<T> list = Arrays.asList(values);
        Collections.sort(list);
        T maxValue = list.get(list.size()-1);
        return maxValue;
    }

    }
