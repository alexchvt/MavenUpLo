package com.simplon.MavenUpLo;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ChainTest {

    @Test
    public void transform_with_unaccepted_characters(){
        //set
        Chain chain = new Chain("éè!'à)&", "");
        //test
        String result = chain.transform();
        //asert
        assertEquals("Erreur",result);
    }

    @Test
    public void transform_Ok(){
        //set
        Chain chain = new Chain("AaBbCc", "");
        //test
        String result = chain.transform();
        //assert
        assertEquals("aAbBcC", result);
    }
}
