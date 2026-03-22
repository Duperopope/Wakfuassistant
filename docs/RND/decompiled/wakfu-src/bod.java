/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bod
extends bny_0 {
    public static final String iMx = "mysteryBoxBronze";
    public static final String iMy = "mysteryBoxSilver";
    public static final String iMz = "mysteryBoxGold";
    public static final String iMA = "mysteryBoxBronzeQuantity";
    public static final String iMB = "mysteryBoxSilverQuantity";
    public static final String iMC = "mysteryBoxGoldQuantity";
    private final bxa_0 iMD;

    public bod(int n, @NotNull bxa_0 bxa_02) {
        super(n);
        this.iMD = bxa_02;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(iMx)) {
            return this.EH(199);
        }
        if (string.equals(iMy)) {
            return this.EH(59);
        }
        if (string.equals(iMz)) {
            return this.EH(0);
        }
        if (string.equals(iMA)) {
            return "x" + this.EI(199);
        }
        if (string.equals(iMB)) {
            return "x" + this.EI(59);
        }
        if (string.equals(iMC)) {
            return "x" + this.EI(0);
        }
        return super.eu(string);
    }

    @Override
    protected int dAg() {
        return 2;
    }

    @Override
    public short aVf() {
        return (short)this.iMD.rI();
    }

    @Override
    public boolean aBk() {
        return true;
    }

    @Override
    protected boolean cmT() {
        return true;
    }

    @Override
    public boolean bfb() {
        return false;
    }

    @Override
    public long aqZ() {
        return this.iMD.blh();
    }

    @Override
    protected String dAl() {
        return aum_0.cWf().a(77, this.iMD.coNN(), new Object[0]);
    }

    @Override
    public String getName() {
        return aum_0.cWf().a(89, (long)this.iMD.coK(), new Object[0]);
    }

    @Override
    public String dah() {
        return aum_0.cWf().b(89, (long)this.iMD.coK(), new Object[0]);
    }

    @Override
    protected String dAf() {
        return null;
    }

    @Override
    protected String dAe() {
        return null;
    }

    @Override
    protected String dAd() {
        return "DungeonLadderNoCrown";
    }

    @Override
    public beg_1 EH(int n) {
        Optional<Integer> optional = fcQ.fL(this.iMD.d(), n);
        if (optional.isEmpty()) {
            return null;
        }
        Object r = fgD.fXh().Vd(optional.get());
        return new beg_1((fhc_0)r);
    }

    @Override
    public int a(bom bom2) {
        return this.EI(bom2.dAJ());
    }

    @Override
    public int EI(int n) {
        return fcQ.fK(this.iMD.d(), n);
    }

    @Override
    @Nullable
    protected String dAh() {
        return bof.b(this.iMD.dAj());
    }

    @Override
    @Nullable
    protected String dAi() {
        return aum_0.cWf().c("dungeon.gameplay." + this.iMD.dAj().aIi(), new Object[0]);
    }

    @Override
    protected eIc dAj() {
        return this.iMD.dAj();
    }

    @Override
    public long dAk() {
        return this.iMD.coNN();
    }

    @Override
    protected boolean dAc() {
        return false;
    }
}

