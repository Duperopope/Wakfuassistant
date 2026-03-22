/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.awt.Point;

/*
 * Renamed from fLe
 */
public class fle_1
extends flk_1 {
    public void f(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        int n9 = n + n7;
        int n10 = n2 + n6 + n4;
        this.urc.e(n10, n9, n3, n4);
    }

    public void a(Point point, fsm_1 fsm_12, Insets insets) {
        this.f(point.x, point.y, fsm_12.width, fsm_12.height, insets.top, insets.bottom, insets.left, insets.right);
    }
}

