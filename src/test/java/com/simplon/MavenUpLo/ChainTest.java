package com.simplon.MavenUpLo;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ChainTest {

    @Test
    public void transform_with_unaccepted_characters(){
        //set
        Chain chain = new Chain();
        //test
        String result = chain.toAlternativeString("éè!'à)&");
        //asert
        assertEquals("Erreur",result);
    }

    @Test
    public void transform_Ok(){
        //set
        Chain chain = new Chain();
        //test
        String result = chain.toAlternativeString("AaBbCc");
        //assert
        assertEquals("aAbBcC", result);
    }
}
