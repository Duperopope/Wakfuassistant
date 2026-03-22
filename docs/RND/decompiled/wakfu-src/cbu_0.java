/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cBU
 */
public class cbu_0
extends cbw_0 {
    public static final byte myR = 5;
    private final ArrayList<cbp_0> myS = new ArrayList(2);

    public void a(cbp_0 cbp_02) {
        this.myS.add(cbp_02);
    }

    public ArrayList<cbp_0> eIY() {
        return this.myS;
    }

    @Override
    public boolean eIS() {
        for (int i = this.myS.size() - 1; i >= 0; --i) {
            if (!this.myS.get(i).isValid()) continue;
            return true;
        }
        return false;
    }

    @Override
    public byte eIT() {
        return 5;
    }

    @Override
    public void D(apl_1 apl_12) {
        int n = apl_12.aIy();
        for (int i = 0; i < n; ++i) {
            this.myS.add(cbe_0.E(apl_12));
        }
    }

    @Override
    public void q(fs_0 fs_02) {
        fs_02.g((byte)this.myS.size());
        int n = this.myS.size();
        for (int i = 0; i < n; ++i) {
            cbe_0.a(fs_02, this.myS.get(i));
        }
    }

    @Override
    public String eIU() {
        StringBuilder stringBuilder = new StringBuilder("{");
        int n = this.myS.size();
        for (int i = 0; i < n; ++i) {
            if (i > 0) {
                stringBuilder.append(" OU ");
            }
            stringBuilder.append(this.myS.get(i).toString());
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    @Override
    public cbp_0 eIV() {
        cbu_0 cbu_02 = new cbu_0();
        cbu_02.jH(this.bDL());
        int n = this.myS.size();
        for (int i = 0; i < n; ++i) {
            cbu_02.a(this.myS.get(i).eIV());
        }
        return cbu_02;
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.eIV();
    }
}

