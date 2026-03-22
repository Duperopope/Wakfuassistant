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
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Renamed from iI
 */
public final class ii_2
extends GeneratedMessageV3
implements il_2 {
    private static final long zj = 0L;
    int an;
    public static final int zk = 1;
    int xX;
    public static final int zl = 2;
    int xZ;
    public static final int zm = 3;
    int yb;
    private byte Y = (byte)-1;
    private static final ii_2 zn = new ii_2();
    @Deprecated
    public static final Parser<ii_2> zo = new ij_1();

    ii_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ii_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ii_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ii_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 8: {
                        this.an |= 1;
                        this.xX = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 16: {
                        this.an |= 2;
                        this.xZ = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 24: {
                        this.an |= 4;
                        this.yb = codedInputStream.readInt32();
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

    public static final Descriptors.Descriptor Qa() {
        return ih_2.wH;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ih_2.wI.ensureFieldAccessorsInitialized(ii_2.class, ik_2.class);
    }

    @Override
    public boolean NK() {
        return (this.an & 1) != 0;
    }

    @Override
    public int getX() {
        return this.xX;
    }

    @Override
    public boolean NL() {
        return (this.an & 2) != 0;
    }

    @Override
    public int getY() {
        return this.xZ;
    }

    @Override
    public boolean NM() {
        return (this.an & 4) != 0;
    }

    @Override
    public int NN() {
        return this.yb;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.NK()) {
            this.Y = 0;
            return false;
        }
        if (!this.NL()) {
            this.Y = 0;
            return false;
        }
        if (!this.NM()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.xX);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.xZ);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt32(3, this.yb);
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
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.xX);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.xZ);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.yb);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ii_2)) {
            return super.equals(object);
        }
        ii_2 ii_22 = (ii_2)object;
        if (this.NK() != ii_22.NK()) {
            return false;
        }
        if (this.NK() && this.getX() != ii_22.getX()) {
            return false;
        }
        if (this.NL() != ii_22.NL()) {
            return false;
        }
        if (this.NL() && this.getY() != ii_22.getY()) {
            return false;
        }
        if (this.NM() != ii_22.NM()) {
            return false;
        }
        if (this.NM() && this.NN() != ii_22.NN()) {
            return false;
        }
        return this.unknownFields.equals((Object)ii_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ii_2.Qa().hashCode();
        if (this.NK()) {
            n = 37 * n + 1;
            n = 53 * n + this.getX();
        }
        if (this.NL()) {
            n = 37 * n + 2;
            n = 53 * n + this.getY();
        }
        if (this.NM()) {
            n = 37 * n + 3;
            n = 53 * n + this.NN();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ii_2 bh(ByteBuffer byteBuffer) {
        return (ii_2)zo.parseFrom(byteBuffer);
    }

    public static ii_2 bd(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ii_2)zo.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ii_2 bZ(ByteString byteString) {
        return (ii_2)zo.parseFrom(byteString);
    }

    public static ii_2 bd(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ii_2)zo.parseFrom(byteString, extensionRegistryLite);
    }

    public static ii_2 be(byte[] byArray) {
        return (ii_2)zo.parseFrom(byArray);
    }

    public static ii_2 bd(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ii_2)zo.parseFrom(byArray, extensionRegistryLite);
    }

    public static ii_2 dg(InputStream inputStream) {
        return (ii_2)GeneratedMessageV3.parseWithIOException(zo, (InputStream)inputStream);
    }

    public static ii_2 dg(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ii_2)GeneratedMessageV3.parseWithIOException(zo, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ii_2 dh(InputStream inputStream) {
        return (ii_2)GeneratedMessageV3.parseDelimitedWithIOException(zo, (InputStream)inputStream);
    }

    public static ii_2 dh(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ii_2)GeneratedMessageV3.parseDelimitedWithIOException(zo, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ii_2 bd(CodedInputStream codedInputStream) {
        return (ii_2)GeneratedMessageV3.parseWithIOException(zo, (CodedInputStream)codedInputStream);
    }

    public static ii_2 fj(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ii_2)GeneratedMessageV3.parseWithIOException(zo, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ik_2 Qb() {
        return ii_2.Qc();
    }

    public static ik_2 Qc() {
        return zn.Qd();
    }

    public static ik_2 f(ii_2 ii_22) {
        return zn.Qd().h(ii_22);
    }

    public ik_2 Qd() {
        return this == zn ? new ik_2() : new ik_2().h(this);
    }

    protected ik_2 bd(GeneratedMessageV3.BuilderParent builderParent) {
        ik_2 ik_22 = new ik_2(builderParent);
        return ik_22;
    }

    public static ii_2 Qe() {
        return zn;
    }

    public static Parser<ii_2> z() {
        return zo;
    }

    public Parser<ii_2> getParserForType() {
        return zo;
    }

    public ii_2 Qf() {
        return zn;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bd(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.Qd();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.Qb();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.Qd();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.Qb();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Qf();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Qf();
    }

    static /* synthetic */ boolean jh() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet g(ii_2 ii_22) {
        return ii_22.unknownFields;
    }
}

