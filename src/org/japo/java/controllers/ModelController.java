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
package org.japo.java.controllers;

import java.util.Properties;
import org.japo.java.entities.Model;
import org.japo.java.view.View;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class ModelController {

    // Items > Modelo
    public void asignarItemsModelo(String[] items, Model model) throws Exception {

    }

    // Modelo > Items
    public void asignarModeloItems(Model model, String[] items) {

    }

    // Copiar Estado Modelo
    public void copiarModelo(Model modeloIni, Model modeloFin) {

    }

    // Propiedades > Modelo
    public void asignarPropiedadesModelo(Properties prp, Model model) {

    }

    // Modelo > Propiedades
    public void asignarModeloPropiedades(Model model, Properties prp) {

    }

    // Validar Controles Subjetivos
    public boolean comprobarValidez(View view) {
        // Validación Individual

        // Validación Conjunta
        return true;
    }

    // Estado Actual > Persistencia
    public void memorizarEstadoApp(Properties prpApp) {
        // Actualiza Propiedades Estado Actual

//        // Guardar Estado Actual
//        UtilesApp.guardarPropiedades(prpApp);
    }
}
