/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package CCuentaTest;

import ETS2.CCuenta;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ignacio Tolosa
 */
public class CCuentaTest {
    
    public CCuentaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   
 @Test
    public void ingresar() {
        CCuenta cuenta = new CCuenta();

        // Check que retorna código correcto al intentar ingresar valor negativo/positivo
        assertEquals(cuenta.ingresar(-1.0), 1);
//        assertEquals(cuenta.ingresar(-3.0), 2);
        assertEquals(cuenta.ingresar(1.0), 0);
    }

 @Test   
    public void retirar() {
        CCuenta cuenta = new CCuenta();

        // Check dSaldo es modificado correctamente ante valor negativo/cero/positivo
        // cuando hay y no hay saldo
        cuenta.dSaldo = 1;
        cuenta.retirar(-1);
        assertEquals(cuenta.dSaldo, 1);
        cuenta.retirar(0);
        assertEquals(cuenta.dSaldo, 1);
        cuenta.retirar(1);
        assertEquals(cuenta.dSaldo, 0);
        cuenta.retirar(1);
        assertEquals(cuenta.dSaldo, 0);
    }
}
