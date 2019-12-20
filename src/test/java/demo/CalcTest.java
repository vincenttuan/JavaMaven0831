/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author MB-Teacher
 */
public class CalcTest {
    
    public CalcTest() {
    }

    @Test
    public void testAdd() {
        // 1A
        Calc calc = new Calc();
        int n1 = 2;
        int n2 = 4;
        int exp = 6;
        // 2A
        int act = calc.add(n1, n2);
        // 3A
        assertThat(act).isEqualTo(exp);
    }
    
    
    
}
