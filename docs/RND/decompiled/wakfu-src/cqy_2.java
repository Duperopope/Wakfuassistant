/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cQY
 */
public class cqy_2
extends cpm_1 {
    @Nullable
    private final bjz_1 nlN;

    cqy_2() {
        this(null);
    }

    public cqy_2(@Nullable bjz_1 bjz_12) {
        this.nlN = bjz_12;
    }

    @Override
    public void run() {
        if (this.nlN == null) {
            return;
        }
        bpm_1.dCG().bI(this.nlN.aWP()).ifPresent(bpg_12 -> cuj_2.eRB().f((bpg_1)bpg_12));
    }

    @Override
    public boolean bxO() {
        if (this.nlN == null) {
            return false;
        }
        return bpm_1.dCG().bI(this.nlN.aWP()).isPresent();
    }

    @Override
    public String ely() {
        return "openInEncyclopedia";
    }

    @Override
    protected int eLB() {
        return crc_2.nms.nnW;
    }

    @Override
    public cps_1 eLz() {
        return cps_1.njS;
    }

    @Override
    public cpm_1 eLD() {
        return new cqy_2(this.nlN);
    }
}

