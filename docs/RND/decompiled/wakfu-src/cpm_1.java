/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collections;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cPM
 */
public abstract class cpm_1 {
    protected static final Logger nii = Logger.getLogger(cpm_1.class);
    public static final String nij = "mru";
    protected boolean cHn = true;
    protected boolean bmh = true;
    public static final String nik = awx_2.dnF.bQk();
    public static final String nil = awx_2.dnL.bQk();
    public static final String nim = awx_2.dnJ.bQk();
    public static final String nin = "9ed34b";
    public static final String nio = "f48140";
    public static final cpm_1[] nip = new cpm_1[0];
    protected Object cqO;

    public abstract cps_1 eLz();

    public abstract void run();

    public abstract boolean bxO();

    public boolean isUsable() {
        return this.bmh;
    }

    public void setUsable(boolean bl) {
        this.bmh = bl;
    }

    public void aH(Object object) {
        this.cqO = object instanceof aJI ? ((aJI)object).chQ() : object;
    }

    public String getLabel() {
        ahv_2 ahv_22 = new ahv_2().ceu().ih(this.isEnabled() ? nik : nim);
        ahv_22.c(this.eLA());
        ahv_22.cev();
        return ahv_22.ceL();
    }

    public abstract String ely();

    public String eLA() {
        return aum_0.cWf().c("desc.mru." + this.ely(), new Object[0]);
    }

    public String getStyle() {
        return nij + this.eLB();
    }

    protected int eLB() {
        return this.eLz().avZ();
    }

    public String eLC() {
        return this.getLabel();
    }

    @Nullable
    public String eLv() {
        return null;
    }

    protected static boolean ac(bgt_0 bgt_02) {
        return bgt_02.i(false, true);
    }

    public boolean isEnabled() {
        return this.cHn;
    }

    public void setEnabled(boolean bl) {
        this.cHn = bl;
    }

    public Iterable<fka_1> eLy() {
        return Collections.emptyList();
    }

    public abstract cpm_1 eLD();

    protected final void d(rw_0 rw_02) {
        boolean bl;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bCA bCA2 = (bCA)this.cqO;
        ArrayList<ry_0> arrayList = ry_0.aa(bCA2.bei());
        boolean bl2 = bl = bCA2.aVK().isEmpty() && arrayList.isEmpty();
        if (bl || bCA2.T(bgt_02.ddI().bqg())) {
            this.a(rw_02, bgt_02, bCA2);
        } else {
            aPd.e("too.far.to.interact", new Object[0]);
        }
    }

    protected void a(rw_0 rw_02, RG rG, ni_1 ni_12) {
        ni_12.a(rw_02, rG);
    }
}

