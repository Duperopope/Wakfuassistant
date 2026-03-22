/*
 * Decompiled with CFR 0.152.
 */
public class fkS
extends fkQ
implements fkU {
    private String sCN = "";
    private short eON = (short)-1;
    private int sCP = 0;

    fkS() {
    }

    @Override
    public String gct() {
        return this.sCN;
    }

    @Override
    public void sP(String string) {
        this.sCN = string;
    }

    public short elB() {
        return this.eON;
    }

    public void dP(short s) {
        this.eON = s;
    }

    public int gcF() {
        return this.sCP;
    }

    public void gcG() {
        ++this.sCP;
    }

    @Override
    public void a(wm_1 wm_12) {
        wm_12.ahe = this.sCN;
        wm_12.ahf = new wn_2();
        wm_12.ahf.ahg = this.eON;
        wm_12.ahf.ahh = this.sCP;
    }

    @Override
    public void b(wm_1 wm_12) {
        this.sCN = wm_12.ahe;
        this.eON = wm_12.ahf.ahg;
        this.sCP = wm_12.ahf.ahh;
    }
}

