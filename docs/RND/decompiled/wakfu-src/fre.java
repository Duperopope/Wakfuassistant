/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.nio.ByteBuffer;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class fre {
    private fre() {
    }

    private static List<Integer> bq(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; --i) {
            if (list.get(i) == 0) continue;
            return list.subList(0, i + 1);
        }
        return List.of();
    }

    private static int l(frd frd2) {
        return 4 * (1 + fre.bq(frd2.eEu()).size() + 1 + fre.bq(frd2.eEv()).size());
    }

    public static byte[] m(frd frd2) {
        azg_1 azg_12 = new azg_1(fre.l(frd2) + 4);
        fre.a(frd2, azg_12, true);
        return azg_12.bTe();
    }

    public static byte[] n(frd frd2) {
        azg_1 azg_12 = new azg_1(fre.l(frd2));
        fre.a(frd2, azg_12, false);
        return azg_12.bTe();
    }

    private static void a(frd frd2, azg_1 azg_12, boolean bl) {
        List<Integer> list = fre.bq(frd2.eEu());
        List<Integer> list2 = fre.bq(frd2.eEv());
        azg_12.vC(list.size());
        list.forEach(azg_12::vC);
        azg_12.vC(list2.size());
        list2.forEach(azg_12::vC);
        if (bl) {
            azg_12.vC(frd2.tL());
        }
    }

    public static frd eV(byte[] byArray) {
        return fre.gw(ByteBuffer.wrap(byArray));
    }

    public static frd gw(ByteBuffer byteBuffer) {
        frd frd2 = fre.gx(byteBuffer);
        frd2.PP(byteBuffer.getInt());
        return frd2;
    }

    public static frd eW(byte[] byArray) {
        return fre.gx(ByteBuffer.wrap(byArray));
    }

    @NotNull
    private static frd gx(ByteBuffer byteBuffer) {
        int n;
        int n2;
        frd frd2 = new frd();
        if (byteBuffer.remaining() < 8) {
            return frd2;
        }
        int n3 = byteBuffer.getInt();
        for (n2 = 0; n2 < n3; ++n2) {
            n = byteBuffer.getInt();
            frd2.gp(n, n2);
        }
        n2 = byteBuffer.getInt();
        for (n = 0; n < n2; ++n) {
            int n4 = byteBuffer.getInt();
            frd2.gq(n4, n);
        }
        return frd2;
    }

    private static int a(frf frf2) {
        int n = 4;
        for (frd frd2 : frf2.gjU().values()) {
            n += 1 + fre.l(frd2);
        }
        return n;
    }

    public static byte[] b(frf frf2) {
        azg_1 azg_12 = new azg_1(fre.a(frf2));
        azg_12.vC(frf2.aVo());
        frf2.gjU().forEach((n, frd2) -> {
            azg_12.aF(n.byteValue());
            fre.a(frd2, azg_12, true);
        });
        return azg_12.bTe();
    }

    public static frf gy(ByteBuffer byteBuffer) {
        frf frf2 = new frf();
        int n = byteBuffer.getInt();
        for (int i = 0; i < n; ++i) {
            byte by = byteBuffer.get();
            frd frd2 = fre.gw(byteBuffer);
            frf2.b(by, frd2);
        }
        return frf2;
    }
}

