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
import org.japo.java.forms.View;
import org.japo.java.lib.UtilesValidacion;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class ModelController {

    // Items > Modelo
    public void asignarItemsModelo(String[] items, Model model) throws Exception {
//        // Texto
//        model.setTexto(items[Model.POS_TEXTO]);
//
//        // Familia
//        model.setFamilia(items[Model.POS_FAMILIA]);
//
//        // Estilo
//        model.setNegrita(items[Model.POS_NEGRITA].equals("true"));
//        model.setCursiva(items[Model.POS_CURSIVA].equals("true"));
//
//        // Talla
//        try {
//            model.setTalla(Integer.parseInt(items[Model.POS_TALLA]));
//        } catch (NumberFormatException e) {
//            model.setTalla(Model.DEF_TALLA);
//        }
//
//        // Frente
//        try {
//            model.setFrenteR(Integer.parseInt(items[Model.POS_FRENTE_R]));
//            model.setFrenteV(Integer.parseInt(items[Model.POS_FRENTE_V]));
//            model.setFrenteA(Integer.parseInt(items[Model.POS_FRENTE_A]));
//        } catch (NumberFormatException e) {
//            model.setFrenteR(Model.DEF_FRENTE_R);
//            model.setFrenteV(Model.DEF_FRENTE_V);
//            model.setFrenteA(Model.DEF_FRENTE_A);
//        }
//
//        // Fondo
//        try {
//            model.setFondoR(Integer.parseInt(items[Model.POS_FONDO_R]));
//            model.setFondoV(Integer.parseInt(items[Model.POS_FONDO_V]));
//            model.setFondoA(Integer.parseInt(items[Model.POS_FONDO_A]));
//        } catch (NumberFormatException e) {
//            model.setFondoR(Model.DEF_FONDO_R);
//            model.setFondoV(Model.DEF_FONDO_V);
//            model.setFondoA(Model.DEF_FONDO_A);
//        }
    }

    // Modelo > Items
    public void asignarModeloItems(Model model, String[] items) {
//        // Items > Lista
//        items[Model.POS_TEXTO] = model.getTexto();
//        items[Model.POS_FAMILIA] = model.getFamilia();
//        items[Model.POS_NEGRITA] = model.isNegrita() + "";
//        items[Model.POS_CURSIVA] = model.isCursiva() + "";
//        items[Model.POS_TALLA] = model.getTalla() + "";
//        items[Model.POS_FRENTE_R] = model.getFrenteR() + "";
//        items[Model.POS_FRENTE_V] = model.getFrenteV() + "";
//        items[Model.POS_FRENTE_A] = model.getFrenteA() + "";
//        items[Model.POS_FONDO_R] = model.getFondoR() + "";
//        items[Model.POS_FONDO_V] = model.getFondoV() + "";
//        items[Model.POS_FONDO_A] = model.getFondoA() + "";
    }

    // Copiar Estado Modelo
    public void copiarModelo(Model modeloIni, Model modeloFin) {
//        // Texto
//        modeloFin.setTexto(modeloIni.getTexto());
//
//        // Familia
//        modeloFin.setFamilia(modeloIni.getFamilia());
//
//        // Estilo
//        modeloFin.setNegrita(modeloIni.isNegrita());
//        modeloFin.setCursiva(modeloIni.isCursiva());
//
//        // Tamaño
//        modeloFin.setTalla(modeloIni.getTalla());
//
//        // Color Frente
//        modeloFin.setFrenteR(modeloIni.getFrenteR());
//        modeloFin.setFrenteV(modeloIni.getFrenteV());
//        modeloFin.setFrenteA(modeloIni.getFrenteA());
//
//        // Color Fondo
//        modeloFin.setFondoR(modeloIni.getFondoR());
//        modeloFin.setFondoV(modeloIni.getFondoV());
//        modeloFin.setFondoA(modeloIni.getFondoA());
    }

    // Propiedades > Modelo
    public void asignarPropiedadesModelo(Properties prp, Model model) {
//        // Texto
//        model.setTexto(prp.getProperty("rotulo.texto", Model.DEF_TEXTO));
//
//        // Familia
//        model.setFamilia(prp.getProperty("rotulo.familia", Model.DEF_FAMILIA));
//
//        // Estilo
//        model.setNegrita(prp.getProperty("rotulo.negrita", Model.DEF_NEGRITA + "").equals("true"));
//        model.setCursiva(prp.getProperty("rotulo.cursiva", Model.DEF_CURSIVA + "").equals("true"));
//
//        // Talla
//        try {
//            model.setTalla(Integer.parseInt(prp.getProperty("rotulo.talla")));
//        } catch (NumberFormatException e) {
//            model.setTalla(Model.DEF_TALLA);
//        }
//
//        // Color de Frente
//        try {
//            model.setFrenteR(Integer.parseInt(prp.getProperty("rotulo.frente_r")));
//            model.setFrenteV(Integer.parseInt(prp.getProperty("rotulo.frente_v")));
//            model.setFrenteA(Integer.parseInt(prp.getProperty("rotulo.frente_a")));
//        } catch (NumberFormatException e) {
//            model.setFrenteR(Model.DEF_FRENTE_R);
//            model.setFrenteV(Model.DEF_FRENTE_V);
//            model.setFrenteA(Model.DEF_FRENTE_A);
//        }
//
//        // Color de Fondo
//        try {
//            model.setFondoR(Integer.parseInt(prp.getProperty("rotulo.fondo_r")));
//            model.setFondoV(Integer.parseInt(prp.getProperty("rotulo.fondo_v")));
//            model.setFondoA(Integer.parseInt(prp.getProperty("rotulo.fondo_a")));
//        } catch (NumberFormatException e) {
//            model.setFondoR(Model.DEF_FONDO_R);
//            model.setFondoV(Model.DEF_FONDO_V);
//            model.setFondoA(Model.DEF_FONDO_A);
//        }
    }

    // Modelo > Propiedades
    public void asignarModeloPropiedades(Model model, Properties prp) {
//        prp.setProperty("rotulo.texto", model.getTexto());
//        prp.setProperty("rotulo.familia", model.getFamilia());
//        prp.setProperty("rotulo.negrita", model.isNegrita() + "");
//        prp.setProperty("rotulo.cursiva", model.isCursiva() + "");
//        prp.setProperty("rotulo.talla", model.getTalla() + "");
//        prp.setProperty("rotulo.frente_r", model.getFrenteR() + "");
//        prp.setProperty("rotulo.frente_v", model.getFrenteV() + "");
//        prp.setProperty("rotulo.frente_a", model.getFrenteA() + "");
//        prp.setProperty("rotulo.fondo_r", model.getFondoR() + "");
//        prp.setProperty("rotulo.fondo_v", model.getFondoV() + "");
//        prp.setProperty("rotulo.fondo_a", model.getFondoA() + "");
    }

    // Validar Controles Subjetivos
    public boolean comprobarValidez(View view) {
        // Validación Individual
        boolean item1OK = UtilesValidacion.validarCampoTexto(view.txfItem1, Model.ER_ITEM1, "*");
        boolean item2OK = UtilesValidacion.validarCampoTexto(view.txfItem2, Model.ER_ITEM2, "*");
        boolean item4OK = UtilesValidacion.validarCampoFecha(view.txfItem4, "*");
        boolean item5OK = UtilesValidacion.validarCampoTexto(view.txfItem5, Model.ER_ITEM5, "*");

        // Validación Conjunta
        return item1OK && item2OK && item4OK && item5OK;
    }

    // Estado Actual > Persistencia
    public void memorizarEstadoApp(Properties prpApp) {
        // Actualiza Propiedades Estado Actual

        // Guardar Estado Actual
        // UtilesApp.guardarPropiedades(prpApp);
    }
}
