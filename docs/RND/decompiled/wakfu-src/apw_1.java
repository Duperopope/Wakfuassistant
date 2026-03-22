/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/*
 * Renamed from apW
 */
public class apw_1
extends aps_1 {
    private static final apx_1[] cPt = new apx_1[0];
    private String cPu = null;
    private final TIntObjectHashMap<HashMap<String, ArrayList<aqk_2>>> cPv = new TIntObjectHashMap();
    private final Object cPw = new Object();
    private final String cPx;
    private final String cPy;
    private boolean cPz;

    public apw_1(String string, String string2, boolean bl) {
        this.cPx = string;
        this.cPy = string2;
        this.start();
    }

    public apw_1(String string, String string2) {
        this(string, string2, false);
    }

    @Override
    public apx_1 a(int n, apx_1 apx_12) {
        if (!this.blc()) {
            cPe.error("Tentative d'acces au (Simple)BinaryStorage alors qu'il n'est pas initialis\u00e9");
            return null;
        }
        apx_1[] apx_1Array = this.a("id", n, apx_12);
        if (apx_1Array != null && apx_1Array.length > 0) {
            return apx_1Array[0];
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public apx_1[] a(String string, Object object, apx_1 apx_12) {
        if (!this.blc()) {
            cPe.error("Tentative d'acces au (Simple)BinaryStorage alors qu'il n'est pas initialis\u00e9");
            return cPt;
        }
        LinkedList<apx_1> linkedList = new LinkedList<apx_1>();
        Object object2 = this.cPw;
        synchronized (object2) {
            HashMap hashMap = (HashMap)this.cPv.get(apx_12.aFS());
            if (hashMap == null) {
                return cPt;
            }
            if (hashMap.get(string) == null) {
                return cPt;
            }
            try {
                File file = new File(this.cPu + this.cPx);
                if (!file.exists()) {
                    return cPt;
                }
                String string2 = object.toString();
                for (aqk_2 aqk_22 : (ArrayList)hashMap.get(string)) {
                    if (!aqk_22.bGv().equals(string2)) continue;
                    try (FileInputStream fileInputStream = new FileInputStream(file);
                         DataInputStream dataInputStream = new DataInputStream(fileInputStream);){
                        FileChannel fileChannel = fileInputStream.getChannel();
                        fileChannel.position(aqk_22.bGw());
                        aqg_2 aqg_22 = new aqg_2();
                        aqg_22.d(dataInputStream);
                        apx_1 apx_13 = apx_12.aFN();
                        ByteBuffer byteBuffer = ByteBuffer.wrap(aqg_22.aKU());
                        apx_13.a(byteBuffer, aqg_22.d(), aqg_22.bGi());
                        if (byteBuffer.remaining() != 0) {
                            cPe.warn("Objet restaur\u00e9 du simple binary storage : " + byteBuffer.remaining() + " bytes restants non lus [type:" + apx_12.aFS() + " | id:" + aqg_22.d() + "]");
                        }
                        linkedList.add(apx_13);
                        for (aql_2 aql_22 : this.cPf) {
                            aql_22.c(this, apx_13);
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
        if (!linkedList.isEmpty()) {
            return linkedList.toArray(new apx_1[linkedList.size()]);
        }
        return cPt;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public apx_1[] a(apx_1 apx_12) {
        if (!this.blc()) {
            cPe.error("Tentative d'acces au (Simple)BinaryStorage alors qu'il n'est pas initialis\u00e9");
            return cPt;
        }
        LinkedList<Object> linkedList = new LinkedList<Object>();
        Object object = this.cPw;
        synchronized (object) {
            HashMap hashMap = (HashMap)this.cPv.get(apx_12.aFS());
            if (hashMap == null) {
                return cPt;
            }
            try {
                File file = new File(this.cPu + this.cPx);
                if (!file.exists()) {
                    return cPt;
                }
                for (aqk_2 aqk_22 : (ArrayList)hashMap.get("id")) {
                    aqg_2 aqg_22;
                    Object object2;
                    try (Object object3 = new FileInputStream(file);){
                        object2 = new DataInputStream((InputStream)object3);
                        try {
                            FileChannel fileChannel = ((FileInputStream)object3).getChannel();
                            fileChannel.position(aqk_22.bGw());
                            aqg_22 = new aqg_2();
                            aqg_22.d((DataInputStream)object2);
                        }
                        finally {
                            ((FilterInputStream)object2).close();
                        }
                    }
                    object3 = apx_12.aFN();
                    object2 = ByteBuffer.wrap(aqg_22.aKU());
                    ((apx_1)object3).a((ByteBuffer)object2, aqg_22.d(), aqg_22.bGi());
                    if (((Buffer)object2).remaining() != 0) {
                        cPe.warn("Objet restaur\u00e9 du simple binary storage : " + ((Buffer)object2).remaining() + " bytes restants non lus [type:" + apx_12.aFS() + " | id:" + aqg_22.d() + "]");
                    }
                    linkedList.add(object3);
                    for (aql_2 aql_22 : this.cPf) {
                        aql_22.c(this, (apx_1)object3);
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
        if (!linkedList.isEmpty()) {
            return linkedList.toArray(new apx_1[linkedList.size()]);
        }
        return cPt;
    }

    public void fE(String string) {
        if (string != null) {
            Object object = string;
            if (((String)object).charAt(((String)object).length() - 1) != '/') {
                object = (String)object + "/";
            }
            this.cPz = false;
            this.cPu = object;
        }
    }

    public boolean blc() {
        return this.cPz;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean bGb() {
        assert (this.cPu != null) : "Il faut initialiser m_baseWorkspace";
        Object object = this.cPw;
        synchronized (object) {
            try {
                File file = new File(this.cPu);
                if (file.exists() && !file.isDirectory()) {
                    throw new RuntimeException("Tentative de changement de workspace [" + this.cPu + "] vers un fichier [not directory] existant [Aborted & Shutdown]");
                }
                if (!file.exists() && !file.mkdirs()) {
                    throw new RuntimeException("Impossible de creer l'arborescence de repertoire [" + this.cPu + "] lors d'un changement de workspace inexistant [Aborted & Shutdown]");
                }
                this.cPv.clear();
                File file2 = new File(this.cPu + this.cPy);
                if (!file2.exists()) {
                    file2.createNewFile();
                    cPe.info("Fichier d'index non trouv\u00e9 pour le chargement de la source binaire : Creation d'une nouvelle source");
                    this.bGg();
                    return true;
                }
                try {
                    FileInputStream fileInputStream = new FileInputStream(file2);
                    try {
                        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                        try {
                            while (true) {
                                aqk_2 aqk_22 = new aqk_2();
                                aqk_22.d(dataInputStream);
                                this.a(aqk_22);
                            }
                        }
                        catch (Throwable throwable) {
                            try {
                                dataInputStream.close();
                            }
                            catch (Throwable throwable2) {
                                throwable.addSuppressed(throwable2);
                            }
                            throw throwable;
                        }
                    }
                    catch (Throwable throwable) {
                        try {
                            fileInputStream.close();
                        }
                        catch (Throwable throwable3) {
                            throwable.addSuppressed(throwable3);
                        }
                        throw throwable;
                    }
                }
                catch (EOFException eOFException) {
                }
            }
            catch (IOException iOException) {
                cPe.error(iOException.getMessage(), (Throwable)iOException);
            }
            this.bGg();
            return true;
        }
    }

    private void bGg() {
        this.cPz = true;
        for (aql_2 aql_22 : this.cPf) {
            aql_22.a((aps_1)this, this.bGc());
        }
    }

    private void a(aqk_2 aqk_22) {
        ArrayList<aqk_2> arrayList;
        HashMap<String, ArrayList<aqk_2>> hashMap = (HashMap<String, ArrayList<aqk_2>>)this.cPv.get(aqk_22.aeV());
        if (hashMap == null) {
            hashMap = new HashMap<String, ArrayList<aqk_2>>(5);
            this.cPv.put(aqk_22.aeV(), hashMap);
        }
        if ((arrayList = (ArrayList<aqk_2>)hashMap.get(aqk_22.bGu())) == null) {
            arrayList = new ArrayList<aqk_2>(300);
            hashMap.put(aqk_22.bGu(), arrayList);
        }
        arrayList.add(aqk_22);
    }

    @Override
    protected void b(apx_1 apx_12) {
        cPe.error("Remove call on a ReadOnlyBinaryStorage");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void c(apx_1 apx_12) {
        Object object = this.cPw;
        synchronized (object) {
            byte[] byArray = apx_12.aFR();
            if (byArray == null) {
                cPe.error("Tentative de sauvegarde d'un binary storable qui n'a aucun bloc de donn\u00e9es " + String.valueOf(apx_12));
                return;
            }
            try {
                long l;
                File file = new File(this.cPu + this.cPx);
                if (!file.exists()) {
                    file.createNewFile();
                }
                try (Field[] fieldArray = new FileOutputStream(this.cPu + this.cPx, true);
                     Field[] fieldArray2 = new DataOutputStream((OutputStream)fieldArray);){
                    FileChannel fileChannel = fieldArray.getChannel();
                    l = fileChannel.size();
                    aqg_2 aqg_22 = new aqg_2(apx_12.bGh(), apx_12.bGi(), byArray);
                    aqg_22.f((DataOutputStream)fieldArray2);
                }
                this.a("id", apx_12.bGh(), apx_12.aFS(), l);
                for (Field field : fieldArray = apx_12.getClass().getDeclaredFields()) {
                    Object object2;
                    if (!field.isAnnotationPresent(aqd_2.class)) continue;
                    aqd_2 aqd_22 = field.getAnnotation(aqd_2.class);
                    if (field.isAccessible()) {
                        object2 = field.get(apx_12);
                    } else {
                        field.setAccessible(true);
                        object2 = field.get(apx_12);
                        field.setAccessible(false);
                    }
                    this.a(aqd_22.name(), object2, apx_12.aFS(), l);
                }
            }
            catch (IOException | IllegalAccessException exception) {
                cPe.error(exception.getMessage(), (Throwable)exception);
            }
        }
    }

    private void a(String string, Object object, int n, long l) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(this.cPu + this.cPy, true);
             DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);){
            aqk_2 aqk_22 = new aqk_2(n, string, object.toString(), l);
            aqk_22.f(dataOutputStream);
            this.a(aqk_22);
        }
        catch (IOException iOException) {
            cPe.error(iOException.getMessage());
        }
    }

    @Override
    protected String bGc() {
        return this.cPu;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void bGd() {
        Object object = this.cPw;
        synchronized (object) {
            System.out.println("cleanUpFiles m_baseWorkspace " + this.cPu);
            File file = new File(this.cPu + this.cPy);
            File file2 = new File(this.cPu + this.cPx);
            file.delete();
            file2.delete();
            this.cPv.clear();
        }
    }
}

