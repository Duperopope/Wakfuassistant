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

public class bwv
extends bws {
    protected final bgt_0 jyH;
    protected final bfF jyI;
    private final int jyJ;

    public bwv(bgt_0 bgt_02, bfF bfF2) {
        this.jyH = bgt_02;
        this.jyI = bfF2;
        this.jyJ = eIp.d(this.jyH, this.jyI.wp());
    }

    @Override
    String dMl() {
        return aum_0.cWf().c("build.save.as", new Object[0]);
    }

    @Override
    String dMm() {
        return aum_0.cWf().c("build.copy.name", this.jyI.getName());
    }

    @Override
    @Unmodifiable List<bfC> dMn() {
        return bfD.hUw.e(this.jyH, this.jyJ);
    }

    @Override
    bfC dMo() {
        if (this.jyI.dhd().tL() == -1) {
            return bfD.hUw.dgM();
        }
        if (this.jyJ <= this.jyI.dhd().tL()) {
            return bfD.hUw.bp((short)this.jyI.dhd().tL());
        }
        List<bfC> list = this.dMn();
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return list.get(1);
    }

    @Override
    @Nullable
    bfB dMq() {
        if (this.jyI.dhd().ws() < 1) {
            return null;
        }
        return (bfB)jyE.get(this.jyI.dhd().ws() - 1);
    }

    @Override
    @Nullable
    String dMr() {
        return aum_0.cWf().c("build.save.as.level.popup", new Object[0]);
    }

    @Override
    public short dMs() {
        return 18646;
    }
}

