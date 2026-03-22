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

/*
 * Renamed from gj
 */
public final class gj_1
extends GeneratedMessageV3
implements gn_1 {
    private static final long rV = 0L;
    int an;
    public static final int rW = 1;
    MapField<Integer, gf_2> kC;
    public static final int rX = 2;
    dn_2 kG;
    private byte Y = (byte)-1;
    private static final gj_1 rY = new gj_1();
    @Deprecated
    public static final Parser<gj_1> rZ = new gk_1();

    gj_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private gj_1() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new gj_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    gj_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block12: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block12;
                    }
                    case 10: {
                        if (!(bl & true)) {
                            this.kC = MapField.newMapField(gm_1.sa);
                            bl |= true;
                        }
                        Object object = (MapEntry)codedInputStream.readMessage(gm_1.sa.getParserForType(), extensionRegistryLite);
                        this.kC.getMutableMap().put((Integer)object.getKey(), (gf_2)object.getValue());
                        continue block12;
                    }
                    case 18: {
                        Object object = null;
                        if ((this.an & 1) != 0) {
                            object = this.kG.qs();
                        }
                        this.kG = (dn_2)codedInputStream.readMessage(dn_2.kx, extensionRegistryLite);
                        if (object != null) {
                            ((dp_1)object).c(this.kG);
                            this.kG = ((dp_1)object).qy();
                        }
                        this.an |= 1;
                        continue block12;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue;
                bl2 = true;
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

    public static final Descriptors.Descriptor Dz() {
        return ge_2.rK;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 1: {
                return this.qJ();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ge_2.rL.ensureFieldAccessorsInitialized(gj_1.class, gl_1.class);
    }

    MapField<Integer, gf_2> qJ() {
        if (this.kC == null) {
            return MapField.emptyMapField(gm_1.sa);
        }
        return this.kC;
    }

    @Override
    public int qK() {
        return this.qJ().getMap().size();
    }

    @Override
    public boolean aF(int n) {
        return this.qJ().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, gf_2> qL() {
        return this.qM();
    }

    @Override
    public Map<Integer, gf_2> qM() {
        return this.qJ().getMap();
    }

    @Override
    public gf_2 a(int n, gf_2 gf_22) {
        Map map = this.qJ().getMap();
        return map.containsKey(n) ? (gf_2)map.get(n) : gf_22;
    }

    @Override
    public gf_2 cO(int n) {
        Map map = this.qJ().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (gf_2)map.get(n);
    }

    @Override
    public boolean qQ() {
        return (this.an & 1) != 0;
    }

    @Override
    public dn_2 qR() {
        return this.kG == null ? dn_2.qt() : this.kG;
    }

    @Override
    public ds_2 qS() {
        return this.kG == null ? dn_2.qt() : this.kG;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (gf_2 gf_22 : this.qM().values()) {
            if (gf_22.isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        if (this.qQ() && !this.qR().isInitialized()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        GeneratedMessageV3.serializeIntegerMapTo((CodedOutputStream)codedOutputStream, this.qJ(), gm_1.sa, (int)1);
        if ((this.an & 1) != 0) {
            codedOutputStream.writeMessage(2, (MessageLite)this.qR());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (Map.Entry entry : this.qJ().getMap().entrySet()) {
            MapEntry mapEntry = gm_1.sa.newBuilderForType().setKey((Object)((Integer)entry.getKey())).setValue((Object)((gf_2)entry.getValue())).build();
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)mapEntry);
        }
        if ((this.an & 1) != 0) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.qR());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof gj_1)) {
            return super.equals(object);
        }
        gj_1 gj_12 = (gj_1)object;
        if (!this.qJ().equals(gj_12.qJ())) {
            return false;
        }
        if (this.qQ() != gj_12.qQ()) {
            return false;
        }
        if (this.qQ() && !this.qR().equals(gj_12.qR())) {
            return false;
        }
        return this.unknownFields.equals((Object)gj_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + gj_1.Dz().hashCode();
        if (!this.qJ().getMap().isEmpty()) {
            n = 37 * n + 1;
            n = 53 * n + this.qJ().hashCode();
        }
        if (this.qQ()) {
            n = 37 * n + 2;
            n = 53 * n + this.qR().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static gj_1 aE(ByteBuffer byteBuffer) {
        return (gj_1)rZ.parseFrom(byteBuffer);
    }

    public static gj_1 aC(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (gj_1)rZ.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static gj_1 bv(ByteString byteString) {
        return (gj_1)rZ.parseFrom(byteString);
    }

    public static gj_1 aC(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (gj_1)rZ.parseFrom(byteString, extensionRegistryLite);
    }

    public static gj_1 aD(byte[] byArray) {
        return (gj_1)rZ.parseFrom(byArray);
    }

    public static gj_1 aC(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (gj_1)rZ.parseFrom(byArray, extensionRegistryLite);
    }

    public static gj_1 ce(InputStream inputStream) {
        return (gj_1)GeneratedMessageV3.parseWithIOException(rZ, (InputStream)inputStream);
    }

    public static gj_1 ce(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gj_1)GeneratedMessageV3.parseWithIOException(rZ, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static gj_1 cf(InputStream inputStream) {
        return (gj_1)GeneratedMessageV3.parseDelimitedWithIOException(rZ, (InputStream)inputStream);
    }

    public static gj_1 cf(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gj_1)GeneratedMessageV3.parseDelimitedWithIOException(rZ, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static gj_1 aC(CodedInputStream codedInputStream) {
        return (gj_1)GeneratedMessageV3.parseWithIOException(rZ, (CodedInputStream)codedInputStream);
    }

    public static gj_1 dG(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gj_1)GeneratedMessageV3.parseWithIOException(rZ, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public gl_1 DA() {
        return gj_1.DB();
    }

    public static gl_1 DB() {
        return rY.DC();
    }

    public static gl_1 c(gj_1 gj_12) {
        return rY.DC().e(gj_12);
    }

    public gl_1 DC() {
        return this == rY ? new gl_1() : new gl_1().e(this);
    }

    protected gl_1 aC(GeneratedMessageV3.BuilderParent builderParent) {
        gl_1 gl_12 = new gl_1(builderParent);
        return gl_12;
    }

    public static gj_1 DD() {
        return rY;
    }

    public static Parser<gj_1> z() {
        return rZ;
    }

    public Parser<gj_1> getParserForType() {
        return rZ;
    }

    public gj_1 DE() {
        return rY;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.aC(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.DC();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.DA();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.DC();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.DA();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.DE();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.DE();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet d(gj_1 gj_12) {
        return gj_12.unknownFields;
    }
}

