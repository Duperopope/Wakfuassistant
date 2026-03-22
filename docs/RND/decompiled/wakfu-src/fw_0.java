/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  org.apache.log4j.Logger
 */
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.log4j.Logger;

/*
 * Renamed from FW
 */
public class fw_0 {
    static final Logger aCr = Logger.getLogger(fw_0.class);
    private static final fw_0 aCs = new fw_0();
    private final ExecutorService aCt = Executors.newCachedThreadPool(new ThreadFactoryBuilder().setNameFormat("AsyncLoader-%d").build());

    private fw_0() {
    }

    public static fw_0 aLA() {
        return aCs;
    }

    public final fy_0 d(URL uRL) {
        fy_0 fy_02 = new fy_0(uRL);
        this.b(fy_02);
        return fy_02;
    }

    public final void b(fv_0 fv_02) {
        this.aCt.execute(new fx_0(fv_02));
    }

    public String toString() {
        return "AsyncLoader{m_service=" + String.valueOf(this.aCt) + "}";
    }
}

