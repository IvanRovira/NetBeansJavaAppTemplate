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

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class DataAccessControllerFactory {

    public static IDataAccessController obtenerDAC(Properties prp) {
        // Referencia DAC
        IDataAccessController dac = null;

        // Tipo de Persistencia
        String persistencia = prp.getProperty(Controller.PRP_DA_PERSISTENCIA);

        // Instancia Controlador Fersistencia
        switch (persistencia) {
            case "CSV":
                dac = new DataAccessControllerCSV();
                break;
            case "JSON":
                dac = new DataAccessControllerJSON();
                break;
            case "PRP":
                dac = new DataAccessControllerPRP();
                break;
            case "SBIN":
                dac = new DataAccessControllerSBIN();
                break;
            case "SXML":
                dac = new DataAccessControllerSXML();
        }
        
        // Devuelve Controlador Persistencia
        return dac;
    }
}
