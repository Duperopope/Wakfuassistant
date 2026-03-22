/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class aTU {
    public static final int gvL = 40;
    private int ena;
    private int beb;
    private int bap;
    private int baq;
    private final ArrayList<bgy> gvM = new ArrayList();

    public boolean o(bgy bgy2) {
        if (this.beb == 0) {
            return true;
        }
        acd_1 acd_12 = bgy2.eap();
        float f2 = aco_1.bn(acd_12.getX() - this.bap, acd_12.getY() - this.baq);
        return f2 <= 40.0f;
    }

    public void p(bgy bgy2) {
        ++this.beb;
        this.gvM.add(bgy2);
        acd_1 acd_12 = bgy2.eap();
        if (this.beb == 1) {
            this.bap = acd_12.getX();
            this.baq = acd_12.getY();
            this.ena = bgy2.doV().cqy();
            return;
        }
        int n = acd_12.getX() - this.bap;
        int n2 = acd_12.getY() - this.baq;
        this.bap += n / this.beb;
        this.baq += n2 / this.beb;
    }

    public int cqy() {
        return this.ena;
    }

    public int aXY() {
        return this.beb;
    }

    public int getX() {
        return this.bap;
    }

    public int getY() {
        return this.baq;
    }

    public ArrayList<bgy> cTZ() {
        return this.gvM;
    }
}

