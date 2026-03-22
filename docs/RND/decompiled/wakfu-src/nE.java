/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.GeneratedMessageV3$UnusedPrivateParameter
 *  com.google.protobuf.Internal
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MapEntry
 *  com.google.protobuf.MapField
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UninitializedMessageException
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntry;
import com.google.protobuf.MapField;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

public final class nE
extends GeneratedMessageV3
implements nI {
    private static final long Od = 0L;
    int an;
    public static final int Oe = 1;
    volatile Object bs;
    public static final int Of = 2;
    long nW;
    public static final int Og = 3;
    long wf;
    public static final int Oh = 4;
    boolean NQ;
    public static final int Oi = 5;
    volatile Object Oj;
    public static final int Ok = 6;
    volatile Object Ol;
    public static final int Om = 7;
    int oq;
    public static final int On = 8;
    int mj;
    public static final int Oo = 9;
    long DJ;
    public static final int Op = 10;
    int Oq;
    public static final int Or = 11;
    int Os;
    public static final int Ot = 12;
    int Ou;
    public static final int Ov = 13;
    long Ow;
    public static final int Ox = 14;
    volatile Object Oy;
    public static final int Oz = 15;
    int OA;
    public static final int OB = 16;
    int OC;
    public static final int OD = 17;
    int OE;
    public static final int OF = 18;
    long OG;
    public static final int OH = 19;
    volatile Object OI;
    public static final int OJ = 20;
    boolean OK;
    public static final int OL = 21;
    volatile Object OM;
    public static final int ON = 22;
    boolean OO;
    public static final int OP = 23;
    volatile Object OQ;
    public static final int OR = 24;
    boolean OS;
    public static final int OT = 25;
    long OU;
    public static final int OV = 26;
    long OW;
    public static final int OX = 27;
    int OY;
    public static final int OZ = 28;
    long Pa;
    public static final int Pb = 29;
    MapField<Integer, Integer> Pc;
    private byte Y = (byte)-1;
    private static final nE Pd = new nE();
    @Deprecated
    public static final Parser<nE> Pe = new nF();

    nE(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private nE() {
        this.bs = "";
        this.Oj = "null";
        this.Ol = "";
        this.Oy = "null";
        this.OI = "null";
        this.OM = "";
        this.OQ = "";
        this.OU = -1L;
        this.OW = -1L;
        this.Pa = -1L;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new nE();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    nE(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block39: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block39;
                    }
                    case 10: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 1;
                        this.bs = byteString;
                        continue block39;
                    }
                    case 16: {
                        this.an |= 2;
                        this.nW = codedInputStream.readInt64();
                        continue block39;
                    }
                    case 24: {
                        this.an |= 4;
                        this.wf = codedInputStream.readInt64();
                        continue block39;
                    }
                    case 32: {
                        this.an |= 8;
                        this.NQ = codedInputStream.readBool();
                        continue block39;
                    }
                    case 42: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 0x10;
                        this.Oj = byteString;
                        continue block39;
                    }
                    case 50: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 0x20;
                        this.Ol = byteString;
                        continue block39;
                    }
                    case 56: {
                        this.an |= 0x40;
                        this.oq = codedInputStream.readInt32();
                        continue block39;
                    }
                    case 64: {
                        this.an |= 0x80;
                        this.mj = codedInputStream.readInt32();
                        continue block39;
                    }
                    case 72: {
                        this.an |= 0x100;
                        this.DJ = codedInputStream.readInt64();
                        continue block39;
                    }
                    case 80: {
                        this.an |= 0x200;
                        this.Oq = codedInputStream.readInt32();
                        continue block39;
                    }
                    case 88: {
                        this.an |= 0x400;
                        this.Os = codedInputStream.readInt32();
                        continue block39;
                    }
                    case 96: {
                        this.an |= 0x800;
                        this.Ou = codedInputStream.readInt32();
                        continue block39;
                    }
                    case 104: {
                        this.an |= 0x1000;
                        this.Ow = codedInputStream.readInt64();
                        continue block39;
                    }
                    case 114: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 0x2000;
                        this.Oy = byteString;
                        continue block39;
                    }
                    case 120: {
                        this.an |= 0x4000;
                        this.OA = codedInputStream.readInt32();
                        continue block39;
                    }
                    case 128: {
                        this.an |= 0x8000;
                        this.OC = codedInputStream.readInt32();
                        continue block39;
                    }
                    case 136: {
                        this.an |= 0x10000;
                        this.OE = codedInputStream.readInt32();
                        continue block39;
                    }
                    case 144: {
                        this.an |= 0x20000;
                        this.OG = codedInputStream.readInt64();
                        continue block39;
                    }
                    case 154: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 0x40000;
                        this.OI = byteString;
                        continue block39;
                    }
                    case 160: {
                        this.an |= 0x80000;
                        this.OK = codedInputStream.readBool();
                        continue block39;
                    }
                    case 170: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 0x100000;
                        this.OM = byteString;
                        continue block39;
                    }
                    case 176: {
                        this.an |= 0x200000;
                        this.OO = codedInputStream.readBool();
                        continue block39;
                    }
                    case 186: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 0x400000;
                        this.OQ = byteString;
                        continue block39;
                    }
                    case 192: {
                        this.an |= 0x800000;
                        this.OS = codedInputStream.readBool();
                        continue block39;
                    }
                    case 200: {
                        this.an |= 0x1000000;
                        this.OU = codedInputStream.readInt64();
                        continue block39;
                    }
                    case 208: {
                        this.an |= 0x2000000;
                        this.OW = codedInputStream.readInt64();
                        continue block39;
                    }
                    case 216: {
                        this.an |= 0x4000000;
                        this.OY = codedInputStream.readInt32();
                        continue block39;
                    }
                    case 224: {
                        this.an |= 0x8000000;
                        this.Pa = codedInputStream.readInt64();
                        continue block39;
                    }
                    case 234: {
                        if ((n & 0x10000000) == 0) {
                            this.Pc = MapField.newMapField(nH.Pf);
                            n |= 0x10000000;
                        }
                        ByteString byteString = (MapEntry)codedInputStream.readMessage(nH.Pf.getParserForType(), extensionRegistryLite);
                        this.Pc.getMutableMap().put((Integer)byteString.getKey(), (Integer)byteString.getValue());
                        continue block39;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue;
                bl = true;
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (UninitializedMessageException uninitializedMessageException) {
            throw uninitializedMessageException.asInvalidProtocolBufferException().setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor aqL() {
        return nd_0.NZ;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 29: {
                return this.arI();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return nd_0.Oa.ensureFieldAccessorsInitialized(nE.class, nG.class);
    }

    @Override
    public boolean wq() {
        return (this.an & 1) != 0;
    }

    @Override
    public String getName() {
        Object object = this.bs;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.bs = string;
        }
        return string;
    }

    @Override
    public ByteString bW() {
        Object object = this.bs;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.bs = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean xk() {
        return (this.an & 2) != 0;
    }

    @Override
    public long xl() {
        return this.nW;
    }

    @Override
    public boolean KT() {
        return (this.an & 4) != 0;
    }

    @Override
    public long KU() {
        return this.wf;
    }

    @Override
    public boolean aqg() {
        return (this.an & 8) != 0;
    }

    @Override
    public boolean aqh() {
        return this.NQ;
    }

    @Override
    public boolean aqM() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public String aqN() {
        Object object = this.Oj;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.Oj = string;
        }
        return string;
    }

    @Override
    public ByteString aqO() {
        Object object = this.Oj;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.Oj = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean aqP() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public String aqQ() {
        Object object = this.Ol;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.Ol = string;
        }
        return string;
    }

    @Override
    public ByteString aqR() {
        Object object = this.Ol;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.Ol = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean xS() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public int xT() {
        return this.oq;
    }

    @Override
    public boolean tK() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public int tL() {
        return this.mj;
    }

    @Override
    public boolean XZ() {
        return (this.an & 0x100) != 0;
    }

    @Override
    public long Ya() {
        return this.DJ;
    }

    @Override
    public boolean aqS() {
        return (this.an & 0x200) != 0;
    }

    @Override
    public int aqT() {
        return this.Oq;
    }

    @Override
    public boolean aqU() {
        return (this.an & 0x400) != 0;
    }

    @Override
    public int aqV() {
        return this.Os;
    }

    @Override
    public boolean aqW() {
        return (this.an & 0x800) != 0;
    }

    @Override
    public int aqX() {
        return this.Ou;
    }

    @Override
    public boolean aqY() {
        return (this.an & 0x1000) != 0;
    }

    @Override
    public long aqZ() {
        return this.Ow;
    }

    @Override
    public boolean ara() {
        return (this.an & 0x2000) != 0;
    }

    @Override
    public String arb() {
        Object object = this.Oy;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.Oy = string;
        }
        return string;
    }

    @Override
    public ByteString arc() {
        Object object = this.Oy;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.Oy = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean ard() {
        return (this.an & 0x4000) != 0;
    }

    @Override
    public int are() {
        return this.OA;
    }

    @Override
    public boolean arf() {
        return (this.an & 0x8000) != 0;
    }

    @Override
    public int arg() {
        return this.OC;
    }

    @Override
    public boolean arh() {
        return (this.an & 0x10000) != 0;
    }

    @Override
    public int ari() {
        return this.OE;
    }

    @Override
    public boolean arj() {
        return (this.an & 0x20000) != 0;
    }

    @Override
    public long ark() {
        return this.OG;
    }

    @Override
    public boolean arl() {
        return (this.an & 0x40000) != 0;
    }

    @Override
    public String arm() {
        Object object = this.OI;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.OI = string;
        }
        return string;
    }

    @Override
    public ByteString arn() {
        Object object = this.OI;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.OI = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean aro() {
        return (this.an & 0x80000) != 0;
    }

    @Override
    public boolean arp() {
        return this.OK;
    }

    @Override
    public boolean arq() {
        return (this.an & 0x100000) != 0;
    }

    @Override
    public String arr() {
        Object object = this.OM;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.OM = string;
        }
        return string;
    }

    @Override
    public ByteString ars() {
        Object object = this.OM;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.OM = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean art() {
        return (this.an & 0x200000) != 0;
    }

    @Override
    public boolean aru() {
        return this.OO;
    }

    @Override
    public boolean arv() {
        return (this.an & 0x400000) != 0;
    }

    @Override
    public String arw() {
        Object object = this.OQ;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.OQ = string;
        }
        return string;
    }

    @Override
    public ByteString arx() {
        Object object = this.OQ;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.OQ = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean ary() {
        return (this.an & 0x800000) != 0;
    }

    @Override
    public boolean arz() {
        return this.OS;
    }

    @Override
    public boolean arA() {
        return (this.an & 0x1000000) != 0;
    }

    @Override
    public long arB() {
        return this.OU;
    }

    @Override
    public boolean arC() {
        return (this.an & 0x2000000) != 0;
    }

    @Override
    public long arD() {
        return this.OW;
    }

    @Override
    public boolean arE() {
        return (this.an & 0x4000000) != 0;
    }

    @Override
    public int arF() {
        return this.OY;
    }

    @Override
    public boolean arG() {
        return (this.an & 0x8000000) != 0;
    }

    @Override
    public long arH() {
        return this.Pa;
    }

    MapField<Integer, Integer> arI() {
        if (this.Pc == null) {
            return MapField.emptyMapField(nH.Pf);
        }
        return this.Pc;
    }

    @Override
    public int arJ() {
        return this.arI().getMap().size();
    }

    @Override
    public boolean jn(int n) {
        return this.arI().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, Integer> arK() {
        return this.arL();
    }

    @Override
    public Map<Integer, Integer> arL() {
        return this.arI().getMap();
    }

    @Override
    public int g(int n, int n2) {
        Map map = this.arI().getMap();
        return map.containsKey(n) ? (Integer)map.get(n) : n2;
    }

    @Override
    public int jo(int n) {
        Map map = this.arI().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (Integer)map.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.wq()) {
            this.Y = 0;
            return false;
        }
        if (!this.xk()) {
            this.Y = 0;
            return false;
        }
        if (!this.KT()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)1, (Object)this.bs);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt64(2, this.nW);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt64(3, this.wf);
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeBool(4, this.NQ);
        }
        if ((this.an & 0x10) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)5, (Object)this.Oj);
        }
        if ((this.an & 0x20) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)6, (Object)this.Ol);
        }
        if ((this.an & 0x40) != 0) {
            codedOutputStream.writeInt32(7, this.oq);
        }
        if ((this.an & 0x80) != 0) {
            codedOutputStream.writeInt32(8, this.mj);
        }
        if ((this.an & 0x100) != 0) {
            codedOutputStream.writeInt64(9, this.DJ);
        }
        if ((this.an & 0x200) != 0) {
            codedOutputStream.writeInt32(10, this.Oq);
        }
        if ((this.an & 0x400) != 0) {
            codedOutputStream.writeInt32(11, this.Os);
        }
        if ((this.an & 0x800) != 0) {
            codedOutputStream.writeInt32(12, this.Ou);
        }
        if ((this.an & 0x1000) != 0) {
            codedOutputStream.writeInt64(13, this.Ow);
        }
        if ((this.an & 0x2000) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)14, (Object)this.Oy);
        }
        if ((this.an & 0x4000) != 0) {
            codedOutputStream.writeInt32(15, this.OA);
        }
        if ((this.an & 0x8000) != 0) {
            codedOutputStream.writeInt32(16, this.OC);
        }
        if ((this.an & 0x10000) != 0) {
            codedOutputStream.writeInt32(17, this.OE);
        }
        if ((this.an & 0x20000) != 0) {
            codedOutputStream.writeInt64(18, this.OG);
        }
        if ((this.an & 0x40000) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)19, (Object)this.OI);
        }
        if ((this.an & 0x80000) != 0) {
            codedOutputStream.writeBool(20, this.OK);
        }
        if ((this.an & 0x100000) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)21, (Object)this.OM);
        }
        if ((this.an & 0x200000) != 0) {
            codedOutputStream.writeBool(22, this.OO);
        }
        if ((this.an & 0x400000) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)23, (Object)this.OQ);
        }
        if ((this.an & 0x800000) != 0) {
            codedOutputStream.writeBool(24, this.OS);
        }
        if ((this.an & 0x1000000) != 0) {
            codedOutputStream.writeInt64(25, this.OU);
        }
        if ((this.an & 0x2000000) != 0) {
            codedOutputStream.writeInt64(26, this.OW);
        }
        if ((this.an & 0x4000000) != 0) {
            codedOutputStream.writeInt32(27, this.OY);
        }
        if ((this.an & 0x8000000) != 0) {
            codedOutputStream.writeInt64(28, this.Pa);
        }
        GeneratedMessageV3.serializeIntegerMapTo((CodedOutputStream)codedOutputStream, this.arI(), nH.Pf, (int)29);
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.an & 1) != 0) {
            n += GeneratedMessageV3.computeStringSize((int)1, (Object)this.bs);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.nW);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt64Size((int)3, (long)this.wf);
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeBoolSize((int)4, (boolean)this.NQ);
        }
        if ((this.an & 0x10) != 0) {
            n += GeneratedMessageV3.computeStringSize((int)5, (Object)this.Oj);
        }
        if ((this.an & 0x20) != 0) {
            n += GeneratedMessageV3.computeStringSize((int)6, (Object)this.Ol);
        }
        if ((this.an & 0x40) != 0) {
            n += CodedOutputStream.computeInt32Size((int)7, (int)this.oq);
        }
        if ((this.an & 0x80) != 0) {
            n += CodedOutputStream.computeInt32Size((int)8, (int)this.mj);
        }
        if ((this.an & 0x100) != 0) {
            n += CodedOutputStream.computeInt64Size((int)9, (long)this.DJ);
        }
        if ((this.an & 0x200) != 0) {
            n += CodedOutputStream.computeInt32Size((int)10, (int)this.Oq);
        }
        if ((this.an & 0x400) != 0) {
            n += CodedOutputStream.computeInt32Size((int)11, (int)this.Os);
        }
        if ((this.an & 0x800) != 0) {
            n += CodedOutputStream.computeInt32Size((int)12, (int)this.Ou);
        }
        if ((this.an & 0x1000) != 0) {
            n += CodedOutputStream.computeInt64Size((int)13, (long)this.Ow);
        }
        if ((this.an & 0x2000) != 0) {
            n += GeneratedMessageV3.computeStringSize((int)14, (Object)this.Oy);
        }
        if ((this.an & 0x4000) != 0) {
            n += CodedOutputStream.computeInt32Size((int)15, (int)this.OA);
        }
        if ((this.an & 0x8000) != 0) {
            n += CodedOutputStream.computeInt32Size((int)16, (int)this.OC);
        }
        if ((this.an & 0x10000) != 0) {
            n += CodedOutputStream.computeInt32Size((int)17, (int)this.OE);
        }
        if ((this.an & 0x20000) != 0) {
            n += CodedOutputStream.computeInt64Size((int)18, (long)this.OG);
        }
        if ((this.an & 0x40000) != 0) {
            n += GeneratedMessageV3.computeStringSize((int)19, (Object)this.OI);
        }
        if ((this.an & 0x80000) != 0) {
            n += CodedOutputStream.computeBoolSize((int)20, (boolean)this.OK);
        }
        if ((this.an & 0x100000) != 0) {
            n += GeneratedMessageV3.computeStringSize((int)21, (Object)this.OM);
        }
        if ((this.an & 0x200000) != 0) {
            n += CodedOutputStream.computeBoolSize((int)22, (boolean)this.OO);
        }
        if ((this.an & 0x400000) != 0) {
            n += GeneratedMessageV3.computeStringSize((int)23, (Object)this.OQ);
        }
        if ((this.an & 0x800000) != 0) {
            n += CodedOutputStream.computeBoolSize((int)24, (boolean)this.OS);
        }
        if ((this.an & 0x1000000) != 0) {
            n += CodedOutputStream.computeInt64Size((int)25, (long)this.OU);
        }
        if ((this.an & 0x2000000) != 0) {
            n += CodedOutputStream.computeInt64Size((int)26, (long)this.OW);
        }
        if ((this.an & 0x4000000) != 0) {
            n += CodedOutputStream.computeInt32Size((int)27, (int)this.OY);
        }
        if ((this.an & 0x8000000) != 0) {
            n += CodedOutputStream.computeInt64Size((int)28, (long)this.Pa);
        }
        for (Map.Entry entry : this.arI().getMap().entrySet()) {
            MapEntry mapEntry = nH.Pf.newBuilderForType().setKey((Object)((Integer)entry.getKey())).setValue((Object)((Integer)entry.getValue())).build();
            n += CodedOutputStream.computeMessageSize((int)29, (MessageLite)mapEntry);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof nE)) {
            return super.equals(object);
        }
        nE nE2 = (nE)object;
        if (this.wq() != nE2.wq()) {
            return false;
        }
        if (this.wq() && !this.getName().equals(nE2.getName())) {
            return false;
        }
        if (this.xk() != nE2.xk()) {
            return false;
        }
        if (this.xk() && this.xl() != nE2.xl()) {
            return false;
        }
        if (this.KT() != nE2.KT()) {
            return false;
        }
        if (this.KT() && this.KU() != nE2.KU()) {
            return false;
        }
        if (this.aqg() != nE2.aqg()) {
            return false;
        }
        if (this.aqg() && this.aqh() != nE2.aqh()) {
            return false;
        }
        if (this.aqM() != nE2.aqM()) {
            return false;
        }
        if (this.aqM() && !this.aqN().equals(nE2.aqN())) {
            return false;
        }
        if (this.aqP() != nE2.aqP()) {
            return false;
        }
        if (this.aqP() && !this.aqQ().equals(nE2.aqQ())) {
            return false;
        }
        if (this.xS() != nE2.xS()) {
            return false;
        }
        if (this.xS() && this.xT() != nE2.xT()) {
            return false;
        }
        if (this.tK() != nE2.tK()) {
            return false;
        }
        if (this.tK() && this.tL() != nE2.tL()) {
            return false;
        }
        if (this.XZ() != nE2.XZ()) {
            return false;
        }
        if (this.XZ() && this.Ya() != nE2.Ya()) {
            return false;
        }
        if (this.aqS() != nE2.aqS()) {
            return false;
        }
        if (this.aqS() && this.aqT() != nE2.aqT()) {
            return false;
        }
        if (this.aqU() != nE2.aqU()) {
            return false;
        }
        if (this.aqU() && this.aqV() != nE2.aqV()) {
            return false;
        }
        if (this.aqW() != nE2.aqW()) {
            return false;
        }
        if (this.aqW() && this.aqX() != nE2.aqX()) {
            return false;
        }
        if (this.aqY() != nE2.aqY()) {
            return false;
        }
        if (this.aqY() && this.aqZ() != nE2.aqZ()) {
            return false;
        }
        if (this.ara() != nE2.ara()) {
            return false;
        }
        if (this.ara() && !this.arb().equals(nE2.arb())) {
            return false;
        }
        if (this.ard() != nE2.ard()) {
            return false;
        }
        if (this.ard() && this.are() != nE2.are()) {
            return false;
        }
        if (this.arf() != nE2.arf()) {
            return false;
        }
        if (this.arf() && this.arg() != nE2.arg()) {
            return false;
        }
        if (this.arh() != nE2.arh()) {
            return false;
        }
        if (this.arh() && this.ari() != nE2.ari()) {
            return false;
        }
        if (this.arj() != nE2.arj()) {
            return false;
        }
        if (this.arj() && this.ark() != nE2.ark()) {
            return false;
        }
        if (this.arl() != nE2.arl()) {
            return false;
        }
        if (this.arl() && !this.arm().equals(nE2.arm())) {
            return false;
        }
        if (this.aro() != nE2.aro()) {
            return false;
        }
        if (this.aro() && this.arp() != nE2.arp()) {
            return false;
        }
        if (this.arq() != nE2.arq()) {
            return false;
        }
        if (this.arq() && !this.arr().equals(nE2.arr())) {
            return false;
        }
        if (this.art() != nE2.art()) {
            return false;
        }
        if (this.art() && this.aru() != nE2.aru()) {
            return false;
        }
        if (this.arv() != nE2.arv()) {
            return false;
        }
        if (this.arv() && !this.arw().equals(nE2.arw())) {
            return false;
        }
        if (this.ary() != nE2.ary()) {
            return false;
        }
        if (this.ary() && this.arz() != nE2.arz()) {
            return false;
        }
        if (this.arA() != nE2.arA()) {
            return false;
        }
        if (this.arA() && this.arB() != nE2.arB()) {
            return false;
        }
        if (this.arC() != nE2.arC()) {
            return false;
        }
        if (this.arC() && this.arD() != nE2.arD()) {
            return false;
        }
        if (this.arE() != nE2.arE()) {
            return false;
        }
        if (this.arE() && this.arF() != nE2.arF()) {
            return false;
        }
        if (this.arG() != nE2.arG()) {
            return false;
        }
        if (this.arG() && this.arH() != nE2.arH()) {
            return false;
        }
        if (!this.arI().equals(nE2.arI())) {
            return false;
        }
        return this.unknownFields.equals((Object)nE2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + nE.aqL().hashCode();
        if (this.wq()) {
            n = 37 * n + 1;
            n = 53 * n + this.getName().hashCode();
        }
        if (this.xk()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.xl());
        }
        if (this.KT()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashLong((long)this.KU());
        }
        if (this.aqg()) {
            n = 37 * n + 4;
            n = 53 * n + Internal.hashBoolean((boolean)this.aqh());
        }
        if (this.aqM()) {
            n = 37 * n + 5;
            n = 53 * n + this.aqN().hashCode();
        }
        if (this.aqP()) {
            n = 37 * n + 6;
            n = 53 * n + this.aqQ().hashCode();
        }
        if (this.xS()) {
            n = 37 * n + 7;
            n = 53 * n + this.xT();
        }
        if (this.tK()) {
            n = 37 * n + 8;
            n = 53 * n + this.tL();
        }
        if (this.XZ()) {
            n = 37 * n + 9;
            n = 53 * n + Internal.hashLong((long)this.Ya());
        }
        if (this.aqS()) {
            n = 37 * n + 10;
            n = 53 * n + this.aqT();
        }
        if (this.aqU()) {
            n = 37 * n + 11;
            n = 53 * n + this.aqV();
        }
        if (this.aqW()) {
            n = 37 * n + 12;
            n = 53 * n + this.aqX();
        }
        if (this.aqY()) {
            n = 37 * n + 13;
            n = 53 * n + Internal.hashLong((long)this.aqZ());
        }
        if (this.ara()) {
            n = 37 * n + 14;
            n = 53 * n + this.arb().hashCode();
        }
        if (this.ard()) {
            n = 37 * n + 15;
            n = 53 * n + this.are();
        }
        if (this.arf()) {
            n = 37 * n + 16;
            n = 53 * n + this.arg();
        }
        if (this.arh()) {
            n = 37 * n + 17;
            n = 53 * n + this.ari();
        }
        if (this.arj()) {
            n = 37 * n + 18;
            n = 53 * n + Internal.hashLong((long)this.ark());
        }
        if (this.arl()) {
            n = 37 * n + 19;
            n = 53 * n + this.arm().hashCode();
        }
        if (this.aro()) {
            n = 37 * n + 20;
            n = 53 * n + Internal.hashBoolean((boolean)this.arp());
        }
        if (this.arq()) {
            n = 37 * n + 21;
            n = 53 * n + this.arr().hashCode();
        }
        if (this.art()) {
            n = 37 * n + 22;
            n = 53 * n + Internal.hashBoolean((boolean)this.aru());
        }
        if (this.arv()) {
            n = 37 * n + 23;
            n = 53 * n + this.arw().hashCode();
        }
        if (this.ary()) {
            n = 37 * n + 24;
            n = 53 * n + Internal.hashBoolean((boolean)this.arz());
        }
        if (this.arA()) {
            n = 37 * n + 25;
            n = 53 * n + Internal.hashLong((long)this.arB());
        }
        if (this.arC()) {
            n = 37 * n + 26;
            n = 53 * n + Internal.hashLong((long)this.arD());
        }
        if (this.arE()) {
            n = 37 * n + 27;
            n = 53 * n + this.arF();
        }
        if (this.arG()) {
            n = 37 * n + 28;
            n = 53 * n + Internal.hashLong((long)this.arH());
        }
        if (!this.arI().getMap().isEmpty()) {
            n = 37 * n + 29;
            n = 53 * n + this.arI().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static nE cm(ByteBuffer byteBuffer) {
        return (nE)Pe.parseFrom(byteBuffer);
    }

    public static nE ci(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (nE)Pe.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static nE dC(ByteString byteString) {
        return (nE)Pe.parseFrom(byteString);
    }

    public static nE ci(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (nE)Pe.parseFrom(byteString, extensionRegistryLite);
    }

    public static nE ck(byte[] byArray) {
        return (nE)Pe.parseFrom(byArray);
    }

    public static nE ci(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (nE)Pe.parseFrom(byArray, extensionRegistryLite);
    }

    public static nE fq(InputStream inputStream) {
        return (nE)GeneratedMessageV3.parseWithIOException(Pe, (InputStream)inputStream);
    }

    public static nE fq(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (nE)GeneratedMessageV3.parseWithIOException(Pe, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static nE fr(InputStream inputStream) {
        return (nE)GeneratedMessageV3.parseDelimitedWithIOException(Pe, (InputStream)inputStream);
    }

    public static nE fr(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (nE)GeneratedMessageV3.parseDelimitedWithIOException(Pe, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static nE ci(CodedInputStream codedInputStream) {
        return (nE)GeneratedMessageV3.parseWithIOException(Pe, (CodedInputStream)codedInputStream);
    }

    public static nE iy(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (nE)GeneratedMessageV3.parseWithIOException(Pe, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public nG arM() {
        return nE.arN();
    }

    public static nG arN() {
        return Pd.arO();
    }

    public static nG a(nE nE2) {
        return Pd.arO().c(nE2);
    }

    public nG arO() {
        return this == Pd ? new nG() : new nG().c(this);
    }

    protected nG ci(GeneratedMessageV3.BuilderParent builderParent) {
        nG nG2 = new nG(builderParent);
        return nG2;
    }

    public static nE arP() {
        return Pd;
    }

    public static Parser<nE> z() {
        return Pe;
    }

    public Parser<nE> getParserForType() {
        return Pe;
    }

    public nE arQ() {
        return Pd;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.ci(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.arO();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.arM();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.arO();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.arM();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.arQ();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.arQ();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(nE nE2) {
        return nE2.unknownFields;
    }
}

