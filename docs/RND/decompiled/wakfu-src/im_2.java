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
 * Renamed from im
 */
public final class im_2
extends GeneratedMessageV3
implements ip_1 {
    private static final long xV = 0L;
    int an;
    public static final int xW = 1;
    int xX;
    public static final int xY = 2;
    int xZ;
    public static final int ya = 3;
    int yb;
    private byte Y = (byte)-1;
    private static final im_2 yc = new im_2();
    @Deprecated
    public static final Parser<im_2> yd = new in_2();

    im_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private im_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new im_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    im_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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

    public static final Descriptors.Descriptor NJ() {
        return ih_2.wx;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ih_2.wy.ensureFieldAccessorsInitialized(im_2.class, io_2.class);
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
        if (!(object instanceof im_2)) {
            return super.equals(object);
        }
        im_2 im_22 = (im_2)object;
        if (this.NK() != im_22.NK()) {
            return false;
        }
        if (this.NK() && this.getX() != im_22.getX()) {
            return false;
        }
        if (this.NL() != im_22.NL()) {
            return false;
        }
        if (this.NL() && this.getY() != im_22.getY()) {
            return false;
        }
        if (this.NM() != im_22.NM()) {
            return false;
        }
        if (this.NM() && this.NN() != im_22.NN()) {
            return false;
        }
        return this.unknownFields.equals((Object)im_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + im_2.NJ().hashCode();
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

    public static im_2 bc(ByteBuffer byteBuffer) {
        return (im_2)yd.parseFrom(byteBuffer);
    }

    public static im_2 aY(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (im_2)yd.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static im_2 bU(ByteString byteString) {
        return (im_2)yd.parseFrom(byteString);
    }

    public static im_2 aY(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (im_2)yd.parseFrom(byteString, extensionRegistryLite);
    }

    public static im_2 aZ(byte[] byArray) {
        return (im_2)yd.parseFrom(byArray);
    }

    public static im_2 aY(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (im_2)yd.parseFrom(byArray, extensionRegistryLite);
    }

    public static im_2 cW(InputStream inputStream) {
        return (im_2)GeneratedMessageV3.parseWithIOException(yd, (InputStream)inputStream);
    }

    public static im_2 cW(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (im_2)GeneratedMessageV3.parseWithIOException(yd, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static im_2 cX(InputStream inputStream) {
        return (im_2)GeneratedMessageV3.parseDelimitedWithIOException(yd, (InputStream)inputStream);
    }

    public static im_2 cX(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (im_2)GeneratedMessageV3.parseDelimitedWithIOException(yd, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static im_2 aY(CodedInputStream codedInputStream) {
        return (im_2)GeneratedMessageV3.parseWithIOException(yd, (CodedInputStream)codedInputStream);
    }

    public static im_2 eU(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (im_2)GeneratedMessageV3.parseWithIOException(yd, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public io_2 NO() {
        return im_2.NP();
    }

    public static io_2 NP() {
        return yc.NQ();
    }

    public static io_2 a(im_2 im_22) {
        return yc.NQ().c(im_22);
    }

    public io_2 NQ() {
        return this == yc ? new io_2() : new io_2().c(this);
    }

    protected io_2 aY(GeneratedMessageV3.BuilderParent builderParent) {
        io_2 io_22 = new io_2(builderParent);
        return io_22;
    }

    public static im_2 NR() {
        return yc;
    }

    public static Parser<im_2> z() {
        return yd;
    }

    public Parser<im_2> getParserForType() {
        return yd;
    }

    public im_2 NS() {
        return yc;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.aY(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.NQ();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.NO();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.NQ();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.NO();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.NS();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.NS();
    }

    static /* synthetic */ boolean fa() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(im_2 im_22) {
        return im_22.unknownFields;
    }
}

