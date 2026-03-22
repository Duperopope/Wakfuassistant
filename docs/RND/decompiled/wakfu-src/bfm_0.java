/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bFm
 */
public class bfm_0
extends bfc_1
implements bfv_1 {
    private static final Logger jTf = Logger.getLogger(bfm_0.class);
    private static final Pattern jTg = Pattern.compile("(\\d+):(\\d+)");
    private final Map<Integer, Integer> jTh = new HashMap<Integer, Integer>();
    @Nullable
    private Integer jTi;

    public bfm_0(int n) {
        super(n);
    }

    @Override
    public boolean aQ(ffV ffV2) {
        bgt_0 bgt_02 = (bgt_0)fcI.ac(aue_0.cVJ().cVK().Xi(), ffV2.LV());
        if (bgt_02 == null) {
            jTf.error((Object)"[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
            return false;
        }
        this.jU(ffV2.LV());
        return true;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        super.aF(byteBuffer);
        return false;
    }

    @Override
    public void v(String[] stringArray) {
        int n;
        this.jTh.clear();
        Matcher matcher = jTg.matcher(stringArray[0]);
        while (matcher.find()) {
            this.jTh.put(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)));
        }
        this.jTi = stringArray.length == 1 ? null : ((n = Integer.parseInt(stringArray[1])) > 0 ? Integer.valueOf(n) : null);
    }

    @Override
    public void clear() {
    }

    @Override
    public @Unmodifiable Collection<Integer> dTn() {
        return Collections.unmodifiableCollection(this.jTh.keySet());
    }

    @Override
    public fgM dTl() {
        return fgM.skX;
    }
}

