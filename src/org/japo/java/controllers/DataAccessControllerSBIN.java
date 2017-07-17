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

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.japo.java.interfaces.IDataAccessController;
import org.japo.java.models.Model;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class DataAccessControllerSBIN implements IDataAccessController {

    // Referencias
    private final Controller control;

    public DataAccessControllerSBIN(Controller control) {
        this.control = control;
    }

    // Modelo > Fichero [SBIN]
    @Override
    public void exportarModelo(Model model, String fichero) throws Exception {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(fichero))) {
            // Escribe el modelo
            salida.writeObject(model);
        }
    }

    // Fichero [SBIN] > Modelo
    @Override
    public void importarModelo(Model modeloFin, String fichero) throws Exception {
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(fichero))) {
            // Persistencia Binaria > Modelo Importado
            Model modeloIni = (Model) entrada.readObject();

            // Modelo Importado > Modelo
            control.convertirModeloModelo(modeloIni, modeloFin);
        }
    }
}
