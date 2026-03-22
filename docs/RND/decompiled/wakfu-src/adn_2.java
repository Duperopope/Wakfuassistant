/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.protobuf.MessageLite
 */
import com.google.common.collect.ImmutableMap;
import com.google.protobuf.MessageLite;

/*
 * Renamed from aDN
 */
public class adn_2
implements adi_1 {
    private final ImmutableMap<Class<? extends MessageLite>, aar_2<? extends MessageLite>> dEm;

    protected adn_2(aar_2<? extends MessageLite> ... aar_2Array) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (aar_2<? extends MessageLite> aar_22 : aar_2Array) {
            builder.put(aar_22.bUk(), aar_22);
        }
        this.dEm = builder.build();
    }

    @Override
    public final boolean b(aam_2 aam_22) {
        if (!(aam_22 instanceof adm_2)) {
            return true;
        }
        adm_2 adm_22 = (adm_2)aam_22;
        MessageLite messageLite = adm_22.bYS();
        aar_2 aar_22 = (aar_2)this.dEm.get((Object)messageLite.getClass());
        return aar_22 == null || aar_22.b(messageLite);
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

