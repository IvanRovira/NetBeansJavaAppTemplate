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

import org.japo.java.models.Model;
import org.japo.java.interfaces.IDataAccessController;
import org.japo.java.libraries.UtilesCSV;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class DataAccessControllerCSV implements IDataAccessController {

    // Fichero [CSV] > Modelo
    @Override
    public void importarModelo(Model model, String fichero) throws Exception {
        // Importar Items CSV
        String[] items = UtilesCSV.importarItemsCSV(fichero);

        // Lista de Items > Modelo
    }

    // Modelo > Fichero [CSV]
    @Override
    public void exportarModelo(Model model, String fichero) throws Exception {
        // Lista de Items
        String[] items = new String[Model.NUM_ITEMS];

        // Modelo > Lista de Items
        // Exportar Items CSV
        UtilesCSV.exportarItemsCSV(items, fichero);
    }
}
