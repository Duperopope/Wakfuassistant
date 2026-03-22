/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Collections;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

public final class eHH
implements eNl {
    private final ehw_0 qsS;
    private final short qsT;

    public eHH(@NotNull ehw_0 ehw_02, short s) {
        this.qsS = ehw_02;
        this.qsT = s;
    }

    public ehw_0 fvS() {
        return this.qsS;
    }

    @Override
    public long QF() {
        return enp_0.B(this.qsS.d(), this.qsT);
    }

    @Override
    public short cmL() {
        return this.qsT;
    }

    @Override
    public int bab() {
        return 36;
    }

    @Override
    public Iterator<enk_0> iterator() {
        enk_0 enk_02 = (enk_0)eHI.qsU.oy(this.qsS.aZH());
        if (enk_02 == null) {
            return Collections.emptyList().iterator();
        }
        return Collections.singleton(enk_02).iterator();
    }

    @Override
    public short fvT() {
        return 0;
    }

    @Override
    public short fvU() {
        return 0;
    }

    @Override
    public short fvV() {
        return 0;
    }

    public String toString() {
        return "AptitudeBonusEffectContainer{m_bonusModel=" + String.valueOf(this.qsS) + ", m_level=" + this.qsT + "}";
    }
}

