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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from zc
 */
public final class zc_1
extends GeneratedMessageV3
implements zf_1 {
    private static final long anl = 0L;
    int an;
    public static final int anm = 1;
    int xX;
    public static final int ann = 2;
    int xZ;
    public static final int ano = 3;
    List<yy_2> anp;
    private byte Y = (byte)-1;
    private static final zc_1 anq = new zc_1();
    @Deprecated
    public static final Parser<zc_1> anr = new zd_1();

    zc_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private zc_1() {
        this.anp = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new zc_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    zc_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block13: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
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
                    case 26: {
                        if ((n & 4) == 0) {
                            this.anp = new ArrayList<yy_2>();
                            n |= 4;
                        }
                        this.anp.add((yy_2)codedInputStream.readMessage(yy_2.ank, extensionRegistryLite));
                        continue block13;
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
            if ((n & 4) != 0) {
                this.anp = Collections.unmodifiableList(this.anp);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor axd() {
        return yp_2.amB;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return yp_2.amC.ensureFieldAccessorsInitialized(zc_1.class, ze_1.class);
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
    public List<yy_2> axe() {
        return this.anp;
    }

    @Override
    public List<? extends zb_1> axf() {
        return this.anp;
    }

    @Override
    public int axg() {
        return this.anp.size();
    }

    @Override
    public yy_2 kg(int n) {
        return this.anp.get(n);
    }

    @Override
    public zb_1 kh(int n) {
        return this.anp.get(n);
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
        for (int i = 0; i < this.axg(); ++i) {
            if (this.kg(i).isInitialized()) continue;
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
        for (int i = 0; i < this.anp.size(); ++i) {
            codedOutputStream.writeMessage(3, (MessageLite)this.anp.get(i));
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
        for (int i = 0; i < this.anp.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)3, (MessageLite)((MessageLite)this.anp.get(i)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof zc_1)) {
            return super.equals(object);
        }
        zc_1 zc_12 = (zc_1)object;
        if (this.NK() != zc_12.NK()) {
            return false;
        }
        if (this.NK() && this.getX() != zc_12.getX()) {
            return false;
        }
        if (this.NL() != zc_12.NL()) {
            return false;
        }
        if (this.NL() && this.getY() != zc_12.getY()) {
            return false;
        }
        if (!this.axe().equals(zc_12.axe())) {
            return false;
        }
        return this.unknownFields.equals((Object)zc_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + zc_1.axd().hashCode();
        if (this.NK()) {
            n = 37 * n + 1;
            n = 53 * n + this.getX();
        }
        if (this.NL()) {
            n = 37 * n + 2;
            n = 53 * n + this.getY();
        }
        if (this.axg() > 0) {
            n = 37 * n + 3;
            n = 53 * n + this.axe().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static zc_1 eh(ByteBuffer byteBuffer) {
        return (zc_1)anr.parseFrom(byteBuffer);
    }

    public static zc_1 cv(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (zc_1)anr.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static zc_1 dW(ByteString byteString) {
        return (zc_1)anr.parseFrom(byteString);
    }

    public static zc_1 cv(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (zc_1)anr.parseFrom(byteString, extensionRegistryLite);
    }

    public static zc_1 cx(byte[] byArray) {
        return (zc_1)anr.parseFrom(byArray);
    }

    public static zc_1 cv(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (zc_1)anr.parseFrom(byArray, extensionRegistryLite);
    }

    public static zc_1 fQ(InputStream inputStream) {
        return (zc_1)GeneratedMessageV3.parseWithIOException(anr, (InputStream)inputStream);
    }

    public static zc_1 fQ(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zc_1)GeneratedMessageV3.parseWithIOException(anr, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static zc_1 fR(InputStream inputStream) {
        return (zc_1)GeneratedMessageV3.parseDelimitedWithIOException(anr, (InputStream)inputStream);
    }

    public static zc_1 fR(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zc_1)GeneratedMessageV3.parseDelimitedWithIOException(anr, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static zc_1 cv(CodedInputStream codedInputStream) {
        return (zc_1)GeneratedMessageV3.parseWithIOException(anr, (CodedInputStream)codedInputStream);
    }

    public static zc_1 jl(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zc_1)GeneratedMessageV3.parseWithIOException(anr, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ze_1 axh() {
        return zc_1.axi();
    }

    public static ze_1 axi() {
        return anq.axj();
    }

    public static ze_1 a(zc_1 zc_12) {
        return anq.axj().c(zc_12);
    }

    public ze_1 axj() {
        return this == anq ? new ze_1() : new ze_1().c(this);
    }

    protected ze_1 cv(GeneratedMessageV3.BuilderParent builderParent) {
        ze_1 ze_12 = new ze_1(builderParent);
        return ze_12;
    }

    public static zc_1 axk() {
        return anq;
    }

    public static Parser<zc_1> z() {
        return anr;
    }

    public Parser<zc_1> getParserForType() {
        return anr;
    }

    public zc_1 axl() {
        return anq;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cv(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.axj();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.axh();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.axj();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.axh();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.axl();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.axl();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean oB() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(zc_1 zc_12) {
        return zc_12.unknownFields;
    }
}

