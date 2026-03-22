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
 * Renamed from dt
 */
public final class dt_2
extends GeneratedMessageV3
implements dx_2 {
    private static final long kA = 0L;
    int an;
    public static final int kB = 1;
    MapField<Integer, dg_1> kC;
    public static final int kD = 2;
    dz_2 kE;
    public static final int kF = 3;
    dn_2 kG;
    private byte Y = (byte)-1;
    private static final dt_2 kH = new dt_2();
    @Deprecated
    public static final Parser<dt_2> kI = new du_2();

    dt_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private dt_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new dt_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    dt_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block13: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block13;
                    }
                    case 10: {
                        if (!(bl & true)) {
                            this.kC = MapField.newMapField(dw_2.kL);
                            bl |= true;
                        }
                        Object object = (MapEntry)codedInputStream.readMessage(dw_2.kL.getParserForType(), extensionRegistryLite);
                        this.kC.getMutableMap().put((Integer)object.getKey(), (dg_1)object.getValue());
                        continue block13;
                    }
                    case 18: {
                        Object object = null;
                        if ((this.an & 1) != 0) {
                            object = this.kE.ru();
                        }
                        this.kE = (dz_2)codedInputStream.readMessage(dz_2.kS, extensionRegistryLite);
                        if (object != null) {
                            ((db_1)object).e(this.kE);
                            this.kE = ((db_1)object).rA();
                        }
                        this.an |= 1;
                        continue block13;
                    }
                    case 26: {
                        Object object = null;
                        if ((this.an & 2) != 0) {
                            object = this.kG.qs();
                        }
                        this.kG = (dn_2)codedInputStream.readMessage(dn_2.kx, extensionRegistryLite);
                        if (object != null) {
                            ((dp_1)object).c(this.kG);
                            this.kG = ((dp_1)object).qy();
                        }
                        this.an |= 2;
                        continue block13;
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

    public static final Descriptors.Descriptor qI() {
        return df_2.jt;
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
        return df_2.ju.ensureFieldAccessorsInitialized(dt_2.class, dv_2.class);
    }

    MapField<Integer, dg_1> qJ() {
        if (this.kC == null) {
            return MapField.emptyMapField(dw_2.kL);
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
    public Map<Integer, dg_1> qL() {
        return this.qM();
    }

    @Override
    public Map<Integer, dg_1> qM() {
        return this.qJ().getMap();
    }

    @Override
    public dg_1 a(int n, dg_1 dg_12) {
        Map map = this.qJ().getMap();
        return map.containsKey(n) ? (dg_1)map.get(n) : dg_12;
    }

    @Override
    public dg_1 aG(int n) {
        Map map = this.qJ().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (dg_1)map.get(n);
    }

    @Override
    public boolean qN() {
        return (this.an & 1) != 0;
    }

    @Override
    public dz_2 qO() {
        return this.kE == null ? dz_2.rv() : this.kE;
    }

    @Override
    public dh_2 qP() {
        return this.kE == null ? dz_2.rv() : this.kE;
    }

    @Override
    public boolean qQ() {
        return (this.an & 2) != 0;
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
        for (dg_1 dg_12 : this.qM().values()) {
            if (dg_12.isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        if (this.qN() && !this.qO().isInitialized()) {
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
        GeneratedMessageV3.serializeIntegerMapTo((CodedOutputStream)codedOutputStream, this.qJ(), dw_2.kL, (int)1);
        if ((this.an & 1) != 0) {
            codedOutputStream.writeMessage(2, (MessageLite)this.qO());
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeMessage(3, (MessageLite)this.qR());
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
            MapEntry mapEntry = dw_2.kL.newBuilderForType().setKey((Object)((Integer)entry.getKey())).setValue((Object)((dg_1)entry.getValue())).build();
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)mapEntry);
        }
        if ((this.an & 1) != 0) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.qO());
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeMessageSize((int)3, (MessageLite)this.qR());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof dt_2)) {
            return super.equals(object);
        }
        dt_2 dt_22 = (dt_2)object;
        if (!this.qJ().equals(dt_22.qJ())) {
            return false;
        }
        if (this.qN() != dt_22.qN()) {
            return false;
        }
        if (this.qN() && !this.qO().equals(dt_22.qO())) {
            return false;
        }
        if (this.qQ() != dt_22.qQ()) {
            return false;
        }
        if (this.qQ() && !this.qR().equals(dt_22.qR())) {
            return false;
        }
        return this.unknownFields.equals((Object)dt_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + dt_2.qI().hashCode();
        if (!this.qJ().getMap().isEmpty()) {
            n = 37 * n + 1;
            n = 53 * n + this.qJ().hashCode();
        }
        if (this.qN()) {
            n = 37 * n + 2;
            n = 53 * n + this.qO().hashCode();
        }
        if (this.qQ()) {
            n = 37 * n + 3;
            n = 53 * n + this.qR().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static dt_2 Y(ByteBuffer byteBuffer) {
        return (dt_2)kI.parseFrom(byteBuffer);
    }

    public static dt_2 Y(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (dt_2)kI.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static dt_2 aG(ByteString byteString) {
        return (dt_2)kI.parseFrom(byteString);
    }

    public static dt_2 Y(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (dt_2)kI.parseFrom(byteString, extensionRegistryLite);
    }

    public static dt_2 Y(byte[] byArray) {
        return (dt_2)kI.parseFrom(byArray);
    }

    public static dt_2 Y(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (dt_2)kI.parseFrom(byArray, extensionRegistryLite);
    }

    public static dt_2 aW(InputStream inputStream) {
        return (dt_2)GeneratedMessageV3.parseWithIOException(kI, (InputStream)inputStream);
    }

    public static dt_2 aW(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dt_2)GeneratedMessageV3.parseWithIOException(kI, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static dt_2 aX(InputStream inputStream) {
        return (dt_2)GeneratedMessageV3.parseDelimitedWithIOException(kI, (InputStream)inputStream);
    }

    public static dt_2 aX(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dt_2)GeneratedMessageV3.parseDelimitedWithIOException(kI, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static dt_2 Y(CodedInputStream codedInputStream) {
        return (dt_2)GeneratedMessageV3.parseWithIOException(kI, (CodedInputStream)codedInputStream);
    }

    public static dt_2 bU(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dt_2)GeneratedMessageV3.parseWithIOException(kI, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public dv_2 qT() {
        return dt_2.qU();
    }

    public static dv_2 qU() {
        return kH.qV();
    }

    public static dv_2 a(dt_2 dt_22) {
        return kH.qV().c(dt_22);
    }

    public dv_2 qV() {
        return this == kH ? new dv_2() : new dv_2().c(this);
    }

    protected dv_2 Y(GeneratedMessageV3.BuilderParent builderParent) {
        dv_2 dv_22 = new dv_2(builderParent);
        return dv_22;
    }

    public static dt_2 qW() {
        return kH;
    }

    public static Parser<dt_2> z() {
        return kI;
    }

    public Parser<dt_2> getParserForType() {
        return kI;
    }

    public dt_2 qX() {
        return kH;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.Y(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.qV();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.qT();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.qV();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.qT();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.qX();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.qX();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(dt_2 dt_22) {
        return dt_22.unknownFields;
    }
}

