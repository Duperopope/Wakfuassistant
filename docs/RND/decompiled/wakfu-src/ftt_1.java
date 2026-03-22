/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fTT
 */
public class ftt_1
implements ftw_1 {
    private String p;
    private final ArrayList<ftu_1> vhj = new ArrayList();
    private boolean crD = false;

    public ftt_1(apd_1 apd_12) {
        if (!apd_12.getName().equalsIgnoreCase("fontDefinition") || apd_12.fq("name") == null) {
            return;
        }
        apd_1 apd_13 = apd_12.fq("name");
        this.p = apd_13.bCt();
        this.vhj.clear();
        ArrayList<apd_1> arrayList = apd_12.fo("desc");
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            apd_1 apd_14 = arrayList.get(i);
            apd_1 apd_15 = apd_14.fq("path");
            apd_1 apd_16 = apd_14.fq("lang");
            apd_1 apd_17 = apd_14.fq("size");
            apd_1 apd_18 = apd_14.fq("deltaX");
            apd_1 apd_19 = apd_14.fq("deltaY");
            if (apd_15 == null || apd_16 == null) continue;
            String string = apd_15.bCt();
            String string2 = apd_16.bCt();
            int n2 = apd_17 != null ? Bw.b((Object)apd_17.bCt(), 0) : 0;
            int n3 = apd_18 != null ? Bw.b((Object)apd_18.bCt(), 0) : 0;
            int n4 = apd_19 != null ? Bw.b((Object)apd_19.bCt(), 0) : 0;
            ftu_1 ftu_12 = new ftu_1();
            ftu_12.lWc = string2;
            ftu_12.awN = string;
            ftu_12.cRf = n2;
            ftu_12.dhZ = n3;
            ftu_12.dia = n4;
            this.vhj.add(ftu_12);
        }
        this.crD = true;
    }

    @Override
    public void k(fhq_2 fhq_22) {
        if (this.crD) {
            int n = this.vhj.size();
            for (int i = 0; i < n; ++i) {
                ftu_1 ftu_12 = this.vhj.get(i);
                fhq_22.a(this.p, ftu_12.bpu(), ftu_12.gHw(), ftu_12.bDw(), ftu_12.getDeltaX(), ftu_12.getDeltaY());
            }
        }
    }

    @Override
    public void a(ftj_1 ftj_12) {
        if (!this.crD) {
            return;
        }
        String string = ftj_12.gHu();
        int n = this.vhj.size();
        for (int i = 0; i < n; ++i) {
            ftu_1 ftu_12 = this.vhj.get(i);
            ftj_12.a(new ftd_2(null, "loadFontDefinition", string, "\"" + this.p + "\"", "\"" + ftu_12.bpu() + "\"", "\"" + ftu_12.gHw() + "\"", String.valueOf(ftu_12.bDw()), String.valueOf(ftu_12.getDeltaX()), String.valueOf(ftu_12.getDeltaY())));
        }
    }

    @Override
    public boolean isInitialized() {
        return true;
    }
}

