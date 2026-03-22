/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

public abstract class bMT
implements aeh_2 {
    public static final String kzU = "deckSelectedActiveSpells";
    public static final String kzV = "deckSelectedPassiveSpells";
    private final bmd_0[] kzW = new bmd_0[fra.sXn.length];
    private final bmd_0[] kzX = new bmd_0[fra.sXo.length];
    public static final String[] kzY = new String[]{"deckSelectedActiveSpells", "deckSelectedPassiveSpells"};

    protected bMT() {
        int n;
        for (n = 0; n < this.kzW.length; ++n) {
            this.kzW[n] = new bmd_0((byte)n, fra.sXn[n], false);
        }
        for (n = 0; n < this.kzX.length; ++n) {
            this.kzX[n] = new bmd_0((byte)n, fra.sXo[n], true);
        }
    }

    protected abstract List<Integer> dfY();

    protected abstract List<Integer> dfZ();

    @Nullable
    protected abstract bmx_0 Ih(int var1);

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "deckSelectedActiveSpells": {
                return this.kzW;
            }
            case "deckSelectedPassiveSpells": {
                return this.kzX;
            }
        }
        return null;
    }

    public void efe() {
        this.a(this.kzW, this.dfY());
        this.a(this.kzX, this.dfZ());
        fse_1.gFu().a((aef_2)this, this.bxk());
    }

    private void a(bmd_0[] bmd_0Array, List<Integer> list) {
        for (int i = 0; i < Math.min(bmd_0Array.length, list.size()); ++i) {
            bmd_0 bmd_02 = bmd_0Array[i];
            if (bmd_02 == null) continue;
            int n = list.get(i);
            bmx_0 bmx_02 = this.Ih(n);
            bmd_02.g(bmx_02);
            fse_1.gFu().a((aef_2)bmd_02, "isLocked");
        }
    }

    public bmd_0 cr(byte by) {
        return this.kzW[by];
    }

    public bmd_0 cs(byte by) {
        return this.kzX[by];
    }

    public bmd_0 i(bmx_0 bmx_02) {
        if (((bmt_0)bmx_02.giP()).eeY()) {
            return this.efg();
        }
        return this.eff();
    }

    private bmd_0 eff() {
        for (bmd_0 bmd_02 : this.kzW) {
            if (bmd_02.eeW() != null || bmd_02.bfb()) continue;
            return bmd_02;
        }
        return null;
    }

    private bmd_0 efg() {
        for (bmd_0 bmd_02 : this.kzX) {
            if (bmd_02.eeW() != null || bmd_02.bfb()) continue;
            return bmd_02;
        }
        return null;
    }

    public Optional<bmd_0> Ii(int n) {
        for (bmd_0 bmd_02 : this.kzW) {
            if (bmd_02.eeW() == null || bmd_02.eeW().axA() != n) continue;
            return Optional.of(bmd_02);
        }
        for (bmd_0 bmd_02 : this.kzX) {
            if (bmd_02.eeW() == null || bmd_02.eeW().axA() != n) continue;
            return Optional.of(bmd_02);
        }
        return Optional.empty();
    }

    @Override
    public String[] bxk() {
        return kzY;
    }
}

