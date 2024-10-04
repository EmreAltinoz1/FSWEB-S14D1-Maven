import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.pool.Rectangle;
import com.workintech.pool.Cuboid;
import com.workintech.developers.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;

@ExtendWith(ResultAnalyzer.class)
public class MainTest {
    private Circle circle;
    private Cylinder cylinder;
    private Rectangle rectangle;
    private Cuboid cuboid;
    private Employee employee;
    private HRManager hrManager;
    private JuniorDeveloper juniorDeveloper;
    private MidDeveloper midDeveloper;
    private SeniorDeveloper seniorDeveloper;

    @BeforeEach
    void setUp() {
        circle = new Circle(3.75);
        cylinder = new Cylinder(5.55, 7.25);
        rectangle = new Rectangle(5, 10);
        cuboid = new Cuboid(5, 10, 5);
        employee = new Employee(1, "Jane Doe", 20000);
        hrManager = new HRManager(1, "John Doe", 120000);
        juniorDeveloper = new JuniorDeveloper(1, "Junior Doe", 45000);
        midDeveloper = new MidDeveloper(1, "Mid Doe", 60000);
        seniorDeveloper = new SeniorDeveloper(1, "Senior Doe", 100000);
    }

    @DisplayName("Circle sınıf değişkenleri doğru access modifier a sahip mi ?")
    @Test
    public void testCircleAccessModifiers() throws NoSuchFieldException {
        Field radiusField = circle.getClass().getDeclaredField("radius");
        assertEquals(radiusField.getModifiers(), 2);
    }

    @DisplayName("Circle sınıf değişkenleri doğru type a sahip mi ?")
    @Test
    public void testCircleTypes() throws NoSuchFieldException {
        assertThat(circle.getRadius(), instanceOf(Number.class));
    }

    @DisplayName("getArea methodu Circle sınıfında doğru çalışıyor mu?")
    @Test
    public void testGetArea() throws NoSuchFieldException {
        assertEquals(3.75, circle.getRadius(), 0.0001);
        assertEquals(44.178646691106465, circle.getArea(), 0.0001);
    }

    @DisplayName("Cylinder sınıf değişkenleri doğru access modifier a sahip mi ?")
    @Test
    public void testCylinderAccessModifiers() throws NoSuchFieldException {
        Field heightField = cylinder.getClass().getDeclaredField("height");
        assertEquals(heightField.getModifiers(), 2);
    }

    @DisplayName("Cylinder sınıf değişkenleri doğru type a sahip mi ?")
    @Test
    public void testCylinderTypes() throws NoSuchFieldException {
        assertThat(cylinder, instanceOf(Circle.class));
        assertThat(cylinder.getHeight(), instanceOf(Number.class));
    }

    @DisplayName("getVolume methodu doğru çalışıyor mu?")
    @Test
    public void testGetVolume() throws NoSuchFieldException {
        assertEquals(5.55, cylinder.getRadius(), 0.0001);
        assertEquals(7.25, cylinder.getHeight(), 0.0001);
        assertEquals(96.76890771219959, cylinder.getArea(), 0.0001);
        assertEquals(701.574580913447, cylinder.getVolume(), 0.0001);
    }

    @DisplayName("Rectangle sınıf değişkenleri doğru access modifier a sahip mi ?")
    @Test
    public void testRectangleAccessModifiers() throws NoSuchFieldException {
        Field widthField = rectangle.getClass().getDeclaredField("width");
        assertEquals(widthField.getModifiers(), 2);
        Field lengthField = rectangle.getClass().getDeclaredField("length");
        assertEquals(lengthField.getModifiers(), 2);
    }

    @DisplayName("Rectangle sınıf değişkenleri doğru type a sahip mi ?")
    @Test
    public void testRectangleTypes() throws NoSuchFieldException {
        assertThat(rectangle.getWidth(), instanceOf(Number.class));
        assertThat(rectangle.getLength(), instanceOf(Number.class));
    }

