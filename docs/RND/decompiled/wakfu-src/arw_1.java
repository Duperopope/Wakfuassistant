/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;

/*
 * Renamed from arw
 */
public class arw_1<T>
extends DefaultMutableTreeNode {
    Color bXH = Color.BLACK;
    T att;

    public arw_1() {
    }

    public arw_1(String string, Color color) {
        super(string);
        this.bXH = color;
    }

    public arw_1(String string, Color color, T t) {
        super(string);
        this.bXH = color;
        this.att = t;
    }

    public arw_1(String string) {
        super(string);
    }

    public Color bHI() {
        return this.bXH;
    }

    public void a(JPanel jPanel) {
    }
}

