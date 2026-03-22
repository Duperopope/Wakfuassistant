/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class bwj
extends bwi {
    @NotNull
    private final eJS jwM;
    @NotNull
    private final bhx_0 jwN;

    bwj(@NotNull eJS eJS2) {
        this.jwM = eJS2;
        this.jwN = blq_1.i(eJS2);
    }

    @Override
    @Nullable
    public bgt_0 dLD() {
        return null;
    }

    @Override
    @NotNull
    public eJS dLE() {
        return this.jwM;
    }

    @Override
    public long Sn() {
        return this.jwM.Sn();
    }

    @Override
    public long Xi() {
        return this.jwM.Xi();
    }

    @Override
    public String getName() {
        return blq_1.j(this.jwM);
    }

    @Override
    public short cmL() {
        return eJW.A(this.jwM);
    }

    @Override
    public <T extends bgy> T dcP() {
        return (T)this.jwN;
    }

    @Override
    public boolean bbj() {
        return false;
    }
}

