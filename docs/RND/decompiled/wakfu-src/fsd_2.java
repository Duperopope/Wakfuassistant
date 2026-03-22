/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;
import java.awt.Rectangle;

/*
 * Renamed from fSD
 */
public class fsd_2
extends fss_2<Rectangle> {
    private final boolean vex;

    public fsd_2(Rectangle rectangle, Rectangle rectangle2, fes_2 fes_22, boolean bl, int n, int n2, abn abn2) {
        super(rectangle, rectangle2, fes_22, n, n2, abn2);
        if (rectangle == null) {
            this.bl(new Rectangle(new Point(0, 0), fes_22.getSize()));
        }
        this.vex = bl;
    }

    @Override
    public boolean Ma(int n) {
        if (!super.Ma(n)) {
            return false;
        }
        if (this.tXJ == null) {
            return true;
        }
        Rectangle rectangle = (Rectangle)this.veb;
        Rectangle rectangle2 = (Rectangle)this.vec;
        int n2 = (int)this.tXJ.h(rectangle.x, rectangle2.x, this.bUi, this.bMn);
        int n3 = (int)this.tXJ.h(rectangle.y, rectangle2.y, this.bUi, this.bMn);
        int n4 = (int)this.tXJ.h(rectangle.width, rectangle2.width, this.bUi, this.bMn);
        int n5 = (int)this.tXJ.h(rectangle.height, rectangle2.height, this.bUi, this.bMn);
        this.getWidget().setScissor(new Rectangle(n2, n3, n4, n5));
        return true;
    }

    @Override
    public void cbz() {
        if (this.vex) {
            this.getWidget().setScissor(null);
        } else {
            this.getWidget().setScissor((Rectangle)this.vec);
        }
        super.cbz();
    }

    public String toString() {
        return "[" + this.getClass().getSimpleName() + "]" + String.valueOf(this.veb) + " -> " + String.valueOf(this.vec);
    }
}

