/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.apache.log4j.Logger
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;

/*
 * Renamed from eKn
 */
public class ekn_0
implements evv_2 {
    private static final Logger qBD = Logger.getLogger(ekn_0.class);
    private final fy_1 qBE = fw_1.Aw();

    public boolean a(fm_1 fm_12, fb_2 fb_22) {
        if (ekj_0.A(fm_12)) {
            qBD.warn((Object)("[COSMETICS] Trying to add a cosmetic item whose type " + String.valueOf((Object)fm_12) + " is for preview only: " + String.valueOf(fb_22)));
            return false;
        }
        Map<Integer, fs_1> map = this.qBE.Au();
        if (!map.containsKey(fm_12.getNumber())) {
            this.qBE.b(fm_12.getNumber(), fs_1.zX().b(fb_22).Ag());
            return true;
        }
        fs_1 fs_12 = map.get(fm_12.getNumber());
        if (fs_12.zR().stream().anyMatch(fb_23 -> fb_23.AK() == fb_22.AK())) {
            qBD.warn((Object)"[COSMETICS] Trying to add an already owned cosmetic");
            return false;
        }
        fu_2 fu_22 = fs_12.zY().b(fb_22);
        fu_22.cr(fb_22.AK());
        this.qBE.b(fm_12.getNumber(), fu_22.Ag());
        return true;
    }

    public void a(fm_1 fm_12, Collection<fb_2> collection) {
        if (ekj_0.A(fm_12)) {
            qBD.warn((Object)("[COSMETICS] Trying to add cosmetic items whose type " + String.valueOf((Object)fm_12) + " is for preview only: " + String.valueOf(collection)));
            return;
        }
        if (collection == null || collection.isEmpty()) {
            return;
        }
        HashMap<Integer, fs_1> hashMap = new HashMap<Integer, fs_1>(this.qBE.Au());
        if (!hashMap.containsKey(fm_12.getNumber())) {
            fs_1 fs_12 = fs_1.zX().r(collection).Ag();
            this.qBE.b(fm_12.getNumber(), fs_12);
            return;
        }
        fs_1 fs_13 = (fs_1)hashMap.get(fm_12.getNumber());
        fu_2 fu_22 = fs_13.zY();
        List<fb_2> list = fu_22.zR();
        collection.forEach(fb_22 -> {
            if (list.stream().noneMatch(fb_23 -> fb_23.AK() == fb_22.AK())) {
                fu_22.b((fb_2)fb_22);
            }
        });
        fs_1 fs_14 = fu_22.Ag();
        this.qBE.b(fm_12.getNumber(), fs_14);
    }

    public boolean f(fm_1 fm_12, int n) {
        return this.a(fm_12, ekn_0.Qn(n));
    }

    public boolean c(fm_1 fm_12, Set<Integer> set) {
        fs_1 fs_12 = this.qBE.Au().get(fm_12.getNumber());
        if (fs_12 == null) {
            qBD.error((Object)String.format("[COSMETICS] Failed to remove new flag of cosmetics with id %s from category %s : the category is empty", new Object[]{set, fm_12}));
            return false;
        }
        boolean bl = fs_12.zU().containsAll(set);
        if (!bl) {
            qBD.error((Object)String.format("[COSMETICS] Failed to to remove new flag of cosmetics with id %s from category %s : at least one item supplied is not inside it", new Object[]{set, fm_12}));
            return false;
        }
        fu_2 fu_22 = fs_12.zY();
        ArrayList<Integer> arrayList = new ArrayList<Integer>(fu_22.zU());
        arrayList.removeAll(set);
        fu_22.Ap().s(arrayList);
        this.qBE.b(fm_12.getNumber(), fu_22.Ag());
        return true;
    }

    public boolean g(fm_1 fm_12, int n) {
        return this.c(fm_12, Collections.singleton(n));
    }

    public boolean h(fm_1 fm_12, int n) {
        fs_1 fs_12 = this.qBE.Au().get(fm_12.getNumber());
        if (fs_12 == null) {
            qBD.error((Object)String.format("[COSMETICS] Failed to remove cosmetic with id %d from category %s : the category is empty", new Object[]{n, fm_12}));
            return false;
        }
        boolean bl = fs_12.zR().stream().anyMatch(fb_22 -> fb_22.AK() == n);
        if (!bl) {
            qBD.error((Object)String.format("[COSMETICS] Failed to remove cosmetic with id %d from category %s : the item is not inside it", new Object[]{n, fm_12}));
            return false;
        }
        Set set = fs_12.zR().stream().filter(fb_22 -> fb_22.AK() != n).collect(Collectors.toSet());
        fu_2 fu_22 = fs_1.zX().r(set);
        ArrayList<Integer> arrayList = new ArrayList<Integer>(fs_12.zU());
        arrayList.remove((Object)n);
        fu_22.Ap().s(arrayList);
        this.qBE.b(fm_12.getNumber(), fu_22.Ag());
        return true;
    }

    public boolean C(fm_1 fm_12) {
        fs_1 fs_12 = this.qBE.Au().get(fm_12.getNumber());
        if (fs_12 == null) {
            qBD.error((Object)String.format("[COSMETICS] Failed to remove all cosmetics from category %s : the category is empty", new Object[]{fm_12}));
            return false;
        }
        this.qBE.b(fm_12.getNumber(), fs_1.zX().Ag());
        return true;
    }

    public boolean a(fm_1 fm_12, long l) {
        if (l == 0L) {
            return true;
        }
        fs_1 fs_12 = this.qBE.Au().get(fm_12.getNumber());
        return fs_12 != null && fs_12.zR().stream().anyMatch(fb_22 -> (long)fb_22.AK() == l);
    }

    public Collection<fb_2> D(fm_1 fm_12) {
        fs_1 fs_12 = this.qBE.Au().get(fm_12.getNumber());
        if (fs_12 == null) {
            return Collections.emptyList();
        }
        return fs_12.zR();
    }

    public Collection<Integer> E(fm_1 fm_12) {
        fs_1 fs_12 = this.qBE.Au().get(fm_12.getNumber());
        if (fs_12 == null) {
            return Collections.emptyList();
        }
        return fs_12.zU();
    }

    private static fb_2 Qn(int n) {
        return fb_2.AQ().cv(n).AW();
    }

    @Override
    public void a(long l, ByteBuffer byteBuffer) {
        try {
            byte[] byArray = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray);
            fw_1 fw_12 = fw_1.av(byArray);
            this.qBE.AG();
            this.qBE.c(fw_12);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            qBD.error((Object)"[COSMETICS] Failed to deserialize cosmetic inventory account data. Keeping old value.", (Throwable)invalidProtocolBufferException);
        }
    }

    @Override
    public byte[] fej() {
        azg_1 azg_12 = new azg_1();
        byte[] byArray = this.qBE.AC().toByteArray();
        azg_12.vC(byArray.length);
        azg_12.dH(byArray);
        return azg_12.bTe();
    }

    public String toString() {
        return "CosmeticsAccountData{m_cosmeticInventory=" + String.valueOf(this.qBE) + "}";
    }

    @Override
    public eva_1 fek() {
        return eva_1.owy;
    }
}

