/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * Renamed from bjX
 */
public class bjx_2
implements bjy_2 {
    private final ArrayList<String> ipX = new ArrayList();

    public bjx_2(String string) {
        try {
            this.lO(string);
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(exception.getMessage(), exception);
        }
    }

    private void lO(String string) {
        String string2;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fo_0.bz(string), "UTF-8"));
        while ((string2 = bufferedReader.readLine()) != null) {
            if (string2.isEmpty()) continue;
            this.ipX.add(string2);
        }
        bufferedReader.close();
    }

    @Override
    public String dsa() {
        return this.ipX.get(GC.mR(this.ipX.size()));
    }

    @Override
    public void clean() {
        this.ipX.clear();
    }
}

