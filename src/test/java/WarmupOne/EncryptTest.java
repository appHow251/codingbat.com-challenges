package WarmupOne;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {

        private Encrypt encrypt;

        @Before
        public void setUp(){
        encrypt = new Encrypt();
    }



        @Test
        public void testEncryptWithTheFirstAlphabet(){
        //Given
        String word = "apple";
        String expected = "dssoh";

        //When
        String actual = Encrypt.encrypt(word);

        //Then
        assertEquals(expected, actual);
    }

        @Test
        public void testEncryptWithTheLastLetters() {
        //Given
        String word = "wxyz";
        String expected = "zabc";

        //When
        String actual = Encrypt.encrypt(word);

        //Then
        assertEquals(expected, actual);
    }
    }


