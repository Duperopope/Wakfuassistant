/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

public class bwt
extends bws {
    private final bgt_0 jyF;

    public bwt(bgt_0 bgt_02) {
        this.jyF = bgt_02;
    }

    @Override
    String dMl() {
        return aum_0.cWf().c("build.create", new Object[0]);
    }

    @Override
    String dMm() {
        return cvu_2.Nh(this.jyF.dnK().ewW());
    }

    @Override
    @Unmodifiable List<bfC> dMn() {
        return bfD.hUw.ab(this.jyF);
    }

    @Override
    bfC dMo() {
        if (this.jyF.dnK().ewW() == -1) {
            return bfD.hUw.dgM();
        }
        return bfD.hUw.bp(this.jyF.cmL());
    }

    @Override
    @Nullable
    bfB dMq() {
        return null;
    }

    @Override
    @Nullable
    String dMr() {
        return null;
    }

    @Override
    public short dMs() {
        return 17905;
    }
}

