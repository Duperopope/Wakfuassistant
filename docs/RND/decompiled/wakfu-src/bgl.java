/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bgl
implements aeh_2 {
    private static final Logger hZR = Logger.getLogger(bgl.class);
    public static final String hZS = "iconUrl";
    public static final String[] hZT = new String[]{"iconUrl"};
    private acd_1 hZU;
    private acd_1 hXo;
    private adj_0 hZV;
    private adj_0 hZW;
    private int hZX;
    private int hZY;
    private final ady_0 hZZ = new bgm(this);
    private final ady_0 iaa = new bgn(this);

    public bgl(acd_1 acd_12, acd_1 acd_13, int n) {
        this.a(acd_12, acd_13, n);
    }

    public bgl(acd_1 acd_12, adj_0 adj_02, int n) {
        this.hZW = adj_02;
        this.hZW.c(this.hZZ);
        this.hZW.c(this.iaa);
        this.hZW.a(this.iaa);
        this.a(acd_12, adj_02.bqg(), n);
    }

    public bgl(adj_0 adj_02, acd_1 acd_12, int n) {
        this.hZV = adj_02;
        this.hZV.c(this.hZZ);
        this.hZV.c(this.iaa);
        this.hZV.a(this.hZZ);
        this.a(adj_02.bqg(), acd_12, n);
    }

    public bgl(adj_0 adj_02, adj_0 adj_03, int n) {
        this.hZV = adj_02;
        this.hZV.c(this.hZZ);
        this.hZV.c(this.iaa);
        this.hZV.a(this.hZZ);
        this.hZW = adj_03;
        this.hZW.c(this.hZZ);
        this.hZW.c(this.iaa);
        this.hZW.a(this.iaa);
        this.a(adj_02.bqg(), adj_03.bqg(), n);
    }

    private void djd() {
        fse_1.gFu().a((aef_2)this, hZS);
    }

    private void a(acd_1 acd_12, acd_1 acd_13, int n) {
        this.hZY = n;
        this.O(acd_12);
        this.P(acd_13);
    }

    public void O(acd_1 acd_12) {
        if (acd_12 != this.hZU) {
            this.hZU = acd_12;
            this.dje();
            this.djd();
        }
    }

    public void P(acd_1 acd_12) {
        if (acd_12 != this.hXo) {
            this.hXo = acd_12;
            this.dje();
            this.djd();
        }
    }

    private void dje() {
        if (this.hXo != null && this.hZU != null) {
            double d2;
            double d3;
            double d4 = 1.0 * (double)(this.hXo.getX() - this.hZU.getX());
            double d5 = d4 / (d3 = (double)aco_1.bm((float)d4, (float)(d2 = -1.0 * (double)(this.hXo.getY() - this.hZU.getY()))));
            if (d5 > Math.cos(0.39269908169872414)) {
                this.hZX = abi_1.dzk.dzy;
                return;
            }
            if (d5 > Math.cos(1.1780972450961724)) {
                if (d2 < 0.0) {
                    this.hZX = abi_1.dzl.dzy;
                    return;
                }
                this.hZX = abi_1.dzj.dzy;
                return;
            }
            if (d5 > Math.cos(1.9634954084936207)) {
                if (d2 < 0.0) {
                    this.hZX = abi_1.dzm.dzy;
                    return;
                }
                this.hZX = abi_1.dzq.dzy;
                return;
            }
            if (d5 > Math.cos(2.748893571891069)) {
                if (d2 < 0.0) {
                    this.hZX = abi_1.dzn.dzy;
                    return;
                }
                this.hZX = abi_1.dzp.dzy;
                return;
            }
            this.hZX = abi_1.dzo.dzy;
        }
    }

    private void CA(int n) {
        double d2;
        if (n % 2 != 0) {
            hZR.warn((Object)"Le calcul des indices de la boussole n'est pas pr\u00e9vue pour un chiffre impair.");
            return;
        }
        if (this.hXo == null || this.hZU == null) {
            return;
        }
        double d3 = 1.0 * (double)(this.hXo.getX() - this.hZU.getX());
        double d4 = aco_1.bm((float)d3, (float)(d2 = -1.0 * (double)(this.hXo.getY() - this.hZU.getY())));
        if (d4 <= 0.0) {
            return;
        }
        double d5 = d2 == 0.0 && d3 < 0.0 ? Math.PI : Math.signum(d2) * Math.acos(d3 / d4);
        double d6 = 57.29577951308232 * d5;
        double d7 = 180 / n;
        int n2 = (int)(d6 + d7) / (int)(2.0 * d7);
        this.hZX = n2 = (n2 + 3) % n;
        this.djd();
    }

    @Override
    public Object eu(String string) {
        if (string.equalsIgnoreCase(hZS)) {
            try {
                return String.format(auc_0.cVq().bS("compassIconsPath"), this.hZX);
            }
            catch (fu_0 fu_02) {
                hZR.error((Object)"PropertyException during getFieldValue for ICON_URL_FIELD", (Throwable)fu_02);
            }
        }
        return null;
    }

    @Override
    public String[] bxk() {
        return hZT;
    }

    public void djf() {
        if (this.hZV != null) {
            this.hZV.c(this.hZZ);
            this.hZV.c(this.iaa);
        }
        if (this.hZW != null) {
            this.hZW.c(this.hZZ);
            this.hZW.c(this.iaa);
        }
    }
}

