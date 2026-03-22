/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.Nullable;

public class bMW
extends bMT {
    public static final String kAc = "deckKey";
    public static final String[] kAd = new String[]{"deckSelectedActiveSpells", "deckSelectedPassiveSpells", "deckKey"};
    private final int kAe;
    private final frd kAf;
    private final fqP<bmx_0> kAg;

    public bMW(int n, frd frd2, bgt_0 bgt_02) {
        this.kAe = n;
        this.kAf = frd2;
        this.kAg = bgt_02.dpH().eeJ();
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(kAc)) {
            return frc.h(this.kAf);
        }
        return super.eu(string);
    }

    @Override
    protected List<Integer> dfY() {
        return this.kAf.eEu();
    }

    @Override
    protected List<Integer> dfZ() {
        return this.kAf.eEv();
    }

    @Override
    @Nullable
    protected bmx_0 Ih(int n) {
        return (bmx_0)this.kAg.pc(n);
    }

    public boolean apo() {
        bgt_0 bgt_02 = cvu_2.eUm();
        return this.kAf.al(bgt_02 != null ? bgt_02 : aue_0.cVJ().cVK());
    }

    public boolean j(bgt_0 bgt_02) {
        return this.kAf.al(bgt_02);
    }

    public frd efh() {
        return this.kAf;
    }

    public int wp() {
        return this.kAe;
    }

    @Override
    public String[] bxk() {
        return kAd;
    }
}

