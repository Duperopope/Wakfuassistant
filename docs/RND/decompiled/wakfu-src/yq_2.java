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
 * Renamed from yQ
 */
public final class yq_2
extends GeneratedMessageV3
implements yt_2 {
    private static final long amJ = 0L;
    int an;
    public static final int amK = 1;
    int amL;
    public static final int amM = 2;
    long amN;
    private byte Y = (byte)-1;
    private static final yq_2 amO = new yq_2();
    @Deprecated
    public static final Parser<yq_2> amP = new yr_2();

    yq_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private yq_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new yq_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    yq_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block12: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block12;
                    }
                    case 8: {
                        this.an |= 1;
                        this.amL = codedInputStream.readInt32();
                        continue block12;
                    }
                    case 16: {
                        this.an |= 2;
                        this.amN = codedInputStream.readInt64();
                        continue block12;
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

    public static final Descriptors.Descriptor avX() {
        return yp_2.amH;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return yp_2.amI.ensureFieldAccessorsInitialized(yq_2.class, ys_2.class);
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
    public boolean awa() {
        return (this.an & 2) != 0;
    }

    @Override
    public long awb() {
        return this.amN;
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
        if (!this.awa()) {
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
            codedOutputStream.writeInt64(2, this.amN);
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
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.amN);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof yq_2)) {
            return super.equals(object);
        }
        yq_2 yq_22 = (yq_2)object;
        if (this.avY() != yq_22.avY()) {
            return false;
        }
        if (this.avY() && this.avZ() != yq_22.avZ()) {
            return false;
        }
        if (this.awa() != yq_22.awa()) {
            return false;
        }
        if (this.awa() && this.awb() != yq_22.awb()) {
            return false;
        }
        return this.unknownFields.equals((Object)yq_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + yq_2.avX().hashCode();
        if (this.avY()) {
            n = 37 * n + 1;
            n = 53 * n + this.avZ();
        }
        if (this.awa()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.awb());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static yq_2 ee(ByteBuffer byteBuffer) {
        return (yq_2)amP.parseFrom(byteBuffer);
    }

    public static yq_2 cs(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (yq_2)amP.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static yq_2 dT(ByteString byteString) {
        return (yq_2)amP.parseFrom(byteString);
    }

    public static yq_2 cs(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (yq_2)amP.parseFrom(byteString, extensionRegistryLite);
    }

    public static yq_2 cu(byte[] byArray) {
        return (yq_2)amP.parseFrom(byArray);
    }

    public static yq_2 cs(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (yq_2)amP.parseFrom(byArray, extensionRegistryLite);
    }

    public static yq_2 fK(InputStream inputStream) {
        return (yq_2)GeneratedMessageV3.parseWithIOException(amP, (InputStream)inputStream);
    }

    public static yq_2 fK(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (yq_2)GeneratedMessageV3.parseWithIOException(amP, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static yq_2 fL(InputStream inputStream) {
        return (yq_2)GeneratedMessageV3.parseDelimitedWithIOException(amP, (InputStream)inputStream);
    }

    public static yq_2 fL(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (yq_2)GeneratedMessageV3.parseDelimitedWithIOException(amP, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static yq_2 cs(CodedInputStream codedInputStream) {
        return (yq_2)GeneratedMessageV3.parseWithIOException(amP, (CodedInputStream)codedInputStream);
    }

    public static yq_2 jc(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (yq_2)GeneratedMessageV3.parseWithIOException(amP, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ys_2 awc() {
        return yq_2.awd();
    }

    public static ys_2 awd() {
        return amO.awe();
    }

    public static ys_2 a(yq_2 yq_22) {
        return amO.awe().c(yq_22);
    }

    public ys_2 awe() {
        return this == amO ? new ys_2() : new ys_2().c(this);
    }

    protected ys_2 cs(GeneratedMessageV3.BuilderParent builderParent) {
        ys_2 ys_22 = new ys_2(builderParent);
        return ys_22;
    }

    public static yq_2 awf() {
        return amO;
    }

    public static Parser<yq_2> z() {
        return amP;
    }

    public Parser<yq_2> getParserForType() {
        return amP;
    }

    public yq_2 awg() {
        return amO;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cs(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.awe();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.awc();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.awe();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.awc();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.awg();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.awg();
    }

    static /* synthetic */ boolean cs() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(yq_2 yq_22) {
        return yq_22.unknownFields;
    }
}

