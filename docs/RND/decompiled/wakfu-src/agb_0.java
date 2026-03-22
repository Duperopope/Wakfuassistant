/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity3D;

/*
 * Renamed from agB
 */
public abstract sealed class agb_0
extends Enum<agb_0>
permits agc_0, agd_0, age_0 {
    public static final /* enum */ agb_0 cul = new agc_0();
    public static final /* enum */ agb_0 cum = new agd_0();
    public static final /* enum */ agb_0 cun = new age_0();
    static final float[] cuo;
    private static final /* synthetic */ agb_0[] cup;

    public static agb_0[] values() {
        return (agb_0[])cup.clone();
    }

    public static agb_0 valueOf(String string) {
        return Enum.valueOf(agb_0.class, string);
    }

    public abstract void a(Entity3D var1, byte var2, float var3, float var4, float var5, float var6);

    private static /* synthetic */ agb_0[] bzf() {
        return new agb_0[]{cul, cum, cun};
    }

    static {
        cup = agb_0.bzf();
        cuo = new float[8];
    }
}

