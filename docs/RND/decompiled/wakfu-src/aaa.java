/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Graphics;

public class aaa {
    private final aco_1 bXG;
    private final Color bXH;

    public aaa(aco_1 aco_12, Color color) {
        this.bXG = aco_12;
        this.bXH = color;
    }

    public aaa(float f2, float f3, Color color) {
        this.bXG = new aco_1(f2, f3);
        this.bXH = color;
    }

    void a(Graphics graphics, int n, int n2) {
        graphics.setColor(this.bXH);
        graphics.drawOval(Math.round(this.bXG.aSc() + (float)n - 2.5f), Math.round(-this.bXG.aSd() + (float)n2 - 2.5f), 5, 5);
    }
}

