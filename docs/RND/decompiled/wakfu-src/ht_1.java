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
 * Renamed from ht
 */
public final class ht_1
extends GeneratedMessageV3
implements hx_1 {
    private static final long uG = 0L;
    int an;
    public static final int uH = 1;
    int uI;
    public static final int uJ = 2;
    int uK;
    public static final int uL = 3;
    int uM;
    public static final int uN = 4;
    MapField<Integer, hy_1> uO;
    private byte Y = (byte)-1;
    private static final ht_1 uP = new ht_1();
    @Deprecated
    public static final Parser<ht_1> uQ = new hu_1();

    ht_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ht_1() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ht_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ht_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block14: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block14;
                    }
                    case 8: {
                        this.an |= 1;
                        this.uI = codedInputStream.readInt32();
                        continue block14;
                    }
                    case 16: {
                        this.an |= 2;
                        this.uK = codedInputStream.readInt32();
                        continue block14;
                    }
                    case 24: {
                        this.an |= 4;
                        this.uM = codedInputStream.readInt32();
                        continue block14;
                    }
                    case 34: {
                        if ((n & 8) == 0) {
                            this.uO = MapField.newMapField(hw_1.uR);
                            n |= 8;
                        }
                        MapEntry mapEntry = (MapEntry)codedInputStream.readMessage(hw_1.uR.getParserForType(), extensionRegistryLite);
                        this.uO.getMutableMap().put((Integer)mapEntry.getKey(), (hy_1)mapEntry.getValue());
                        continue block14;
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

    public static final Descriptors.Descriptor Il() {
        return hh_1.ua;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 4: {
                return this.Is();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hh_1.ub.ensureFieldAccessorsInitialized(ht_1.class, hv_1.class);
    }

    @Override
    public boolean Im() {
        return (this.an & 1) != 0;
    }

    @Override
    public int In() {
        return this.uI;
    }

    @Override
    public boolean Io() {
        return (this.an & 2) != 0;
    }

    @Override
    public int Ip() {
        return this.uK;
    }

    @Override
    public boolean Iq() {
        return (this.an & 4) != 0;
    }

    @Override
    public int Ir() {
        return this.uM;
    }

    MapField<Integer, hy_1> Is() {
        if (this.uO == null) {
            return MapField.emptyMapField(hw_1.uR);
        }
        return this.uO;
    }

    @Override
    public int It() {
        return this.Is().getMap().size();
    }

    @Override
    public boolean dz(int n) {
        return this.Is().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, hy_1> Iu() {
        return this.Iv();
    }

    @Override
    public Map<Integer, hy_1> Iv() {
        return this.Is().getMap();
    }

    @Override
    public hy_1 a(int n, hy_1 hy_12) {
        Map map = this.Is().getMap();
        return map.containsKey(n) ? (hy_1)map.get(n) : hy_12;
    }

    @Override
    public hy_1 dA(int n) {
        Map map = this.Is().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (hy_1)map.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.Im()) {
            this.Y = 0;
            return false;
        }
        if (!this.Io()) {
            this.Y = 0;
            return false;
        }
        for (hy_1 hy_12 : this.Iv().values()) {
            if (hy_12.isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.uI);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.uK);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt32(3, this.uM);
        }
        GeneratedMessageV3.serializeIntegerMapTo((CodedOutputStream)codedOutputStream, this.Is(), hw_1.uR, (int)4);
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.an & 1) != 0) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.uI);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.uK);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.uM);
        }
        for (Map.Entry entry : this.Is().getMap().entrySet()) {
            MapEntry mapEntry = hw_1.uR.newBuilderForType().setKey((Object)((Integer)entry.getKey())).setValue((Object)((hy_1)entry.getValue())).build();
            n += CodedOutputStream.computeMessageSize((int)4, (MessageLite)mapEntry);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ht_1)) {
            return super.equals(object);
        }
        ht_1 ht_12 = (ht_1)object;
        if (this.Im() != ht_12.Im()) {
            return false;
        }
        if (this.Im() && this.In() != ht_12.In()) {
            return false;
        }
        if (this.Io() != ht_12.Io()) {
            return false;
        }
        if (this.Io() && this.Ip() != ht_12.Ip()) {
            return false;
        }
        if (this.Iq() != ht_12.Iq()) {
            return false;
        }
        if (this.Iq() && this.Ir() != ht_12.Ir()) {
            return false;
        }
        if (!this.Is().equals(ht_12.Is())) {
            return false;
        }
        return this.unknownFields.equals((Object)ht_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ht_1.Il().hashCode();
        if (this.Im()) {
            n = 37 * n + 1;
            n = 53 * n + this.In();
        }
        if (this.Io()) {
            n = 37 * n + 2;
            n = 53 * n + this.Ip();
        }
        if (this.Iq()) {
            n = 37 * n + 3;
            n = 53 * n + this.Ir();
        }
        if (!this.Is().getMap().isEmpty()) {
            n = 37 * n + 4;
            n = 53 * n + this.Is().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ht_1 aS(ByteBuffer byteBuffer) {
        return (ht_1)uQ.parseFrom(byteBuffer);
    }

    public static ht_1 aO(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ht_1)uQ.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ht_1 bJ(ByteString byteString) {
        return (ht_1)uQ.parseFrom(byteString);
    }

    public static ht_1 aO(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ht_1)uQ.parseFrom(byteString, extensionRegistryLite);
    }

    public static ht_1 aP(byte[] byArray) {
        return (ht_1)uQ.parseFrom(byArray);
    }

    public static ht_1 aO(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ht_1)uQ.parseFrom(byArray, extensionRegistryLite);
    }

    public static ht_1 cC(InputStream inputStream) {
        return (ht_1)GeneratedMessageV3.parseWithIOException(uQ, (InputStream)inputStream);
    }

    public static ht_1 cC(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ht_1)GeneratedMessageV3.parseWithIOException(uQ, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ht_1 cD(InputStream inputStream) {
        return (ht_1)GeneratedMessageV3.parseDelimitedWithIOException(uQ, (InputStream)inputStream);
    }

    public static ht_1 cD(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ht_1)GeneratedMessageV3.parseDelimitedWithIOException(uQ, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ht_1 aO(CodedInputStream codedInputStream) {
        return (ht_1)GeneratedMessageV3.parseWithIOException(uQ, (CodedInputStream)codedInputStream);
    }

    public static ht_1 eq(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ht_1)GeneratedMessageV3.parseWithIOException(uQ, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public hv_1 Iw() {
        return ht_1.Ix();
    }

    public static hv_1 Ix() {
        return uP.Iy();
    }

    public static hv_1 a(ht_1 ht_12) {
        return uP.Iy().c(ht_12);
    }

    public hv_1 Iy() {
        return this == uP ? new hv_1() : new hv_1().c(this);
    }

    protected hv_1 aO(GeneratedMessageV3.BuilderParent builderParent) {
        hv_1 hv_12 = new hv_1(builderParent);
        return hv_12;
    }

    public static ht_1 Iz() {
        return uP;
    }

    public static Parser<ht_1> z() {
        return uQ;
    }

    public Parser<ht_1> getParserForType() {
        return uQ;
    }

    public ht_1 IA() {
        return uP;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.aO(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.Iy();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.Iw();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.Iy();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.Iw();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.IA();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.IA();
    }

    static /* synthetic */ boolean el() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ht_1 ht_12) {
        return ht_12.unknownFields;
    }
}

