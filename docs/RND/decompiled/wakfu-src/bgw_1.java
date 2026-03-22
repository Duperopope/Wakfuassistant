/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumMap;
import java.util.Map;
import java.util.Optional;

/*
 * Renamed from bGw
 */
public final class bgw_1
extends bgq_1 {
    private final int jVO;
    private final fhk jVP;

    public bgw_1(int n, fhk fhk2, long l) {
        Object object;
        this.jVP = fhk2;
        this.jVO = n;
        EnumMap<ffS, ffV> enumMap = new EnumMap<ffS, ffV>(ffS.class);
        for (Object object2 : bgv_1.values()) {
            Optional optional;
            object = this.jVP.t(object2.dTQ());
            Optional<Object> optional2 = optional = object == null ? Optional.empty() : bgr_1.jVu.tu(l).B((Long)object);
            if (optional.isPresent()) {
                ffS[] ffSArray;
                ffV ffV2 = (ffV)optional.get();
                this.a(object2.dTQ(), new bgp_1(object2.dTQ(), ffV2));
                for (ffS ffS2 : ffSArray = ffV2.fWi().fZs()) {
                    enumMap.put(ffS2, ffV2);
                }
                continue;
            }
            this.a(object2.dTQ(), new bgp_1(object2.dTQ()));
        }
        for (Map.Entry entry : enumMap.entrySet()) {
            Object object2;
            ffS ffS3 = (ffS)entry.getKey();
            object2 = (ffV)entry.getValue();
            object = ((ffV)object2).to(((ffV)object2).LV());
            ((ffV)object2).cE((ffV)object);
            this.g(ffS3).setItem((ffV)object);
        }
        this.dTR();
    }

    @Override
    public boolean jW(long l) {
        return this.jVP.fa(l);
    }

    public boolean j(bgt_0 bgt_02) {
        return this.jVP.al(bgt_02);
    }

    public fhk dTV() {
        return this.jVP;
    }

    public int wp() {
        return this.jVO;
    }
}

