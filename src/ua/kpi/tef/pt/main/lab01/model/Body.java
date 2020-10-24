package ua.kpi.tef.pt.main.lab01.model;

import ua.kpi.tef.pt.main.lab01.model.parts.Color;
import ua.kpi.tef.pt.main.lab01.model.parts.Material;

public class Body implements ClothingPart {
    private final String title = "Body";
    private Material material;
    private Color color;

    @Override
    public String getTitle(){
        return title;
    }

    @Override
    public Material getMaterial() {
        return material;
    }

    @Override
    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title)
                .append("\n\tmaterial: ").append(material)
                .append("\n\tcolor: ").append(color);
        return sb.toString();
    }
}
