import faculty.FacultyEJB;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;
import java.util.List;

@RunWith(Arquillian.class)
@RunAsClient
public class TS {
    @Deployment
    public static JavaArchive createDeployment()
    {
        JavaArchive jar = ShrinkWrap.create(JavaArchive.class).addClass(FacultyEJB.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
        System.out.println(jar.toString(true));
        return jar;
    }
    @Inject
    private FacultyEJB facultyEJB;

    @Test
    public void testFaculty(){
        List list = facultyEJB.findAllFaculty();
        System.out.println(list.toString());
    }
}
