import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

    public static void main(String[] args) {

//        BeanFactory bf = new XmlBeanFactory(new FileSystemResource("src/xml/spring.xml"));
//        Triangle t= (Triangle) bf.getBean("triangle");
//        t.Draw();
//
//        ApplicationContext ap = new FileSystemXmlApplicationContext("src/xml/spring.xml");
//        Triangle t2 = (Triangle) ap.getBean("triangle");
//        t2.Draw();
//
//        Triangle eq = (Triangle) ap.getBean("equilateral_triangle");
//        eq.Draw();
//
//        Triangle cit = (Triangle) ap.getBean("constructor_injected_triangle");
//        cit.Draw();

        ApplicationContext ap1 = new FileSystemXmlApplicationContext("src/xml/spring.xml");
        Square s1 = (Square) ap1.getBean("square");
        System.out.println(s1);

        Square s2 = (Square) ap1.getBean("childsquare");
        System.out.println(s2);

        Line l1 = (Line) ap1.getBean("line");
        l1.showLine();
    }
}
