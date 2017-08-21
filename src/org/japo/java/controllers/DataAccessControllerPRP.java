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
import org.japo.java.interfaces.IDataAccessController;
import org.japo.java.models.Model;
import org.japo.java.libraries.UtilesApp;
import org.japo.java.libraries.UtilesValidacion;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class DataAccessControllerPRP implements IDataAccessController {
    // Nombres Propiedades
//    public static final String PRP_ITEM1 = "nombre.subnombre";
    
    // Fichero Propiedades > Modelo
    @Override
    public void importarModelo(Model model, String fichero) throws Exception {
        // Fichero Propiedades > Propiedades
        Properties prp = UtilesApp.cargarPropiedades(fichero);

        // Propiedades > Modelo
        convertirPropiedadesModelo(prp, model);
    }

    // Modelo > Fichero Propiedades
    @Override
    public void exportarModelo(Model model, String fichero) throws Exception {
        // Propiedades
        Properties prp = new Properties();

        // Modelo > Propiedades
        convertirModeloPropiedades(model, prp);

        // Propiedades > Fichero Propiedades
        UtilesApp.guardarPropiedades(prp, fichero);
    }

    // Modelo > Propiedades
    void convertirModeloPropiedades(Model model, Properties prp) {

    }

    // Propiedades > Modelo
    void convertirPropiedadesModelo(Properties prp, Model model) throws Exception {
        /*
        1 - Sustituir Item1 por el primer campo del modelo
        2 - Repetir estructura para el resto de items
        */
        // Item1
//        if (UtilesValidacion.validarDato(prp.getProperty(PRP_ITEM1), Model.ER_ITEM1)) {
//            model.setItem1(model.getItem1());
//        } else {
//            throw new Exception("Datos corruptos");
//        }
    }
}
