/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class bQN
implements aeh_2 {
    public static final String kXh = "elements";
    public static final String kXi = "name";
    public static final String kXj = "openned";
    public static final String[] kXk = new String[]{"elements", "openned"};
    private boolean kXl;
    private final int kXm;
    private final bQV kXn;
    final ArrayList<aef_2> kXo = new ArrayList();

    @Override
    public String[] bxk() {
        return kXk;
    }

    public bQN(bQV bQV2, int n) {
        this.kXn = bQV2;
        this.kXm = n;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kXh)) {
            return this.kXo;
        }
        if (string.equals(kXi)) {
            switch (this.kXn) {
                case kXL: {
                    return bQD.ejE().IW(this.kXm);
                }
                case kXM: {
                    return bQD.ejE().IV(this.kXm);
                }
                case kXN: {
                    return bQD.ejE().IV(this.kXm);
                }
            }
        }
        if (string.equals(kXj)) {
            return this.kXl;
        }
        return null;
    }

    public void a(aef_2 aef_22) {
        if (this.kXo.contains(aef_22)) {
            return;
        }
        this.kXo.add(aef_22);
    }

    public int aYs() {
        return bQD.ejE().IX(this.kXm);
    }

    public void dJz() {
        this.kXl = !this.kXl;
        fse_1.gFu().a((aef_2)this, kXj);
    }

    public int cjd() {
        return this.kXm;
    }

    public boolean bVe() {
        return this.kXl;
    }

    public int aVo() {
        return this.kXo.size();
    }
}

