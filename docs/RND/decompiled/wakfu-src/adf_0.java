/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Multimap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from adF
 */
public final class adf_0 {
    private static final Logger cko = Logger.getLogger(adf_0.class);
    private static final adf_0 ckp = new adf_0();
    private String aCH;
    private final Map<Short, adD> ckq = new HashMap<Short, adD>();
    private final Multimap<Integer, adD> ckr = HashMultimap.create();
    private short cks = 0;

    private adf_0() {
    }

    public static adf_0 buP() {
        return ckp;
    }

    public String aLM() {
        return this.aCH;
    }

    public void en(String string) {
        this.aCH = string;
    }

    public short buQ() {
        short s = this.cks;
        this.cks = (short)(s + 1);
        return s;
    }

    public void buq() {
        this.clear();
        if (this.aCH == null) {
            return;
        }
        try {
            apl_1 apl_12 = apl_1.dw(fo_0.by(this.aCH));
            this.a(apl_12);
            apl_12.close();
        }
        catch (IOException iOException) {
            cko.error((Object)("Error while loading PlayList file : " + this.aCH), (Throwable)iOException);
        }
    }

    public void buR() {
        if (this.aCH == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = fq_0.bO(this.aCH);
            fs_0 fs_02 = new fs_0(fileOutputStream);
            this.b(fs_02);
            fs_02.close();
            ((OutputStream)fileOutputStream).close();
        }
        catch (IOException iOException) {
            cko.error((Object)("Error while saving PlayList file : " + this.aCH), (Throwable)iOException);
        }
    }

    public void a(@NotNull apl_1 apl_12) {
        short s = apl_12.aIz();
        this.ckq.clear();
        this.ckr.clear();
        for (short s2 = 0; s2 < s; s2 = (short)(s2 + 1)) {
            adD adD2 = new adD();
            adD2.k(apl_12);
            this.b(adD2);
        }
    }

    public void b(@NotNull fs_0 fs_02) {
        fs_02.k((short)this.ckq.size());
        for (adD adD2 : this.ckq.values()) {
            adD2.m(fs_02);
        }
    }

    public final void b(adD adD2) {
        this.ckq.put(adD2.buM(), adD2);
        this.ckr.put((Object)adD2.buN(), (Object)adD2);
    }

    public adD av(short s) {
        return this.ckq.get(s);
    }

    public Collection<adD> rW(int n) {
        return this.ckr.get((Object)n);
    }

    public void d(BiConsumer<Short, adD> biConsumer) {
        this.ckq.forEach(biConsumer);
    }

    public short c(adD adD2) {
        for (Map.Entry<Short, adD> entry : this.ckq.entrySet()) {
            if (!entry.getValue().a(adD2)) continue;
            return entry.getKey();
        }
        return -1;
    }

    public void clear() {
        this.ckq.clear();
        this.ckr.clear();
    }
}

