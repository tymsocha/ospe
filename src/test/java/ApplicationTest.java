import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    Application application = new Application();
    int[] oldTab = {1,2,3,4,5,6,7,8,9};
    int[] newTab;

    @Test
    void newTabSmallerThanOldTab() {
        // Given
        int newTabLength = 6;

        // When
        newTab = application.newTab(oldTab, newTabLength);

        // Thenn
        assertArrayEquals(new int[]{1,2,3,4,5,6}, newTab);
    }

    @Test
    void newTabEqualsOldTab() {
        // Given
        int newTabLength = 9;

        // When
        newTab = application.newTab(oldTab, newTabLength);

        // Thenn
        assertArrayEquals(oldTab, newTab);
    }

    @Test
    void newTabBiggerThanOldTab() {
        // Given
        int newTabLength = 11;

        // When
        newTab = application.newTab(oldTab, newTabLength);

        // Thenn
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,0,0}, newTab);
    }
}
