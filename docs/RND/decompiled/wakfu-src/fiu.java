/*
 * Decompiled with CFR 0.152.
 */
import java.util.Date;

public class fiu
implements gq_0<vt_1> {
    private String jpN;
    private int srQ;
    private int srR;
    private Date srS;
    private String eAl;
    private boolean srT;

    public fiu() {
    }

    public fiu(String string, int n, int n2, Date date, String string2, boolean bl) {
        this.jpN = string;
        this.srQ = n;
        this.srR = n2;
        this.srS = date;
        this.eAl = string2;
        this.srT = bl;
    }

    public String dJe() {
        return this.jpN;
    }

    public int fZI() {
        return this.srQ;
    }

    public int fZJ() {
        return this.srR;
    }

    public Date fZK() {
        return this.srS;
    }

    public String hF() {
        return this.eAl;
    }

    public boolean fWm() {
        return this.srT;
    }

    @Override
    public boolean a(vt_1 vt_12) {
        vt_12.add = this.jpN;
        vt_12.ago = this.srQ;
        vt_12.agp = this.srR;
        vt_12.agq = this.srS.getTime();
        vt_12.agr = this.eAl;
        vt_12.ags = this.srT;
        return true;
    }

    @Override
    public boolean b(vt_1 vt_12) {
        this.jpN = vt_12.add;
        this.srQ = vt_12.ago;
        this.srR = vt_12.agp;
        this.srS = new Date(vt_12.agq);
        this.eAl = vt_12.agr;
        this.srT = vt_12.ags;
        return true;
    }
}

