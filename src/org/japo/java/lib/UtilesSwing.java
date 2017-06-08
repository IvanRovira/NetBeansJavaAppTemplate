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

import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

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
        } catch (ClassNotFoundException | IllegalAccessException
            | InstantiationException | UnsupportedLookAndFeelException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    // Escalar/Asignar Image > Etiqueta
    public static void asignarImagenEscalada(JLabel lblImagen, Image imgOriginal) {
        // Obtiene la imagen escalada
        Image imgEscalada = imgOriginal.getScaledInstance(
              lblImagen.getSize().width,
              lblImagen.getSize().height,
              Image.SCALE_FAST);

        // Image (Final) > Icon
        Icon i = new ImageIcon(imgEscalada);

        // Icon > Etiqueta Imagen
        lblImagen.setIcon(i);
    }

    // Obtiene el texto copiado al portapapeles
    public static String obtenerTextoPortapapeles() {
        // Referencia al texto del portapapeles
        String result = "";

        try {
            // Acceso al portapapeles
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

            // Contenido del Portapapeles
            // El parámetro de getContents no se usa
            Transferable contents = clipboard.getContents(null);

            // Extrae texto del portapapeles
            result = (String) contents.getTransferData(DataFlavor.stringFlavor);
        } catch (HeadlessException | UnsupportedFlavorException | IOException e) {
            System.out.println(e);
        }

        // Texto extraido
        return result;
    }

    // Coloca texto en el portapapeles
    public static void ponerTextoPortapapeles(String texto, ClipboardOwner propietario) {
        // Entidad que implementa la capacidad de transmitir texto
        StringSelection transmisor = new StringSelection(texto);

        // Acceso al portapapeles
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

        // Transmisión de texto
        clipboard.setContents(transmisor, propietario);
    }
}
