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
 * Renamed from iA
 */
public final class ia_2
extends GeneratedMessageV3
implements id_2 {
    private static final long yQ = 0L;
    int an;
    public static final int yR = 1;
    boolean yS;
    public static final int yT = 2;
    int yU;
    public static final int yV = 3;
    iw_1 yW;
    public static final int yX = 4;
    long yY;
    public static final int yZ = 5;
    boolean xC;
    private byte Y = (byte)-1;
    private static final ia_2 za = new ia_2();
    @Deprecated
    public static final Parser<ia_2> zb = new ib_2();

    ia_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ia_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ia_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ia_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block15: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block15;
                    }
                    case 8: {
                        this.an |= 1;
                        this.yS = codedInputStream.readBool();
                        continue block15;
                    }
                    case 16: {
                        this.an |= 2;
                        this.yU = codedInputStream.readInt32();
                        continue block15;
                    }
                    case 26: {
                        iy_1 iy_12 = null;
                        if ((this.an & 4) != 0) {
                            iy_12 = this.yW.OV();
                        }
                        this.yW = (iw_1)codedInputStream.readMessage(iw_1.yP, extensionRegistryLite);
                        if (iy_12 != null) {
                            iy_12.c(this.yW);
                            this.yW = iy_12.Pb();
                        }
                        this.an |= 4;
                        continue block15;
                    }
                    case 32: {
                        this.an |= 8;
                        this.yY = codedInputStream.readInt64();
                        continue block15;
                    }
                    case 40: {
                        this.an |= 0x10;
                        this.xC = codedInputStream.readBool();
                        continue block15;
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

    public static final Descriptors.Descriptor Pg() {
        return ih_2.wz;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ih_2.wA.ensureFieldAccessorsInitialized(ia_2.class, ic_2.class);
    }

    @Override
    public boolean Ph() {
        return (this.an & 1) != 0;
    }

    @Override
    public boolean Pi() {
        return this.yS;
    }

    @Override
    public boolean Pj() {
        return (this.an & 2) != 0;
    }

    @Override
    public int Pk() {
        return this.yU;
    }

    @Override
    public boolean Pl() {
        return (this.an & 4) != 0;
    }

    @Override
    public iw_1 Pm() {
        return this.yW == null ? iw_1.OW() : this.yW;
    }

    @Override
    public iz_1 Pn() {
        return this.yW == null ? iw_1.OW() : this.yW;
    }

    @Override
    public boolean Po() {
        return (this.an & 8) != 0;
    }

    @Override
    public long Pp() {
        return this.yY;
    }

    @Override
    public boolean MA() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public boolean MB() {
        return this.xC;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.Ph()) {
            this.Y = 0;
            return false;
        }
        if (!this.Pj()) {
            this.Y = 0;
            return false;
        }
        if (!this.Pl()) {
            this.Y = 0;
            return false;
        }
        if (!this.Po()) {
            this.Y = 0;
            return false;
        }
        if (!this.MA()) {
            this.Y = 0;
            return false;
        }
        if (!this.Pm().isInitialized()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeBool(1, this.yS);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.yU);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeMessage(3, (MessageLite)this.Pm());
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeInt64(4, this.yY);
        }
        if ((this.an & 0x10) != 0) {
            codedOutputStream.writeBool(5, this.xC);
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
            n += CodedOutputStream.computeBoolSize((int)1, (boolean)this.yS);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.yU);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeMessageSize((int)3, (MessageLite)this.Pm());
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeInt64Size((int)4, (long)this.yY);
        }
        if ((this.an & 0x10) != 0) {
            n += CodedOutputStream.computeBoolSize((int)5, (boolean)this.xC);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ia_2)) {
            return super.equals(object);
        }
        ia_2 ia_22 = (ia_2)object;
        if (this.Ph() != ia_22.Ph()) {
            return false;
        }
        if (this.Ph() && this.Pi() != ia_22.Pi()) {
            return false;
        }
        if (this.Pj() != ia_22.Pj()) {
            return false;
        }
        if (this.Pj() && this.Pk() != ia_22.Pk()) {
            return false;
        }
        if (this.Pl() != ia_22.Pl()) {
            return false;
        }
        if (this.Pl() && !this.Pm().equals(ia_22.Pm())) {
            return false;
        }
        if (this.Po() != ia_22.Po()) {
            return false;
        }
        if (this.Po() && this.Pp() != ia_22.Pp()) {
            return false;
        }
        if (this.MA() != ia_22.MA()) {
            return false;
        }
        if (this.MA() && this.MB() != ia_22.MB()) {
            return false;
        }
        return this.unknownFields.equals((Object)ia_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ia_2.Pg().hashCode();
        if (this.Ph()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashBoolean((boolean)this.Pi());
        }
        if (this.Pj()) {
            n = 37 * n + 2;
            n = 53 * n + this.Pk();
        }
        if (this.Pl()) {
            n = 37 * n + 3;
            n = 53 * n + this.Pm().hashCode();
        }
        if (this.Po()) {
            n = 37 * n + 4;
            n = 53 * n + Internal.hashLong((long)this.Pp());
        }
        if (this.MA()) {
            n = 37 * n + 5;
            n = 53 * n + Internal.hashBoolean((boolean)this.MB());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ia_2 bf(ByteBuffer byteBuffer) {
        return (ia_2)zb.parseFrom(byteBuffer);
    }

    public static ia_2 bb(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ia_2)zb.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ia_2 bX(ByteString byteString) {
        return (ia_2)zb.parseFrom(byteString);
    }

    public static ia_2 bb(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ia_2)zb.parseFrom(byteString, extensionRegistryLite);
    }

    public static ia_2 bc(byte[] byArray) {
        return (ia_2)zb.parseFrom(byArray);
    }

    public static ia_2 bb(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ia_2)zb.parseFrom(byArray, extensionRegistryLite);
    }

    public static ia_2 dc(InputStream inputStream) {
        return (ia_2)GeneratedMessageV3.parseWithIOException(zb, (InputStream)inputStream);
    }

    public static ia_2 dc(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ia_2)GeneratedMessageV3.parseWithIOException(zb, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ia_2 dd(InputStream inputStream) {
        return (ia_2)GeneratedMessageV3.parseDelimitedWithIOException(zb, (InputStream)inputStream);
    }

    public static ia_2 dd(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ia_2)GeneratedMessageV3.parseDelimitedWithIOException(zb, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ia_2 bb(CodedInputStream codedInputStream) {
        return (ia_2)GeneratedMessageV3.parseWithIOException(zb, (CodedInputStream)codedInputStream);
    }

    public static ia_2 fd(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ia_2)GeneratedMessageV3.parseWithIOException(zb, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ic_2 Pq() {
        return ia_2.Pr();
    }

    public static ic_2 Pr() {
        return za.Ps();
    }

    public static ic_2 a(ia_2 ia_22) {
        return za.Ps().c(ia_22);
    }

    public ic_2 Ps() {
        return this == za ? new ic_2() : new ic_2().c(this);
    }

    protected ic_2 bb(GeneratedMessageV3.BuilderParent builderParent) {
        ic_2 ic_22 = new ic_2(builderParent);
        return ic_22;
    }

    public static ia_2 Pt() {
        return za;
    }

    public static Parser<ia_2> z() {
        return zb;
    }

    public Parser<ia_2> getParserForType() {
        return zb;
    }

    public ia_2 Pu() {
        return za;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bb(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.Ps();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.Pq();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.Ps();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.Pq();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Pu();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Pu();
    }

    static /* synthetic */ boolean bg() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ia_2 ia_22) {
        return ia_22.unknownFields;
    }
}

