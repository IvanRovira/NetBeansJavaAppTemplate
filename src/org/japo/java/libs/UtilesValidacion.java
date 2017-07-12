/*
 * Copyright 2017 José A. Pacheco Ondoño - joanpaon@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.libs;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.swing.JTextField;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class UtilesValidacion {

    // Dato + ExpReg
    public static boolean validarDato(String dato, String expReg) {
        // Semáforo de validación
        boolean testOK;

        try {
            // Patrón de la expresión regular
            Pattern patron = Pattern.compile(expReg);

            // Detector del texto de prueba
            Matcher detector = patron.matcher(dato);

            // Coincidencia
            testOK = detector.matches();
        } catch (PatternSyntaxException pse) {
            // ExpReg errónea - Depurar
            testOK = false;
        }

        // Resultado de la validación
        return testOK;
    }

    // Campo de texto + FECHA + Texto campo vacío
    public static boolean validarCampoFecha(
        JTextField txfActual, String textoCampoVacio) {
        // Texto del campo - No espaciadores
        String textoActual = txfActual.getText().trim();

        // Campo vacio
        textoActual = textoActual.equals("") ? textoCampoVacio : textoActual;

        // Valida el Dato
        boolean validacionOK = UtilesFecha.validarFecha(textoActual);

        // Señala la validación
        if (validacionOK) {
            // Señalar Contenido Correcto
            txfActual.setForeground(Color.BLACK);
        } else {
            // Señalar Contenido Erróneo
            txfActual.setForeground(Color.RED);
        }

        // Resultado de la validación
        return validacionOK;
    }

    // Campo de texto + ExpReg + Texto campo vacío
    public static boolean validarCampoTexto(
        JTextField txfActual, String expReg, String textoCampoVacio) {
        // Texto del campo - No espaciadores
        String textoActual = txfActual.getText().trim();

        // Comprueba campo vacío
        textoActual = textoActual.equals("") ? textoCampoVacio : textoActual;

        // Restaura el texto formateado
        txfActual.setText(textoActual);

        // Valida el Dato
        boolean validacionOK = UtilesValidacion.validarDato(textoActual, expReg);

        // Señala la validación
        if (validacionOK) {
            // Señalar Contenido Correcto
            txfActual.setForeground(Color.BLACK);
        } else {
            // Señalar Contenido Erróneo
            txfActual.setForeground(Color.RED);
        }

        // Resultado de la validación
        return validacionOK;
    }
}
