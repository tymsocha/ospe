import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    Application application = new Application();
    int[] tab = {1,2,3,3,5,5,7,8,9};

    @Test
    void sumOfUniqueNumbers() {
        // Given
        int[] tab = {1,2,3,4,4,5,5,7,8,9};
        int[] tab2 = {1,1,1,4,4,5,5,7,8,9,9};
        int[] tab3 = {1,2};
        int[] tab4 = {1,2,2,4};
        int[] tab5 = {15,25,35,45};
        int[] tab6 = {1,29,45,45,55,56,56,55,45};

        // When
        int suma = application.suma_elem_unikalnych(tab);
        int suma2 = application.suma_elem_unikalnych(tab2);
        int suma3 = application.suma_elem_unikalnych(tab3);
        int suma4 = application.suma_elem_unikalnych(tab4);
        int suma5 = application.suma_elem_unikalnych(tab5);
        int suma6 = application.suma_elem_unikalnych(tab6);

        // Then
        assertEquals(suma, 30);
        assertEquals(suma2, 15);
        assertEquals(suma3, 3);
        assertEquals(suma4, 5);
        assertEquals(suma5, 120);
        assertEquals(suma6, 30);
    }

    @Test
    void checkIfSumEqualsZeroIfTabIsEmpty() {
        // Given
        int[] tab = {};

        // When
        int suma = application.suma_elem_unikalnych(tab);

        // Then
        assertEquals(suma, 0);
    }

}
