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
package org.japo.java.models;

import java.io.Serializable;
import org.japo.java.libraries.UtilesValidacion;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class Model implements Serializable {

    // Número de items
    public static final int NUM_ITEMS = 1;

    // Constantes de acceso
    public static final int POS_ITEM1 = 0;

    // Expresiones regulares
    public static final String ER_ITEM1 = "\\d{5}";

    // Valores por defecto
    public static final String DEF_ITEM1 = "00000";

    // Campos de la entidad
    private String item1;

    // Constructor Predeterminado
    public Model() {
        item1 = DEF_ITEM1;
    }

    // Constructor Parametrizado
    public Model(String item1) {
        // Item 1
        if (UtilesValidacion.validarDato(item1, ER_ITEM1)) {
            this.item1 = item1;
        } else {
            this.item1 = DEF_ITEM1;
        }
    }

    // --- INICIO SETTERS / GETTERS
    //
    public String getItem1() {
        return item1;
    }

    public void setItem1(String item1) {
        if (UtilesValidacion.validarDato(item1, ER_ITEM1)) {
            this.item1 = item1;
        }
    }

    // --- FIN SETTERS / GETTERS
}
