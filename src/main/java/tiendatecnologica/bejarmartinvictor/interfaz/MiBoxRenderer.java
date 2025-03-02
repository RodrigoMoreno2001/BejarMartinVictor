/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendatecnologica.bejarmartinvictor.interfaz;

import java.awt.*;
import javax.swing.*;

class MiBoxRenderer extends JLabel implements ListCellRenderer {
    
    public MiBoxRenderer() {
        setOpaque(true);
        setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
        setBackground(new Color(125, 109, 153));
        setForeground(new Color(232,219,255));
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected,
            boolean cellHasFocus) {
        setText(value.toString());
        return this;
    }
    
}