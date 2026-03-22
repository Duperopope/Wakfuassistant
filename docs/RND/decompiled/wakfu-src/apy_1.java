/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Renamed from apY
 */
public final class apy_1
extends aps_1 {
    private final TIntObjectHashMap<ArrayList<aqc_2>> cPJ = new TIntObjectHashMap();
    private final TIntObjectHashMap<TIntObjectHashMap<ArrayList<aqi_2>>> cPK = new TIntObjectHashMap();
    private static final boolean cPL = false;
    final String cPM;
    private final int cPN = 20000000;
    private final int cPO = 500;
    private aqc_2 cPP;
    private final Object cPQ = new Object();
    final StringBuilder cPR = new StringBuilder(20);
    private static final Pattern cPS = Pattern.compile("[^a-zA-Z0-9-_/\\.]");
    private boolean cPz;
    private final File cPT;
    private final File cPU;
    private final File cPV;
    private final File cPW;
    private final TLongObjectHashMap<File> cPX = new TLongObjectHashMap();
    final TIntObjectHashMap<File> cPY = new TIntObjectHashMap();
    private static final String cPZ = "data.";
    private static final String cQa = ".bdat";
    private static final String cQb = "index.";
    private static final String cQc = ".bdat";
    private static final String cQd = "metadata.bdat";
    private final aqt_1 cQe;
    private final aqt_1 cQf = aqt_1.b(aqt_1.cQF);
    private final aqt_1 cQg = aqt_1.b(aqt_1.cQF);

    protected apy_1(String string) {
        this(string, false);
    }

    private apy_1(String string, boolean bl) {
        this.cPM = apy_1.fG(string);
        this.cPW = new File(this.cPM);
        this.cPT = new File(this.cPM + "~building_index.tmp");
        this.cPU = new File(this.cPM + "~building_data.tmp");
        this.cPV = new File(this.cPM + cQd);
        this.setName("BinaryStorage (" + this.cPM + ")");
        aqt_1 aqt_12 = this.cQe = bl ? aqt_1.b(aqt_1.cQG) : aqt_1.b(aqt_1.cQF);
        if (this.bGb()) {
            this.start();
        } else {
            cPe.error("Echec de l'initialisation du binary storage " + String.valueOf(this));
        }
    }

    public static boolean fF(String string) {
        File file = new File(apy_1.fG(string) + cQd);
        return file.exists();
    }

    private static String fG(String string) {
        Object object = string;
        if (((String)(object = cPS.matcher((CharSequence)object).replaceAll("_"))).charAt(0) == '/') {
            object = ((String)object).substring(1, ((String)object).length());
        }
        if (((String)object).charAt(((String)object).length() - 1) != '/') {
            object = (String)object + "/";
        }
        return object;
    }

    public boolean blc() {
        return this.cPz;
    }

    @Override
    protected String bGc() {
        return this.cPM;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected boolean bGb() {
        Object object = this.cPQ;
        synchronized (object) {
            block29: {
                if (this.cPz) {
                    cPe.error("Binary storage already initialize : " + this.cPM);
                    return false;
                }
                try {
                    if (this.cPW.exists() && !this.cPW.isDirectory()) {
                        cPe.error("Tentative de changement de workspace [" + this.cPM + "] vers un fichier [not directory] existant [Aborted & Shutdown]");
                        return false;
                    }
                    if (!this.cPW.exists() && !this.cPW.mkdirs()) {
                        cPe.error("Impossible de creer l'arborescence de repertoire [" + this.cPM + "] lors d'un changement de workspace inexistant [Aborted & Shutdown]");
                        return false;
                    }
                    this.cPJ.clear();
                    if (!this.cPV.exists()) {
                        this.cPV.createNewFile();
                        cPe.info("Fichier de meta donn\u00e9es non trouv\u00e9 pour le chargement de la source binaire : Creation d'une nouvelle source");
                        break block29;
                    }
                    Object object2 = null;
                    Object object3 = null;
                    try {
                        object2 = new FileInputStream(this.cPV);
                        object3 = this.cQg.b((FileInputStream)object2);
                        try {
                            while (true) {
                                int n = ((DataInputStream)object3).readInt();
                                int n2 = ((DataInputStream)object3).readInt();
                                int n3 = ((DataInputStream)object3).readInt();
                                int n4 = ((DataInputStream)object3).readInt();
                                int n5 = n;
                                ArrayList<aqc_2> arrayList = (ArrayList<aqc_2>)this.cPJ.get(n5);
                                if (arrayList == null) {
                                    arrayList = new ArrayList<aqc_2>();
                                    this.cPJ.put(n5, arrayList);
                                }
                                arrayList.add(new aqc_2(this, n5, n2, n3, n4));
                            }
                        }
                        catch (EOFException eOFException) {
                            if (object3 != null) {
                                try {
                                    ((FilterInputStream)object3).close();
                                }
                                catch (IOException iOException) {
                                    cPe.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                                }
                            }
                            if (object2 != null) {
                                try {
                                    ((FileInputStream)object2).close();
                                }
                                catch (IOException iOException) {
                                    cPe.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                                }
                            }
                        }
                    }
                    catch (Throwable throwable) {
                        if (object3 != null) {
                            try {
                                ((FilterInputStream)object3).close();
                            }
                            catch (IOException iOException) {
                                cPe.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                            }
                        }
                        if (object2 != null) {
                            try {
                                ((FileInputStream)object2).close();
                            }
                            catch (IOException iOException) {
                                cPe.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                            }
                        }
                        throw throwable;
                    }
                }
                catch (FileNotFoundException fileNotFoundException) {
                    cPe.error(fileNotFoundException.getMessage(), (Throwable)fileNotFoundException);
                    return false;
                }
                catch (IOException iOException) {
                    cPe.error(iOException.getMessage(), (Throwable)iOException);
                    return false;
                }
            }
            this.cPz = true;
            for (Object object3 : this.cPf) {
                object3.a((aps_1)this, this.bGc());
            }
            return true;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void bGo() {
        try {
            FileOutputStream fileOutputStream = null;
            FilterOutputStream filterOutputStream = null;
            try {
                fileOutputStream = new FileOutputStream(this.cPV, false);
                FilterOutputStream filterOutputStream2 = filterOutputStream = this.cQg.b(fileOutputStream);
                if (!this.cPJ.isEmpty()) {
                    this.cPJ.forEachEntry((TIntObjectProcedure)new apz_1(this, (DataOutputStream)filterOutputStream2));
                }
            }
            finally {
                if (filterOutputStream != null) {
                    try {
                        filterOutputStream.close();
                    }
                    catch (IOException iOException) {
                        cPe.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    }
                    catch (IOException iOException) {
                        cPe.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                    }
                }
            }
        }
        catch (FileNotFoundException fileNotFoundException) {
            cPe.error(fileNotFoundException.getMessage(), (Throwable)fileNotFoundException);
        }
        catch (IOException iOException) {
            cPe.error(iOException.getMessage(), (Throwable)iOException);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void c(apx_1 apx_12) {
        Object object = this.cPQ;
        synchronized (object) {
            ArrayList<aqi_2> arrayList = this.a(cPl, apx_12.aFS(), (Object)apx_12.bGh(), 1);
            if (arrayList.size() <= 0) {
                this.d(apx_12);
            } else {
                this.a(apx_12, arrayList.get(0));
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void d(apx_1 apx_12) {
        byte[] byArray = apx_12.aFR();
        if (byArray == null) {
            cPe.error("Tentative de sauvegarde d'un binary storable qui n'a aucun bloc de donn\u00e9es " + String.valueOf(apx_12));
            return;
        }
        long l = apx_12.dy(byArray);
        int n = byArray.length + 4 + 2 + 4;
        this.bT(apx_12.aFS(), n);
        try {
            Field[] fieldArray;
            long l2;
            File file = this.cPP.cQl;
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = null;
            FilterOutputStream filterOutputStream = null;
            try {
                fileOutputStream = new FileOutputStream(this.cPP.cQl, true);
                filterOutputStream = this.cQe.b(fileOutputStream);
                l2 = fileOutputStream.getChannel().size();
                fieldArray = new aqg_2(apx_12.bGh(), apx_12.bGi(), byArray);
                fieldArray.f((DataOutputStream)filterOutputStream);
            }
            finally {
                if (filterOutputStream != null) {
                    try {
                        filterOutputStream.close();
                    }
                    catch (IOException iOException) {
                        cPe.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    }
                    catch (IOException iOException) {
                        cPe.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                    }
                }
            }
            ++this.cPP.cQk;
            this.cPP.Yh += n;
            this.a(cPl, apx_12.bGh(), apx_12.aFS(), this.cPP.cQj, l2, l);
            for (Field field : fieldArray = apx_12.getClass().getDeclaredFields()) {
                Object object;
                if (!field.isAnnotationPresent(aqd_2.class)) continue;
                aqd_2 aqd_22 = field.getAnnotation(aqd_2.class);
                if (field.isAccessible()) {
                    object = field.get(apx_12);
                } else {
                    field.setAccessible(true);
                    object = field.get(apx_12);
                    field.setAccessible(false);
                }
                this.a(aqd_22.name().hashCode(), object, apx_12.aFS(), this.cPP.cQj, l2, l);
            }
            this.bGo();
        }
        catch (IOException iOException) {
            cPe.error(iOException.getMessage(), (Throwable)iOException);
        }
        catch (IllegalAccessException illegalAccessException) {
            cPe.error(illegalAccessException.getMessage(), (Throwable)illegalAccessException);
        }
    }

    private void a(apx_1 apx_12, aqi_2 aqi_22) {
        aqi_2 aqi_23 = aqi_22;
        byte[] byArray = apx_12.aFR();
        if (byArray == null) {
            cPe.error("Tentative de sauvegarde d'un binary storable qui n'a aucun bloc de donn\u00e9es " + String.valueOf(apx_12));
            return;
        }
        if (aqi_23.cQu != apx_12.dy(byArray)) {
            this.b(apx_12, aqi_22);
            this.d(apx_12);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void b(apx_1 apx_12) {
        Object object = this.cPQ;
        synchronized (object) {
            ArrayList<aqi_2> arrayList = this.a(cPl, apx_12.aFS(), (Object)apx_12.bGh(), 1);
            if (!arrayList.isEmpty()) {
                this.b(apx_12, arrayList.get(0));
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void b(apx_1 apx_12, aqi_2 aqi_22) {
        this.bU(apx_12.aFS(), aqi_22.cQj);
        try {
            int n;
            FileInputStream fileInputStream = null;
            FilterInputStream filterInputStream = null;
            FileOutputStream fileOutputStream = null;
            try {
                this.cPR.setLength(0);
                fileInputStream = new FileInputStream(this.cPP.cQl);
                filterInputStream = this.cQe.b(fileInputStream);
                int n2 = (int)fileInputStream.getChannel().size();
                fileOutputStream = new FileOutputStream(this.cPU, false);
                fileInputStream.getChannel().position(aqi_22.cQt);
                n = aqg_2.e((DataInputStream)filterInputStream);
                long l = aqi_22.cQt + (long)n;
                fileInputStream.getChannel().transferTo(0L, aqi_22.cQt, fileOutputStream.getChannel());
                fileInputStream.getChannel().transferTo(l, (long)n2 - l, fileOutputStream.getChannel());
            }
            finally {
                if (filterInputStream != null) {
                    try {
                        filterInputStream.close();
                    }
                    catch (IOException iOException) {
                        cPe.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                    }
                }
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    }
                    catch (IOException iOException) {
                        cPe.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    }
                    catch (IOException iOException) {
                        cPe.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                    }
                }
            }
            this.cPR.setLength(0);
            File file = this.cPP.cQl;
            if (file.exists()) {
                file.delete();
            }
            this.cPU.renameTo(file);
            --this.cPP.cQk;
            this.cPP.Yh -= n;
            this.a(aqi_22.cQj, aqi_22.cQt, n, apx_12);
            this.bGo();
        }
        catch (FileNotFoundException fileNotFoundException) {
            cPe.error(fileNotFoundException.getMessage(), (Throwable)fileNotFoundException);
        }
        catch (IOException iOException) {
            cPe.error(iOException.getMessage(), (Throwable)iOException);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(int n, long l, long l2, apx_1 apx_12) {
        block17: {
            try {
                int n2 = apx_12.aFS();
                TIntObjectHashMap tIntObjectHashMap = (TIntObjectHashMap)this.cPK.get(n2);
                if (tIntObjectHashMap != null) {
                    TIntObjectIterator tIntObjectIterator = tIntObjectHashMap.iterator();
                    while (tIntObjectIterator.hasNext()) {
                        Object object;
                        tIntObjectIterator.advance();
                        FileOutputStream fileOutputStream = null;
                        FilterOutputStream filterOutputStream = null;
                        try {
                            fileOutputStream = new FileOutputStream(this.cPT, false);
                            filterOutputStream = this.cQf.b(fileOutputStream);
                            object = ((ArrayList)tIntObjectIterator.value()).iterator();
                            while (object.hasNext()) {
                                aqi_2 aqi_22 = (aqi_2)object.next();
                                if (aqi_22.cQj == n && aqi_22.cQt > l) {
                                    aqi_22.cQt -= l2;
                                    aqi_22.f((DataOutputStream)filterOutputStream);
                                    continue;
                                }
                                if (aqi_22.cQj == n && aqi_22.cQt == l) {
                                    object.remove();
                                    aqi_22.aZp();
                                    continue;
                                }
                                if (n == aqi_22.cQj && (n != aqi_22.cQj || aqi_22.cQt >= l)) continue;
                                aqi_22.f((DataOutputStream)filterOutputStream);
                            }
                        }
                        finally {
                            if (filterOutputStream != null) {
                                try {
                                    filterOutputStream.close();
                                }
                                catch (IOException iOException) {
                                    cPe.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                                }
                            }
                        }
                        object = this.bV(tIntObjectIterator.key(), n2);
                        if (((File)object).exists()) {
                            ((File)object).delete();
                        }
                        this.cPT.renameTo((File)object);
                    }
                    break block17;
                }
                cPe.error("Situation anormale : on met a jour des indexes qu'on a pas encore mont\u00e9 en memoire");
            }
            catch (IOException iOException) {
                cPe.error(iOException.getMessage(), (Throwable)iOException);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private apx_1[] a(ArrayList<aqi_2> arrayList, apx_1 apx_12) {
        if (arrayList.size() == 0) {
            return null;
        }
        ArrayList<apx_1> arrayList2 = new ArrayList<apx_1>();
        int n = apx_12.aFS();
        Iterator<aqi_2> iterator = arrayList.iterator();
        block18: while (true) {
            if (!iterator.hasNext()) {
                if (arrayList2.size() <= 0) return null;
                return arrayList2.toArray(new apx_1[arrayList2.size()]);
            }
            aqi_2 aqi_22 = iterator.next();
            int n2 = aqi_22.cQj;
            long l = aqi_22.cQt;
            this.bU(n, n2);
            try {
                apx_1 apx_13;
                this.cPR.setLength(0);
                File file = this.cPP.cQl;
                if (!file.exists()) {
                    return null;
                }
                FileInputStream fileInputStream = null;
                FilterInputStream filterInputStream = null;
                aqg_2 aqg_22 = null;
                try {
                    fileInputStream = new FileInputStream(file);
                    filterInputStream = this.cQe.b(fileInputStream);
                    if (l < 0L) {
                        cPe.error("position n\u00e9gative");
                        apx_13 = null;
                        return apx_13;
                    }
                    fileInputStream.getChannel().position(l);
                    aqg_22 = new aqg_2();
                    aqg_22.d((DataInputStream)filterInputStream);
                }
                finally {
                    if (filterInputStream != null) {
                        try {
                            filterInputStream.close();
                        }
                        catch (IOException iOException) {
                            cPe.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                        }
                    }
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        }
                        catch (IOException iOException) {
                            cPe.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                        }
                    }
                }
                apx_13 = apx_12.aFN();
                ByteBuffer byteBuffer = ByteBuffer.wrap(aqg_22.aKU());
                apx_13.a(byteBuffer, aqg_22.d(), aqg_22.bGi());
                if (byteBuffer.remaining() != 0) {
                    cPe.warn("Objet restaur\u00e9 du binary storage : " + byteBuffer.remaining() + " bytes restants non lus [type:" + apx_12.aFS() + " | id:" + aqg_22.d() + "]");
                }
                arrayList2.add(apx_13);
                Iterator iterator2 = this.cPf.iterator();
                while (true) {
                    if (!iterator2.hasNext()) continue block18;
                    aql_2 aql_22 = (aql_2)iterator2.next();
                    aql_22.c(this, apx_13);
                }
            }
            catch (IOException iOException) {
                cPe.error(iOException.getMessage(), (Throwable)iOException);
                continue;
            }
            break;
        }
    }

    @Override
    public apx_1[] a(String string, Object object, apx_1 apx_12) {
        return this.a(string.hashCode(), object, apx_12);
    }

    public apx_1[] a(int n, Object object, apx_1 apx_12) {
        return this.a(n, object, apx_12, Integer.MAX_VALUE);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public apx_1[] a(int n, Object object, apx_1 apx_12, int n2) {
        Object object2 = this.cPQ;
        synchronized (object2) {
            return this.a(this.a(n, apx_12.aFS(), object, n2), apx_12);
        }
    }

    @Override
    public apx_1 a(int n, apx_1 apx_12) {
        apx_1[] apx_1Array = this.a(cPl, (Object)n, apx_12, 1);
        if (apx_1Array != null && apx_1Array.length > 0) {
            return apx_1Array[0];
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public apx_1[] a(apx_1 apx_12) {
        Object object = this.cPQ;
        synchronized (object) {
            ArrayList arrayList;
            TIntObjectHashMap tIntObjectHashMap = (TIntObjectHashMap)this.cPK.get(apx_12.aFS());
            if (tIntObjectHashMap == null) {
                this.tA(apx_12.aFS());
                tIntObjectHashMap = (TIntObjectHashMap)this.cPK.get(apx_12.aFS());
            }
            if ((arrayList = (ArrayList)tIntObjectHashMap.get(cPl)) == null || arrayList.isEmpty()) {
                return null;
            }
            return this.a(arrayList, apx_12);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void bGd() {
        Object object = this.cPQ;
        synchronized (object) {
            File[] fileArray;
            for (File file : fileArray = this.cPW.listFiles(new aqa_2(this))) {
                file.delete();
            }
        }
    }

    private void bT(int n, int n2) {
        ArrayList<aqc_2> arrayList = (ArrayList<aqc_2>)this.cPJ.get(n);
        aqc_2 aqc_22 = null;
        if (arrayList == null) {
            aqc_22 = new aqc_2(this, n, 1, 0, 0);
            arrayList = new ArrayList<aqc_2>();
            arrayList.add(aqc_22);
            this.cPJ.put(n, arrayList);
        }
        int n3 = 0;
        for (aqc_2 aqc_23 : arrayList) {
            if (aqc_23.cQj > n3) {
                n3 = aqc_23.cQj;
            }
            if (aqc_23.cQk + 1 > 500 || n2 + aqc_23.Yh > 20000000) continue;
            aqc_22 = aqc_23;
            break;
        }
        if (aqc_22 == null) {
            aqc_22 = new aqc_2(this, n, n3 + 1, 0, 0);
            arrayList.add(aqc_22);
        }
        this.a(aqc_22);
    }

    private boolean bU(int n, int n2) {
        ArrayList<aqc_2> arrayList = (ArrayList<aqc_2>)this.cPJ.get(n);
        aqc_2 aqc_22 = null;
        if (arrayList == null) {
            aqc_22 = new aqc_2(this, n, 1, 0, 0);
            arrayList = new ArrayList<aqc_2>();
            arrayList.add(aqc_22);
            this.cPJ.put(n, arrayList);
        }
        for (aqc_2 aqc_23 : arrayList) {
            if (aqc_23.cQj != n2) continue;
            this.a(aqc_23);
            return true;
        }
        return false;
    }

    private void a(aqc_2 aqc_22) {
        this.cPP = aqc_22;
    }

    private File bV(int n, int n2) {
        long l = GC.s(n2, n);
        File file = (File)this.cPX.get(l);
        if (file != null) {
            return file;
        }
        this.cPR.setLength(0);
        String string = this.cPR.append(this.cPM).append(cQb).append(n2).append("_").append(n).append(".bdat").toString();
        file = new File(string);
        this.cPX.put(l, (Object)file);
        return file;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(int n, Object object, int n2, int n3, long l, long l2) {
        try {
            ArrayList<aqi_2> arrayList;
            File file = this.bV(n, n2);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = null;
            FilterOutputStream filterOutputStream = null;
            aqi_2 aqi_22 = null;
            try {
                fileOutputStream = new FileOutputStream(file, true);
                filterOutputStream = this.cQf.b(fileOutputStream);
                aqi_22 = aqi_2.a(object.toString(), n3, l, l2);
                aqi_22.f((DataOutputStream)filterOutputStream);
            }
            finally {
                if (filterOutputStream != null) {
                    try {
                        filterOutputStream.close();
                    }
                    catch (IOException iOException) {
                        cPe.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    }
                    catch (IOException iOException) {
                        cPe.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                    }
                }
            }
            TIntObjectHashMap tIntObjectHashMap = (TIntObjectHashMap)this.cPK.get(n2);
            if (tIntObjectHashMap == null) {
                this.tA(n2);
                tIntObjectHashMap = (TIntObjectHashMap)this.cPK.get(n2);
            }
            if ((arrayList = (ArrayList<aqi_2>)tIntObjectHashMap.get(n)) == null) {
                arrayList = new ArrayList<aqi_2>(50);
                tIntObjectHashMap.put(n, arrayList);
            }
            arrayList.add(aqi_22);
        }
        catch (IOException iOException) {
            cPe.error(iOException.getMessage(), (Throwable)iOException);
        }
    }

    private ArrayList<aqi_2> a(int n, int n2, Object object, int n3) {
        ArrayList arrayList;
        TIntObjectHashMap tIntObjectHashMap = (TIntObjectHashMap)this.cPK.get(n2);
        if (tIntObjectHashMap == null) {
            this.tA(n2);
            tIntObjectHashMap = (TIntObjectHashMap)this.cPK.get(n2);
        }
        ArrayList<aqi_2> arrayList2 = new ArrayList<aqi_2>();
        if (tIntObjectHashMap != null && (arrayList = (ArrayList)tIntObjectHashMap.get(n)) != null) {
            int n4 = arrayList.size();
            String string = object.toString();
            for (int i = 0; i < n4; ++i) {
                aqi_2 aqi_22 = (aqi_2)arrayList.get(i);
                if (!aqi_22.cQv.equals(string)) continue;
                arrayList2.add(aqi_22);
                if (arrayList2.size() >= n3) break;
            }
        }
        return arrayList2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void tA(int n) {
        Pattern pattern = Pattern.compile(cQb.replaceAll("\\.", "\\\\\\.") + n + "_([a-zA-Z0-9_.-]+)" + ".bdat".replaceAll("\\.", "\\\\\\."));
        File[] fileArray = this.cPW.listFiles(new aqb_2(this, pattern));
        TIntObjectHashMap tIntObjectHashMap = (TIntObjectHashMap)this.cPK.get(n);
        if (tIntObjectHashMap == null) {
            tIntObjectHashMap = new TIntObjectHashMap();
            this.cPK.put(n, (Object)tIntObjectHashMap);
        }
        for (File file : fileArray) {
            int n2;
            Matcher matcher = pattern.matcher(file.getName());
            if (!matcher.matches()) continue;
            try {
                n2 = Integer.parseInt(matcher.group(1));
            }
            catch (NumberFormatException numberFormatException) {
                cPe.error("Nom de fichier d'index mal form\u00e9 : " + file.getName());
                continue;
            }
            try {
                FileInputStream fileInputStream = null;
                FilterInputStream filterInputStream = null;
                try {
                    fileInputStream = new FileInputStream(file);
                    filterInputStream = this.cQf.b(fileInputStream);
                    try {
                        while (true) {
                            aqi_2 aqi_22 = aqi_2.bGs();
                            aqi_22.d((DataInputStream)filterInputStream);
                            ArrayList<aqi_2> arrayList = (ArrayList<aqi_2>)tIntObjectHashMap.get(n2);
                            if (arrayList == null) {
                                arrayList = new ArrayList<aqi_2>();
                                tIntObjectHashMap.put(n2, arrayList);
                            }
                            arrayList.add(aqi_22);
                        }
                    }
                    catch (EOFException eOFException) {
                        if (filterInputStream != null) {
                            try {
                                filterInputStream.close();
                            }
                            catch (IOException iOException) {
                                cPe.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                            }
                        }
                        if (fileInputStream == null) continue;
                        try {
                            fileInputStream.close();
                        }
                        catch (IOException iOException) {
                            cPe.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                        }
                    }
                }
                catch (Throwable throwable) {
                    if (filterInputStream != null) {
                        try {
                            filterInputStream.close();
                        }
                        catch (IOException iOException) {
                            cPe.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                        }
                    }
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        }
                        catch (IOException iOException) {
                            cPe.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                        }
                    }
                    throw throwable;
                }
            }
            catch (FileNotFoundException fileNotFoundException) {
                cPe.error(fileNotFoundException.getMessage());
            }
            catch (IOException iOException) {
                cPe.error(iOException.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        return "BinaryStorage working under " + this.cPM;
    }
}

