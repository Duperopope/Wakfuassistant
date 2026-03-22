/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aBJ
 */
public final class abj_2 {
    private static final Logger dzD = Logger.getLogger(abj_2.class);
    public static final int dzE = 11;
    private final acd_1 dzF = new acd_1();
    private acd_1 dzG = null;
    private final List<abk_2> dzH;

    public static abj_2 a(anp_2 anp_22) {
        if (!anp_22.bDV() || anp_22.bDU() <= 1) {
            dzD.error((Object)"Impossible de convertir un PathFindResult sans r\u00e9sultat en Direction8Path");
            return null;
        }
        abj_2 abj_22 = new abj_2(anp_22.bDU() - 1);
        abj_22.u(new acd_1(anp_22.bDW()));
        for (int i = 1; i < anp_22.bDU(); ++i) {
            abi_1 abi_12 = anp_22.tk(i);
            int n = anp_22.tj(i)[2] - anp_22.tj(i - 1)[2];
            if (abi_12 == null) {
                dzD.error((Object)"Impossible de convertir le d\u00e9placement en Direction8 : le PathFindResult n'est pas continu ?");
                return null;
            }
            abj_22.a(abi_12, n);
        }
        abj_22.v(new acd_1(anp_22.bDX()));
        return abj_22;
    }

    public abj_2(acd_1 acd_12, List<abk_2> list) {
        this.dzH = list;
        if (list == null || list.size() == 0) {
            dzD.error((Object)"Liste de cellules vide");
            return;
        }
        this.u(acd_12);
    }

