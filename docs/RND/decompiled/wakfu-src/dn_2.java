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
 * Renamed from dn
 */
public final class dn_2
extends GeneratedMessageV3
implements ds_2 {
    private static final long kn = 0L;
    int an;
    public static final int ko = 1;
    MapField<Integer, dm_1> kp;
    public static final int kq = 2;
    MapField<Integer, Integer> kr;
    public static final int ks = 3;
    boolean kt;
    public static final int ku = 4;
    boolean kv;
    private byte Y = (byte)-1;
    private static final dn_2 kw = new dn_2();
    @Deprecated
    public static final Parser<dn_2> kx = new do_1();

    dn_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private dn_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new dn_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    dn_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 10: {
                        if (!(n & true)) {
                            this.kp = MapField.newMapField(dr_2.kz);
                            n |= 1;
                        }
                        MapEntry mapEntry = (MapEntry)codedInputStream.readMessage(dr_2.kz.getParserForType(), extensionRegistryLite);
                        this.kp.getMutableMap().put((Integer)mapEntry.getKey(), (dm_1)mapEntry.getValue());
                        continue block14;
                    }
                    case 18: {
                        if ((n & 2) == 0) {
                            this.kr = MapField.newMapField(dq_2.ky);
                            n |= 2;
                        }
                        MapEntry mapEntry = (MapEntry)codedInputStream.readMessage(dq_2.ky.getParserForType(), extensionRegistryLite);
                        this.kr.getMutableMap().put((Integer)mapEntry.getKey(), (Integer)mapEntry.getValue());
                        continue block14;
                    }
                    case 24: {
                        this.an |= 1;
                        this.kt = codedInputStream.readBool();
                        continue block14;
                    }
                    case 32: {
                        this.an |= 2;
                        this.kv = codedInputStream.readBool();
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

    public static final Descriptors.Descriptor qd() {
        return df_2.jJ;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 1: {
                return this.qe();
            }
            case 2: {
                return this.qi();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return df_2.jK.ensureFieldAccessorsInitialized(dn_2.class, dp_1.class);
    }

    MapField<Integer, dm_1> qe() {
        if (this.kp == null) {
            return MapField.emptyMapField(dr_2.kz);
        }
        return this.kp;
    }

    @Override
    public int qf() {
        return this.qe().getMap().size();
    }

    @Override
    public boolean az(int n) {
        return this.qe().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, dm_1> qg() {
        return this.qh();
    }

    @Override
    public Map<Integer, dm_1> qh() {
        return this.qe().getMap();
    }

    @Override
    public dm_1 a(int n, dm_1 dm_12) {
        Map map = this.qe().getMap();
        return map.containsKey(n) ? (dm_1)map.get(n) : dm_12;
    }

    @Override
    public dm_1 aA(int n) {
        Map map = this.qe().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (dm_1)map.get(n);
    }

    MapField<Integer, Integer> qi() {
        if (this.kr == null) {
            return MapField.emptyMapField(dq_2.ky);
        }
        return this.kr;
    }

    @Override
    public int qj() {
        return this.qi().getMap().size();
    }

    @Override
    public boolean aB(int n) {
        return this.qi().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, Integer> qk() {
        return this.ql();
    }

    @Override
    public Map<Integer, Integer> ql() {
        return this.qi().getMap();
    }

    @Override
    public int a(int n, int n2) {
        Map map = this.qi().getMap();
        return map.containsKey(n) ? (Integer)map.get(n) : n2;
    }

    @Override
    public int aC(int n) {
        Map map = this.qi().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (Integer)map.get(n);
    }

    @Override
    public boolean qm() {
        return (this.an & 1) != 0;
    }

    @Override
    public boolean qn() {
        return this.kt;
    }

    @Override
    public boolean qo() {
        return (this.an & 2) != 0;
    }

    @Override
    public boolean qp() {
        return this.kv;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.qm()) {
            this.Y = 0;
            return false;
        }
        for (dm_1 dm_12 : this.qh().values()) {
            if (dm_12.isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        GeneratedMessageV3.serializeIntegerMapTo((CodedOutputStream)codedOutputStream, this.qe(), dr_2.kz, (int)1);
        GeneratedMessageV3.serializeIntegerMapTo((CodedOutputStream)codedOutputStream, this.qi(), dq_2.ky, (int)2);
        if ((this.an & 1) != 0) {
            codedOutputStream.writeBool(3, this.kt);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeBool(4, this.kv);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        MapEntry mapEntry;
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (Map.Entry entry : this.qe().getMap().entrySet()) {
            mapEntry = dr_2.kz.newBuilderForType().setKey((Object)((Integer)entry.getKey())).setValue((Object)((dm_1)entry.getValue())).build();
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)mapEntry);
        }
        for (Map.Entry entry : this.qi().getMap().entrySet()) {
            mapEntry = dq_2.ky.newBuilderForType().setKey((Object)((Integer)entry.getKey())).setValue((Object)((Integer)entry.getValue())).build();
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)mapEntry);
        }
        if ((this.an & 1) != 0) {
            n += CodedOutputStream.computeBoolSize((int)3, (boolean)this.kt);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeBoolSize((int)4, (boolean)this.kv);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof dn_2)) {
            return super.equals(object);
        }
        dn_2 dn_22 = (dn_2)object;
        if (!this.qe().equals(dn_22.qe())) {
            return false;
        }
        if (!this.qi().equals(dn_22.qi())) {
            return false;
        }
        if (this.qm() != dn_22.qm()) {
            return false;
        }
        if (this.qm() && this.qn() != dn_22.qn()) {
            return false;
        }
        if (this.qo() != dn_22.qo()) {
            return false;
        }
        if (this.qo() && this.qp() != dn_22.qp()) {
            return false;
        }
        return this.unknownFields.equals((Object)dn_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + dn_2.qd().hashCode();
        if (!this.qe().getMap().isEmpty()) {
            n = 37 * n + 1;
            n = 53 * n + this.qe().hashCode();
        }
        if (!this.qi().getMap().isEmpty()) {
            n = 37 * n + 2;
            n = 53 * n + this.qi().hashCode();
        }
        if (this.qm()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashBoolean((boolean)this.qn());
        }
        if (this.qo()) {
            n = 37 * n + 4;
            n = 53 * n + Internal.hashBoolean((boolean)this.qp());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static dn_2 X(ByteBuffer byteBuffer) {
        return (dn_2)kx.parseFrom(byteBuffer);
    }

    public static dn_2 X(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (dn_2)kx.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static dn_2 aF(ByteString byteString) {
        return (dn_2)kx.parseFrom(byteString);
    }

    public static dn_2 X(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (dn_2)kx.parseFrom(byteString, extensionRegistryLite);
    }

    public static dn_2 X(byte[] byArray) {
        return (dn_2)kx.parseFrom(byArray);
    }

    public static dn_2 X(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (dn_2)kx.parseFrom(byArray, extensionRegistryLite);
    }

    public static dn_2 aU(InputStream inputStream) {
        return (dn_2)GeneratedMessageV3.parseWithIOException(kx, (InputStream)inputStream);
    }

    public static dn_2 aU(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dn_2)GeneratedMessageV3.parseWithIOException(kx, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static dn_2 aV(InputStream inputStream) {
        return (dn_2)GeneratedMessageV3.parseDelimitedWithIOException(kx, (InputStream)inputStream);
    }

    public static dn_2 aV(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dn_2)GeneratedMessageV3.parseDelimitedWithIOException(kx, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static dn_2 X(CodedInputStream codedInputStream) {
        return (dn_2)GeneratedMessageV3.parseWithIOException(kx, (CodedInputStream)codedInputStream);
    }

    public static dn_2 bR(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dn_2)GeneratedMessageV3.parseWithIOException(kx, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public dp_1 qq() {
        return dn_2.qr();
    }

    public static dp_1 qr() {
        return kw.qs();
    }

    public static dp_1 a(dn_2 dn_22) {
        return kw.qs().c(dn_22);
    }

    public dp_1 qs() {
        return this == kw ? new dp_1() : new dp_1().c(this);
    }

    protected dp_1 X(GeneratedMessageV3.BuilderParent builderParent) {
        dp_1 dp_12 = new dp_1(builderParent);
        return dp_12;
    }

    public static dn_2 qt() {
        return kw;
    }

    public static Parser<dn_2> z() {
        return kx;
    }

    public Parser<dn_2> getParserForType() {
        return kx;
    }

    public dn_2 qu() {
        return kw;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.X(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.qs();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.qq();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.qs();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.qq();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.qu();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.qu();
    }

    static /* synthetic */ boolean cQ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(dn_2 dn_22) {
        return dn_22.unknownFields;
    }
}

