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

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class DataAccessControllerPRP implements IDataAccessController {
    // Referencias
    private final Controller control;

    public DataAccessControllerPRP(Controller control) {
        this.control = control;
    }

    // Modelo > Fichero [Propiedades de Java]
    @Override
    public void exportarModelo(Model model, String fichero) throws Exception {
        // Propiedades
        Properties prp = new Properties();
        
        // Modelo > Propiedades
        control.convertirModeloPropiedades(model, prp);

        // Guarda las propiedades
        UtilesApp.guardarPropiedades(prp, fichero);
    }

    // Fichero [Propiedades de Java] > Modelo
    @Override
    public void importarModelo(Model model, String fichero) throws Exception {
        // Carga Propiedades
        Properties prp = UtilesApp.cargarPropiedades(fichero);

        // Propiedades > Modelo
        control.convertirPropiedadesModelo(prp, model);
    }
}
