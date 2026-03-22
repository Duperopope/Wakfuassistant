/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;
import java.awt.geom.Rectangle2D;

/*
 * Renamed from awf
 */
class awf_1 {
    private final String djN;
    private final Point djO;
    private final Rectangle2D djP;
    private long djQ;
    final /* synthetic */ avu_2 djR;

    awf_1(avu_2 avu_22, String string, Point point, Rectangle2D rectangle2D) {
        this.djR = avu_22;
        this.djN = string;
        this.djO = point;
        this.djP = rectangle2D;
        this.djQ = avu_22.diR;
    }

    String bNV() {
        return this.djN;
    }

    Point bNW() {
        return this.djO;
    }

    int bNX() {
        return (int)(-this.djP.getMinX());
    }

    int bNY() {
        return (int)(-this.djP.getMinY());
    }

    Rectangle2D bNZ() {
        return this.djP;
    }

    boolean bOa() {
        return this.djR.diR - this.djQ < 10000L;
    }

    void bOb() {
        this.djQ = this.djR.diR;
    }

    void bOc() {
        this.djQ = 0L;
    }
}

