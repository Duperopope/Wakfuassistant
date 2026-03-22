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
 * Renamed from yU
 */
public final class yu_2
extends GeneratedMessageV3
implements yx_2 {
    private static final long amQ = 0L;
    int an;
    public static final int amR = 1;
    int amL;
    public static final int amS = 2;
    int xX;
    public static final int amT = 3;
    int xZ;
    private byte Y = (byte)-1;
    private static final yu_2 amU = new yu_2();
    @Deprecated
    public static final Parser<yu_2> amV = new yv_2();

    yu_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private yu_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new yu_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    yu_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        this.amL = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 16: {
                        this.an |= 2;
                        this.xX = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 24: {
                        this.an |= 4;
                        this.xZ = codedInputStream.readInt32();
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

    public static final Descriptors.Descriptor awo() {
        return yp_2.amF;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return yp_2.amG.ensureFieldAccessorsInitialized(yu_2.class, yw_2.class);
    }

    @Override
    public boolean avY() {
        return (this.an & 1) != 0;
    }

    @Override
    public int avZ() {
        return this.amL;
    }

    @Override
    public boolean NK() {
        return (this.an & 2) != 0;
    }

    @Override
    public int getX() {
        return this.xX;
    }

    @Override
    public boolean NL() {
        return (this.an & 4) != 0;
    }

    @Override
    public int getY() {
        return this.xZ;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.avY()) {
            this.Y = 0;
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
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.amL);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.xX);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt32(3, this.xZ);
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
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.amL);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.xX);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.xZ);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof yu_2)) {
            return super.equals(object);
        }
        yu_2 yu_22 = (yu_2)object;
        if (this.avY() != yu_22.avY()) {
            return false;
        }
        if (this.avY() && this.avZ() != yu_22.avZ()) {
            return false;
        }
        if (this.NK() != yu_22.NK()) {
            return false;
        }
        if (this.NK() && this.getX() != yu_22.getX()) {
            return false;
        }
        if (this.NL() != yu_22.NL()) {
            return false;
        }
        if (this.NL() && this.getY() != yu_22.getY()) {
            return false;
        }
        return this.unknownFields.equals((Object)yu_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + yu_2.awo().hashCode();
        if (this.avY()) {
            n = 37 * n + 1;
            n = 53 * n + this.avZ();
        }
        if (this.NK()) {
            n = 37 * n + 2;
            n = 53 * n + this.getX();
        }
        if (this.NL()) {
            n = 37 * n + 3;
            n = 53 * n + this.getY();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static yu_2 ef(ByteBuffer byteBuffer) {
        return (yu_2)amV.parseFrom(byteBuffer);
    }

    public static yu_2 ct(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (yu_2)amV.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static yu_2 dU(ByteString byteString) {
        return (yu_2)amV.parseFrom(byteString);
    }

    public static yu_2 ct(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (yu_2)amV.parseFrom(byteString, extensionRegistryLite);
    }

    public static yu_2 cv(byte[] byArray) {
        return (yu_2)amV.parseFrom(byArray);
    }

    public static yu_2 ct(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (yu_2)amV.parseFrom(byArray, extensionRegistryLite);
    }

    public static yu_2 fM(InputStream inputStream) {
        return (yu_2)GeneratedMessageV3.parseWithIOException(amV, (InputStream)inputStream);
    }

    public static yu_2 fM(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (yu_2)GeneratedMessageV3.parseWithIOException(amV, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static yu_2 fN(InputStream inputStream) {
        return (yu_2)GeneratedMessageV3.parseDelimitedWithIOException(amV, (InputStream)inputStream);
    }

    public static yu_2 fN(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (yu_2)GeneratedMessageV3.parseDelimitedWithIOException(amV, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static yu_2 ct(CodedInputStream codedInputStream) {
        return (yu_2)GeneratedMessageV3.parseWithIOException(amV, (CodedInputStream)codedInputStream);
    }

    public static yu_2 jf(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (yu_2)GeneratedMessageV3.parseWithIOException(amV, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public yw_2 awp() {
        return yu_2.awq();
    }

    public static yw_2 awq() {
        return amU.awr();
    }

    public static yw_2 a(yu_2 yu_22) {
        return amU.awr().c(yu_22);
    }

    public yw_2 awr() {
        return this == amU ? new yw_2() : new yw_2().c(this);
    }

    protected yw_2 ct(GeneratedMessageV3.BuilderParent builderParent) {
        yw_2 yw_22 = new yw_2(builderParent);
        return yw_22;
    }

    public static yu_2 aws() {
        return amU;
    }

    public static Parser<yu_2> z() {
        return amV;
    }

    public Parser<yu_2> getParserForType() {
        return amV;
    }

    public yu_2 awt() {
        return amU;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.ct(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.awr();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.awp();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.awr();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.awp();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.awt();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.awt();
    }

    static /* synthetic */ boolean pT() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(yu_2 yu_22) {
        return yu_22.unknownFields;
    }
}

