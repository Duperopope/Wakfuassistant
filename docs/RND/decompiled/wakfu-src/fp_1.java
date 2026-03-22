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
 * Renamed from fP
 */
public final class fp_1
extends GeneratedMessageV3
implements ft_1 {
    private static final long ra = 0L;
    int an;
    public static final int rb = 1;
    int rc;
    public static final int rd = 2;
    int re;
    public static final int rf = 3;
    volatile Object rg;
    public static final int rh = 4;
    long ri;
    public static final int rj = 5;
    MapField<Integer, fo_2> rk;
    public static final int rl = 6;
    boolean rm;
    private byte Y = (byte)-1;
    private static final fp_1 rn = new fp_1();
    @Deprecated
    public static final Parser<fp_1> ro = new fq_2();

    fp_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private fp_1() {
        this.rg = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new fp_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    fp_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block16: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block16;
                    }
                    case 8: {
                        this.an |= 1;
                        this.rc = codedInputStream.readInt32();
                        continue block16;
                    }
                    case 16: {
                        this.an |= 2;
                        this.re = codedInputStream.readInt32();
                        continue block16;
                    }
                    case 26: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 4;
                        this.rg = byteString;
                        continue block16;
                    }
                    case 32: {
                        this.an |= 8;
                        this.ri = codedInputStream.readInt64();
                        continue block16;
                    }
                    case 42: {
                        if ((n & 0x10) == 0) {
                            this.rk = MapField.newMapField(fs_2.rp);
                            n |= 0x10;
                        }
                        ByteString byteString = (MapEntry)codedInputStream.readMessage(fs_2.rp.getParserForType(), extensionRegistryLite);
                        this.rk.getMutableMap().put((Integer)byteString.getKey(), (fo_2)byteString.getValue());
                        continue block16;
                    }
                    case 48: {
                        this.an |= 0x10;
                        this.rm = codedInputStream.readBool();
                        continue block16;
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

    public static final Descriptors.Descriptor BH() {
        return fo_1.qW;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 5: {
                return this.BR();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return fo_1.qX.ensureFieldAccessorsInitialized(fp_1.class, fr_1.class);
    }

    @Override
    public boolean BI() {
        return (this.an & 1) != 0;
    }

    @Override
    public int BJ() {
        return this.rc;
    }

    @Override
    public boolean BK() {
        return (this.an & 2) != 0;
    }

    @Override
    public int BL() {
        return this.re;
    }

    @Override
    public boolean BM() {
        return (this.an & 4) != 0;
    }

    @Override
    public String BN() {
        Object object = this.rg;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.rg = string;
        }
        return string;
    }

    @Override
    public ByteString BO() {
        Object object = this.rg;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.rg = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean BP() {
        return (this.an & 8) != 0;
    }

    @Override
    public long BQ() {
        return this.ri;
    }

    MapField<Integer, fo_2> BR() {
        if (this.rk == null) {
            return MapField.emptyMapField(fs_2.rp);
        }
        return this.rk;
    }

    @Override
    public int BS() {
        return this.BR().getMap().size();
    }

    @Override
    public boolean cC(int n) {
        return this.BR().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, fo_2> BT() {
        return this.BU();
    }

    @Override
    public Map<Integer, fo_2> BU() {
        return this.BR().getMap();
    }

    @Override
    public fo_2 a(int n, fo_2 fo_22) {
        Map map = this.BR().getMap();
        return map.containsKey(n) ? (fo_2)map.get(n) : fo_22;
    }

    @Override
    public fo_2 cD(int n) {
        Map map = this.BR().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (fo_2)map.get(n);
    }

    @Override
    public boolean BV() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public boolean BW() {
        return this.rm;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.BI()) {
            this.Y = 0;
            return false;
        }
        if (!this.BK()) {
            this.Y = 0;
            return false;
        }
        if (!this.BM()) {
            this.Y = 0;
            return false;
        }
        if (!this.BP()) {
            this.Y = 0;
            return false;
        }
        if (!this.BV()) {
            this.Y = 0;
            return false;
        }
        for (fo_2 fo_22 : this.BU().values()) {
            if (fo_22.isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.rc);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.re);
        }
        if ((this.an & 4) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)3, (Object)this.rg);
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeInt64(4, this.ri);
        }
        GeneratedMessageV3.serializeIntegerMapTo((CodedOutputStream)codedOutputStream, this.BR(), fs_2.rp, (int)5);
        if ((this.an & 0x10) != 0) {
            codedOutputStream.writeBool(6, this.rm);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.an & 1) != 0) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.rc);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.re);
        }
        if ((this.an & 4) != 0) {
            n += GeneratedMessageV3.computeStringSize((int)3, (Object)this.rg);
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeInt64Size((int)4, (long)this.ri);
        }
        for (Map.Entry entry : this.BR().getMap().entrySet()) {
            MapEntry mapEntry = fs_2.rp.newBuilderForType().setKey((Object)((Integer)entry.getKey())).setValue((Object)((fo_2)entry.getValue())).build();
            n += CodedOutputStream.computeMessageSize((int)5, (MessageLite)mapEntry);
        }
        if ((this.an & 0x10) != 0) {
            n += CodedOutputStream.computeBoolSize((int)6, (boolean)this.rm);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof fp_1)) {
            return super.equals(object);
        }
        fp_1 fp_12 = (fp_1)object;
        if (this.BI() != fp_12.BI()) {
            return false;
        }
        if (this.BI() && this.BJ() != fp_12.BJ()) {
            return false;
        }
        if (this.BK() != fp_12.BK()) {
            return false;
        }
        if (this.BK() && this.BL() != fp_12.BL()) {
            return false;
        }
        if (this.BM() != fp_12.BM()) {
            return false;
        }
        if (this.BM() && !this.BN().equals(fp_12.BN())) {
            return false;
        }
        if (this.BP() != fp_12.BP()) {
            return false;
        }
        if (this.BP() && this.BQ() != fp_12.BQ()) {
            return false;
        }
        if (!this.BR().equals(fp_12.BR())) {
            return false;
        }
        if (this.BV() != fp_12.BV()) {
            return false;
        }
        if (this.BV() && this.BW() != fp_12.BW()) {
            return false;
        }
        return this.unknownFields.equals((Object)fp_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + fp_1.BH().hashCode();
        if (this.BI()) {
            n = 37 * n + 1;
            n = 53 * n + this.BJ();
        }
        if (this.BK()) {
            n = 37 * n + 2;
            n = 53 * n + this.BL();
        }
        if (this.BM()) {
            n = 37 * n + 3;
            n = 53 * n + this.BN().hashCode();
        }
        if (this.BP()) {
            n = 37 * n + 4;
            n = 53 * n + Internal.hashLong((long)this.BQ());
        }
        if (!this.BR().getMap().isEmpty()) {
            n = 37 * n + 5;
            n = 53 * n + this.BR().hashCode();
        }
        if (this.BV()) {
            n = 37 * n + 6;
            n = 53 * n + Internal.hashBoolean((boolean)this.BW());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static fp_1 aA(ByteBuffer byteBuffer) {
        return (fp_1)ro.parseFrom(byteBuffer);
    }

    public static fp_1 ay(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (fp_1)ro.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static fp_1 bq(ByteString byteString) {
        return (fp_1)ro.parseFrom(byteString);
    }

    public static fp_1 ay(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (fp_1)ro.parseFrom(byteString, extensionRegistryLite);
    }

    public static fp_1 az(byte[] byArray) {
        return (fp_1)ro.parseFrom(byArray);
    }

    public static fp_1 ay(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (fp_1)ro.parseFrom(byArray, extensionRegistryLite);
    }

    public static fp_1 bW(InputStream inputStream) {
        return (fp_1)GeneratedMessageV3.parseWithIOException(ro, (InputStream)inputStream);
    }

    public static fp_1 bW(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fp_1)GeneratedMessageV3.parseWithIOException(ro, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static fp_1 bX(InputStream inputStream) {
        return (fp_1)GeneratedMessageV3.parseDelimitedWithIOException(ro, (InputStream)inputStream);
    }

    public static fp_1 bX(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fp_1)GeneratedMessageV3.parseDelimitedWithIOException(ro, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static fp_1 ay(CodedInputStream codedInputStream) {
        return (fp_1)GeneratedMessageV3.parseWithIOException(ro, (CodedInputStream)codedInputStream);
    }

    public static fp_1 du(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fp_1)GeneratedMessageV3.parseWithIOException(ro, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public fr_1 BX() {
        return fp_1.BY();
    }

    public static fr_1 BY() {
        return rn.BZ();
    }

    public static fr_1 a(fp_1 fp_12) {
        return rn.BZ().c(fp_12);
    }

    public fr_1 BZ() {
        return this == rn ? new fr_1() : new fr_1().c(this);
    }

    protected fr_1 ay(GeneratedMessageV3.BuilderParent builderParent) {
        fr_1 fr_12 = new fr_1(builderParent);
        return fr_12;
    }

    public static fp_1 Ca() {
        return rn;
    }

    public static Parser<fp_1> z() {
        return ro;
    }

    public Parser<fp_1> getParserForType() {
        return ro;
    }

    public fp_1 Cb() {
        return rn;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.ay(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.BZ();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.BX();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.BZ();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.BX();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Cb();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Cb();
    }

    static /* synthetic */ boolean oV() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(fp_1 fp_12) {
        return fp_12.unknownFields;
    }
}

