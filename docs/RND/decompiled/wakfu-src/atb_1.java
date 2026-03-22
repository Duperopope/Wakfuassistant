/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  com.google.common.io.LittleEndianDataInputStream
 */
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.io.LittleEndianDataInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from atB
 */
public class atb_1 {
    private static final LoadingCache<String, byte[]> ddh = CacheBuilder.newBuilder().expireAfterAccess(1L, TimeUnit.MINUTES).build((CacheLoader)new atc_1());
    public static final int ddi = 1;
    public static final int ddj = 100;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(String string, ParticleSystem particleSystem, int n) {
        try (LittleEndianDataInputStream littleEndianDataInputStream = new LittleEndianDataInputStream((InputStream)new ByteArrayInputStream((byte[])ddh.get((Object)string)));){
            atb_1.a((DataInput)littleEndianDataInputStream, particleSystem, n);
        }
    }

    public static void a(DataInput dataInput, ParticleSystem particleSystem, int n) {
        if (n < 1) {
            n = 1;
        } else if (n > 100) {
            n = 100;
        }
        atb_1.a(particleSystem, n, dataInput);
        int n2 = dataInput.readByte() & 0xFF;
        for (int i = 0; i < n2; ++i) {
            auw_1 auw_12 = atb_1.a(dataInput, n);
            if (auw_12 == null) continue;
            particleSystem.b(auw_12);
        }
    }

    private static void a(ParticleSystem particleSystem, int n, DataInput dataInput) {
        boolean bl = dataInput.readBoolean();
        boolean bl2 = dataInput.readBoolean();
        boolean bl3 = dataInput.readBoolean();
        int n2 = dataInput.readInt();
        int n3 = dataInput.readInt();
        long l = dataInput.readLong();
        int n4 = auo_1.t(dataInput, n);
        byte by = dataInput.readByte();
        particleSystem.aC(bl);
        particleSystem.setDuration(n4);
        particleSystem.aA(by);
        particleSystem.aNi = bl2;
        aub_2 aub_22 = new aub_2(bl3 ? new aud_2() : aue_2.bMt());
        particleSystem.a(aub_22);
        particleSystem.aJw = l;
        particleSystem.d(auw_2.uH(n2), auw_2.uH(n3));
    }

    private static auw_1 a(DataInput dataInput, float f2) {
        int n;
        int n2;
        float f3 = dataInput.readByte();
        float f4 = dataInput.readByte();
        int n3 = dataInput.readInt();
        if (f2 < f3 || f2 > f4) {
            dataInput.skipBytes(n3);
            return null;
        }
        float f5 = (f2 - f3) / (f4 - f3);
        auw_1 auw_12 = (auw_1)auy_1.s(dataInput, f5);
        int n4 = dataInput.readByte();
        for (n2 = 0; n2 < n4; ++n2) {
            atw_2 atw_22 = auh_1.x(dataInput, f5);
            auw_12.a(atw_22);
        }
        atb_1.a(dataInput, f5, auw_12);
        n2 = dataInput.readByte();
        for (n = 0; n < n2; ++n) {
            auxx_1 auxx_12 = (auxx_1)auz_1.s(dataInput, f5);
            atb_1.a(dataInput, f5, auxx_12);
            auw_12.a(auxx_12);
        }
        n = dataInput.readByte();
        for (int i = 0; i < n; ++i) {
            auw_1 auw_13 = atb_1.a(dataInput, f2);
            auw_12.b(auw_13);
        }
        return auw_12;
    }

    private static void a(DataInput dataInput, float f2, att_2 att_22) {
        int n = dataInput.readByte();
        for (int i = 0; i < n; ++i) {
            atq_1 atq_12 = aum_1.r(dataInput, f2);
            int n2 = dataInput.readByte();
            if (n2 == 0) {
                atq_12.a((ats_1[])null);
            } else {
                ats_1[] ats_1Array = new ats_1[n2];
                for (int j = 0; j < n2; ++j) {
                    ats_1Array[j] = aup_1.w(dataInput, f2);
                }
                atq_12.a(ats_1Array);
            }
            if (atq_12.bLi()) {
                att_22.c(atq_12);
                continue;
            }
            att_22.a(atq_12);
        }
    }
}

