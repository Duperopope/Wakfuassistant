/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aJc
 */
public class ajc_0
extends air_0 {
    ajc_0(zh_0 zh_02) {
        super(zh_02);
    }

    protected Float bou() {
        bof_1 bof_12 = boh_1.ehH().ehM().ehG();
        return Float.valueOf(bof_12 == null ? 0.0f : bof_12.blD());
    }

    @Override
    protected /* synthetic */ Object getValue() {
        return this.bou();
    }
}

