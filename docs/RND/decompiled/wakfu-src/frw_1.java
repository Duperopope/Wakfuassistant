/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.awt.Point;
import org.apache.log4j.Logger;

/*
 * Renamed from fRW
 */
public class frw_1 {
    private static final Logger vbO = Logger.getLogger(frw_1.class);
    private double uqf;
    private double uqg;
    private double uqh = -1.0;
    private double uqi = -1.0;
    private double vbP;
    private double vbQ;
    private double vbR;
    private double vbS;
    private short vbT = (short)-1;
    private short vbU = (short)-1;
    private boolean vbV = false;
    private boolean vbW = false;
    private final Point vbX = new Point(0, 0);
    private awg_1 tEC;
    private boolean vbY = false;

    public void setPixmap(awg_1 awg_12) {
        if (awg_12 != null) {
            this.tEC = awg_12;
        }
    }

    public awg_1 getPixmap() {
        return this.tEC;
    }

    public double gFc() {
        return this.uqf;
    }

    public void ah(double d2) {
        this.uqf = d2;
        this.vbY = true;
    }

    public double gFd() {
        return this.uqg;
    }

    public void ai(double d2) {
        this.uqg = d2;
        this.vbY = true;
    }

    public short gFe() {
        return this.vbT;
    }

    public void fS(short s) {
        this.vbT = s;
    }

    public short gFf() {
        return this.vbU;
    }

    public void fT(short s) {
        this.vbU = s;
    }

    public int aWk() {
        return frw_1.ak(this.vbT, this.vbU);
    }

    public static int ak(short s, short s2) {
        return (s << 16) + s2;
    }

    public Point gFg() {
        return this.vbX;
    }

    public boolean gFh() {
        return this.vbV;
    }

    public void pk(boolean bl) {
        this.vbV = bl;
    }

    public boolean gFi() {
        return this.vbW;
    }

    public void pl(boolean bl) {
        this.vbW = bl;
    }

    public double gFj() {
        return this.uqh;
    }

    public void aj(double d2) {
        this.uqh = d2;
        this.vbY = true;
    }

    public double gFk() {
        return this.uqi;
    }

    public void ak(double d2) {
        this.uqi = d2;
        this.vbY = true;
    }

    public double gFl() {
        return this.vbP;
    }

    public void al(double d2) {
        this.vbP = d2;
        this.vbY = true;
    }

    public double gFm() {
        return this.vbQ;
    }

    public void am(double d2) {
        this.vbQ = d2;
        this.vbY = true;
    }

    public double gFn() {
        return this.vbR;
    }

    public void an(double d2) {
        this.vbR = d2;
        this.vbY = true;
    }

    public double gFo() {
        return this.vbS;
    }

    public void ao(double d2) {
        this.vbS = d2;
        this.vbY = true;
    }

    public static boolean a(double d2, double d3, double d4, double d5, frw_1 frw_12, frw_1 frw_13, frw_1 frw_14, frw_1 frw_15) {
        if (frw_12.vbV || frw_13.vbV || frw_14.vbV || frw_15.vbV) {
            return true;
        }
        double d6 = frw_12.gFj() + frw_13.gFj();
        double d7 = frw_12.gFk() + frw_14.gFo();
        return d2 >= frw_12.uqf && d3 >= frw_12.uqg && d2 + d4 < frw_12.uqf + d6 && d3 + d5 < frw_12.uqg + d7;
    }

    public boolean c(double d2, double d3, double d4, double d5) {
        return d2 >= this.uqf && d3 >= this.uqg && d2 + d4 < this.uqf + this.uqh && d3 + d5 < this.uqg + this.uqi;
    }

    public boolean ap(double d2) {
        return d2 >= this.uqf;
    }

    public boolean j(double d2, double d3) {
        return d2 + d3 < this.uqf + this.uqh;
    }

    public boolean aq(double d2) {
        return d2 >= this.uqg;
    }

    public boolean k(double d2, double d3) {
        return d2 + d3 < this.uqg + this.uqi;
    }

    public Point d(double d2, double d3, double d4, double d5) {
        double d6 = 0.0;
        double d7 = 0.0;
        if (this.vbV) {
            this.vbP = this.uqf;
            this.vbQ = this.uqg;
            this.vbR = d4;
            this.vbS = d5;
        } else {
            this.vbR = d4;
            this.vbS = d5;
            if (d2 < this.uqf) {
                d6 = this.uqf - d2 - d4;
            } else if (d2 >= this.uqh + this.uqf) {
                d6 = d4;
            } else if (d2 + d4 >= this.uqh + this.uqf) {
                d6 = this.uqh + this.uqf - d4 - d2;
            }
            if (d3 < this.uqg) {
                d7 = this.uqg - d3 - d5;
            } else if (d3 >= this.uqi + this.uqg) {
                d7 = d5;
            } else if (d3 + d5 >= this.uqi + this.uqg) {
                d7 = this.uqi + this.uqg - d5 - d3;
            }
            this.vbP = Math.max(Math.min(d2, this.uqf + this.uqh - this.vbR), this.uqf);
            this.vbQ = Math.max(Math.min(d3, this.uqg + this.uqi - this.vbS), this.uqg);
        }
        this.vbX.setLocation(d6, d7);
        this.vbY = true;
        return this.vbX;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void gFp() {
        if (this.tEC == null || this.tEC.bHg() == null) {
            return;
        }
        try {
            float f2 = (float)((this.vbP - this.uqf) / this.uqh);
            float f3 = (float)((this.vbQ - this.uqg) / this.uqi);
            acc_1 acc_12 = this.tEC.bHg().bQs();
            int n = (int)((float)acc_12.bWx() * f2);
            int n2 = (int)((float)acc_12.bWy() * f3);
            float f4 = (float)(this.vbR / this.uqh);
            float f5 = (float)(this.vbS / this.uqi);
            int n3 = (int)((float)acc_12.bWx() * f4);
            int n4 = (int)((float)acc_12.bWy() * f5);
            this.tEC.setX(n);
            this.tEC.setY(n2);
            this.tEC.setHeight(n4);
            this.tEC.setWidth(n3);
            this.tEC.dl(false);
            this.tEC.bOY();
        }
        catch (NullPointerException nullPointerException) {
            vbO.error((Object)"La pixmap ou sa texture interne est nulle.", (Throwable)nullPointerException);
        }
        finally {
            this.vbY = false;
        }
    }

    public boolean bOX() {
        return this.vbY;
    }
}

