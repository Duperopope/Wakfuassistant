/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class bve
implements aeh_2 {
    public static final String jrs = "name";
    public static final String jrt = "position";
    public static final String jru = "authorisations";
    public static final String jrv = "canBeEdited";
    public static final String jrw = "canBeDeleted";
    public static final String jrx = "id";
    public static final String jry = "modulationColor";
    public static final String[] jrz = new String[]{"name", "position", "authorisations", "canBeEdited", "canBeDeleted", "id", "modulationColor"};
    private final buG[] jrA;
    private final fab jrB;

    public bve(fab fab2) {
        this.jrB = fab2;
        eyh_2[] eyh_2Array = eyh_2.values();
        this.jrA = new buG[eyh_2Array.length];
        for (int i = 0; i < this.jrA.length; ++i) {
            this.jrA[i] = new buG(eyh_2Array[i]);
        }
        for (buG buG2 : this.jrA) {
            boolean bl = this.jrB.b(buG2.dJm());
            buG2.gX(bl);
        }
    }

    @Override
    public String[] bxk() {
        return jrz;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(jrs)) {
            return this.getName();
        }
        if (string.equals(jrt)) {
            return aea_2.xj(this.jrB.bfE() + 1);
        }
        if (string.equals(jrv)) {
            return this.dJl();
        }
        if (string.equals(jrw)) {
            return this.dJP();
        }
        if (string.equals(jrx)) {
            return this.jrB.Sn();
        }
        if (string.equals(jru)) {
            return this.jrA;
        }
        if (string.equals(jry)) {
            return this.getModulationColor();
        }
        return null;
    }

    public axb_2 getModulationColor() {
        bve bve2 = (bve)fse_1.gFu().vY("overGuildRank");
        if (bve2 != null && bve2.Sn() == this.Sn()) {
            return awx_2.dnD;
        }
        bve bve3 = (bve)fse_1.gFu().vY("draggedGuildRank");
        if (bve3 != null && bve3.Sn() == this.Sn()) {
            return awx_2.dnE;
        }
        bve bve4 = (bve)fse_1.gFu().vY("selectedGuildRank");
        if (bve4 != null && bve4.Sn() == this.Sn()) {
            return awx_2.dnF;
        }
        return new awx_2(1.0f, 1.0f, 1.0f, 0.7f);
    }

    public boolean dJP() {
        if (!this.dJl()) {
            return false;
        }
        long l = bvk.dJZ().drj();
        long l2 = bvk.dJZ().dKs();
        return this.jrB.Sn() != l && this.jrB.Sn() != l2;
    }

    public boolean dJl() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bjn_1 bjn_12 = bgt_02.dpI();
        ezz_1 ezz_12 = bjn_12.jP(bgt_02.Sn());
        if (ezz_12 == null) {
            return false;
        }
        fab fab2 = bjn_12.jR(ezz_12.Xm());
        if (fab2 == null) {
            return false;
        }
        return fab2.b(eyh_2.rKH, this.dJS().bfE());
    }

    public String getName() {
        return this.jrB.getName();
    }

    public long dJQ() {
        ArrayList<eyh_2> arrayList = new ArrayList<eyh_2>();
        for (buG buG2 : this.jrA) {
            if (!buG2.isChecked()) continue;
            arrayList.add(buG2.dJm());
        }
        return eyh_2.aN(arrayList);
    }

    public long dJR() {
        return this.jrB.fQk();
    }

    public long Sn() {
        return this.jrB.Sn();
    }

    public fab dJS() {
        return this.jrB;
    }

    public bvi dJT() {
        return new bvi(this.jrB);
    }

    public boolean equals(Object object) {
        if (!(object instanceof bve)) {
            return false;
        }
        bve bve2 = (bve)object;
        return bve2.dJQ() == this.dJQ() && bve2.Sn() == this.Sn() && bve2.getName().equals(this.getName());
    }
}

