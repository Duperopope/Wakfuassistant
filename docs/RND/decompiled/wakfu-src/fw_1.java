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
 * Renamed from fw
 */
public final class fw_1
extends GeneratedMessageV3
implements fa_2 {
    private static final long qt = 0L;
    public static final int qu = 1;
    MapField<Integer, fs_1> qv;
    private byte Y = (byte)-1;
    private static final fw_1 qw = new fw_1();
    @Deprecated
    public static final Parser<fw_1> qx = new fx_1();

    fw_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private fw_1() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new fw_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    fw_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    case 10: {
                        if (!(bl & true)) {
                            this.qv = MapField.newMapField(fz_1.qy);
                            bl |= true;
                        }
                        MapEntry mapEntry = (MapEntry)codedInputStream.readMessage(fz_1.qy.getParserForType(), extensionRegistryLite);
                        this.qv.getMutableMap().put((Integer)mapEntry.getKey(), (fs_1)mapEntry.getValue());
                        continue block11;
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

    public static final Descriptors.Descriptor Aq() {
        return fl_1.pe;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 1: {
                return this.Ar();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return fl_1.pf.ensureFieldAccessorsInitialized(fw_1.class, fy_1.class);
    }

    MapField<Integer, fs_1> Ar() {
        if (this.qv == null) {
            return MapField.emptyMapField(fz_1.qy);
        }
        return this.qv;
    }

    @Override
    public int As() {
        return this.Ar().getMap().size();
    }

    @Override
    public boolean cs(int n) {
        return this.Ar().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, fs_1> At() {
        return this.Au();
    }

    @Override
    public Map<Integer, fs_1> Au() {
        return this.Ar().getMap();
    }

    @Override
    public fs_1 a(int n, fs_1 fs_12) {
        Map map = this.Ar().getMap();
        return map.containsKey(n) ? (fs_1)map.get(n) : fs_12;
    }

    @Override
    public fs_1 ct(int n) {
        Map map = this.Ar().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (fs_1)map.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (fs_1 fs_12 : this.Au().values()) {
            if (fs_12.isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        GeneratedMessageV3.serializeIntegerMapTo((CodedOutputStream)codedOutputStream, this.Ar(), fz_1.qy, (int)1);
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (Map.Entry entry : this.Ar().getMap().entrySet()) {
            MapEntry mapEntry = fz_1.qy.newBuilderForType().setKey((Object)((Integer)entry.getKey())).setValue((Object)((fs_1)entry.getValue())).build();
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)mapEntry);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof fw_1)) {
            return super.equals(object);
        }
        fw_1 fw_12 = (fw_1)object;
        if (!this.Ar().equals(fw_12.Ar())) {
            return false;
        }
        return this.unknownFields.equals((Object)fw_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + fw_1.Aq().hashCode();
        if (!this.Ar().getMap().isEmpty()) {
            n = 37 * n + 1;
            n = 53 * n + this.Ar().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static fw_1 aw(ByteBuffer byteBuffer) {
        return (fw_1)qx.parseFrom(byteBuffer);
    }

    public static fw_1 au(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (fw_1)qx.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static fw_1 bm(ByteString byteString) {
        return (fw_1)qx.parseFrom(byteString);
    }

    public static fw_1 au(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (fw_1)qx.parseFrom(byteString, extensionRegistryLite);
    }

    public static fw_1 av(byte[] byArray) {
        return (fw_1)qx.parseFrom(byArray);
    }

    public static fw_1 au(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (fw_1)qx.parseFrom(byArray, extensionRegistryLite);
    }

    public static fw_1 bO(InputStream inputStream) {
        return (fw_1)GeneratedMessageV3.parseWithIOException(qx, (InputStream)inputStream);
    }

    public static fw_1 bO(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fw_1)GeneratedMessageV3.parseWithIOException(qx, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static fw_1 bP(InputStream inputStream) {
        return (fw_1)GeneratedMessageV3.parseDelimitedWithIOException(qx, (InputStream)inputStream);
    }

    public static fw_1 bP(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fw_1)GeneratedMessageV3.parseDelimitedWithIOException(qx, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static fw_1 au(CodedInputStream codedInputStream) {
        return (fw_1)GeneratedMessageV3.parseWithIOException(qx, (CodedInputStream)codedInputStream);
    }

    public static fw_1 di(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fw_1)GeneratedMessageV3.parseWithIOException(qx, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public fy_1 Av() {
        return fw_1.Aw();
    }

    public static fy_1 Aw() {
        return qw.Ax();
    }

    public static fy_1 a(fw_1 fw_12) {
        return qw.Ax().c(fw_12);
    }

    public fy_1 Ax() {
        return this == qw ? new fy_1() : new fy_1().c(this);
    }

    protected fy_1 au(GeneratedMessageV3.BuilderParent builderParent) {
        fy_1 fy_12 = new fy_1(builderParent);
        return fy_12;
    }

    public static fw_1 Ay() {
        return qw;
    }

    public static Parser<fw_1> z() {
        return qx;
    }

    public Parser<fw_1> getParserForType() {
        return qx;
    }

    public fw_1 Az() {
        return qw;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.au(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.Ax();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.Av();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.Ax();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.Av();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Az();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Az();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(fw_1 fw_12) {
        return fw_12.unknownFields;
    }
}

