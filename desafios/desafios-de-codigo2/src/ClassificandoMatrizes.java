import java.util.*;

public class ClassificandoArrays {

    public static void main(String[] args) {
        classificarArray();
    }
    public static void classificarArray(){
        List<Integer> numeros2 = new ArrayList<>(lerArray());
        for (int i = numeros2.size()-1; i >= 0 ; i--) {
            if (numeros2.get(i) %2 != 0){
                for (int j = i;j >= 0; j--) {
                    if (numeros2.get(j) %2 == 0) {
                        int impar = numeros2.get(i);
                        int par = numeros2.get(j);
                        numeros2.set(i, par);
                        numeros2.set(j, impar);
                        break;
                    }
                }
            }
        }
        for (int j = numeros2.size()-1; j >= 0 ; j--) System.out.println(numeros2.get(j));
    }
    public static Set<Integer> lerArray(){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) nums[i] = scanner.nextInt();
        Set<Integer> numeros1 = new LinkedHashSet<>();
        for (int i = nums.length-1; i >= 0; i--) numeros1.add(nums[i]);
        return numeros1;
    }
}