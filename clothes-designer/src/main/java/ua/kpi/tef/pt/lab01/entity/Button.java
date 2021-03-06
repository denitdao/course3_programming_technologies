package ua.kpi.tef.pt.lab01.entity;

import ua.kpi.tef.pt.lab01.entity.parts.Color;
import ua.kpi.tef.pt.lab01.entity.parts.Material;

public class Button implements ClothingPart {
    private final String title = "Button";
    private Material material;
    private Color color;
    private int amount;

    public Button(Material material, Color color, int amount) {
        this.material = material;
        this.color = color;
        this.amount = amount;
    }

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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title)
                .append("\n\tmaterial: ").append(material)
                .append("\n\tcolor: ").append(color)
                .append("\n\tamount: ").append(amount);
        return sb.toString();
    }
}
