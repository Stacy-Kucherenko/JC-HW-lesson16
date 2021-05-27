package lviv.lgs.ua;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		Class present = Present.class;
		
		System.out.println("Class name: " + present.getName());
		System.out.println("Simple class name: " + present.getSimpleName());
		System.out.println("Modifier = " + Modifier.toString(present.getModifiers()));
		System.out.println("Package = " + present.getPackage());
		System.out.println("Super class = " + present.getSuperclass());
		System.out.println();
		
		System.out.println("Class " + present.getSimpleName() + " has the following fields: " );
		Field [] presentFields = present.getDeclaredFields();
		
		for (Field field : presentFields) {
		System.out.println("Field " + field);
		}
		
		System.out.println("The total number of all fields in the class " + present.getSimpleName() + " - " + presentFields.length);
		System.out.println();
		
		System.out.println("Class " + present.getSimpleName() + " has the following set of PUBLIC fields: ");
		Field[] presentPublicFields = present.getFields();
		for (Field field : presentPublicFields) {
		System.out.println("Field " + field);
		}
		
		System.out.println("The total number of PUBLIC fields in the class " + present.getSimpleName() + " - " + presentPublicFields.length);
		System.out.println();
		
		
		System.out.println("Class " + present.getSimpleName() + " has the following set of constructors: ");
		Constructor [] presentConstructors = present.getConstructors();
		for (Constructor constructor : presentConstructors) {
		System.out.println("Constructor = " + constructor);
		}
		System.out.println("The total number of constructors for class " + present.getSimpleName() + " - " + presentConstructors.length);
		System.out.println();
		
		System.out.println("Class " + present.getSimpleName() + " has the following set of methods: ");
		Method [] presentMethods = present.getMethods();
		for (Method method : presentMethods) {
		System.out.println("Method = " + method);
		}
		System.out.println("The total number of methods for class " + present.getSimpleName() + " - " + presentMethods.length);
		System.out.println();

		System.out.println("Let's buy a new product using reflection: ");
		Constructor <Present> constructor = present.getConstructor(String.class, double.class, double.class, double.class);
		Present newInstance = constructor.newInstance("Box", 25.5, 30.1, 25.8);
		System.out.println(newInstance);
		System.out.println();
		
		System.out.println("Let's change the name of the present using reflection:");
		Field fieldName = present.getField("name");
		fieldName.set(newInstance, "Gift box");
		System.out.println(newInstance);
		System.out.println();
		
		System.out.println("Let's display the name of the present on the console using reflection: ");
		Method presentMethod = present.getMethod("getName", null);
		System.out.println("Name of the selected present - " + presentMethod.invoke(newInstance, null));
		System.out.println();
		
		System.out.println("Find out the name of the store and the price of the gift using reflection: ");
		presentMethod = present.getMethod("boughtIn", String.class, int.class);
		presentMethod.invoke(newInstance, "ZARA", 50);
		System.out.println();
		
		System.out.println("Find out the name of person for whom the present was bought using reflaction: ");
		presentMethod = present.getMethod("presentForPerson", String.class); 
		presentMethod.invoke(newInstance, "Alexa Brown"); 
		
		
	}

}
