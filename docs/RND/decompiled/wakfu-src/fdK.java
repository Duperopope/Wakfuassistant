/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Comparator;
import java.util.List;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class fdK
extends fdz_0 {
    private final boolean rXz;
    private final fdn_0 rXA;
    private final fdn_0 rXB;
    private final List<fdM> rXC;
    private final List<fdo_0> rXD;
    private final List<fdq_0> rXE;
    @Nullable
    private final ang_2 rXF;

    public fdK(int n, int n2, eIx eIx2, int n3, boolean bl, fdn_0 fdn_02, fdn_0 fdn_03, List<fdM> list, List<fdo_0> list2, List<fdq_0> list3, @Nullable ang_2 ang_22) {
        super(n, n2, eIx2, n3);
        this.rXz = bl;
        this.rXA = fdn_02;
        this.rXB = fdn_03;
        this.rXC = list;
        this.rXD = list2;
        this.rXE = list3;
        this.rXF = ang_22;
        list3.sort(Comparator.comparingInt(fdq_0::cxR).thenComparingInt(fdq_0::d));
    }

    @Generated
    public static fdl_0 fTX() {
        return new fdl_0();
    }

    @Generated
    public boolean cxF() {
        return this.rXz;
    }

    @Generated
    public fdn_0 fTY() {
        return this.rXA;
    }

    @Generated
    public fdn_0 fTZ() {
        return this.rXB;
    }

    @Generated
    public List<fdM> dPN() {
        return this.rXC;
    }

    @Generated
    public List<fdo_0> fUa() {
        return this.rXD;
    }

    @Generated
    public List<fdq_0> fUb() {
        return this.rXE;
    }

    @Nullable
    @Generated
    public ang_2 daw() {
        return this.rXF;
    }

    @Generated
    public String toString() {
        return "IESteleParameter(m_randomizedRewards=" + this.cxF() + ", m_activationPrice=" + String.valueOf(this.fTY()) + ", m_additionalPrice=" + String.valueOf(this.fTZ()) + ", m_difficulties=" + String.valueOf(this.dPN()) + ", m_rewardPool=" + String.valueOf(this.fUa()) + ", m_rewardTiers=" + String.valueOf(this.fUb()) + ", m_activationCriterion=" + String.valueOf(this.daw()) + ")";
    }
}

