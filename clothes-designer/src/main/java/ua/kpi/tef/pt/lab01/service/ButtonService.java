package ua.kpi.tef.pt.lab01.service;

import ua.kpi.tef.pt.lab01.model.Button;
import ua.kpi.tef.pt.lab01.model.ClothingPart;
import ua.kpi.tef.pt.lab01.model.parts.Color;
import ua.kpi.tef.pt.lab01.model.parts.Material;

public class ButtonService {

    public static Button create(Material material, Color color, Integer amount) {
        return new Button(material, color, amount);
    }

    /**
     * Used to edit Clothing Part.
     * Receives {@link Button} to edit and new Enum values.
     * Pass {@code null} instead of {@code Enum} to not edit it.
     */
    public static void edit(ClothingPart clothingPart, Material material, Color color, Integer amount) {
        Button button = (Button) clothingPart;
        if (material != null) button.setMaterial(material);
        if (color != null) button.setColor(color);
        if (amount != null) button.setAmount(amount);
    }
}