    public static abj_2 eV(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 11) {
            dzD.error((Object)("Impossible de d\u00e9coder un Direction8Path dans un buffer de " + byteBuffer.remaining() + " < 11"));
            return null;
        }
        byteBuffer.mark();
        int n = byteBuffer.getInt();
        int n2 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        int n3 = byteBuffer.get() & 0xFF;
        abj_2 abj_22 = new abj_2(n3);
        acd_1 acd_12 = new acd_1(n, n2, s);
        abj_22.u(acd_12);
        if (byteBuffer.remaining() < abj_22.bWa()) {
            dzD.error((Object)("La taille du buffer ne correspond pas : attendu=" + abj_22.bWa() + " > courant=" + byteBuffer.remaining()));
            byteBuffer.reset();
            return null;
        }
        for (int i = 0; i < n3; ++i) {
            byte by = byteBuffer.get();
            abi_1 abi_12 = abi_1.wG(by >> 5 & 7);
            int n4 = by & 0x1F;
            if ((n4 & 0x10) != 0) {
                n4 |= 0xFFFFFFE0;
            }
            abj_22.a(abi_12, n4);
        }
        abj_22.v(acd_12);
        return abj_22;
    }

    public static abj_2 a(acd_1 acd_12, abj_2 abj_22, abj_2 abj_23) {
        acd_1 acd_13 = abj_23.bVW();
        acd_1 acd_14 = abj_22.bVW();
        int n = -1;
        int n2 = -1;
        if (acd_14.ac(acd_12)) {
            n = 0;
        }
        if (acd_14.ac(acd_13)) {
            n2 = 0;
        }
        for (int i = 0; i < abj_22.bVZ(); ++i) {
            abk_2 abk_22 = abj_22.wK(i);
            acd_14.e(abk_22.dzJ);
            acd_14.w(0, 0, acd_14.bdi() + abk_22.dzK);
            if (n == -1 && acd_14.ac(acd_12)) {
                n = i + 1;
                if (n2 != -1) break;
            }
            if (!acd_14.ac(acd_13)) continue;
            n2 = i + 1;
            if (n != -1) break;
        }
        if (n != -1 && n2 != -1) {
            abj_2 abj_24 = new abj_2(abj_23.bVZ() + abj_22.bVZ());
            abj_24.u(acd_12);
            if (n2 >= n) {
                for (int i = n; i <= n2 - 1; ++i) {
                    abj_24.a(abj_22.wK(i));
                }
            } else {
                for (int i = n - 1; i >= n2; --i) {
                    abk_2 abk_23 = abj_22.wK(i);
                    abj_24.a(abk_23.dzJ.bVS(), -abk_23.dzK);
                }
            }
            abj_24.dzH.addAll(abj_23.dzH);
            abj_24.v(new acd_1(abj_23.bVX()));
            return abj_24;
        }
        return null;
    }

    public acd_1 bVW() {
        return new acd_1(this.dzF);
    }

    public acd_1 bVX() {
        if (this.dzG == null) {
            acd_1 acd_12 = this.bVW();
            for (abk_2 abk_22 : this.dzH) {
                acd_12.e(abk_22.dzJ);
                acd_12.w(0, 0, abk_22.dzK);
            }
            this.dzG = acd_12;
        }
        return new acd_1(this.dzG);
    }

    @Nullable
    private acd_1 wJ(int n) {
        acd_1 acd_12 = this.bVW();
        if (n < 0 || n >= this.bVZ()) {
            return null;
        }
        for (int i = 0; i < n; ++i) {
            abk_2 abk_22 = this.wK(i);
            acd_12.e(abk_22.dzJ);
            acd_12.w(0, 0, abk_22.dzK);
        }
        return new acd_1(acd_12);
    }

    public byte[] aVX() {
        assert (this.dzH.size() <= 255) : "Impossible d'encoder un Direction8Path de plus de 255 steps";
        ByteBuffer byteBuffer = ByteBuffer.allocate(this.bVY());
        byteBuffer.putInt(this.dzF.getX());
        byteBuffer.putInt(this.dzF.getY());
        byteBuffer.putShort(this.dzF.bdi());
        byteBuffer.put((byte)this.dzH.size());
        for (abk_2 abk_22 : this.dzH) {
            int n = (abk_22.dzJ.dzy & 7) << 5;
            byteBuffer.put((byte)(n |= abk_22.dzK & 0x1F));
        }
        return byteBuffer.array();
    }

    public int bVY() {
        return 11 + this.bWa();
    }

    public String toString() {
        String string = "{ size = " + this.dzH.size() + ", [" + this.dzF.getX() + ":" + this.dzF.getY() + ":" + this.dzF.bdi() + "] ";
        acd_1 acd_12 = this.bVW();
        for (abk_2 abk_22 : this.dzH) {
            acd_12.e(abk_22.dzJ);
            acd_12.w(0, 0, abk_22.dzK);
            string = string + "[" + acd_12.getX() + ":" + acd_12.getY() + ":" + acd_12.bdi() + "] ";
        }
        string = string + "}";
        return string;
    }

    public boolean equals(Object object) {
        if (object != null && object instanceof abj_2) {
            abj_2 abj_22 = (abj_2)object;
            if (!abj_22.dzF.equals(this.dzF)) {
                return false;
            }
            return abj_22.dzH.equals(this.dzH);
        }
        return false;
    }

    public int bVZ() {
        return this.dzH.size();
    }

    public abk_2 wK(int n) {
        return this.dzH.get(n);
    }

    public abj_2 cC(int n, int n2) {
        int n3;
        if (n < 0 || n >= n2 || n2 > this.bVZ()) {
            throw new IllegalArgumentException("0 <= startIndex < endIndex <= size() non-respect\u00e9");
        }
        abj_2 abj_22 = new abj_2(n2 - n);
        acd_1 acd_12 = this.bVW();
        for (n3 = 0; n3 < n; ++n3) {
            abk_2 abk_22 = this.dzH.get(n3);
            acd_12.e(abk_22.dzJ);
            acd_12.w(0, 0, abk_22.dzK);
        }
        abj_22.u(acd_12);
        for (n3 = n; n3 < n2; ++n3) {
            abj_22.a(this.dzH.get(n3));
        }
        return abj_22;
    }

    public boolean t(acd_1 acd_12) {
        acd_1 acd_13 = this.bVW();
        if (acd_13.ac(acd_12)) {
            return true;
        }
        for (int i = 0; i < this.bVZ(); ++i) {
            abk_2 abk_22 = this.dzH.get(i);
            acd_13.e(abk_22.dzJ);
            acd_13.w(0, 0, abk_22.dzK);
            if (!acd_13.ac(acd_12)) continue;
            return true;
        }
        return false;
    }

    public boolean a(abj_2 abj_22) {
        if (abj_22 == null) {
            return false;
        }
        int n = this.bVZ();
        int n2 = abj_22.bVZ();
        if (n2 > n) {
            return false;
        }
        acd_1 acd_12 = abj_22.bVW();
        for (int i = 0; i < n; ++i) {
            acd_1 acd_13 = this.wJ(i);
            if (acd_13 == null || !acd_13.equals(acd_12)) continue;
            boolean bl = true;
            for (int j = 0; j < n2; ++j) {
                if (i + j >= n) continue;
                acd_1 acd_14 = abj_22.wJ(j);
                acd_1 acd_15 = this.wJ(i + j);
                if (acd_14 != null && acd_14.equals(acd_15)) continue;
                bl = false;
            }
            if (!bl) continue;
            return true;
        }
        return false;
    }

    public boolean d(abi_1 abi_12) {
        for (abk_2 abk_22 : this.dzH) {
            if (abk_22.dzJ.dzy != abi_12.dzy) continue;
            return true;
        }
        return false;
    }

    private abj_2(int n) {
        this.dzH = new ArrayList<abk_2>(n);
    }

    private void a(abi_1 abi_12, int n) {
        if (n < -16 || n > 15 || abi_12.dzy < 0 || abi_12.dzy > 7 || this.dzH.size() > 255) {
            throw new IllegalArgumentException("step ou direction invalides");
        }
        this.dzH.add(new abk_2(abi_12, n));
    }

    private void a(abk_2 abk_22) {
        if (abk_22.dzK < -16 || abk_22.dzK > 15 || abk_22.dzJ.dzy < 0 || abk_22.dzJ.dzy > 7) {
            throw new IllegalArgumentException("step ou direction invalides");
        }
        this.a(abk_22.dzJ, abk_22.dzK);
    }

    private void u(acd_1 acd_12) {
        this.dzF.C(acd_12);
    }

    public void v(acd_1 acd_12) {
        this.dzG = acd_12;
    }

    private int bWa() {
        return this.dzH.size();
    }
}