    @DisplayName("Rectangle metodları doğru çalışıyor mu?")
    @Test
    public void testRectangleMethods() throws NoSuchFieldException {
        assertEquals(5.0, rectangle.getWidth(), 0.0001);
        assertEquals(10.0, rectangle.getLength(), 0.0001);
        assertEquals(50.0, rectangle.getArea(), 0.0001);
    }

    @DisplayName("Cuboid sınıf değişkenleri doğru access modifier a sahip mi ?")
    @Test
    public void testCuboidAccessModifiers() throws NoSuchFieldException {
        Field heightField = cuboid.getClass().getDeclaredField("height");
        assertEquals(heightField.getModifiers(), 2);
    }

    @DisplayName("Cuboid sınıf değişkenleri doğru type a sahip mi ?")
    @Test
    public void testCuboidTypes() throws NoSuchFieldException {
        assertThat(cuboid, instanceOf(Rectangle.class));
        assertThat(cuboid.getHeight(), instanceOf(Number.class));
    }

    @DisplayName("Cuboid metodları doğru çalışıyor mu?")
    @Test
    public void testCuboidMethods() throws NoSuchFieldException {
        assertEquals(5.0, cuboid.getWidth(), 0.0001);
        assertEquals(10.0, cuboid.getLength(), 0.0001);
        assertEquals(50.0, cuboid.getArea(), 0.0001);
        assertEquals(5.0, cuboid.getHeight(), 0.0001);
        assertEquals(250.0, cuboid.getVolume(), 0.0001);
    }

    @DisplayName("Employee sınıf değişkenleri doğru access modifier a sahip mi ?")
    @Test
    public void testEmployeeAccessModifiers() throws NoSuchFieldException {
        Field idField = employee.getClass().getDeclaredField("id");
        assertEquals(idField.getModifiers(), 2);
        Field nameField = employee.getClass().getDeclaredField("name");
        assertEquals(nameField.getModifiers(), 2);
        Field salaryField = employee.getClass().getDeclaredField("salary");
        assertEquals(salaryField.getModifiers(), 2);
    }

    @DisplayName("Employee sınıf değişkenleri doğru type a sahip mi ?")
    @Test
    public void testEmployeeTypes() throws NoSuchFieldException {
        assertThat(employee.getId(), instanceOf(Number.class));
        assertThat(employee.getName(), instanceOf(String.class));
        assertThat(employee.getSalary(), instanceOf(Number.class));
    }

    @DisplayName("Employee sınıfından doğru türeyen sınıflar var mı ?")
    @Test
    public void testEmployeeSubClasses() throws NoSuchFieldException {
        assertThat(hrManager, instanceOf(Employee.class));
        assertThat(juniorDeveloper, instanceOf(Employee.class));
        assertThat(midDeveloper, instanceOf(Employee.class));
        assertThat(seniorDeveloper, instanceOf(Employee.class));
    }

    @DisplayName("HRManager addEmployee metodları doğru çalışıyor mu?")
    @Test
    public void testHRManagerAddEmployee() {
        // Test adding developers
        hrManager.addEmployee(juniorDeveloper);
        hrManager.addEmployee(midDeveloper);
        hrManager.addEmployee(seniorDeveloper);

        // Test work method updates salary
        double initialSalary = juniorDeveloper.getSalary();
        juniorDeveloper.work();
        assertTrue(juniorDeveloper.getSalary() > initialSalary);

        initialSalary = midDeveloper.getSalary();
        midDeveloper.work();
        assertTrue(midDeveloper.getSalary() > initialSalary);

        initialSalary = seniorDeveloper.getSalary();
        seniorDeveloper.work();
        assertTrue(seniorDeveloper.getSalary() > initialSalary);

        initialSalary = hrManager.getSalary();
        hrManager.work();
        assertTrue(hrManager.getSalary() > initialSalary);
    }
}
