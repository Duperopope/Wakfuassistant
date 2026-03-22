/*
 * Decompiled with CFR 0.152.
 */
public class aIW
extends air_0 {
    aIW(zh_0 zh_02) {
        super(zh_02);
    }

    protected Float bou() {
        bof_1 bof_12 = boh_1.ehH().ehM().ehG();
        return Float.valueOf(bof_12 == null ? 0.0f : bof_12.blu());
    }

    @Override
    protected /* synthetic */ Object getValue() {
        return this.bou();
    }
}

