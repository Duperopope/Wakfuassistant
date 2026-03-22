/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.awt.Dimension;
import org.apache.log4j.Logger;

/*
 * Renamed from fSM
 */
public class fsm_1
extends Dimension
implements Cloneable {
    private static Logger oO = Logger.getLogger(fsm_1.class);
    private float cyD = -1.0f;
    private float cyE = -1.0f;

    public fsm_1() {
    }

    public fsm_1(int n, int n2) {
        this.width = n;
        this.height = n2;
    }

    public fsm_1(fsm_1 fsm_12) {
        this.width = fsm_12.width;
        this.height = fsm_12.height;
        this.cyD = fsm_12.cyD;
        this.cyE = fsm_12.cyE;
    }

    public fsm_1(float f2, float f3) {
        this.cyD = f2;
        this.cyE = f3;
    }

    public fsm_1(int n, float f2) {
        this.width = n;
        this.cyE = f2;
    }

    public fsm_1(float f2, int n) {
        this.cyD = f2;
        this.height = n;
    }

    public float gGd() {
        return this.cyD;
    }

    public float gGe() {
        return this.cyE;
    }

    public void b(fsm_1 fsm_12) {
        this.width = Math.min(this.width, fsm_12.width);
        this.height = Math.min(this.height, fsm_12.height);
    }

    public void hi(int n, int n2) {
        this.width = Math.min(this.width, n);
        this.height = Math.min(this.height, n2);
    }

    public void I(int n, int n2) {
        this.width = n;
        this.height = n2;
    }

    public void bQ(float f2, float f3) {
        this.cyE = f3;
        this.cyD = f2;
    }

    public void setHeight(int n) {
        this.height = n;
    }

    public void gd(float f2) {
        this.cyE = f2;
    }

    public void setWidth(int n) {
        this.width = n;
    }

    public void ge(float f2) {
        this.cyD = f2;
    }

    public boolean gGf() {
        return this.cyD != -1.0f || this.cyE != -1.0f;
    }

    public boolean c(fsm_1 fsm_12) {
        if (fsm_12 == null) {
            return false;
        }
        if (fsm_12.height != this.height) {
            return false;
        }
        if (fsm_12.width != this.width) {
            return false;
        }
        if (fsm_12.cyE != this.cyE) {
            return false;
        }
        return fsm_12.cyD == this.cyD;
    }

    public fsm_1 gGg() {
        fsm_1 fsm_12 = new fsm_1(this.width, this.height);
        fsm_12.gd(this.cyE);
        fsm_12.ge(this.cyD);
        return fsm_12;
    }
}

