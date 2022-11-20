package matrizes;

import java.util.*;

public class ClassificandoArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int N = scanner.nextInt();
        int[] nums = new int[N];
        for (i = 0; i < N; i++) nums[i] = scanner.nextInt();

        Set<Integer> numeros1 = new LinkedHashSet<>();
        for (i = nums.length-1; i >= 0; i--) numeros1.add(nums[i]);

        List<Integer> numeros2 = new ArrayList<>(numeros1);
        for (i = numeros2.size()-1; i >= 0 ; i--) {
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

        scanner.close();
    }
}