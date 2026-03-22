/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bER
 */
public class ber_0
implements aeh_2 {
    private static final String jRH = "shardSlotList";
    private static final String jRI = "shardsEffects";
    private static final String jRJ = "hasShardEffects";
    private static final String jRK = "hasShardsSlots";
    private static final String jRL = "hasSublimation";
    private static final String jRM = "sublimationName";
    private static final String jRN = "hasSpecialSublimation";
    private static final String jRO = "specialSublimationName";
    private static final String jRP = "formattedSpecialSublimationName";
    private static final String jRQ = "isEditable";
    private static final String jRR = "remainingCharges";
    private static final String jRS = "remainingChargesText";
    private static final String jRT = "<UNKNOWN>";
    private static final String[] jRU = new String[]{"shardSlotList", "shardsEffects", "hasShardsSlots", "isEditable", "remainingCharges", "remainingChargesText"};
    @NotNull
    private final fhi_0 jRV;
    private final List<bES> jRW = new ArrayList<bES>();

    public ber_0(fhc_0 fhc_02) {
        this.jRV = fhc_02.fYy() ? new fhi_0() : fhi_0.spR;
    }

    public ber_0(ffV ffV2) {
        this.jRV = ffV2.dXg() ? ffV2.eAZ() : fhi_0.spR;
        for (Map.Entry<Byte, fhn_0> entry : this.jRV.dTS().entrySet()) {
            byte by = entry.getKey();
            fhn_0 fhn_02 = entry.getValue();
            this.jRW.add(new bES(by, fhn_02, ffV2));
        }
    }

    @Override
    public String[] bxk() {
        return jRU;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(jRH)) {
            return this.jRW;
        }
        if (string.equals(jRI)) {
            return this.dqX();
        }
        if (string.equals(jRJ)) {
            return this.dSR();
        }
        if (string.equals(jRK)) {
            return this.jRV.fYN();
        }
        if (string.equals(jRQ)) {
            return this.jRV.isEditable();
        }
        if (string.equals(jRL)) {
            return this.jRV.fYQ();
        }
        if (string.equals(jRM)) {
            Object r = fgD.fXh().Vd(this.jRV.ahy());
            if (r == null) {
                return jRT;
            }
            return ((fhc_0)r).getName();
        }
        if (string.equals(jRN)) {
            return this.jRV.dXi();
        }
        if (string.equals(jRO)) {
            Object r = fgD.fXh().Vd(this.jRV.ahA());
            if (r == null) {
                return jRT;
            }
            return ((fhc_0)r).getName();
        }
        if (string.equals(jRP)) {
            String string2 = ber_0.Gz(this.jRV.ahA());
            return string2 != null ? string2 : jRT;
        }
        if (string.equals(jRR)) {
            byte by = this.jRV.fYJ();
            if (by < 0) {
                return 0;
            }
            return by;
        }
        if (string.equals(jRS)) {
            byte by = this.jRV.fYJ();
            return aum_0.cWf().c("item.charges", by < 0 ? (byte)0 : by);
        }
        return null;
    }

    @Nullable
    public static String Gz(int n) {
        if (n == 0) {
            return null;
        }
        Object r = fgD.fXh().Vd(n);
        if (r == null) {
            return null;
        }
        fhp_0 fhp_02 = ((fhc_0)r).dCC();
        if (fhp_02 == null) {
            return null;
        }
        fgj fgj2 = fhp_02.dCF() == fhr_0.sqy ? fgj.siF : fgj.siH;
        return new ahv_2().ceC().ih(beo_0.e(fgj2)).c(((fhc_0)r).getName()).ceD().ceL();
    }

    private ArrayList<String> dqX() {
        ArrayList<String> arrayList = new ArrayList<String>();
        int n = this.jRW.size();
        for (int i = 0; i < n; ++i) {
            arrayList.addAll(this.jRW.get(i).dSV());
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(0, aum_0.cWf().c("effectOnEquip", new Object[0]));
        }
        return arrayList;
    }

    private boolean dSR() {
        int n = this.jRW.size();
        for (int i = 0; i < n; ++i) {
            if (this.jRW.get(i).dSV().isEmpty()) continue;
            return true;
        }
        return false;
    }

    public bES bV(byte by) {
        return this.jRW.get(by);
    }

    public String toString() {
        return "ShardsDisplayer{m_shards=" + String.valueOf(this.jRV) + ", m_shardsSlotDisplayers=" + String.valueOf(this.jRW) + "}";
    }
}

