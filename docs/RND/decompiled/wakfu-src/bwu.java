/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

public class bwu
extends bwv {
    private static final bfB jyG = new bfB(0);

    public bwu(bgt_0 bgt_02, bfF bfF2) {
        super(bgt_02, bfF2);
    }

    @Override
    String dMl() {
        return aum_0.cWf().c("build.edit", new Object[0]);
    }

    @Override
    String dMm() {
        return this.jyI.getName();
    }

    @Override
    @Unmodifiable List<bfC> dMn() {
        if (this.jyI.dhe()) {
            return List.of(bfD.hUw.bp((short)this.jyI.dhd().tL()));
        }
        return bfD.hUw.ab(this.jyH);
    }

    @Override
    bfC dMo() {
        return bfD.hUw.bp((short)this.jyI.dhd().tL());
    }

    @Override
    public List<bfB> dMp() {
        ArrayList<bfB> arrayList = new ArrayList<bfB>(jyE);
        arrayList.add(jyG);
        return arrayList;
    }

    @Override
    @Nullable
    bfB dMq() {
        if (this.jyI.dhd().ws() == 0) {
            return jyG;
        }
        return super.dMq();
    }

    @Override
    @Nullable
    String dMr() {
        if (this.jyI.wp() == 0) {
            return aum_0.cWf().c("builds.change.level.tuto.disabled", new Object[0]);
        }
        if (this.jyI.dhe()) {
            return aum_0.cWf().c("build.cannot.change.permanent.build.level", new Object[0]);
        }
        return null;
    }

    @Override
    public short dMs() {
        return 19824;
    }

    @Override
    public boolean dMt() {
        return this.jyI.wp() > 0;
    }
}

