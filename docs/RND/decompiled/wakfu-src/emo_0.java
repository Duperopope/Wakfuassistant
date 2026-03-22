/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  org.jetbrains.annotations.Unmodifiable
 */
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from eMo
 */
public class emo_0 {
    private static final String qMD = "</image>";
    private static final String qME = " ";
    private static final String qMF = ", ";
    private static final @Unmodifiable Map<Integer, emn_0> qMG = ImmutableMap.builder().put((Object)enf_0.qPW.d(), (Object)emn_0.qMB).put((Object)enf_0.qPX.d(), (Object)emn_0.qMB).put((Object)enf_0.qPY.d(), (Object)emn_0.qMB).put((Object)enf_0.qPZ.d(), (Object)emn_0.qMB).put((Object)enf_0.qQc.d(), (Object)emn_0.qMA).put((Object)enf_0.qQd.d(), (Object)emn_0.qMA).put((Object)enf_0.qQe.d(), (Object)emn_0.qMA).put((Object)enf_0.qQf.d(), (Object)emn_0.qMA).build();
    private static final @Unmodifiable Map<Integer, Integer> qMH = ImmutableMap.builder().put((Object)enf_0.qPW.d(), (Object)0).put((Object)enf_0.qPX.d(), (Object)1).put((Object)enf_0.qPY.d(), (Object)2).put((Object)enf_0.qPZ.d(), (Object)3).put((Object)enf_0.qQc.d(), (Object)4).put((Object)enf_0.qQe.d(), (Object)5).put((Object)enf_0.qQd.d(), (Object)6).put((Object)enf_0.qQf.d(), (Object)7).build();
    public static final Comparator<eMl> qMI = Comparator.comparingInt(eMl2 -> qMH.get(eMl2.avZ()));
    private Map<emm_0, List<eMl>> qMJ = new HashMap<emm_0, List<eMl>>();

    public boolean Ry(int n) {
        return qMG.containsKey(n);
    }

    public void a(enk_0 enk_02, String string, short s) {
        if (!this.Ry(enk_02.avZ())) {
            return;
        }
        int n = enk_02.a(0, s, ene_0.qPu);
        emm_0 emm_02 = new emm_0(qMG.get(enk_02.avZ()), n);
        List<eMl> list = this.qMJ.get(emm_02);
        if (list == null) {
            list = new ArrayList<eMl>();
        }
        eMl eMl2 = new eMl(enk_02.avZ(), string);
        list.add(eMl2);
        this.qMJ.put(emm_02, list);
    }

    public Collection<String> b(My my) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (Map.Entry<emm_0, List<eMl>> entry : this.qMJ.entrySet()) {
            List<eMl> list = entry.getValue();
            if (list.isEmpty()) continue;
            if (list.size() == 1) {
                arrayList.add(list.get(0).getDescription());
                continue;
            }
            list.sort(qMI);
            emm_0 emm_02 = entry.getKey();
            String string = my.c(emm_02.clY(), new Object[0]);
            StringBuilder stringBuilder = new StringBuilder(Bz.a(string, emm_02.cWC()));
            for (int i = 0; i < list.size(); ++i) {
                String[] stringArray = list.get(i).getDescription().split(qMD);
                if (stringArray.length < 2) {
                    stringBuilder.append(qMF).append(list.get(i).getDescription());
                    continue;
                }
                stringBuilder.append(qME).append(stringArray[0]).append(qMD);
            }
            arrayList.add(stringBuilder.toString());
        }
        return arrayList;
    }
}

