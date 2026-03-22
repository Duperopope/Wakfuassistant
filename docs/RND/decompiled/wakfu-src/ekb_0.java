/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Map;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eKB
 */
public final class ekb_0
extends Enum<ekb_0> {
    public static final /* enum */ ekb_0 qCW = new ekb_0(1, 10, null);
    public static final /* enum */ ekb_0 qCX = new ekb_0(2, 20, qCW);
    public static final /* enum */ ekb_0 qCY = new ekb_0(3, 30, qCX);
    public static final /* enum */ ekb_0 qCZ = new ekb_0(4, 40, qCY);
    public static final /* enum */ ekb_0 qDa = new ekb_0(5, 50, qCZ);
    public static final /* enum */ ekb_0 qDb = new ekb_0(6, 60, qDa);
    public static final /* enum */ ekb_0 qDc = new ekb_0(7, 70, qDb);
    public static final /* enum */ ekb_0 qDd = new ekb_0(8, 80, qDc);
    public static final /* enum */ ekb_0 qDe = new ekb_0(9, 90, qDd);
    public static final /* enum */ ekb_0 qDf = new ekb_0(10, 100, qDe);
    public static final /* enum */ ekb_0 qDg = new ekb_0(11, 110, qDf);
    public static final /* enum */ ekb_0 qDh = new ekb_0(12, 120, qDg);
    public static final /* enum */ ekb_0 qDi = new ekb_0(13, 130, qDh);
    public static final /* enum */ ekb_0 qDj = new ekb_0(14, 140, qDi);
    public static final /* enum */ ekb_0 qDk = new ekb_0(15, 150, qDj);
    public static final /* enum */ ekb_0 qDl = new ekb_0(16, 160, qDk);
    public static final ekb_0 qDm;
    public static final ekb_0 qDn;
    public static final short qDo = 0;
    private final short qDp;
    private final short qDq;
    @Nullable
    private final ekb_0 qDr;
    private static final /* synthetic */ ekb_0[] qDs;

    public static ekb_0[] values() {
        return (ekb_0[])qDs.clone();
    }

    public static ekb_0 valueOf(String string) {
        return Enum.valueOf(ekb_0.class, string);
    }

    private ekb_0(@Nullable int n2, int n3, ekb_0 ekb_02) {
        this.qDp = (short)n2;
        this.qDq = (short)n3;
        this.qDr = ekb_02;
    }

    public short aVf() {
        if (this.qDr == null) {
            return 0;
        }
        return (short)(this.qDr.aVe() + 1);
    }

    @NotNull
    public static ekb_0 dS(short s) {
        for (ekb_0 ekb_02 : ekb_0.values()) {
            if (ekb_02.qDq < s || ekb_02.qDr != null && ekb_02.qDr.qDq >= s) continue;
            return ekb_02;
        }
        return s > ekb_0.qDn.qDq ? qDn : qDm;
    }

    @Nullable
    public static ekb_0 dT(short s) {
        for (ekb_0 ekb_02 : ekb_0.values()) {
            if (ekb_02.qDp != s) continue;
            return ekb_02;
        }
        return null;
    }

    @NotNull
    public <Value> ekc_0<Value> a(@NotNull Map<ekb_0, Value> map, boolean bl) {
        if (map.containsKey((Object)this)) {
            return new ekc_0<Value>(false, this, map.get((Object)this));
        }
        if (!bl) {
            return new ekc_0<Object>(false, null, null);
        }
        ekb_0 ekb_02 = this.fyz();
        if (ekb_02 == null) {
            return new ekc_0<Object>(false, null, null);
        }
        while (ekb_02 != null && !map.containsKey((Object)ekb_02)) {
            ekb_02 = ekb_02.fyz();
        }
        if (ekb_02 == null) {
            return new ekc_0<Object>(true, null, null);
        }
        return new ekc_0<Value>(true, ekb_02, map.get((Object)ekb_02));
    }

    @Generated
    public short aIi() {
        return this.qDp;
    }

    @Generated
    public short aVe() {
        return this.qDq;
    }

    @Nullable
    @Generated
    public ekb_0 fyz() {
        return this.qDr;
    }

    private static /* synthetic */ ekb_0[] fyA() {
        return new ekb_0[]{qCW, qCX, qCY, qCZ, qDa, qDb, qDc, qDd, qDe, qDf, qDg, qDh, qDi, qDj, qDk, qDl};
    }

    static {
        qDs = ekb_0.fyA();
        qDm = qCW;
        qDn = qDl;
    }
}

