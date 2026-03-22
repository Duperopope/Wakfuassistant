/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from anP
 */
public final class anp_2
implements Iterable<int[]> {
    public static final anp_2 cKu = new anp_2();
    public static final int cKv = 0;
    public static final int cKw = 1;
    public static final int cKx = 2;
    private static final Logger cKy = Logger.getLogger(anp_2.class);
    private final boolean cKz;
    private final int[][] cKA;
    private static final acp_1 cKB = new acp_1();
    private static final acp_1 cKC = new acp_1();
    private static final acp_1 cKD = new acp_1();
    private static final acp_1 cKE = new acp_1();
    private static final acp_1 cKF = new acp_1();

    private anp_2() {
        this.cKz = false;
        this.cKA = null;
    }

    public anp_2(int n) {
        this.cKA = new int[n][3];
        this.cKz = true;
    }

    public anp_2(int[][] nArray) {
        this.cKA = nArray;
        this.cKz = true;
    }

    public anp_2(int[] nArray, List<int[]> list) {
        this.cKA = new int[1 + list.size()][3];
        this.cKA[0][0] = nArray[0];
        this.cKA[0][1] = nArray[1];
        this.cKA[0][2] = nArray[2];
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            int[] nArray2 = list.get(i);
            assert (nArray2.length == 3) : "Cellule de longueur invalide : " + nArray2.length;
            this.cKA[i + 1][0] = nArray2[0];
            this.cKA[i + 1][1] = nArray2[1];
            this.cKA[i + 1][2] = nArray2[2];
        }
        this.cKz = true;
    }

    public anp_2(List<int[]> list) {
        this.cKA = new int[list.size()][3];
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            int[] nArray = list.get(i);
            assert (nArray.length == 3) : "Cellule de longueur invalide : " + nArray.length;
            this.cKA[i][0] = nArray[0];
            this.cKA[i][1] = nArray[1];
            this.cKA[i][2] = nArray[2];
        }
        this.cKz = true;
    }

    public anp_2(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        if (byteBuffer.remaining() > 0 && byteBuffer.remaining() < 65536) {
            this.cKA = new int[byteBuffer.remaining() / 10][3];
            int n = 0;
            while (byteBuffer.remaining() >= 10) {
                this.cKA[n][0] = byteBuffer.getInt();
                this.cKA[n][1] = byteBuffer.getInt();
                this.cKA[n][2] = byteBuffer.getShort();
                ++n;
            }
            this.cKz = true;
        } else {
            this.cKA = null;
            this.cKz = false;
            cKy.error((Object)("PathFindResult s\u00e9rialis\u00e9 de longueur louche : " + byArray.length + " @ " + adu_1.bYT()));
        }
    }

    public void a(int n, int n2, int n3, short s) {
        this.cKA[n][0] = n2;
        this.cKA[n][1] = n3;
        this.cKA[n][2] = s;
    }

    public void a(int n, int[] nArray) {
        this.cKA[n] = nArray;
    }

    public int bDU() {
        if (!this.cKz || this.cKA == null) {
            return 0;
        }
        return this.cKA.length;
    }

    public boolean bDV() {
        return this.cKz;
    }

    public int[] tj(int n) {
        assert (n >= 0 && n < this.cKA.length) : "Trying to get a path step not within the bounds length = " + this.cKA.length + " stepIndex = " + n;
        if (n < this.cKA.length) {
            return this.cKA[n];
        }
        return null;
    }

    public int[] bDW() {
        if (this.cKA != null && this.cKA.length != 0) {
            return this.cKA[0];
        }
        return null;
    }

    public int[] bDX() {
        if (this.cKA != null && this.cKA.length != 0) {
            return this.cKA[this.cKA.length - 1];
        }
        return null;
    }

    public abi_1 tk(int n) {
        if (!this.cKz || n < 0 || n >= this.bDU()) {
            return null;
        }
        int n2 = this.cKA[n][0] - this.cKA[n - 1][0];
        int n3 = this.cKA[n][1] - this.cKA[n - 1][1];
        return abi_1.cB(n2, n3);
    }

    @Override
    public Iterator<int[]> iterator() {
        if (this.cKA == null) {
            return new azi_1<int[]>();
        }
        return new azh_1<int[]>((E[])this.cKA, true);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{ ");
        if (this.cKz) {
            for (int[] nArray : this.cKA) {
                stringBuilder.append('[').append(nArray[0]).append(';').append(nArray[1]).append(';').append(nArray[2]).append("] ");
            }
        } else {
            stringBuilder.append("not found");
        }
        return stringBuilder.append('}').toString();
    }

    public ArrayList<acc_2> f(long l, boolean bl) {
        ArrayList<acc_2> arrayList = new ArrayList<acc_2>();
        if (this.cKA.length < 2) {
            return null;
        }
        cKB.u(this.cKA[0]);
        cKC.u(this.cKA[1]);
        cKC.i(cKB);
        long l2 = 0L;
        int n = 1;
        acc_2 acc_22 = new acc_2();
        acc_2 acc_23 = null;
        acc_22.b(cKB);
        acc_22.ht(l2);
        do {
            cKD.u(this.cKA[n]);
            cKE.g(cKD);
            cKE.i(cKB);
            if (cKE.aSc() != cKC.aSc() || cKE.aSd() != cKC.aSd() || bl && cKE.aSe() != cKC.aSe()) {
                acc_22.d(cKB);
                acc_22.hu(l2 += (long)(acc_22.bzM().k(acc_22.bzK()).bWY() * (float)l));
                cKF.g(acc_22.bzM());
                cKF.i(acc_22.bzK());
                acc_22.c(cKF);
                if (acc_23 != null) {
                    acc_23.e(cKC);
                }
                arrayList.add(acc_22);
                cKC.g(cKE);
                acc_23 = acc_22;
                acc_22 = new acc_2();
                acc_22.b(cKB);
                acc_22.ht(l2);
            }
            cKB.g(cKD);
        } while (++n < this.cKA.length);
        acc_22.d(cKB);
        acc_22.hu(l2 += (long)(acc_22.bzM().k(acc_22.bzK()).bWY() * (float)l));
        acc_22.c(acc_22.bzM().k(acc_22.bzK()));
        arrayList.add(acc_22);
        return arrayList;
    }

    public boolean l(int[] nArray) {
        if (!this.bDV()) {
            return false;
        }
        for (int[] nArray2 : this) {
            if (nArray2[0] != nArray[0] || nArray2[1] != nArray[1] || nArray2[2] != nArray[2]) continue;
            return true;
        }
        return false;
    }

    public boolean m(int[] nArray) {
        if (!this.bDV()) {
            return false;
        }
        for (int[] nArray2 : this) {
            if (nArray2[0] != nArray[0] || nArray2[1] != nArray[1]) continue;
            return true;
        }
        return false;
    }

    public int F(int n, int n2, int n3) {
        int n4;
        if (!this.bDV()) {
            return 0;
        }
        int n5 = n4 = n3 < 0 ? 0 : n3;
        while (n4 < this.cKA.length) {
            if (this.cKA[n4][0] == n && this.cKA[n4][1] == n2) {
                return this.cKA[n4][2];
            }
            ++n4;
        }
        return 0;
    }

    public anp_2 bP(int n, int n2) {
        if (n < 0 || n >= n2 || n2 > this.bDU()) {
            throw new IllegalArgumentException("0 <= startIndex < endIndex <= getPathLength() non-respect\u00e9");
        }
        anp_2 anp_22 = new anp_2(n2 - n);
        for (int i = n; i < n2; ++i) {
            anp_22.a(i - n, this.tj(i));
        }
        return anp_22;
    }

    public static azx_1<anp_2, Integer> a(int[] nArray, @NotNull anp_2 anp_22, @NotNull anp_2 anp_23) {
        int n;
        anp_2 anp_24;
        int n2;
        int[] nArray2 = anp_23.bDW();
        if (nArray2 == null) {
            cKy.error((Object)("Le point de d\u00e9part du 2e chemin est null lors d'une fusion de chemin: firstPath=" + String.valueOf(anp_22) + ", secondPath=" + String.valueOf(anp_23)));
            return null;
        }
        int n3 = -1;
        int n4 = -1;
        for (n2 = 0; n2 < anp_22.bDU(); ++n2) {
            int[] nArray3 = anp_22.tj(n2);
            if (nArray3[0] == nArray[0] && nArray3[1] == nArray[1] && nArray3[2] == nArray[2] && n3 == -1) {
                n3 = n2;
                if (n4 != -1) break;
            }
            if (nArray3[0] != nArray2[0] || nArray3[1] != nArray2[1] || nArray3[2] != nArray2[2]) continue;
            n4 = n2;
            if (n3 != -1) break;
        }
        if (n3 == -1) {
            cKy.error((Object)("La position de d\u00e9part " + nArray[0] + ":" + nArray[1] + ":" + nArray[2] + " n'a pas \u00e9t\u00e9 trouv\u00e9e sur le premier chemin. (path: " + String.valueOf(anp_22) + ")"));
            return null;
        }
        if (n4 == -1) {
            cKy.error((Object)("Le point de jonction " + nArray2[0] + ":" + nArray2[1] + ":" + nArray2[2] + " n'a pas \u00e9t\u00e9 trouv\u00e9 sur le premier chemin. (path: " + String.valueOf(anp_22) + ")"));
            return null;
        }
        n2 = 0;
        int n5 = 0;
        if (n3 <= n4) {
            anp_24 = new anp_2(n4 - n3 + anp_23.bDU());
            for (n = n3; n < n4; ++n) {
                anp_24.a(n2++, anp_22.tj(n));
            }
        } else {
            anp_24 = new anp_2(n3 - n4 + anp_23.bDU());
            for (n = n3; n > n4; --n) {
                anp_24.a(n2++, anp_22.tj(n));
            }
            n5 = n3;
            for (n = 0; n < anp_23.bDU(); ++n) {
                int[] nArray4 = anp_23.tj(n);
                if (nArray4 == null) continue;
                if (nArray4[0] != nArray[0] || nArray4[1] != nArray[1] || nArray4[2] != nArray[2]) {
                    ++n5;
                    continue;
                }
                break;
            }
        }
        for (n = 0; n < anp_23.bDU(); ++n) {
            anp_24.a(n2++, anp_23.tj(n));
        }
        return new azx_1<anp_2, Integer>(anp_24, n5);
    }

    public byte[] apI() {
        int n = this.bDU();
        ByteBuffer byteBuffer = ByteBuffer.allocate(n * 10);
        for (int i = 0; i < n; ++i) {
            int[] nArray = this.tj(i);
            byteBuffer.putInt(nArray[0]);
            byteBuffer.putInt(nArray[1]);
            byteBuffer.putShort((short)nArray[2]);
        }
        return byteBuffer.array();
    }

    public List<int[]> bDY() {
        return Arrays.asList(this.cKA);
    }

    public boolean equals(Object object) {
        if (object == null || !(object instanceof anp_2)) {
            return false;
        }
        anp_2 anp_22 = (anp_2)object;
        if (anp_22.cKz != this.cKz || anp_22.cKA.length != this.cKA.length) {
            return false;
        }
        int n = this.cKA.length;
        for (int i = 0; i < n; ++i) {
            int[] nArray = this.cKA[i];
            int[] nArray2 = anp_22.cKA[i];
            if (nArray.length == nArray2.length && nArray[0] == nArray2[0] && nArray[1] == nArray2[1] && nArray[2] == nArray2[2]) continue;
            return false;
        }
        return true;
    }
}

