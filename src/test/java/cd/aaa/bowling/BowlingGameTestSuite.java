package cd.aaa.bowling;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({FrameFactoryTest.class, FrameTest.class, GameTest.class, ProceduralBowlingGameTest.class, TenthFrameTest.class})
public class BowlingGameTestSuite {

}
