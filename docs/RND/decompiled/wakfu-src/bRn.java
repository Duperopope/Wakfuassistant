/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class bRn
implements aeh_2 {
    public static final String kZL = "typeFilterList";
    public static final String kZM = "noFilterSelected";
    public static final String[] kZN = new String[]{"typeFilterList", "noFilterSelected"};
    protected final ArrayList<bRo> kZO = new ArrayList();

    public bRn() {
        this.ekF();
    }

    protected final void ekF() {
        this.kZO.clear();
        for (bRr bRr2 : bRr.values()) {
            if (!this.d(bRr2)) continue;
            this.kZO.add(this.c(bRr2));
        }
    }

    private boolean d(bRr bRr2) {
        return bRr2 != bRr.lab;
    }

    protected bRo c(bRr bRr2) {
        return new bRo(bRr2.aFW());
    }

    @Override
    public String[] bxk() {
        return kZN;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kZL)) {
            return this.kZO;
        }
        if (string.equals(kZM)) {
            return this.kZO.stream().noneMatch(bRo::bqr) && !bif_2.dYO().dYs();
        }
        return null;
    }

    public bRo cK(byte by) {
        for (bRo bRo2 : this.kZO) {
            if (bRo2.aJr() != by) continue;
            return bRo2;
        }
        return null;
    }

    public void a(bRr bRr2, boolean bl) {
        this.q(bRr2.aFW(), bl);
    }

    public void q(byte by, boolean bl) {
        this.b(by, bl, true);
    }

    public void b(byte by, boolean bl, boolean bl2) {
        for (bRo bRo2 : this.kZO) {
            if (bRo2.aJr() != by) continue;
            bRo2.setSelected(bl);
            break;
        }
        if (bl2) {
            ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.liH, this.ekH());
        }
        fse_1.gFu().a((aef_2)this, kZM);
    }

    public void dYG() {
        for (bRo bRo2 : this.kZO) {
            bRo2.setSelected(true);
        }
    }

    public void dYH() {
        for (bRo bRo2 : this.kZO) {
            bRo2.setSelected(false);
        }
    }

    public void ekG() {
        this.nv(((bsg_1)aie_0.cfn().bmH()).f(bsn_1.liH));
    }

    private String ekH() {
        StringBuilder stringBuilder = new StringBuilder();
        for (bRo bRo2 : this.kZO) {
            if (!bRo2.f(null)) continue;
            stringBuilder.append(bRo2.aJr()).append(";");
        }
        return stringBuilder.toString();
    }

    public void nv(String string) {
        String[] stringArray = this.kZO.iterator();
        while (stringArray.hasNext()) {
            String[] stringArray2 = stringArray.next();
            stringArray2.setSelected(false);
        }
        for (String string2 : stringArray = string.split(";")) {
            byte by = Bw.a((Object)string2, (byte)-1);
            if (by == -1) continue;
            this.b(by, true, false);
        }
    }

    public ArrayList<bRo> ekI() {
        return this.kZO;
    }

    public boolean a(fsn_1 fsn_12, byte by) {
        bRo bRo2 = this.cK(by);
        if (bRo2 == null) {
            return false;
        }
        return !bRo2.f(fsn_12);
    }
}

