/**
 * InnerClassObject
 */
class Methods {
    String animal;
    int value;

    void run() {
        System.out.println("executing run methods");
        System.out.println("animal : " + animal + ", value : " + value);

    }
}

public class ClassObject {
    public static void main(String[] args) {
        System.out.println("Class & Methods");
        Methods methods = new Methods();
        methods.animal = "Dog";
        methods.value = 104;
        methods.run();
    }
}
