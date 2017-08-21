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
package org.japo.java.libraries;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class UtilesDNI {

    // Limites número DNI
    public final static int DNI_MIN = 10000000;
    public final static int DNI_MAX = 99999999;

    // Secuencia letras DNI
    public static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";

    // Calcula letra a partir del número de DNI
    public static char calcularLetraDNI(int dni) {
        return LETRAS.charAt(dni % LETRAS.length());
    }

    // Extraer número del DNI
    public static int extraerNumeroDNI(String dni) {
        // Almacen del DNI extraido
        int numeroDNI;

        // DNI en formato NNNNNNNNL o NNNNNNNN-L
        try {
            // Convierte el texto a entero
            numeroDNI = Integer.parseInt(dni.substring(0, 8));

            // Valida el DNI
            if (validarRangoDNI(numeroDNI) == false) {
                throw new Exception("DNI erróneo");
            }
        } catch (Exception e) {
            // Número para DNI erróneo
            numeroDNI = -1;
        }

        // Devuelve el DNI obtenido
        return numeroDNI;
    }

    // Extraer letra del DNI
    public static char extraerLetraDNI(String dni) {
        // Posición guión
        int posGuion = dni.indexOf('-');

        // Letra del DNI
        char letra;

        // DNI en formato NNNNNNNNL o NNNNNNNN-L
        if (posGuion > -1) {            // Formato NNNNNNNN-L
            letra = dni.charAt(posGuion + 1);
        } else if (dni.length() > 0) {  // Formato NNNNNNNNL
            letra = dni.charAt(dni.length() - 1);
        } else {                        // Formato INCORRECTO
            letra = '?';
        }

        // Convierte la letra a mayúscula
        letra = Character.toUpperCase(letra);

        // Comprueba si la letra está en la lista
        if (LETRAS.indexOf(letra) == -1) {
            // Letra desconocida > INCORRECTO
            letra = '?';
        }

        // Devuelve la letra extraida
        return letra;
    }

    // Número de DNI entre mínimo y máximo
    public static boolean validarRangoDNI(int numero) {
        return numero >= DNI_MIN && numero <= DNI_MAX;
    }

    // Valida DNI - Formato texto
    public static boolean validarDNI(String dni) {
        // Extraer DNI
        int numero = extraerNumeroDNI(dni);

        // Extraer LETRA
        char letra = extraerLetraDNI(dni);

        // Resultado del análisis
        return validarDNI(numero, letra);
    }

    // Valida DNI - Formato número + letra
    public static boolean validarDNI(int numero, char letra) {
        // Semáforo de validación
        boolean dniOK;

        // Análisis DNI
        if (!validarRangoDNI(numero)) {
            // DNI NO válido
            dniOK = false;
        } else {
            // Análisis LETRA
            dniOK = calcularLetraDNI(numero) == letra;
        }

        // Resultado del análisis
        return dniOK;
    }
}
