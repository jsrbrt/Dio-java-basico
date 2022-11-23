import java.util.*;

public class ParentesesValido {
    public static void main(String[] args) {
        String entrada = new Scanner(System.in).nextLine();
        boolean caracter = ehValido(entrada);
        System.out.printf("A String '%s' é válida? "+ caracter, entrada);
    }
    public static boolean ehValido(String s) {
        //TODO: implemente a lógica de caracteres válidos e retorne se a string é valida ou não.
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
