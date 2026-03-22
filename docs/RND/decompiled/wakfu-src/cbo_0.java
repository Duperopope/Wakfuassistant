/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cBO
 */
public class cbo_0
extends cbw_0 {
    public static final byte myK = 6;
    private final ArrayList<cbp_0> myL = new ArrayList(2);

    public void a(cbp_0 cbp_02) {
        this.myL.add(cbp_02);
    }

    public ArrayList<cbp_0> eIY() {
        return this.myL;
    }

    @Override
    public boolean eIS() {
        for (int i = this.myL.size() - 1; i >= 0; --i) {
            if (this.myL.get(i).isValid()) continue;
            return false;
        }
        return true;
    }

    @Override
    public byte eIT() {
        return 6;
    }

    @Override
    public void D(apl_1 apl_12) {
        int n = apl_12.aIy();
        for (int i = 0; i < n; ++i) {
            this.myL.add(cbe_0.E(apl_12));
        }
    }

    @Override
    public void q(fs_0 fs_02) {
        fs_02.g((byte)this.myL.size());
        int n = this.myL.size();
        for (int i = 0; i < n; ++i) {
            cbe_0.a(fs_02, this.myL.get(i));
        }
    }

    @Override
    public String eIU() {
        StringBuilder stringBuilder = new StringBuilder("{");
        int n = this.myL.size();
        for (int i = 0; i < n; ++i) {
            if (i > 0) {
                stringBuilder.append(" ET ");
            }
            stringBuilder.append(this.myL.get(i).toString());
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    @Override
    public cbp_0 eIV() {
        cbo_0 cbo_02 = new cbo_0();
        cbo_02.jH(this.bDL());
        int n = this.myL.size();
        for (int i = 0; i < n; ++i) {
            cbo_02.a(this.myL.get(i).eIV());
        }
        return cbo_02;
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.eIV();
    }
}

