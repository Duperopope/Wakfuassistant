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

/*
 * Renamed from dz
 */
public final class dz_2
extends GeneratedMessageV3
implements dh_2 {
    private static final long kM = 0L;
    int an;
    public static final int kN = 1;
    boolean kO;
    public static final int kP = 2;
    MapField<Integer, dc_1> kQ;
    private byte Y = (byte)-1;
    private static final dz_2 kR = new dz_2();
    @Deprecated
    public static final Parser<dz_2> kS = new da_2();

    dz_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private dz_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new dz_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    dz_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block12: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block12;
                    }
                    case 8: {
                        this.an |= 1;
                        this.kO = codedInputStream.readBool();
                        continue block12;
                    }
                    case 18: {
                        if ((n & 2) == 0) {
                            this.kQ = MapField.newMapField(df_1.kZ);
                            n |= 2;
                        }
                        MapEntry mapEntry = (MapEntry)codedInputStream.readMessage(df_1.kZ.getParserForType(), extensionRegistryLite);
                        this.kQ.getMutableMap().put((Integer)mapEntry.getKey(), (dc_1)mapEntry.getValue());
                        continue block12;
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

    public static final Descriptors.Descriptor rm() {
        return df_2.jD;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 2: {
                return this.ro();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return df_2.jE.ensureFieldAccessorsInitialized(dz_2.class, db_1.class);
    }

    @Override
    public boolean rn() {
        return (this.an & 1) != 0;
    }

    @Override
    public boolean getEnabled() {
        return this.kO;
    }

    MapField<Integer, dc_1> ro() {
        if (this.kQ == null) {
            return MapField.emptyMapField(df_1.kZ);
        }
        return this.kQ;
    }

    @Override
    public int rp() {
        return this.ro().getMap().size();
    }

    @Override
    public boolean aI(int n) {
        return this.ro().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, dc_1> rq() {
        return this.rr();
    }

    @Override
    public Map<Integer, dc_1> rr() {
        return this.ro().getMap();
    }

    @Override
    public dc_1 a(int n, dc_1 dc_12) {
        Map map = this.ro().getMap();
        return map.containsKey(n) ? (dc_1)map.get(n) : dc_12;
    }

    @Override
    public dc_1 aJ(int n) {
        Map map = this.ro().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (dc_1)map.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.rn()) {
            this.Y = 0;
            return false;
        }
        for (dc_1 dc_12 : this.rr().values()) {
            if (dc_12.isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeBool(1, this.kO);
        }
        GeneratedMessageV3.serializeIntegerMapTo((CodedOutputStream)codedOutputStream, this.ro(), df_1.kZ, (int)2);
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.an & 1) != 0) {
            n += CodedOutputStream.computeBoolSize((int)1, (boolean)this.kO);
        }
        for (Map.Entry entry : this.ro().getMap().entrySet()) {
            MapEntry mapEntry = df_1.kZ.newBuilderForType().setKey((Object)((Integer)entry.getKey())).setValue((Object)((dc_1)entry.getValue())).build();
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)mapEntry);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof dz_2)) {
            return super.equals(object);
        }
        dz_2 dz_22 = (dz_2)object;
        if (this.rn() != dz_22.rn()) {
            return false;
        }
        if (this.rn() && this.getEnabled() != dz_22.getEnabled()) {
            return false;
        }
        if (!this.ro().equals(dz_22.ro())) {
            return false;
        }
        return this.unknownFields.equals((Object)dz_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + dz_2.rm().hashCode();
        if (this.rn()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashBoolean((boolean)this.getEnabled());
        }
        if (!this.ro().getMap().isEmpty()) {
            n = 37 * n + 2;
            n = 53 * n + this.ro().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static dz_2 Z(ByteBuffer byteBuffer) {
        return (dz_2)kS.parseFrom(byteBuffer);
    }

    public static dz_2 Z(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (dz_2)kS.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static dz_2 aH(ByteString byteString) {
        return (dz_2)kS.parseFrom(byteString);
    }

    public static dz_2 Z(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (dz_2)kS.parseFrom(byteString, extensionRegistryLite);
    }

    public static dz_2 Z(byte[] byArray) {
        return (dz_2)kS.parseFrom(byArray);
    }

    public static dz_2 Z(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (dz_2)kS.parseFrom(byArray, extensionRegistryLite);
    }

    public static dz_2 aY(InputStream inputStream) {
        return (dz_2)GeneratedMessageV3.parseWithIOException(kS, (InputStream)inputStream);
    }

    public static dz_2 aY(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dz_2)GeneratedMessageV3.parseWithIOException(kS, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static dz_2 aZ(InputStream inputStream) {
        return (dz_2)GeneratedMessageV3.parseDelimitedWithIOException(kS, (InputStream)inputStream);
    }

    public static dz_2 aZ(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dz_2)GeneratedMessageV3.parseDelimitedWithIOException(kS, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static dz_2 Z(CodedInputStream codedInputStream) {
        return (dz_2)GeneratedMessageV3.parseWithIOException(kS, (CodedInputStream)codedInputStream);
    }

    public static dz_2 bX(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dz_2)GeneratedMessageV3.parseWithIOException(kS, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public db_1 rs() {
        return dz_2.rt();
    }

    public static db_1 rt() {
        return kR.ru();
    }

    public static db_1 c(dz_2 dz_22) {
        return kR.ru().e(dz_22);
    }

    public db_1 ru() {
        return this == kR ? new db_1() : new db_1().e(this);
    }

    protected db_1 Z(GeneratedMessageV3.BuilderParent builderParent) {
        db_1 db_12 = new db_1(builderParent);
        return db_12;
    }

    public static dz_2 rv() {
        return kR;
    }

    public static Parser<dz_2> z() {
        return kS;
    }

    public Parser<dz_2> getParserForType() {
        return kS;
    }

    public dz_2 rw() {
        return kR;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.Z(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.ru();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.rs();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.ru();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.rs();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.rw();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.rw();
    }

    static /* synthetic */ boolean B() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet d(dz_2 dz_22) {
        return dz_22.unknownFields;
    }
}

