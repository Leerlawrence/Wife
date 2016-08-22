import static org.junit.Assert.assertEquals;
import org.junit.*;

public class WifeTest {

  Wife wife;

  @Before
  public void before(){
  wife = new Wife("Alison",50, 45.0, 1.5);     
  //The above sets up 'Wife' with age, weight and height

}

  @Test 
  public void doesWifeHaveName(){
    assertEquals("Alison", wife.getWifesName());
  }

  @Test
  public void hasAge(){
    assertEquals(50, wife.getWifesAge());
  }

  @Test
  public void hasWeight(){
  assertEquals(45.0, wife.getWifesWeight(), 0.01);   //the last bit is a delta which allows you to get within a range
}

@Test
public void hasHeight(){
  assertEquals(1.5, wife.getWifesHeight(), 0.01);   //the last bit is a delta which allows you to get within a range
}

  @Test
  public void  readyToDiet(){
  assertEquals(false, wife.readyToDiet());
  }


}