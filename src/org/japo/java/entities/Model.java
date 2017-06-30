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
package org.japo.java.entities;

import java.io.Serializable;
import org.japo.java.lib.UtilesFecha;
import org.japo.java.lib.UtilesValidacion;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class Model implements Serializable {

    // Número de items
    public static final int NUM_ITEMS = 5;

    // Constantes de acceso
    public static final int POS_ITEM1 = 0;
    public static final int POS_ITEM2 = 1;
    public static final int POS_ITEM3 = 2;
    public static final int POS_ITEM4 = 3;
    public static final int POS_ITEM5 = 4;

    // Expresiones regulares
    public static final String ER_ITEM1 = "[0-9]{5}";           // 00000 - 99999
    public static final String ER_ITEM2 = "[01]\\d{2}";         // 000 - 199
    public static final String ER_ITEM3 = "[0-9]";              // 0 - 9
//    public static final String ER_ITEM4 // MUY COMPLEJA - PE: FECHA
    public static final String ER_ITEM5 = "0|[1-9][0-9]{0,2}";  // 0 - 999

    // Valores por defecto
    public static final String DEF_ITEM1 = "00000";
    public static final String DEF_ITEM2 = "000";
    public static final String DEF_ITEM3 = "0";
    public static final String DEF_ITEM4 = UtilesFecha.obtenerFechaHoy();
    public static final String DEF_ITEM5 = "0";

    // Campos de la entidad
    private String item1;
    private String item2;
    private String item3;
    private String item4;
    private String item5;

    // Constructor Predeterminado
    public Model() {
        item1 = DEF_ITEM1;
        item2 = DEF_ITEM2;
        item3 = DEF_ITEM3;
        item4 = DEF_ITEM4;
        item5 = DEF_ITEM5;
    }

    // Constructor Parametrizado
    public Model(String item1, String item2,
                 String item3, String item4,
                 String item5) {
        // Item 1
        if (UtilesValidacion.validarDato(item1, ER_ITEM1)) {
            this.item1 = item1;
        } else {
            this.item1 = DEF_ITEM1;
        }

        // Item 2
        if (UtilesValidacion.validarDato(item2, ER_ITEM2)) {
            this.item2 = item2;
        } else {
            this.item2 = DEF_ITEM2;
        }

        // Item 3
        if (UtilesValidacion.validarDato(item3, ER_ITEM3)) {
            this.item3 = item3;
        } else {
            this.item3 = DEF_ITEM3;
        }

        // Item 4 - Fecha
        if (UtilesFecha.validarFecha(item4)) {
            this.item4 = item4;
        } else {
            this.item4 = DEF_ITEM4;
        }

        // Item 5
        if (UtilesValidacion.validarDato(item5, ER_ITEM5)) {
            this.item5 = item5;
        } else {
            this.item5 = DEF_ITEM5;
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

    public String getItem2() {
        return item2;
    }

    public void setItem2(String item2) {
        if (UtilesValidacion.validarDato(item2, ER_ITEM2)) {
            this.item2 = item2;
        }
    }

    public String getItem3() {
        return item3;
    }

    public void setItem3(String item3) {
        if (UtilesValidacion.validarDato(item3, ER_ITEM3)) {
            this.item3 = item3;
        }
    }

    public String getItem4() {
        return item4;
    }

    public void setItem4(String item4) {
        if (UtilesFecha.validarFecha(item4)) {
            this.item4 = item4;
        }
    }

    public String getItem5() {
        return item5;
    }

    public void setItem5(String item5) {
        if (UtilesValidacion.validarDato(item5, ER_ITEM5)) {
            this.item5 = item5;
        }
    }

    // --- FIN SETTERS / GETTERS
}
