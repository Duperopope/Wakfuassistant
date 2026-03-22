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
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Renamed from iw
 */
public final class iw_1
extends GeneratedMessageV3
implements iz_1 {
    private static final long yH = 0L;
    int an;
    public static final int yI = 1;
    long yJ;
    public static final int yK = 2;
    int yL;
    public static final int yM = 3;
    boolean yN;
    private byte Y = (byte)-1;
    private static final iw_1 yO = new iw_1();
    @Deprecated
    public static final Parser<iw_1> yP = new ix_1();

    iw_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private iw_1() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new iw_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    iw_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        this.yJ = codedInputStream.readInt64();
                        continue block13;
                    }
                    case 16: {
                        this.an |= 2;
                        this.yL = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 24: {
                        this.an |= 4;
                        this.yN = codedInputStream.readBool();
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

    public static final Descriptors.Descriptor OM() {
        return ih_2.wB;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ih_2.wC.ensureFieldAccessorsInitialized(iw_1.class, iy_1.class);
    }

    @Override
    public boolean ON() {
        return (this.an & 1) != 0;
    }

    @Override
    public long OO() {
        return this.yJ;
    }

    @Override
    public boolean OP() {
        return (this.an & 2) != 0;
    }

    @Override
    public int OQ() {
        return this.yL;
    }

    @Override
    public boolean OR() {
        return (this.an & 4) != 0;
    }

    @Override
    public boolean OS() {
        return this.yN;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.ON()) {
            this.Y = 0;
            return false;
        }
        if (!this.OP()) {
            this.Y = 0;
            return false;
        }
        if (!this.OR()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(1, this.yJ);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.yL);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeBool(3, this.yN);
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
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.yJ);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.yL);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeBoolSize((int)3, (boolean)this.yN);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof iw_1)) {
            return super.equals(object);
        }
        iw_1 iw_12 = (iw_1)object;
        if (this.ON() != iw_12.ON()) {
            return false;
        }
        if (this.ON() && this.OO() != iw_12.OO()) {
            return false;
        }
        if (this.OP() != iw_12.OP()) {
            return false;
        }
        if (this.OP() && this.OQ() != iw_12.OQ()) {
            return false;
        }
        if (this.OR() != iw_12.OR()) {
            return false;
        }
        if (this.OR() && this.OS() != iw_12.OS()) {
            return false;
        }
        return this.unknownFields.equals((Object)iw_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + iw_1.OM().hashCode();
        if (this.ON()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.OO());
        }
        if (this.OP()) {
            n = 37 * n + 2;
            n = 53 * n + this.OQ();
        }
        if (this.OR()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashBoolean((boolean)this.OS());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static iw_1 be(ByteBuffer byteBuffer) {
        return (iw_1)yP.parseFrom(byteBuffer);
    }

    public static iw_1 ba(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (iw_1)yP.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static iw_1 bW(ByteString byteString) {
        return (iw_1)yP.parseFrom(byteString);
    }

    public static iw_1 ba(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (iw_1)yP.parseFrom(byteString, extensionRegistryLite);
    }

    public static iw_1 bb(byte[] byArray) {
        return (iw_1)yP.parseFrom(byArray);
    }

    public static iw_1 ba(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (iw_1)yP.parseFrom(byArray, extensionRegistryLite);
    }

    public static iw_1 da(InputStream inputStream) {
        return (iw_1)GeneratedMessageV3.parseWithIOException(yP, (InputStream)inputStream);
    }

    public static iw_1 da(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (iw_1)GeneratedMessageV3.parseWithIOException(yP, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static iw_1 db(InputStream inputStream) {
        return (iw_1)GeneratedMessageV3.parseDelimitedWithIOException(yP, (InputStream)inputStream);
    }

    public static iw_1 db(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (iw_1)GeneratedMessageV3.parseDelimitedWithIOException(yP, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static iw_1 ba(CodedInputStream codedInputStream) {
        return (iw_1)GeneratedMessageV3.parseWithIOException(yP, (CodedInputStream)codedInputStream);
    }

    public static iw_1 fa(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (iw_1)GeneratedMessageV3.parseWithIOException(yP, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public iy_1 OT() {
        return iw_1.OU();
    }

    public static iy_1 OU() {
        return yO.OV();
    }

    public static iy_1 a(iw_1 iw_12) {
        return yO.OV().c(iw_12);
    }

    public iy_1 OV() {
        return this == yO ? new iy_1() : new iy_1().c(this);
    }

    protected iy_1 ba(GeneratedMessageV3.BuilderParent builderParent) {
        iy_1 iy_12 = new iy_1(builderParent);
        return iy_12;
    }

    public static iw_1 OW() {
        return yO;
    }

    public static Parser<iw_1> z() {
        return yP;
    }

    public Parser<iw_1> getParserForType() {
        return yP;
    }

    public iw_1 OX() {
        return yO;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.ba(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.OV();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.OT();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.OV();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.OT();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.OX();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.OX();
    }

    static /* synthetic */ boolean el() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(iw_1 iw_12) {
        return iw_12.unknownFields;
    }
}

