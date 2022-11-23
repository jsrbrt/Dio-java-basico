import java.util.Scanner;

public class ParentesesValido {
    public static void main(String[] args) {
        System.out.println(ehValido(new Scanner(System.in).nextLine()));
    }
    public static boolean ehValido(String s) {
        //TODO: implemente a lógica de caracteres válidos e retorne se a string é valida ou não.

        //daria para fazer mais simples, mas desse jeito ele checa a ordem para definir se é valido
        boolean parenteses = s.contains("(") && s.contains(")");
        boolean colchetes = s.contains("[") && s.contains("]");
        boolean chaves = s.contains("{") && s.contains("}");
        char[] chars = s.toCharArray();

        if (parenteses) {
            for (char c : chars) {
                if (c == ')') return false;
                else if (c == '(') return true;
            }
        } else if (colchetes) {
            for (char c : chars) {
                if (c == ']') return false;
                else if (c == '[') return true;
            }
        } else if (chaves) {
            for (char c : chars) {
                if (c == '}') return false;
                else if (c == '{') return true;
            }
        } else return s.isBlank();
        return false;
    }
}
