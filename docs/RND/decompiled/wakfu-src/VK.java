/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TShortArrayList
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.list.array.TShortArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class VK {
    private static final Logger bKe = Logger.getLogger(VK.class);
    private final int bKf;
    private final int bKg;
    private final short bKh;

    public VK(int n, int n2, short s) {
        this.bKf = n;
        this.bKg = n2;
        this.bKh = s;
    }

    public short a(int n, int n2, int n3, VL vL) {
        assert (n >= 0 && n < this.bKf);
        assert (n2 >= 0 && n2 < this.bKg);
        if (vL == null) {
            return this.bKh;
        }
        int n4 = vL.bkL();
        if (n4 == 1) {
            return vL.pY(0);
        }
        int n5 = n + n2 * this.bKf;
        return vL.pZ(n5);
    }

    public VL k(short @NotNull [] sArray) {
        int n;
        assert (sArray.length == this.bKf * this.bKg);
        TShortArrayList tShortArrayList = new TShortArrayList();
        for (n = 0; n < sArray.length; ++n) {
            if (tShortArrayList.contains(sArray[n])) continue;
            tShortArrayList.add(sArray[n]);
        }
        n = tShortArrayList.size();
        if (n == 0) {
            throw new VM("pas de cellsValue");
        }
        if (n > 16) {
            throw new VM("Trop de valeur diff\u00e9rentes");
        }
        return VL.a(tShortArrayList, sArray, this.bKh);
    }

    public short bkK() {
        return this.bKh;
    }
}

