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

import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.util.Properties;
import javax.swing.JOptionPane;
import org.japo.java.models.Model;
import org.japo.java.views.View;
import org.japo.java.libraries.UtilesApp;
import org.japo.java.libraries.UtilesSwing;
import org.japo.java.interfaces.IDAController;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class Controller {

    // Referencias
    private final View view;
    private final Properties prpApp;
    private final Model model;
    private final ModelController modelControl;
    private final IDAController daControl;

    // Constructor Parametrizado
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        // Propiedades App
        this.prpApp = UtilesApp.cargarPropiedades("app.properties");

        // Controlador de Modelo
        this.modelControl = new ModelController();

        // *** Controlador de Persistencia ***
        this.daControl = new DAControllerJSON(modelControl);
    }

    // --- INICIO SETTERS / GETTERS ----
    public View getView() {
        return view;
    }

    public Properties getPrpApp() {
        return prpApp;
    }

    public Model getModel() {
        return model;
    }

    public ModelController getModelControl() {
        return modelControl;
    }

    public IDAController getDaControl() {
        return daControl;
    }

    // --- FIN SETTERS / GETTERS ----
    //
    // Propiedades Vista > Estado Vista
    public void restaurarEstadoVista(View view, Properties prp) {
        // Icono Ventana
        UtilesSwing.establecerFavicon(view, prp.getProperty("ruta_favicon"));

        // Establece Lnf
        UtilesSwing.establecerLnF(prp.getProperty("lnf", UtilesSwing.WINDOWS));

        // Activa Singleton
        if (!UtilesApp.activarInstancia(prp.getProperty("puerto_bloqueo", UtilesApp.PUERTO_BLOQUEO))) {
            UtilesSwing.terminarPrograma(view);
        }

        // Activa otras propiedades
    }

    // Vista (Subjetivo) > Modelo
    public void sincronizarVistaModelo(Model model, View view) {

    }

    // Modelo > Vista 
    public void sincronizarModeloVista(Model model, View view) {

    }

    // Iniciado Cierre Ventana
    public void procesarCierreVentana(WindowEvent evt) {
        // Memorizar Estado de la Applicación
        modelControl.memorizarEstadoApp(prpApp);
    }

    // Persistencia > Modelo > Interfaz
    public void procesarImportacion(ActionEvent evt) {
        try {
            // Fichero de Datos
            String fichero = prpApp.getProperty("fichero_datos");

            // Persistencia > Modelo
            daControl.importarModelo(model, fichero);

            // Modelo > Interfaz
            sincronizarModeloVista(model, view);

            // Validar Datos Cargados > Interfaz
            modelControl.comprobarValidez(view);

            // Mensaje - Importación OK
            String msg = "Datos cargados correctamente";
            JOptionPane.showMessageDialog(view, msg);
        } catch (Exception e) {
            // Mensaje - Importación NO
            String msg = "Error al cargar los datos";
            JOptionPane.showMessageDialog(view, msg);
        }
    }

    // Interfaz > Modelo > Persistencia
    public void procesarExportacion(ActionEvent evt) {
        // Validar Datos Interfaz
        if (modelControl.comprobarValidez(view)) {
            try {
                // Interfaz > Modelo
                sincronizarVistaModelo(model, view);

                // Fichero de Datos
                String fichero = prpApp.getProperty("fichero_datos");

                // Modelo > Persistencia
                daControl.exportarModelo(model, fichero);

                // Mensaje - Exportación OK
                String msg = "Datos guardados correctamente";
                JOptionPane.showMessageDialog(view, msg);
            } catch (Exception e) {
                // Mensaje - Exportación NO
                String msg = "Error al guardar los datos";
                JOptionPane.showMessageDialog(view, msg);
            }
        } else {
            // Mensaje - Validación Pendiente
            JOptionPane.showMessageDialog(view, "Hay datos erróneos.");
        }
    }
}
