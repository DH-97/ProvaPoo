
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public abstract class Teste {
    // Use reflection to get all methods from an implementing class
    private Method[] getMethods() {
        return this.getClass().getDeclaredMethods();
    }

    public String testar() {
        String result = "";
        for (Method m : getMethods()) {
            if (m.getName().equals("testar")) {
                continue;
            }
            if (Modifier.isPrivate(m.getModifiers())) {
                continue;
            }
            boolean passed = false;
            try {
                passed = (boolean) m.invoke(this);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
            String coloredResult = passed ?
                "\u001B[32m" + "Passou" + "\u001B[0m" :
                "\u001B[31m" + "Falhou" + "\u001B[0m";
            result += m.getName() + ": " + coloredResult + "\n";
        }
        return result;
    }
}
