/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

public class bmj
extends blP {
    public static final String izQ = "title";
    public static final String izR = "rarityColor";
    @Nullable
    private final byo_2 izS;

    public bmj(int n) {
        super(fm_1.pA, n);
        this.izS = byp_2.lyZ.JE(n);
    }

    @Override
    @Nullable
    protected bgv_2 dun() {
        return null;
    }

    public boolean dvJ() {
        return this.izS != null;
    }

    public String dvK() {
        return bmj.DX(this.dut());
    }

    public static String DX(int n) {
        return aum_0.cWf().a(34, (long)n, new Object[0]);
    }

    public static String DY(int n) {
        return aum_0.cWf().b(34, (long)n, new Object[0]);
    }

    public static boolean DZ(int n) {
        return aum_0.cWf().e(34, n);
    }

    @Override
    public Optional<String> dur() {
        return Optional.of(bmj.DY(this.dut()));
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "title": {
                return this.dvK();
            }
            case "rarityColor": {
                if (this.izS == null) {
                    return null;
                }
                return beo_0.d(this.izS.egk().gkb());
            }
        }
        return super.eu(string);
    }
}

