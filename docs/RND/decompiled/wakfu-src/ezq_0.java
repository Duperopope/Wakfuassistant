/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.Optional;

/*
 * Renamed from ezQ
 */
public final class ezq_0 {
    private ezq_0() {
    }

    public static boolean a(ezk_0 ezk_02, yg_2 yg_22) {
        for (int n = 0; n < 10; n = (int)((byte)(n + 1))) {
            ezw ezw2 = ezk_02.Pm(n);
            if (ezw2 == null) continue;
            yh_1 yh_12 = new yh_1();
            yh_12.ami.Rv = (byte)n;
            yh_12.ami.ZZ = ezw2.doG();
            yh_12.ami.aaa = 1;
            yh_12.ami.Vk = ezw2.getName();
            yg_22.amg.add(yh_12);
        }
        yg_22.amh = ezk_02.fmR();
        return true;
    }

    public static boolean b(ezk_0 ezk_02, yg_2 yg_22) {
        ezk_02.dRD();
        for (yh_1 yh_12 : yg_22.amg) {
            ezw ezw2;
            if (!ezk_02.dr(yh_12.ami.ZZ) || (ezw2 = ezk_02.ds(yh_12.ami.ZZ)) == null) continue;
            ezw2.setName(yh_12.ami.Vk);
            ezk_02.a(yh_12.ami.Rv, ezw2);
            ezk_02.X(yh_12.ami.Rv, true);
            ezk_02.fmY();
        }
        ezk_02.eG(yg_22.amh);
        ezk_02.dmO();
        ezk_02.fmS();
        return true;
    }

    public static byte[] a(ezk_0 ezk_02) {
        azg_1 azg_12 = new azg_1();
        int n = ezk_02.puJ.length;
        azg_12.vC(n);
        for (int i = 0; i < n; ++i) {
            azg_12.aF((byte)(ezk_02.puJ[i] ? 1 : 0));
            long l = Optional.ofNullable(ezk_02.puI[i]).map(ezw::fmB).orElse(-1L);
            azg_12.gK(l);
        }
        return azg_12.bTe();
    }

    public static void a(ezk_0 ezk_02, byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getInt();
        for (int i = 0; i < n; ++i) {
            ezk_02.puJ[i] = byteBuffer.get() == 1;
            long l = byteBuffer.getLong();
            if (ezk_02.puI[i] == null) continue;
            ezk_02.puI[i].lM(l);
        }
    }
}

