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
package org.japo.java.lib;

import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class UtilesSwing {

    // LnF - UNIX
    public static final String GTK = "com.sun.java.swing.plaf.gtk.GTKLookAndFeel";

    // LnF - WINDOWS
    public static final String WINDOWS = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
    public static final String WINDOWS_CLASSIC = "com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel";
    
    // LnF
    public static final String MOTIF = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
    public static final String METAL = "javax.swing.plaf.metal.MetalLookAndFeel";
    public static final String NIMBUS = "javax.swing.plaf.nimbus.NimbusLookAndFeel";

    // Cerrar programa
    public static void terminarPrograma(JFrame f) {
        // Oculta la ventana
        f.setVisible(false);

        // Devuelve los recursos
        f.dispose();

        // Cierra el programa
        System.exit(0);
    }

    // Establecer LnF
    public static void establecerLnF(String lnf) {
        try {
            UIManager.setLookAndFeel(lnf);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
