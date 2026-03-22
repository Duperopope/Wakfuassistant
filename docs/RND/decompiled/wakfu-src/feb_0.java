/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  lombok.Generated
 *  org.apache.log4j.Logger
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Generated;
import org.apache.log4j.Logger;

/*
 * Renamed from feb
 */
public class feb_0
implements evv_2 {
    private static final Logger rZE = Logger.getLogger(feb_0.class);
    private Map<Integer, Integer> maw = new HashMap<Integer, Integer>();

    public int Qe(int n) {
        return this.maw.getOrDefault(n, 0);
    }

    public int fO(int n, int n2) {
        this.maw.merge(n, n2, Integer::sum);
        int n3 = this.Qe(n);
        if (n3 <= 0) {
            this.maw.remove(n);
        }
        return Math.max(0, n3);
    }

    @Override
    public void a(long l, ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        try {
            cx_1 cx_12 = cx_1.T(byArray);
            this.maw.clear();
            cx_12.ot().forEach(db_22 -> this.maw.put(db_22.d(), db_22.oP()));
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            rZE.error((Object)("[ACCOUNT_INVENTORY] Failed to deserialize account inventory for account " + l), (Throwable)invalidProtocolBufferException);
            this.maw.clear();
        }
    }

    @Override
    public byte[] fej() {
        dd_1 dd_12 = db_2.oR();
        List<db_2> list = this.maw.entrySet().stream().map(entry -> dd_12.ao((Integer)entry.getKey()).ap((Integer)entry.getValue()).oY()).toList();
        cx_1 cx_12 = cx_1.ox().h(list).oE();
        byte[] byArray = cx_12.toByteArray();
        azg_1 azg_12 = new azg_1(4 + byArray.length);
        azg_12.vC(byArray.length);
        azg_12.dH(byArray);
        return azg_12.bTe();
    }

    @Override
    public eva_1 fek() {
        return eva_1.owu;
    }

    @Generated
    public Map<Integer, Integer> fUd() {
        return this.maw;
    }

    @Generated
    public void L(Map<Integer, Integer> map) {
        this.maw = map;
    }
}

