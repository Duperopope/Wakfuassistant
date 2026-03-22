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

public final class eP
extends GeneratedMessageV3
implements fe_0 {
    private static final long nU = 0L;
    int an;
    public static final int nV = 1;
    long nW;
    public static final int nX = 2;
    volatile Object nY;
    public static final int nZ = 3;
    volatile Object bu;
    public static final int oa = 50;
    int ob;
    public static final int oc = 51;
    volatile Object od;
    private byte Y = (byte)-1;
    private static final eP oe = new eP();
    @Deprecated
    public static final Parser<eP> of = new eQ();

    eP(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private eP() {
        this.nY = "";
        this.bu = "";
        this.od = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new eP();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    eP(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        this.nW = codedInputStream.readInt64();
                        continue block15;
                    }
                    case 18: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 2;
                        this.nY = byteString;
                        continue block15;
                    }
                    case 26: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 4;
                        this.bu = byteString;
                        continue block15;
                    }
                    case 400: {
                        this.an |= 8;
                        this.ob = codedInputStream.readInt32();
                        continue block15;
                    }
                    case 410: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 0x10;
                        this.od = byteString;
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

    public static final Descriptors.Descriptor xj() {
        return eO.nO;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return eO.nP.ensureFieldAccessorsInitialized(eP.class, eR.class);
    }

    @Override
    public boolean xk() {
        return (this.an & 1) != 0;
    }

    @Override
    public long xl() {
        return this.nW;
    }

    @Override
    public boolean xm() {
        return (this.an & 2) != 0;
    }

    @Override
    public String xn() {
        Object object = this.nY;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.nY = string;
        }
        return string;
    }

    @Override
    public ByteString xo() {
        Object object = this.nY;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.nY = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean xp() {
        return (this.an & 4) != 0;
    }

    @Override
    public String getTag() {
        Object object = this.bu;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.bu = string;
        }
        return string;
    }

    @Override
    public ByteString bX() {
        Object object = this.bu;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.bu = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean xq() {
        return (this.an & 8) != 0;
    }

    @Override
    public int xr() {
        return this.ob;
    }

    @Override
    public boolean xs() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public String xt() {
        Object object = this.od;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.od = string;
        }
        return string;
    }

    @Override
    public ByteString xu() {
        Object object = this.od;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.od = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.xk()) {
            this.Y = 0;
            return false;
        }
        if (!this.xm()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(1, this.nW);
        }
        if ((this.an & 2) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)2, (Object)this.nY);
        }
        if ((this.an & 4) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)3, (Object)this.bu);
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeInt32(50, this.ob);
        }
        if ((this.an & 0x10) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)51, (Object)this.od);
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
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.nW);
        }
        if ((this.an & 2) != 0) {
            n += GeneratedMessageV3.computeStringSize((int)2, (Object)this.nY);
        }
        if ((this.an & 4) != 0) {
            n += GeneratedMessageV3.computeStringSize((int)3, (Object)this.bu);
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeInt32Size((int)50, (int)this.ob);
        }
        if ((this.an & 0x10) != 0) {
            n += GeneratedMessageV3.computeStringSize((int)51, (Object)this.od);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof eP)) {
            return super.equals(object);
        }
        eP eP2 = (eP)object;
        if (this.xk() != eP2.xk()) {
            return false;
        }
        if (this.xk() && this.xl() != eP2.xl()) {
            return false;
        }
        if (this.xm() != eP2.xm()) {
            return false;
        }
        if (this.xm() && !this.xn().equals(eP2.xn())) {
            return false;
        }
        if (this.xp() != eP2.xp()) {
            return false;
        }
        if (this.xp() && !this.getTag().equals(eP2.getTag())) {
            return false;
        }
        if (this.xq() != eP2.xq()) {
            return false;
        }
        if (this.xq() && this.xr() != eP2.xr()) {
            return false;
        }
        if (this.xs() != eP2.xs()) {
            return false;
        }
        if (this.xs() && !this.xt().equals(eP2.xt())) {
            return false;
        }
        return this.unknownFields.equals((Object)eP2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + eP.xj().hashCode();
        if (this.xk()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.xl());
        }
        if (this.xm()) {
            n = 37 * n + 2;
            n = 53 * n + this.xn().hashCode();
        }
        if (this.xp()) {
            n = 37 * n + 3;
            n = 53 * n + this.getTag().hashCode();
        }
        if (this.xq()) {
            n = 37 * n + 50;
            n = 53 * n + this.xr();
        }
        if (this.xs()) {
            n = 37 * n + 51;
            n = 53 * n + this.xt().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static eP ao(ByteBuffer byteBuffer) {
        return (eP)of.parseFrom(byteBuffer);
    }

    public static eP ao(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (eP)of.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static eP ba(ByteString byteString) {
        return (eP)of.parseFrom(byteString);
    }

    public static eP ao(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (eP)of.parseFrom(byteString, extensionRegistryLite);
    }

    public static eP ao(byte[] byArray) {
        return (eP)of.parseFrom(byArray);
    }

    public static eP ao(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (eP)of.parseFrom(byArray, extensionRegistryLite);
    }

    public static eP bC(InputStream inputStream) {
        return (eP)GeneratedMessageV3.parseWithIOException(of, (InputStream)inputStream);
    }

    public static eP bC(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eP)GeneratedMessageV3.parseWithIOException(of, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static eP bD(InputStream inputStream) {
        return (eP)GeneratedMessageV3.parseDelimitedWithIOException(of, (InputStream)inputStream);
    }

    public static eP bD(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eP)GeneratedMessageV3.parseDelimitedWithIOException(of, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static eP ao(CodedInputStream codedInputStream) {
        return (eP)GeneratedMessageV3.parseWithIOException(of, (CodedInputStream)codedInputStream);
    }

    public static eP cQ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eP)GeneratedMessageV3.parseWithIOException(of, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public eR xv() {
        return eP.xw();
    }

    public static eR xw() {
        return oe.xx();
    }

    public static eR a(eP eP2) {
        return oe.xx().c(eP2);
    }

    public eR xx() {
        return this == oe ? new eR() : new eR().c(this);
    }

    protected eR ao(GeneratedMessageV3.BuilderParent builderParent) {
        eR eR2 = new eR(builderParent);
        return eR2;
    }

    public static eP xy() {
        return oe;
    }

    public static Parser<eP> z() {
        return of;
    }

    public Parser<eP> getParserForType() {
        return of;
    }

    public eP xz() {
        return oe;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.ao(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.xx();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.xv();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.xx();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.xv();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.xz();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.xz();
    }

    static /* synthetic */ boolean bg() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(eP eP2) {
        return eP2.unknownFields;
    }
}

