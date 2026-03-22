/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.EnumSet;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from evT
 */
public final class evt_1
extends Enum<evt_1> {
    public static final /* enum */ evt_1 owK = new evt_1(0, evw_1.oxz, 0, 0, 0);
    public static final /* enum */ evt_1 owL = new evt_1(101, evw_1.oxA, 107, 101, 0);
    public static final /* enum */ evt_1 owM = new evt_1(107, evw_1.oxB, 107, 101, 0);
    public static final float owN = 0.5f;
    public final int owO;
    private final evw_1 owP;
    private final int owQ;
    private final int owR;
    private final int owS;
    private static final /* synthetic */ evt_1[] owT;

    public static evt_1[] values() {
        return (evt_1[])owT.clone();
    }

    public static evt_1 valueOf(String string) {
        return Enum.valueOf(evt_1.class, string);
    }

    private evt_1(int n2, evw_1 evw_12, int n3, int n4, int n5) {
        this.owO = n2;
        this.owP = evw_12;
        this.owQ = n3;
        this.owR = n4;
        this.owS = n5;
    }

    @NotNull
    public static evt_1 Oq(int n) {
        for (evt_1 evt_12 : evt_1.values()) {
            if (evt_12.owO != n) continue;
            return evt_12;
        }
        return owK;
    }

    public int d() {
        return this.owO;
    }

    public boolean b(evv_1 evv_12) {
        return this.owP.feG().contains((Object)evv_12);
    }

    public EnumSet<evv_1> fex() {
        return this.owP.feG();
    }

    public int fey() {
        return this.owQ;
    }

    public int fez() {
        return this.owR;
    }

    public float fdP() {
        float f2 = ewo_0.oBF.p(ewr_0.oFr);
        if (this.owP.b(evv_1.oxu)) {
            return f2 * (1.0f + (float)ewo_0.oBF.i(ewr_0.oFs) / 100.0f);
        }
        return f2;
    }

    public int fdQ() {
        return this.owS;
    }

    public float feA() {
        float f2 = ewo_0.oBF.p(ewr_0.oFp);
        if (this.owP.b(evv_1.oxt)) {
            return f2 * (1.0f + (float)ewo_0.oBF.i(ewr_0.oFq) / 100.0f);
        }
        return f2;
    }

    public float feB() {
        float f2 = ewo_0.oBF.p(ewr_0.oFv);
        if (this.owP.b(evv_1.oxw)) {
            return f2 * (1.0f + (float)ewo_0.oBF.i(ewr_0.oFw) / 100.0f);
        }
        return f2;
    }

    public float feC() {
        float f2 = ewo_0.oBF.p(ewr_0.oFt);
        if (this.owP.b(evv_1.oxv)) {
            return f2 * (1.0f + (float)ewo_0.oBF.i(ewr_0.oFu) / 100.0f);
        }
        return f2;
    }

    public String toString() {
        return "SubscriptionLevel{name=" + this.name() + ", m_id=" + this.owO + ", m_rightsSet=" + String.valueOf((Object)this.owP) + ", m_premiumLevel=" + this.owQ + ", m_freeLevel=" + this.owR + ", m_craftXpRatio=" + this.fdP() + ", m_lootExtraRoll=" + this.owS + ", m_xpRatio=" + this.feA() + ", m_dropRatio=" + this.feB() + ", m_kamasRatio=" + this.feC() + "}";
    }

    private static /* synthetic */ evt_1[] feD() {
        return new evt_1[]{owK, owL, owM};
    }

    static {
        owT = evt_1.feD();
    }
}

