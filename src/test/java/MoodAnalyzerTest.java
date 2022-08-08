import exception.MoodAnalysisException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenMessage_WhenSad_ShouldReturn_Sad(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        String mood;
        try {
            mood = moodAnalyzer.analyseMood();
            Assert.assertEquals("SAD",mood);

        } catch (MoodAnalysisException e){
        }
    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturn_Happy(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any Mood");
        String mood;
        try {
            mood = moodAnalyzer.analyseMood();
            Assert.assertEquals("HAPPY",mood);

        } catch (MoodAnalysisException e){
        }
    }

    @Test
    public void givenNullMood_ShouldReturn_Happy(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood;
        try {
            mood = moodAnalyzer.analyseMood();
            Assert.assertEquals("HAPPY",mood);
        } catch (MoodAnalysisException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenNullMood_ShouldThrow_Exception(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try {
            moodAnalyzer.analyseMood(null);
        } catch (MoodAnalysisException e){
            Assert.assertEquals(MoodAnalysisException.exceptionType.ENTERED_NULL, e.type);
        }
    }
}
